package com.grocerycrud.functional_testing.desafio01;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;


public class TestCaseClass extends IntermediateClass {
    String URL="https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap";

    @Test
    public void registerUser(){
        try {
            String URL="https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap";
            driver.get(URL);
            HomePage homePage = PageFactory.initElements(driver, HomePage.class);
            FormPage formPage = PageFactory.initElements(driver, FormPage.class);
            Map<String, String> person = new Data().generateFormArray();

            homePage.addCustomer();
            formPage.fillForm01(person);
            } catch (Exception e) {e.printStackTrace();}
    }

    @Test
    public void deleteUser(){
        try {

            driver.get(URL);
            HomePage homePage = PageFactory.initElements(driver, HomePage.class);
            FormPage formPage = PageFactory.initElements(driver, FormPage.class);
            Map<String, String> person = new Data().generateFormArray();

            homePage.addCustomer();
            formPage.fillForm02(person);
            homePage.deleteCustomer(person.get("name"));
        } catch (Exception e) {e.printStackTrace();}
    }

}

