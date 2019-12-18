package serenitydojo.cucumber.parallel.navigation;

import net.thucydides.core.annotations.Step;

public class NavigateTo {

    MavenSearchPage homePage;

    @Step("Open the Maven Search page")
    public void theMavenSearchPage() {
        homePage.open();
    }
}
