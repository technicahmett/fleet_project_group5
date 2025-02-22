package com.fleet_project_group5.pages;

import com.fleet_project_group5.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarOdometerPage {
    public CarOdometerPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

   // @FindBy(xpath="//span[@class='title title-level-1']/i[@class='fa-asterisk menu-icon']")
    @FindBy(xpath = "(//a[@class='unclickable'])[1]")
    public WebElement fleetButton;

    @FindBy(xpath = "//span[.='Vehicle Odometer']")
    public WebElement VehicleOdometerButton;





}
