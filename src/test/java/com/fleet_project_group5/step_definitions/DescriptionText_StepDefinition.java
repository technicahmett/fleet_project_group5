package com.fleet_project_group5.step_definitions;

import com.fleet_project_group5.pages.DescriptionTextPage;
import com.fleet_project_group5.utilities.BrowserUtils;
import com.fleet_project_group5.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;


public class DescriptionText_StepDefinition {
    DescriptionTextPage descriptionPage = new DescriptionTextPage();


@Given("the user hover over on Activities button")
public void the_user_hover_over_on_activities_button() {

    descriptionPage.waitUntilLoaderScreenDisappear();
    Actions actions = new Actions(Driver.getDriver());
    actions.moveToElement(descriptionPage.activitiesButton).perform();

}
@Given("the user clicks on Calendar Event button.")
public void the_user_clicks_on_calendar_event_button() {
    BrowserUtils.sleep(5);
    descriptionPage.calendarEvents.click();

}
@Given("the user clicks on Create Calendar Event button.")
public void the_user_clicks_on_create_calendar_event_button() {

    BrowserUtils.sleep(10);
    descriptionPage.createCalendarEvent.click();
}
@When("the user enters text into theDescription field")
    public void the_user_enters_text_into_the_description_field() {
     descriptionPage.enterTextInIframe();
     descriptionPage.waitUntilLoaderScreenDisappear();
     descriptionPage.iframeText.sendKeys("Hello World");
Driver.getDriver().switchTo().defaultContent();



}
@Then("the entered text should be displayed in the Description field")
public void the_entered_text_should_be_displayed_in_the_description_field() {

    Driver.getDriver().switchTo().frame(descriptionPage.iframe);

    String actualText = descriptionPage.iframeText.getText();
    String expectedText = "Hello World";

    BrowserUtils.assertEquals("Description field text does not match!", expectedText, actualText);

}
    @Given("the user hover over on Activities button for driver")
    public void theUserHoverOverOnActivitiesButtonForDriver() {
        descriptionPage.waitUntilLoaderScreenDisappear();
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(descriptionPage.activitiesForDriver).perform();



    }


}