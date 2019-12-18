package serenitydojo.cucumber.parallel.search;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;

import java.util.List;
import java.util.stream.Collectors;

public class SearchResult extends UIInteractionSteps {
    public List<String> artifacts() {
        return findAll(SearchResultList.SEARCH_RESULT_ARTIFACT_IDS)
                .stream()
                .map(WebElementFacade::getTextContent)
                .collect(Collectors.toList());
    }

    public List<String> groupIds() {
        return findAll(SearchResultList.SEARCH_RESULT_GROUP_IDS)
                .stream()
                .map(WebElementFacade::getTextContent)
                .collect(Collectors.toList());
    }

    public void selectVersionNumber() {
        $(SearchResultList.SEARCH_RESULT_VERSION_IDS).click();
    }

    public void selectGroupId() {
        $(SearchResultList.SEARCH_RESULT_GROUP_IDS).click();
    }

}
