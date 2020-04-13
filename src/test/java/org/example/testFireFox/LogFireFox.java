package org.example.testFireFox;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertAll;

class LogFireFox {

    @Test
    void logInLogOut() {

        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("http://demo.testarena.pl/zaloguj");

        assertEquals("TestArena Demo", driver.getTitle());

        driver.findElement(By.id("email")).sendKeys("administrator@testarena.pl");
        driver.findElement(By.id("password")).sendKeys("sumXQQ72$L");

        driver.findElement(By.id("login")).click();

        assertEquals("Kokpit - TestArena Demo", driver.getTitle());

        //Xpath=//tagname[@attribute='value']
        driver.findElement(By.xpath("//a[@href='http://demo.testarena.pl/wyloguj']")).click();

        assertEquals("TestArena Demo", driver.getTitle());

        driver.quit();
    }

}