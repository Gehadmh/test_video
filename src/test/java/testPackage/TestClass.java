package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


    @Test
public class TestClass{
        WebDriver driver;

        @BeforeMethod
        public void beforeMethod() {
            driver = new ChromeDriver();
        }

        @AfterMethod
        public void afterMethod() {
            driver.quit();
        }
        public void navigatetoduckduckgoandcheckpagetitle(){
          //  driver = new ChromeDriver();
            driver.get("https://duckduckgo.com/");
            Assert.assertNotEquals(driver.getTitle(),"Google");
          //  driver.quit();
        }

        public void navigatetoduckduckgoandasserpagetitle(){
         //   driver = new ChromeDriver();
            driver.get("https://duckduckgo.com/");
            System.out.println("Page Title: " + driver.getTitle());
         //   driver.quit();
        }



    }

