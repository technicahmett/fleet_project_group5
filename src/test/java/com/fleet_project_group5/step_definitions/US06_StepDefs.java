package com.fleet_project_group5.step_definitions;

import com.fleet_project_group5.pages.VehiclesPage;
import com.fleet_project_group5.utilities.BrowserUtils;
import com.fleet_project_group5.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static com.fleet_project_group5.utilities.BrowserUtils.*;

public class US06_StepDefs {
    VehiclesPage page = new VehiclesPage();

    @When("user over hover to Fleet Button")
    public void userOverHoverToFleetButton() {
        BrowserUtils.sleep(2);
        hover(page.fleetButton);
    }

    @And("user clicks Vehicles Button")
    public void userClicksVehiclesButton() {
        BrowserUtils.sleep(2);
        page.vehicles.click();
    }

    @Then("user over hover to three dots")
    public void userOverHoverToThreeDots() {

        BrowserUtils.sleep(3);
        hover(page.threeDots);

        //getElementsText(page.threeDots);
        //List<WebElement> listOfThreeDots=driver
        System.out.println("---------------------------------");
        System.out.println("dropdownOptions_as_STRING(page.threeDots) = " + dropdownOptions_as_STRING(page.threeDots));;


    }


}