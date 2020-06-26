package co.com.choucair.services.soaprest.stepdefinitions;

import co.com.choucair.services.soaprest.questions.LastResponseStatus;
import co.com.choucair.services.soaprest.tasks.AddNumbers;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepDefinitionsSoapAddNumbers {

    @When("^you add two number$")
    public void youAddTwoNumber(List<String> values) {
        theActorInTheSpotlight().attemptsTo(AddNumbers.with(values));

    }

    @Then("^I should see the response of the servvices is (\\d+)$")
    public void iShouldSeeTheResponseOfTheServvicesIs(int code) {
        theActorInTheSpotlight().should(
                seeThat("last response status code is 200", LastResponseStatus.isEqualsTo(code)) );

    }

}
