package com.avtomationPractice;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpensPageTest {
    public ChromeDriver driver;

    @BeforeEach
    public void shouldBeforeEveryone() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void firstTest() {
        driver.get("http://automationpractice.com/index.php");

        String title = driver.getTitle();
        Assertions.assertEquals("My Store", title);

    }

    @AfterEach
    public void close() {
        driver.quit();
    }

}
