package com.fleet_project_group5.pages;

import com.fleet_project_group5.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US11_CarOdometerPage {
    public US11_CarOdometerPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

   // @FindBy(xpath="//span[@class='title title-level-1']/i[@class='fa-asterisk menu-icon']")

   //@FindBy(xpath = "//i[@class='fa-asterisk menu-icon']")   //not interactable
   //@FindBy(xpath = "//a[@class='unclickable']//i[@class='fa-asterisk menu-icon']")
   //@FindBy(xpath = "//a[@class='unclickable']//span[@class='title title-level-1']//i[@class='fa-asterisk menu-icon']")
    @FindBy(xpath = "(//a[@class='unclickable'])[1]")
    public WebElement fleetButtonInDriver;

    @FindBy(xpath = "(//a[@class='unclickable'])[2]")
    public WebElement fleetButtonInManager;

    @FindBy(xpath = "//span[.='Vehicle Odometer']")
    public WebElement VehicleOdometerButton;

    @FindBy(xpath = "//input[@value='1']")
    public WebElement defaultPageNumber;

    @FindBy(xpath = "//button[@class='btn dropdown-toggle ']")
    public WebElement viewPerPage;

    @FindBy(xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement errorMessage;







}
