package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class AllegroTestingApp {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.pl/");


        WebElement inputField = driver.findElement(By.name("_nkw"));
        inputField.sendKeys("mavic mini");

        WebElement szukaj = driver.findElement(
                By.xpath("//*[@id=\"gh-cat\"]/option[30]"));
        WebElement wyszukaj = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]"));

        inputField.submit();
    }
}