package com.fleet_project_group5.pages;

import com.fleet_project_group5.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Us07_pageExpect {
    public Us07_pageExpect() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//span[@class='title title-level-1']")
        public WebElement expected;
    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement expected2;
}
