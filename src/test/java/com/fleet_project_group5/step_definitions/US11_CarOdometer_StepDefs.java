package com.fleet_project_group5.step_definitions;

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

/*
    @When("user hover over Fleet Button")
    public void user_Hover_Over_Fleet_Button() {
        BrowserUtils.sleep(2);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(carOdometerPage.fleetButtonInDriver).perform();
    }
 */
Actions actions = new Actions(Driver.getDriver());
    @When("user hover over Fleet Button in Driver Page")
    public void user_HoverOver_FleetButton_InDriverPage() {
        BrowserUtils.sleep(2);
        actions.moveToElement(carOdometerPage.fleetButtonInDriver).perform();
    }

    @When("user hover over Fleet Button in Manager Page")
    public void user_HoverOver_FleetButton_InManagerPage() {
        BrowserUtils.sleep(2);
        actions.moveToElement(carOdometerPage.fleetButtonInManager).perform();
        BrowserUtils.sleep(2);
    }

    @And("user clicks Vehicle Odometer Button")
    public void userClicksVehicleOdometerButton() {
        BrowserUtils.sleep(1);
        carOdometerPage.VehicleOdometerButton.click();
    }

    @Then("user should see the error message")
    public void userShouldSeeTheErrorMessage() {
        carOdometerPage.errorMessage.isDisplayed();
    }


    @Then("user sees the default page value as {string}")
    public void userSeesTheDefaultPageValueAs(String expectedPageNumber) {

      //String actualPageNumber= carOdometerPage.defaultPageNumber.getText();
       //Assert.assertEquals(actualPageNumber, expectedPageNumber);

    }


    @Then("user sees the View Per Page as {string} by default")
    public void user_sees_the_view_per_page_as_by_default(String string) {

    }



}
