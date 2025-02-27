package com.fleet_project_group5.pages;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehicleContractPage extends BasePage {
    public VehicleContractPage() {

    }
    @FindBy(xpath ="//span[.='Vehicle Contracts']")
    public WebElement vehicleContractsButton;

    @FindBy(xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement youDoNotHavePermission;


}
