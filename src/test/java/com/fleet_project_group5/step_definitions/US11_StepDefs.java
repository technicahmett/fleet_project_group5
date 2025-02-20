package com.fleet_project_group5.step_definitions;

import com.fleet_project_group5.pages.CarOdometerPage;
import com.fleet_project_group5.utilities.BrowserUtils;
import com.fleet_project_group5.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class US11_StepDefs {
    CarOdometerPage page = new CarOdometerPage();


    @When("user hover over Fleet Button")
    public void user_Hover_Over_Fleet_Button() {
        BrowserUtils.sleep(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(page.fleetButton).perform();

        throw new io.cucumber.java.PendingException();
    }

    @And("user clicks Vehicle Odometer Button")
    public void userClicksVehicleOdometerButton() {
        // Write code here that turns the phrase above into concrete actions
        BrowserUtils.sleep(3);
        page.VehicleOdometerButton.click();
        throw new io.cucumber.java.PendingException();
    }

    @Then("user should see Car Odometer Info Page")
    public void user_should_see_car_odometer_ınfo_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }






    @Then("user should see the error message")
    public void userShouldSeeTheErrorMessage() {
    }
}
