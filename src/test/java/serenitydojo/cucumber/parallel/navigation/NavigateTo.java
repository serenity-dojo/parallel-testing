package serenitydojo.cucumber.parallel.navigation;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;
import serenitydojo.cucumber.parallel.search.SearchForm;

import java.time.Duration;

public class NavigateTo extends UIInteractionSteps {

    MavenSearchPage homePage;

    @Step("Open the Maven Search page")
    public void theMavenSearchPage() {
        homePage.open();
        withTimeoutOf(Duration.ofSeconds(30)).waitFor(ExpectedConditions.elementToBeClickable(SearchForm.SEARCH_BUTTON));
    }
}
