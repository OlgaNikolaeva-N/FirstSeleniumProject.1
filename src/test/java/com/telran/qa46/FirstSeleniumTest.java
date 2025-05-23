package com.telran.qa46;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstSeleniumTest {
    //before - setUp
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        //driver.get("https://www.google.com");//without history
        //maximaze browser to windows
        driver.manage().window().maximize();
        driver.navigate().to("https://ilcarro.web.app/search");//with history
        //wait for all elements on the load before starting test
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://www.google.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

    }
    //test
    @Test
    public void openGoogleTest(){
        System.out.println("Googleopened");
    }


    //after -tearDown
    @AfterMethod(enabled = false)
    public void tearDown(){
        //driver.quit();//all and browser
        driver.close();//only one tab
    }
}
