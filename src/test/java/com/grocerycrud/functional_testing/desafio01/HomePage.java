package com.grocerycrud.functional_testing.desafio01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.Map;

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
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/div[1]/div[2]/form/div[2]/table/thead/tr[2]/td[3]/input")
    @CacheLookup
    WebElement search_name;
    @FindBy(how = How.XPATH, using = "//*[@id=\"gcrud-search-form\"]/div[2]/table/thead/tr[2]/td[1]/div/input")
    @CacheLookup
    WebElement actions_checkbox;
    @FindBy(how = How.XPATH, using = "//*[@id=\"gcrud-search-form\"]/div[2]/table/thead/tr[2]/td[2]/div[1]/a")
    @CacheLookup
    WebElement delete_button;
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/div[3]/div/div/div[2]/p[2]")
    @CacheLookup
    WebElement delete_message;
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/div[3]/div/div/div[3]/button[2]")
    @CacheLookup
    WebElement delete_popup_button;
    @FindBy(how = How.XPATH, using = "/html/body/div[4]/span[3]/p")
    @CacheLookup
    WebElement popup_message;


    public void addCustomer() {
        combo_select.click();
        add_customer_button.click();
    }
    public void deleteCustomer(String name){
        search_name.sendKeys(name);
        actions_checkbox.click();
        delete_button.click();
        Assert.assertEquals(delete_message.getText(), "Are you sure that you want to delete those 2 items?");
        delete_popup_button.click();
        Assert.assertEquals(popup_message.getText(), "Your data has been successfully deleted from the database.");

    }
}
