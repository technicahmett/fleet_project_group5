package com.fleet_project_group5.pages;

import com.fleet_project_group5.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US11_CarOdometerPage extends BasePage{
    public US11_CarOdometerPage() {
    }

    @FindBy(xpath = "//input[@value='1']")
    public WebElement defaultPageNumber;

    @FindBy(xpath = "//button[@class='btn dropdown-toggle ']")
    public WebElement viewPerPage;

    @FindBy(xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement errorMessage;








}
