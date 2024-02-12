package com.indonesia.teststeps.provisions;

//import com.indonesia.pages.Provisions.ProvisionsPage;
import com.indonesia.pages.CommonComponentPage;
import com.indonesia.pages.LauncherPage;
import com.indonesia.pages.provisions.ProvisionsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.util.List;

import static com.indonesia.pages.Page.getElement;
import static com.indonesia.pages.Page.waitForPageToLoad;
import static org.junit.Assert.assertTrue;

public class ProvisionsTestSteps {
    String executionDuration, executionDurationRange, executionDurationRangeMin, executionDurationRangeMax;
    private ProvisionsPage provisionsPage = new ProvisionsPage();
    private LauncherPage launcherPage = new LauncherPage();
    private CommonComponentPage commonComponentPage = new CommonComponentPage();

    @And("click on DetailledView and provisions")
    public void clickOnDetailledViewAndProvisions() throws Exception {
        provisionsPage.clickDetailledView();
        provisionsPage.navigateToProvisionsPage();

    }

    @Then("Verify all the filters are present on provisions")
    public void VerifyallthefiltersarepresentOnProvisions(List<String> columnList)
            throws Exception {
        for (String columnName : columnList) {
            assertTrue(provisionsPage.checkColumnDisplayonprovisions(columnName));
        }
    }

}