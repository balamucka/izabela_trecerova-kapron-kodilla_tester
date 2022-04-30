package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EBayTestingApp2 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");


        WebElement inputField = driver.findElement(By.cssSelector("[class='gh-tb ui-autocomplete-input']"));
        inputField.sendKeys("mavic mini");
        WebElement wyszukaj = driver.findElement(By.id("gh-btn"));

        inputField.submit();
    }
}