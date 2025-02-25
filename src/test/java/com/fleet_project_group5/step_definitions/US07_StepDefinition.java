package com.fleet_project_group5.step_definitions;

import com.fleet_project_group5.pages.All_CarsPage;
import com.fleet_project_group5.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US07_StepDefinition {


    All_CarsPage allCarsPage = new All_CarsPage();

    @When("user enters  fleet management page")
    public void user_enters_fleet_management_page() {
        allCarsPage.fleetButton.click();
    }


    @When("user enters inside Vehicles module")
    public void user_enters_inside_vehicles_module() {
       allCarsPage.vehicleButton.click();


    }

     @When("user selected all cars button click")
       public void user_selected_all_cars_button_click () {
           allCarsPage.allCarsChooseButton.click();
           allCarsPage.allCarsChooseButton.click();
    }



       @Then("user should see each cars selected")
       public void userShouldSeeEachCarsSelected () {
           allCarsPage.eachButton.click();
           allCarsPage.eachButton1.click();
           allCarsPage.eachButton2.click();


       }


       @Then("user should see more each cars selected")
       public void userShouldSeeMoreEachCarsSelected () {


       }

    @Then("user should see the all cars")
    public void user_should_see_the_all_cars() {

        BrowserUtils.verifyTitle("All Cars");
    }


    @Then("user should see the {string}")
    public void userShouldSeeThe(String expectedTitle) {
        String actualTitle = allCarsPage.allCarsTitle.getText();
        Assert.assertEquals(actualTitle, expectedTitle);
    }



}


