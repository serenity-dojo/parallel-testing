package serenitydojo.cucumber.parallel.search;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

public class SearchHomepageFor extends UIInteractionSteps {

    @Step("Search for term {0}")
    public void term(String term) {
        $(SearchFormHomepage.SEARCH_FIELD_HOMEPAGE).type(term, Keys.ENTER);
    }
}
