package com.fleet_project_group5.pages;

import com.fleet_project_group5.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US06_Page {

    public US06_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//span[@class='title title-level-1'])[1]")
    public WebElement fleetButtonForDriver;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement fleetButtonForSM;

    @FindBy (xpath = "//span[.='Vehicles']")
    public WebElement vehicles;

    //@FindBy (xpath = "(//div[@class='more-bar-holder'])[1]//a[@data-toggle='dropdown']")
    @FindBy(xpath = "(//a[@data-toggle='dropdown'])[2]")
    public WebElement threeDots;



}
