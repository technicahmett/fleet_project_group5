package com.fleet_project_group5.step_definitions;

import com.fleet_project_group5.pages.US06_Page;
import com.fleet_project_group5.utilities.BrowserUtils;
import com.fleet_project_group5.utilities.ConfigurationReader;
import com.fleet_project_group5.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class US06_StepDefs {
    US06_Page page = new US06_Page();

    @When("user goto Fleet Button as {string}")
    public void userGotoFleetButtonAs(String userType) {
        if (userType.equalsIgnoreCase("driver")) {
            page.fleetButtonForDriver.click();
        } else if (userType.equalsIgnoreCase("sales manager")) {
            page.fleetButtonForSM.click();
        } else if (userType.equalsIgnoreCase("store manager")) {
            page.fleetButtonForSM.click();
        }
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
