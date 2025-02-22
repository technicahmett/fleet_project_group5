package com.fleet_project_group5.pages;

import com.fleet_project_group5.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US06_Page {

    public US06_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "(//a[@class='unclickable'])[1]")
    public WebElement fleet;

    @FindBy (xpath = "//span[.='Vehicles']")
    public WebElement vehicles;




}
