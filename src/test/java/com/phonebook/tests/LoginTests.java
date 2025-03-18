package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {
    @Test
    public void loginPositiveTests(){

        click(By.cssSelector("[href='/login']"));

        type(By.name("email"), "goa97@gmai.com");

        type(By.name("password"), "1234567#sS");
        //click login button
        click(By.name("login"));
        //verify SignOut button is displayed
        Assert.assertTrue(isElementPresent(By.xpath("//button[.='Sign Out']")));


    }

}
