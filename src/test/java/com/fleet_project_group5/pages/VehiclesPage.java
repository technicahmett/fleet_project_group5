package com.fleet_project_group5.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehiclesPage extends BasePage {



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