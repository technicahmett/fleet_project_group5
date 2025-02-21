package com.fleet_project_group5.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US06_StepDefs {
    @When("user goto Fleet Button")
    public void userGotoFleetButton() {
        System.out.println("Run Fleet button");
    }

    @And("user clicks Vehicles Button")
    public void userClicksVehiclesButton() {
        System.out.println("Run Click vehicles button");
    }

    @Then("user goto three dots")
    public void userGotoThreeDots() {
        System.out.println("Run Three dots");
    }
}
