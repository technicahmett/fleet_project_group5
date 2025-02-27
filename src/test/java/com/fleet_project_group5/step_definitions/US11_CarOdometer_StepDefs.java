package com.fleet_project_group5.step_definitions;

import com.fleet_project_group5.pages.BasePage;
import com.fleet_project_group5.pages.US11_CarOdometerPage;
import com.fleet_project_group5.utilities.BrowserUtils;
import com.fleet_project_group5.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class US11_CarOdometer_StepDefs {
    US11_CarOdometerPage carOdometerPage = new US11_CarOdometerPage();


    @When("user hover over Fleet Button")
    public void user_HoverOver_FleetButton() {
        BrowserUtils.sleep(2);
        BrowserUtils.hover(carOdometerPage.fleetButton);
    }


    @And("user clicks Vehicle Odometer Button")
    public void user_clicks_Vehicle_odometer_button() {
        BrowserUtils.sleep(1);
        carOdometerPage.VehicleOdometerButton.click();
    }

    @Then("user sees the default page value as {string}")
    public void user_sees_the_default_page_value_as(String expectedPageNumber) {

        String actualPageNumber = carOdometerPage.defaultPageNumber.getAttribute("value");
        Assert.assertEquals(expectedPageNumber, actualPageNumber);

    }

    @Then("user sees the View Per Page as {string} by default")
    public void user_sees_theViewPerPage_as_by_default(String expectedViewPerPage) {
        String actualViewPerPage = carOdometerPage.viewPerPage.getText();
        Assert.assertEquals(expectedViewPerPage, actualViewPerPage);

    }

    @Then("user should see the error message")
    public void user_should_see_the_error_message() {

        carOdometerPage.errorMessage.isDisplayed();
    }


}
