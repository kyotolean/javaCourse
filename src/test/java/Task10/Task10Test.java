package Task10;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task10Test {
    private WebDriver driver;
    @BeforeTest
    void setup(){
        //System.setProperty("web-driver.chrome.driver", "C:/Users/ME/IdeaProjects/labJava/driver/chromedriver");
        ChromeDriverManager.getInstance().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
    }
    @Test
    void simpleWDTest(){
        //step 1
        driver.get("https://www.demoblaze.com/prod.html?idp_=1");

        //step 2
        //1
        WebElement demoblazeBuyButton = driver.findElement(By.tagName("btn btn-success btn-lg"));
        Assert.assertTrue(demoblazeBuyButton.isDisplayed());

        //2
        WebElement demoblazeFooter = driver.findElement(By.className("footer"));
        Assert.assertTrue(demoblazeFooter.isDisplayed());

        //3
        WebElement demoblazeImageHeight = driver.findElement(By.tagName("img"));
        Assert.assertTrue(demoblazeImageHeight.isDisplayed());

        //4
        WebElement demoblazeNavCSS = driver.findElement(By.className("navbar-brand"));
        Assert.assertTrue(demoblazeNavCSS.isDisplayed());

        //5
        WebElement demoblazeHeader = driver.findElement(By.className("name"));
        Assert.assertEquals(demoblazeHeader.getText(), "Samsung ");

    }

    @AfterTest
    void closeBrowser(){
        driver.close();
        driver.quit();
    }

}
