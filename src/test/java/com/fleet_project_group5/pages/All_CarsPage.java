package com.fleet_project_group5.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class All_CarsPage extends BasePage{

    @FindBy(xpath = "//div[@class='btn-group dropdown']//input[@type='checkbox']")
    public static WebElement allCarsChooseButton;


    @FindBy(xpath = "(//input[@tabindex='-1'])[3]")
    public static WebElement eachButton;


    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public static WebElement allCarsTitle;





}
