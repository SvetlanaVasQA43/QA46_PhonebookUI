package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreatAccountTest extends TestBase{

    @Test(enabled = false)
    public void newUserRegistrationPositiveTest(){
        //click on login link
        click(By.cssSelector("[href='/login']"));

        //enter email
        type(By.name("email"), "goa97@gmai.com");

        //enter password
        type(By.name("password"), "1234567#sS");

        //click on Registration button
        click(By.name("registration"));

        //verify SignOut button is displayed
        Assert.assertTrue(isElementPresent(By.xpath("//button[.='Sign Out']")));

    }

    @Test
    public void existedUserRegistrationNegativeTest(){
        //click on login link
        click(By.cssSelector("[href='/login']"));

        //enter email
        type(By.name("email"), "goa97@gmai.com");

        //enter password
        type(By.name("password"), "1234567#sS");

        //click on Registration button
        click(By.name("registration"));

        //verify Alert is displayed
        Assert.assertTrue(isAlertDisplayed());


    }


}
