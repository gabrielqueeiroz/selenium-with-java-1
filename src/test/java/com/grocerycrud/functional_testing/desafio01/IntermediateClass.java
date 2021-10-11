package com.grocerycrud.functional_testing.desafio01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

public class IntermediateClass {
    public static WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @AfterSuite
    public void afterSuite(){
        driver.quit();
    }
}
