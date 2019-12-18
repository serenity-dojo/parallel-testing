package serenitydojo.cucumber.parallel.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.util.EnvironmentVariables;
import serenitydojo.cucumber.parallel.search.ArtifactDetails;
import serenitydojo.cucumber.parallel.search.SearchFor;
import serenitydojo.cucumber.parallel.search.SearchResult;
import serenitydojo.cucumber.parallel.navigation.NavigateTo;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchStepDefinitions {

    @Steps
    NavigateTo navigateTo;

    @Steps
    SearchFor searchFor;

    @Steps
    SearchResult searchResult;

    @Steps
    ArtifactDetails artifactDetails;

    EnvironmentVariables environmentVariables;

    @Given("^(?:.*) is on the search page")
    public void i_am_on_the_DuckDuckGo_home_page() {
        navigateTo.theMavenSearchPage();
    }

    @Given("^(?:.*) has searched for \"(.*)\"")
    public void has_searched_for(String term) {
        navigateTo.theMavenSearchPage();
        searchFor.term(term);
    }

    @When("^s?he searches for \"(.*)\"")
    public void search_for(String term) {
        searchFor.term(term);
    }

    @When("^s?he selects the version number")
    public void selects_the_version_number() {
        searchResult.selectVersionNumber();
    }

    @When("^s?he selects the group id")
    public void selects_the_group_id() {
        searchResult.selectGroupId();
    }

    @Then("the following artifacts should be proposed:")
    public void artifacts_proposed(List<String> artifacts) {
        assertThat(searchResult.artifacts()).containsAll(artifacts);
    }

    @Then("^the artifact details for (.*) should be displayed")
    public void theArtifactDetailsShouldBeDisplayed(String artifactId) {
        assertThat(artifactDetails.getCoordinates()).contains(artifactId);
    }

    @io.cucumber.java.en.Then("all the artifacts for the {string} group should be displayed")
    public void allTheArtifactsForTheGroupShouldBeDisplayed(String groupId) {
        assertThat(searchResult.groupIds()).allMatch(id -> id.equals(groupId));
    }

    @io.cucumber.java.en.Then("the result list should be empty")
    public void theResultListShouldBeEmpty() {
        assertThat(searchResult.groupIds()).contains("No records found, try new search criteria.");
    }
}
