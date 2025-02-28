package com.fleet_project_group5.step_definitions;

import com.fleet_project_group5.pages.BasePage;
import com.fleet_project_group5.pages.CarOdometerPage;
import com.fleet_project_group5.pages.VehicleContractPage;
import com.fleet_project_group5.pages.VehiclesPage;
import com.fleet_project_group5.utilities.BrowserUtils;
import com.fleet_project_group5.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static com.fleet_project_group5.utilities.BrowserUtils.hover;

public class US04_StepDefs  {
    VehicleContractPage vehicleContractPage = new VehicleContractPage();

    @When("the user hover overs to fleet button")
    public void the_user_hover_overs_to_fleet_button() {
       vehicleContractPage.waitUntilLoaderScreenDisappear();
        hover(vehicleContractPage.fleetButton);
    }
    @When("the user clicks to  Vehicle Contracts page")
    public void the_user_clicks_to_vehicle_contracts_page() {
        BrowserUtils.sleep(2);
        vehicleContractPage.vehicleContractsButton.click();
        System.out.println("==============================================");
    }
    @Then("the page title is {string}")
    public void the_page_title_is(String expectedTitle) {
        System.out.println("test here ???????????????????????????????????????????");
        BrowserUtils.sleep(2);
        System.out.println("Actual title " + Driver.getDriver().getTitle());
        BrowserUtils.verifyTitle(expectedTitle);

    }


    @Then("the URL is {string}")
    public void theURLIs(String expectedURL) {
        BrowserUtils.sleep(2);
        System.out.println("Actual URL " + Driver.getDriver().getCurrentUrl());
        BrowserUtils.verifyURLContains(expectedURL);
    }

    @Then("the user should see an error message {string}")
    public void theUserShouldSeeAnErrorMessage(String arg0) {
       if (vehicleContractPage.youDoNotHavePermission.isDisplayed()){
           System.out.println("Yes error is successfuly displayed");
       }else {
           System.out.println("No error cannot displayed please check your code");
       }



    }


    @And("the user should not have access to the Vehicle Contracts page")
    public void theUserShouldNotHaveAccessToTheVehicleContractsPage() {
    }
}





