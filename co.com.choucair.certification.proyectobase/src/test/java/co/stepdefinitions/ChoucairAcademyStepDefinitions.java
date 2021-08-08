package co.stepdefinitions;

import co.model.AcademyChoucairData;
import co.questions.Answer;
import co.tasks.Login;
import co.tasks.OpenUp;
import co.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage () { OnStage.setTheStage(new OnlineCast());}


    @Given("^than Jennifer want to learn automation at the Academy Choucair$")
    public void thanJenniferWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorCalled( "Jennifer").wasAbleTo(OpenUp.thePage(), (Login.onThePage(academyChoucairData.get(0).getStrUser(), academyChoucairData.get(0).getStrPassword())));

    }


    @When("^she search for the course (.*) on the choucair academy platforms$")
    public void sheSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatforms(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));

    }


    @Then("^she finds the course called (.*)$")
    public void sheFindsTheCourseCalledRecursosAutomatizaciónBancolombia(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));


    }



}
