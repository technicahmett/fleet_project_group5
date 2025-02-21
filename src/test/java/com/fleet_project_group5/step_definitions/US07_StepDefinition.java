package com.fleet_project_group5.step_definitions;

import com.fleet_project_group5.pages.US07_Page;
import com.fleet_project_group5.utilities.BrowserUtils;
import com.fleet_project_group5.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.List;

public class US07_StepDefinition {


    US07_Page us07_page = new US07_Page();

    @When("user enters  fleet management page")
    public void user_enters_fleet_management_page() {
      us07_page.fleetButton.click();


    }
    @When("user enters inside Vehicles module")
    public void user_enters_inside_vehicles_module() {
        us07_page.fleetButton2.click();



    }
    @Then("user should see the all cars")
    public void user_should_see_the_all_cars() {
        BrowserUtils.verifyTitle("All - Car - Entities - System - Car - Entities - System");

    }
    @When("user selected all cars button click")
    public void user_selected_all_cars_button_click() {
        us07_page.fleetButton3.click();
        us07_page.fleetButton3.click();

    }


    @Then("user should see each cars selected")
    public void userShouldSeeEachCarsSelected() {
        us07_page.fleetButton4.click();

    }


    @Then("user should see more each cars selected")
    public void userShouldSeeMoreEachCarsSelected() {
        us07_page.fleetButton5.click();
    }
}

