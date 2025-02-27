package com.fleet_project_group5.step_definitions;

import com.fleet_project_group5.pages.MainModulesPage;
import com.fleet_project_group5.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class US01MainModules_StepDefs {

    MainModulesPage mainModulesPage = new MainModulesPage();

    @Then("the user should see the following modules:")
    public void the_user_should_see_the_following_modules(List<String> expectedModules) {
        mainModulesPage.waitUntilLoaderScreenDisappear();
        Assert.assertEquals(expectedModules, BrowserUtils.getElementsText(mainModulesPage.moduleElements));
        System.out.println("Expected Modules: " + expectedModules);
        System.out.println("Actual Modules: " + BrowserUtils.getElementsText(mainModulesPage.moduleElements));
    }
}



