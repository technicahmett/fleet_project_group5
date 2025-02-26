package com.fleet_project_group5.step_definitions;

import com.fleet_project_group5.pages.VehiclesPage;
import com.fleet_project_group5.utilities.BrowserUtils;
import com.fleet_project_group5.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static com.fleet_project_group5.utilities.BrowserUtils.*;

public class US06_StepDefs {
    VehiclesPage page = new VehiclesPage();

    @When("user hover over to Fleet Button")
    public void userHoverOverToFleetButton() {
        BrowserUtils.sleep(2);
        hover(page.fleetButton);
    }

    @And("user clicks Vehicles Button")
    public void userClicksVehiclesButton() {
        BrowserUtils.sleep(2);
        page.vehicles.click();
    }

    @Then("user hover over to three dots")
    public void userHoverOverToThreeDots() {

        BrowserUtils.sleep(3);
        hover(page.threeDots);

        //getElementsText(page.threeDots);
        List<WebElement> listOfThreeDots=Driver.getDriver().findElements(By.xpath("(//ul[@class='nav nav-pills icons-holder launchers-list'])[1]"));
        System.out.println("---------------------------------");


        for (WebElement each : listOfThreeDots) {
            System.out.println(each.getText());
        }
    }
    @Then("user should see three icon on the dropdown")
    public void user_should_see_three_icon_on_the_dropdown(List<String> exceptedList) {
        List<String> actualList = BrowserUtils.dropdownOptions_as_STRING(page.dropdown);

        Assert.assertEquals(exceptedList, actualList);
    }


}