package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AllegroTestingApp {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");


        WebElement inputField = driver.findElement(By.xpath("//*[@class=\"gh-tb ui-autocomplete-input\"]"));
        inputField.sendKeys("mavic mini");

        WebElement szukaj = driver.findElement(
                By.xpath("//*[@id=\"gh-cat\"]/option[30]"));
        WebElement wyszukaj = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]"));

        inputField.submit();
    }
}