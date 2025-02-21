package com.fleet_project_group5.pages;

import com.fleet_project_group5.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US07_Page {
public US07_Page() {
    PageFactory.initElements(Driver.getDriver(), this);
}

@FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/a/span")
    public WebElement fleetButton;


@FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[3]/a/span")
    public WebElement fleetButton2;


@FindBy(xpath = "//div[@class='btn-group dropdown']//input[@type='checkbox']")
    public WebElement fleetButton3;

@FindBy(xpath = "//tr[@class='grid-row row-click-action']//input[@type='checkbox']")
    public WebElement fleetButton4;

@FindBy(xpath = "//tr[@class='grid-row row-click-action row-selected']//input[@type='checkbox']")
    public WebElement fleetButton5;



}
