package com.fleet_project_group5.step_definitions;

import com.fleet_project_group5.pages.All_CarsPage;
import com.fleet_project_group5.pages.VehiclesPage;
import com.fleet_project_group5.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US07_StepDefinition {


    VehiclesPage vehiclesPage = new VehiclesPage();

    @When("user enters  fleet management page")
    public void user_enters_fleet_management_page() {
        vehiclesPage.fleetButton.click();
    }


    @When("user enters inside Vehicles module")
    public void user_enters_inside_vehicles_module() {
        vehiclesPage.vehicleButton.click();


    }

    @When("user selected all cars button click")
    public void user_selected_all_cars_button_click() {
        vehiclesPage.allCarsChooseButton.click();
        vehiclesPage.allCarsChooseButton.click();
    }


    @Then("user should see each cars selected")
    public void userShouldSeeEachCarsSelected() {
        vehiclesPage.eachButton.click();


    }


    @Then("user should see more each cars selected")
    public void userShouldSeeMoreEachCarsSelected() {


    }

    @Then("user should see the all cars")
    public void user_should_see_the_all_cars() {

        BrowserUtils.verifyTitle("All Cars");
    }


    @Then("user should see the {string}")
    public void userShouldSeeThe(String expectedTitle) {
        String actualTitle = vehiclesPage.allCarsTitle.getText();
        Assert.assertEquals(actualTitle, expectedTitle);
    }


}


