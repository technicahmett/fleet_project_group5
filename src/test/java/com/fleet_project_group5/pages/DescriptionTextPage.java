package com.fleet_project_group5.pages;

import com.fleet_project_group5.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DescriptionTextPage extends BasePage {


    @FindBy(xpath = "//li[@class='dropdown dropdown-level-1'][4]")
    public WebElement activitiesButton;

    @FindBy(xpath = "//a[.='Calendar Events']")
    public WebElement calendarEvents;

    @FindBy(xpath = "//a[@class='btn main-group btn-primary pull-right ']")
    public WebElement createCalendarEvent;


    @FindBy(tagName = "iframe")
    public WebElement iframe;

    public void enterTextInIframe() {
        Driver.getDriver().switchTo().frame(iframe);
    }

    @FindBy(tagName = "p")
    public WebElement iframeText;

    @FindBy(xpath = "//li[@class='dropdown dropdown-level-1'][3]")
    public WebElement activitiesForDriver;



}




