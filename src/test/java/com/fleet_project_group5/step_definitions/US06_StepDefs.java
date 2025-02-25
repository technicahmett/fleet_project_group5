package com.fleet_project_group5.step_definitions;

import com.fleet_project_group5.pages.VehiclesPage;
import com.fleet_project_group5.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US06_StepDefs {
    VehiclesPage page = new VehiclesPage();

    @When("user goto Fleet Button")
    public void userGotoFleet() {
        page.fleetButton.click();

    }

    @And("user clicks Vehicles Button")
    public void userClicksVehiclesButton() {
        //BrowserUtils.sleep(3);
        page.vehicles.click();
    }

    @Then("user goto three dots")
    public void userGotoThreeDots() {

        BrowserUtils.sleep(6);
        //Actions actions = new Actions(Driver.getDriver());
        //actions.moveToElement(page.threeDots).click().perform();
        page.threeDots.click();
    }


}