package serenitydojo.cucumber.parallel.search;

import org.openqa.selenium.By;

class SearchResultList {
    static By SEARCH_RESULT_ROWS = By.xpath("//table[@id='resultTable']/tbody/tr");
    static By SEARCH_RESULT_GROUP_IDS = By.xpath("//table[@id='resultTable']/tbody/tr/td[1]");
    static By SEARCH_RESULT_ARTIFACT_IDS = By.xpath("//table[@id='resultTable']/tbody/tr/td[2]/a[1]");
    static By SEARCH_RESULT_VERSION_IDS = By.xpath("//table[@id='resultTable']/tbody/tr/td[3]/a[1]");
}
