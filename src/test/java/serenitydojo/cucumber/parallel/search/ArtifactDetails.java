package serenitydojo.cucumber.parallel.search;

import net.serenitybdd.core.steps.UIInteractionSteps;

public class ArtifactDetails extends UIInteractionSteps {
    public String getCoordinates() {
        return $(ArtifactDetailsPage.ARTIFACT_COORDINATES).getText();
    }
}
