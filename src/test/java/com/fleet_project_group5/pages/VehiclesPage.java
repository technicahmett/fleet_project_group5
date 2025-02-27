package com.fleet_project_group5.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class VehiclesPage extends BasePage {


    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement vehicles;


    //@FindBy (xpath = "(//div[@class='more-bar-holder'])[1]//a[@data-toggle='dropdown']")
    //@FindBy(xpath = "(//a[@data-toggle='dropdown'])[2]")
    //@FindBy(xpath="(//ul[@class='nav nav-pills icons-holder launchers-list'])[1]")
    //@FindBy(xpath = "(//*[@class='dropdown-menu dropdown-menu__action-cell launchers-dropdown-menu'])[1]")
    @FindBy(xpath = "//ul[@class='nav nav-pills icons-holder launchers-list']//*[@class='launcher-item']//a")
    public List<WebElement> threeDots;


    @FindBy(xpath = "//ul[@class='nav nav-pills icons-holder launchers-list']//li//a")
    private List<WebElement> dropdownItems;

    // Dropdown öğelerini alır
    public List<WebElement> getDropdownItems() {
        return dropdownItems;

/*
    @FindBy(tagName = "dropdown")
    public WebElement dropdown;

*/
//

    }
}