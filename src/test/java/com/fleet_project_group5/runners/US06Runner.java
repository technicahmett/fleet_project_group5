package com.fleet_project_group5.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = "src/test/resources/features",
        glue = "com/fleet_project_group5/step_definitions",
        dryRun = false,

        //tags="@driver06",
        //tags="@salesManager06"
        //tags = "@storeManager06"
        tags="@wip06",

         publish = true //generating a report with public link
)

public class US06Runner {}