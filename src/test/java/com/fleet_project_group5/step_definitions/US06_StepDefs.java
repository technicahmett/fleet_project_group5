package com.fleet_project_group5.step_definitions;

import com.fleet_project_group5.pages.VehiclesPage;
import com.fleet_project_group5.utilities.BrowserUtils;
import com.fleet_project_group5.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

import static com.fleet_project_group5.utilities.BrowserUtils.*;
import static org.apache.commons.lang.ArrayUtils.contains;

public class US06_StepDefs {
    VehiclesPage page = new VehiclesPage();

    WebDriver driver;
    private List<WebElement> dropdownItems;

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

    @Then("user should see three icons named {string}, {string} and {string} in the dropdown menu")
    public void user_should_see_three_icons_View_Edit_And_Delete_in_the_dropdown(String title1, String title2, String title3) {
        // List<String> actualList = BrowserUtils.dropdownOptions_as_STRING(page.dropdown);
        // Assert.assertEquals(exceptedList, actualList);
        // List<WebElement> dropdownItems = driver.findElements(By.cssSelector("ul.nav.nav-pills.icons-holder.launchers-list li.launcher-item a"));
        // List<String> actualTitles = new ArrayList<>();

        String[] expectedItemsArray = {title1, title2, title3};

        for (int i = 0; i < page.threeDots.size(); i++) {
            String itemText = page.threeDots.get(i).getAttribute("title"); // 'title' attribute'u üzerinden öğe ismi
            System.out.println("Dropdown items: " + itemText);

            Assert.assertTrue("Doesnt Find excepted items: " + itemText, contains(expectedItemsArray, itemText));
        }
//        Assert.assertEquals(title1, actualTitles.get(0));
//        Assert.assertEquals(title2, actualTitles.get(1));
//        Assert.assertEquals(title3, actualTitles.get(2));

    }

}


