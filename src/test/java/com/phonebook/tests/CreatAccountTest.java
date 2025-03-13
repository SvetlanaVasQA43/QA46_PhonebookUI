package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreatAccountTest extends TestBase{

    @Test
    public void newUserRegistrationPositiveTest(){
        //click on login link
        driver.findElement(By.cssSelector("[href='/login']")).click();
    }



    //enter email

    //enter password

    //click on Registration button

    //verify SignOut button is displayed



}
