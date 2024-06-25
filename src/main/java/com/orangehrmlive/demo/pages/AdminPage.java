package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;



public class AdminPage extends Utility {
    private static final Logger log = LogManager.getLogger(AdminPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Admin']")
    WebElement adminButton;



    public void clickOnAdminButton(){
        log.info("CLick on admin button ");
        //CustomListeners.test.log(Status.PASS,"Click on admin button ");
        clickOnElement(adminButton);
    }
}
