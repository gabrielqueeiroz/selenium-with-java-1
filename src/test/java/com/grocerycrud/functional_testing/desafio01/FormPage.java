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
    @FindBy(how = How.CSS, using = "#report-success > p")
    //*[@id="report-success"]/p
    @CacheLookup
    WebElement message;

    public void fillForm(Map<String, String> person) {
        name.sendKeys(person.get("name"));
        last_name.sendKeys(person.get("last_name"));
        contact_first_name.sendKeys(person.get("contact_first_name"));
        phone.sendKeys(person.get("phone"));
        addressLine1.sendKeys(person.get("addressLine1"));
        addressLine2.sendKeys(person.get("addressLine2"));
        city.sendKeys(person.get("city"));
        state.sendKeys(person.get("state"));
        postal_code.sendKeys(person.get("postal_code"));
        country.sendKeys(person.get("country"));
        from_employeer.sendKeys(person.get("from_employeer"));
        credit_limit.sendKeys(person.get("credit_limit"));
        save_button.click();
        Assert.assertEquals(message.getText(), "Your data has been successfully stored into the database. Edit Customer or Go back to list");
    }
}

