package org.voloshyn.Task10;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverLab {
    public static void main(String[] args) {
        ///https://www.demoblaze.com/prod.html?idp_=1
        ChromeDriverManager.getInstance().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.demoblaze.com/prod.html?idp_=1");

        WebElement demoblazeBuyButton = driver.findElement(By.tagName("btn btn-success btn-lg"));
        demoblazeBuyButton.click();
        System.out.println("1: click" + demoblazeBuyButton);

        WebElement demoblazeFooter = driver.findElement(By.className("footer"));
        System.out.println("2: " + demoblazeFooter.getTagName());

        WebElement demoblazeImageHeight = driver.findElement(By.tagName("img"));
        System.out.println("3: " + demoblazeImageHeight.getAttribute("height"));

        WebElement demoblazeNavCSS = driver.findElement(By.className("navbar-brand"));
        System.out.println("4: " + demoblazeNavCSS.getCssValue("a"));

        WebElement demoblazeHeader = driver.findElement(By.className("name"));
        System.out.println("5: " + demoblazeHeader.getText());

        driver.close();
        driver.quit();





    }
}
