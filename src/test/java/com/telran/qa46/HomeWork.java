package com.telran.qa46;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class HomeWork {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void findElementByTagName(){
        WebElement span = driver.findElement(By.tagName("span"));
        System.out.println(span.getText());

        WebElement a = driver.findElement(By.tagName("a"));
        System.out.println(a.getText());

        WebElement ul = driver.findElement(By.tagName("ul"));
        System.out.println(ul.getText());

        WebElement p = driver.findElement(By.tagName("p"));
        System.out.println(p.getText());

        WebElement h1 = driver.findElement(By.tagName("li"));
        System.out.println(h1.getText());

        WebElement strong = driver.findElement(By.tagName("strong"));
        System.out.println(strong.getText());

        List<WebElement> ul1 = driver.findElements(By.tagName("ul"));
        System.out.println(ul1.size());
    }

    @Test
    public void findElementBySimpleLocators(){
        driver.findElement(By.id("small-searchterms"));

        driver.findElement(By.className("flyout-cart"));

        WebElement shoppingCart = driver.findElement(By.linkText("Shopping cart"));
        System.out.println(shoppingCart.getText());

        WebElement tricentis = driver.findElement(By.partialLinkText("Tricentis"));
        System.out.println(tricentis.getText());
    }

    @Test
    public void findElementByCssSelectorTest(){
        driver.findElement(By.cssSelector("span"));

        driver.findElement(By.cssSelector("#small-searchterms"));

        driver.findElement(By.cssSelector(".flyout-cart"));

        driver.findElement(By.cssSelector("[href='/register']"));

        driver.findElement(By.cssSelector("[href*='cart']"));

        driver.findElement(By.cssSelector("[href^='/wishlist']"));

        driver.findElement(By.cssSelector("[href$='books']"));

        driver.findElement(By.cssSelector(".ico-register"));

        driver.findElement(By.cssSelector("#bar-notification"));

        driver.findElement(By.cssSelector("[href^='/computers']"));
    }
}
