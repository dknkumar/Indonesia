package com.indonesia.teststeps.provisions;

//import com.indonesia.pages.Provisions.ProvisionsPage;
import com.indonesia.pages.CommonComponentPage;
import com.indonesia.pages.LauncherPage;
import com.indonesia.pages.provisions.ProvisionsPage;
import com.indonesia.teststeps.common.CommonTestSteps;
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


    @Then("User should be able to download the results in .xlsx format in an excel sheet")
    public void userShouldBeAbleToDownloadTheResultsInXslxFormatInAnExcelSheet() throws Exception {
        CommonTestSteps.verifyFileIsDownloaded("detailedView_details.xlsx");
    }

    @Then("User should be able to download the dataBase results in .xlsx format in an excel sheet")
    public void userShouldBeAbleToDownloadTheDataBaseResultsInXslxFormatInAnExcelSheet() throws Exception {
        CommonTestSteps.verifyFileIsDownloaded("DataBase_details.xlsx");
    }

    @Then("Downloaded data in the excel sheet must be same as showing in the Home page.")
    public void downloadedDataInTheExcelSheetMustBeSameAsShowingInTheHomePage() throws Exception {
        Thread.sleep(10000);
        provisionsPage.checkDownloadFile();
    }


    @When("click on button {string} on provision")
    public void clickOnButtonGo(String buttonName) throws Exception {
        switch (buttonName) {

            case "Download":
                provisionsPage.clickOnDownloadButton();
                break;
            case "DataBase":
                provisionsPage.clickOnDataBaseButton();
                break;

        }
    }

    @Then("Verify all the filters are present on provisions")
    public void VerifyallthefiltersarepresentOnProvisions(List<String> columnList)
            throws Exception {
        for (String columnName : columnList) {
            assertTrue(provisionsPage.checkColumnDisplayonprovisions(columnName));
        }
    }

}