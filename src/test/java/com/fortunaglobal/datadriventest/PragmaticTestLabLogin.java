package com.fortunaglobal.datadriventest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PragmaticTestLabLogin {
    public static WebDriver driver;

    @Test(dataProvider = "PragmaticTestData")
    public void loginPragmaticTestLab(String username, String password) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS) ;
        driver.manage().window().maximize();
        driver.get("http://hrm.pragmatictestlabs.com/symfony/web/index.php/auth/login");
        driver.findElement(By.id("txtUsername")).sendKeys(username);
        driver.findElement(By.id("txtPassword")).sendKeys(password);
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(5000);
        System.out.println(driver.getTitle());
       // driver.quit();
    }
    @DataProvider(name= "PragmaticTestData")
    public Object[][] passData(){  // object can pass any data type.
        Object data[][] = new Object[3][2];
        data[0][0] ="a";
        data[0][1] ="b";

        data[1][0] ="a";
        data[1][1] ="b";

        data[2][0] ="Admin";
        data[2][1] ="Ptl@#321";

        return data;

    }
}
