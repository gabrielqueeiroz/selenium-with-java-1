package com.grocerycrud.functional_testing.desafio01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/select/option[4]")
    @CacheLookup
    WebElement combo_select;
    @FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[1]/div[2]/form/div[1]/div[1]/a")
    @CacheLookup
    WebElement add_customer_button;

    public void addCustomer() {
        combo_select.click();
        add_customer_button.click();
    }
}

