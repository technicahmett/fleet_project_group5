package com.fleet_project_group5.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainModulesPage extends BasePage {

    @FindBy(xpath = "//span[@class='title title-level-1']")
    public List<WebElement> moduleElements;

}


