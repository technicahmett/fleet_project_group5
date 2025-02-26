package com.fleet_project_group5.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehiclesPage extends BasePage {



    @FindBy (xpath = "//span[.='Vehicles']")
    public WebElement vehicles;


    //@FindBy (xpath = "(//div[@class='more-bar-holder'])[1]//a[@data-toggle='dropdown']")
    //@FindBy(xpath = "(//a[@data-toggle='dropdown'])[2]")
    //@FindBy(xpath="(//ul[@class='nav nav-pills icons-holder launchers-list'])[1]")
    @FindBy(xpath = "(//*[@class='dropdown-menu dropdown-menu__action-cell launchers-dropdown-menu'])[1]")
    public WebElement threeDots;

    //All Cars Task
    @FindBy(xpath = "//div[@class='btn-group dropdown']//input[@type='checkbox']")
    public WebElement allCarsChooseButton;


    @FindBy(xpath = "//tr[@class='grid-row row-click-action']//input[@type='checkbox']")
    public WebElement eachButton;

    @FindBy(xpath = "(//input[@tabindex='-1'])[4]")
    public WebElement eachButton1;

    @FindBy(xpath = "(//input[@tabindex='-1'])[8]")
    public WebElement eachButton2;


    @FindBy(xpath = "//span[@class='title title-level-1']")
    public WebElement allCars;

    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement allCarsTitle;



}