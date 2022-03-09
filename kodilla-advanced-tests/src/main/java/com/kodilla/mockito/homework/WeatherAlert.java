package com.kodilla.mockito.homework;

import com.kodilla.notification.Notification;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeatherAlert {

    private Map<Location, List<Client>> notifications = new HashMap<>();

    public void addSubscriberToLocation(Location location, Client client) {
        if (notifications.containsKey(location)) {
            notifications.get(location).add(client);
        } else {
            List<Client> clients = new ArrayList<>();
            clients.add(client);
            notifications.put(location, clients);
        }
    }

    public void sendNotifications(Notification notification, Location location) {
        if (notifications.containsKey(location)) {
            notifications.get(location).forEach(client -> client.receive(notification));
        }
    }



    public void sendNotificationsToAllClients(Notification notification) {

        notifications.entrySet().forEach(e ->
                e.getValue().forEach(c -> c.receive(notification)));

    }



    public void removeSubscribedLocation(Client client, Location location) {
        if (notifications.containsKey(location)) {
            notifications.get(location).remove(client);
        }

    }

    public void removeClientsFromAllLocation(Client client) {
        notifications.values().forEach(clients -> clients.remove(client));

    }

    public void removeLocation(Location location) {
        this.notifications.remove(location);

    }
}
