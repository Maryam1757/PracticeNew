package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();

        WebDriver driver = new EdgeDriver();

        driver.get("https://www.google.com");
        


    }
}