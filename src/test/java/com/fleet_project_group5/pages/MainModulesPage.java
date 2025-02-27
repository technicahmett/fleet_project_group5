package com.fleet_project_group5.pages;

import com.fleet_project_group5.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;

public class MainModulesPage {


    public MainModulesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Sayfada bulunan ana modülleri temsil eden web elementleri
    @FindBy(xpath = "//span[@class='title']") // Modül isimleri içeren locator
    public List<WebElement> moduleElements;

    // Sayfadaki modül isimlerini liste olarak döndür
    public List<String> getModuleNames() {
        return moduleElements.stream().map(WebElement::getText).collect(Collectors.toList());
    }
}


