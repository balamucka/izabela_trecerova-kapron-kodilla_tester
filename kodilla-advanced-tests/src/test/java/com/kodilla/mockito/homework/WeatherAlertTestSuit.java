package com.kodilla.mockito.homework;

import com.kodilla.notification.Notification;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class WeatherAlertTestSuit {

    WeatherAlert weatherAlert = new WeatherAlert();
    Client client = Mockito.mock(Client.class);
    Location location = Mockito.mock(Location.class);
    Notification notification = Mockito.mock(Notification.class);

    @Test
    public void subscribedClientShouldReceivedNotificationFromSpecificLocation() {
        weatherAlert.addSubscriberToLocation(location, client);
        weatherAlert.sendNotifications(notification, location);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

    @Test
    public void shouldAddClientToExistingLocation() {
        weatherAlert.addSubscriberToLocation(location, client);
        Client client1 = Mockito.mock(Client.class);
        weatherAlert.addSubscriberToLocation(location, client1);

        weatherAlert.sendNotifications(notification, location);
        Mockito.verify(client1, Mockito.times(1)).receive(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

    @Test
    public void unsubscribedLocationByClientShouldNotSentNotificationToClient() {
        Location warsaw = Mockito.mock(Location.class);
        weatherAlert.addSubscriberToLocation(location, client);
        weatherAlert.addSubscriberToLocation(warsaw, client);
        weatherAlert.removeSubscribedLocation(client, location);

        weatherAlert.sendNotifications(notification, location);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void shouldReceiveNotificationFromNotDeletedLocation() {
        Location warsaw = Mockito.mock(Location.class);
        weatherAlert.addSubscriberToLocation(location, client);
        weatherAlert.addSubscriberToLocation(warsaw, client);
        weatherAlert.removeSubscribedLocation(client, location);

        weatherAlert.sendNotifications(notification, warsaw);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

    @Test
    public void unsubscribedAllLocationShouldDeletedClientFromNotification() {
        Location warsaw = Mockito.mock(Location.class);
        weatherAlert.addSubscriberToLocation(location, client);
        weatherAlert.addSubscriberToLocation(warsaw, client);
        weatherAlert.removeClientsFromAllLocation(client);

        weatherAlert.sendNotifications(notification, location);
        weatherAlert.sendNotifications(notification, warsaw);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void notificationFromSpecificLocationShouldBeSentOnlyToSpecificClient() {
        Client client1 = Mockito.mock(Client.class);
        Client client2 = Mockito.mock(Client.class);
        Location london = Mockito.mock(Location.class);
        weatherAlert.addSubscriberToLocation(london, client);
        weatherAlert.addSubscriberToLocation(london, client1);
        weatherAlert.addSubscriberToLocation(location, client2);

        weatherAlert.sendNotifications(notification, london);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
        Mockito.verify(client1, Mockito.times(1)).receive(notification);
        Mockito.verify(client2, Mockito.never()).receive(notification);
    }

    @Test
    public void notificationShouldBeSentToAllSubscribedClient() {
        Client client1 = Mockito.mock(Client.class);
        Client client2 = Mockito.mock(Client.class);
        Location london = Mockito.mock(Location.class);
        weatherAlert.addSubscriberToLocation(london, client);
        weatherAlert.addSubscriberToLocation(london, client1);
        weatherAlert.addSubscriberToLocation(location, client2);

        weatherAlert.sendNotificationsToAllClients(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
        Mockito.verify(client1, Mockito.times(1)).receive(notification);
        Mockito.verify(client2, Mockito.times(1)).receive(notification);

    }

    @Test
    public void shouldDeletedSpecificLocation() {
        Client client1 = Mockito.mock(Client.class);
        Client client2 = Mockito.mock(Client.class);
        Location london = Mockito.mock(Location.class);
        weatherAlert.addSubscriberToLocation(london, client);
        weatherAlert.addSubscriberToLocation(london, client1);
        weatherAlert.addSubscriberToLocation(location, client2);
        weatherAlert.removeLocation(london);
        weatherAlert.sendNotificationsToAllClients(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
        Mockito.verify(client1, Mockito.never()).receive(notification);
        Mockito.verify(client2, Mockito.times(1)).receive(notification);
    }

}