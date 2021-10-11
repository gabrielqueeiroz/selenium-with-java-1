package com.grocerycrud.functional_testing.desafio01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.Map;

public class FormPage {
    WebDriver driver;

    public FormPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"field-customerName\"]")
    @CacheLookup
    WebElement name;
    @FindBy(how = How.XPATH, using = "//*[@id=\"field-contactLastName\"]")
    @CacheLookup
    WebElement last_name;
    @FindBy(how = How.XPATH, using = "//*[@id=\"field-contactFirstName\"]")
    @CacheLookup
    WebElement contact_first_name;
    @FindBy(how = How.XPATH, using = "//*[@id=\"field-phone\"] ")
    @CacheLookup
    WebElement phone;
    @FindBy(how = How.XPATH, using = "//*[@id=\"field-addressLine1\"]")
    @CacheLookup
    WebElement addressLine1;
    @FindBy(how = How.XPATH, using = "//*[@id=\"field-addressLine2\"]")
    @CacheLookup
    WebElement addressLine2;
    @FindBy(how = How.XPATH, using = "//*[@id=\"field-city\"]")
    @CacheLookup
    WebElement city;
    @FindBy(how = How.XPATH, using = "//*[@id=\"field-state\"] ")
    @CacheLookup
    WebElement state;
    @FindBy(how = How.XPATH, using = "//*[@id=\"field-postalCode\"]")
    @CacheLookup
    WebElement postal_code;
    @FindBy(how = How.XPATH, using = "//*[@id=\"field-country\"]")
    @CacheLookup
    WebElement country;
    @FindBy(how = How.XPATH, using = "//*[@id=\"field-salesRepEmployeeNumber\"]")
    @CacheLookup
    WebElement from_employeer;
    @FindBy(how = How.XPATH, using = "//*[@id=\"field-creditLimit\"]")
    @CacheLookup
    WebElement credit_limit;
    @FindBy(how = How.XPATH, using = "//*[@id=\"form-button-save\"]")
    @CacheLookup
    WebElement save_button;
    @FindBy(how = How.XPATH, using = "//*[@id=\"report-success\"]/p")
    @CacheLookup
    WebElement message;

    public void fillForm(Map<String, String> person) {
        try {
            Thread.sleep(2000);
            name.sendKeys(person.get("name"));
            Thread.sleep(2000);
            last_name.sendKeys(person.get("last_name"));
            Thread.sleep(2000);
            contact_first_name.sendKeys(person.get("contact_first_name"));
            Thread.sleep(2000);
            phone.sendKeys(person.get("phone"));
            Thread.sleep(2000);
            addressLine1.sendKeys(person.get("addressLine1"));
            Thread.sleep(2000);
            addressLine2.sendKeys(person.get("addressLine2"));
            Thread.sleep(2000);
            city.sendKeys(person.get("city"));
            Thread.sleep(2000);
            state.sendKeys(person.get("state"));
            Thread.sleep(2000);
            postal_code.sendKeys(person.get("postal_code"));
            Thread.sleep(2000);
            country.sendKeys(person.get("country"));
            Thread.sleep(2000);
            from_employeer.sendKeys(person.get("from_employeer"));
            Thread.sleep(2000);
            credit_limit.sendKeys(person.get("credit_limit"));
            Thread.sleep(2000);
            save_button.click();
            Thread.sleep(2000);
            Assert.assertEquals(message.getText(), "Your data has been successfully deleted from the database");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

