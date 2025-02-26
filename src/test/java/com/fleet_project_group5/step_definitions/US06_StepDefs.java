package com.fleet_project_group5.step_definitions;

import com.fleet_project_group5.pages.VehiclesPage;
import com.fleet_project_group5.utilities.BrowserUtils;
import com.fleet_project_group5.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class US06_StepDefs {
    VehiclesPage page = new VehiclesPage();

    @When("user over hover to Fleet Button")
    public void userOverHoverToFleetButton() {
        BrowserUtils.sleep(2);
        page.fleetButton.click();
    }

    @And("user clicks Vehicles Button")
    public void userClicksVehiclesButton() {
        BrowserUtils.sleep(2);
        page.vehicles.click();
    }

    @Then("user over hover to three dots")
    public void userOverHoverToThreeDots() {

        BrowserUtils.sleep(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(page.threeDots).perform();
        BrowserUtils.sleep(6);


       // List<WebElement> listOfThreeDots=


    }


}