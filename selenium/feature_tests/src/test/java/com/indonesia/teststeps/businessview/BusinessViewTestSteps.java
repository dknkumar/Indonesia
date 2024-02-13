package com.indonesia.teststeps.businessview;

import com.indonesia.pages.BusinessView.BusinessViewPage;
import com.indonesia.pages.CommonComponentPage;
import com.indonesia.pages.LauncherPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.util.List;

import static com.indonesia.pages.Page.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BusinessViewTestSteps {
    String executionDuration, executionDurationRange, executionDurationRangeMin, executionDurationRangeMax;
    private BusinessViewPage businessViewPage = new BusinessViewPage();
    private LauncherPage launcherPage = new LauncherPage();
    private CommonComponentPage commonComponentPage = new CommonComponentPage();

    @And("^the (BusinessView|Provisions) tab is opened on DetailedView page$")
    public void theTabIsOpenedonDetailedViewpage(String tabName) throws Exception {
        //manageAlertsPage.switchToFrame(manageAlertsPage.iFrame);
        //Assert.assertEquals("Manage Users",manageAlertsPage.getPageTitle());
        if(tabName.equals("Business View")) {
            businessViewPage.navigateToBusinessViewPage();
        } else {
            businessViewPage.navigateToProvisionsPage();
        }
        Thread.sleep(4000);
    }



    @And("^the (Summary|DetailedView|ERV) tab is opened$")
    public void theTabIsOpened(String tabName) throws Exception {
        //manageAlertsPage.switchToFrame(manageAlertsPage.iFrame);
        //Assert.assertEquals("Manage Users",manageAlertsPage.getPageTitle());
        if(tabName.equals("Detailed View")) {
            businessViewPage.navigateToERVPage();
        } else {
            businessViewPage.navigateToDetailedViewPage();
        }
        Thread.sleep(5000);
    }


    @Then("Verify all the filters are present")
    public void Verifyallthefiltersarepresent(List<String> columnList)
            throws Exception {
        for (String columnName : columnList) {
            assertTrue(businessViewPage.checkColumnDisplay(columnName));
        }
    }

    @Then("<{string}> should have following drop-down values")
    public void shouldHaveFollowingDropDownValues(String dropDown, List<String> dropDownValues)
            throws Exception {
        assertTrue(
                businessViewPage.dropDownsContainsValues(
                        businessViewPage.getDropDowns1(dropDown), dropDownValues));
    }

    @Then("<{string}> should have following drop-down PR values")
    public void shouldHaveFollowingDropDownPRValues(String PRdropDown, List<String> PRdropDownValues)
            throws Exception {
        assertTrue(
                businessViewPage.dropDownsContainsValues(
                        businessViewPage.getDropDowns2(PRdropDown), PRdropDownValues));
    }

    @And("the CBP button is clicked in the businessview page")
    public void theCBPButtonIsClickedInTheBusinessViewPage() throws Exception {
        businessViewPage.clickCBPBtn();
    }


    @And("verify the CBP button is disabled in the businessview page")
    public void theCBPButtonIsDisabledInTheBusinessViewPage() throws Exception {
        assertTrue(businessViewPage.getCBTElement().isEnabled());
    }

    @And("the clickandhold the pop")
    public void theClickAndHoldThePop() throws Exception {
        businessViewPage.clickandhold();

    }

    @Then("Verify toast message {string}")
    public void verifyToastMessage(String message) throws Exception {
        waitForPageToLoad();
        assertTrue(getElement(By.xpath("//div//p[text()='" + message + "']")).isDisplayed());
    }

    @And("click on cancel")
    public void clickOnCancel() throws Exception {
        businessViewPage.clickcancel();

    }
    @And("click on arrow on the Detailed view screen's right side")
    public void clickOnArrowbutton() throws Exception {
        businessViewPage.clickOnArrowbutton();

    }

    @And("^Select the column (.+) '(.+)' value")
    public void selectTheColumnColumnValueValue(String column, String value) throws Exception {
        businessViewPage.clickDropDown(column);
        businessViewPage.selectDropDownOption(value);
    }

    @And("^Select the columns (.+) '(.+)' value for ColumnsFilter")
    public void selectTheColumnColumnValueForColumnsFilter(String column, String filtername) throws Exception {
        businessViewPage.clickDropDown(column);
        businessViewPage.selectDropDownOptionForColumnsFilter(filtername);
    }

    @When("click on button {string}")
    public void clickOnButtonMaximum(String Maximum) throws Exception {
        businessViewPage.clickButtonMaximum(Maximum);
    }

    @And("click on DetailledView")
    public void clickOnDetailledView() throws Exception {
        businessViewPage.clickDetailledView();
        businessViewPage.navigateToBusinessViewPage();

    }

    @And("click on ProvisionTab in the DetailledView Page")
    public void clickOnProvisionTabInTheDetailledViewPage() throws Exception {
        businessViewPage.clickDetailledView();
        businessViewPage.navigateToProvisionsPage();

    }

    @And("the {string} is entered into the SKU filter in BusinessView page")
    public void theSKUIsEnteredIntoTheSKUFilterInSNRPage(String SKU) throws Exception {
        businessViewPage.enterSKU(SKU);
    }
    @And("the {string} is entered into the Description filter in BusinessView page")
    public void theDescriptionIsEnteredIntoTheDescriptionFilterInSNRPage(String Description) throws Exception {
        businessViewPage.enterDescription(Description);
    }

    @And("the {string} is entered into the Plant filter in BusinessView page")
    public void thePlantIsEnteredIntoThePlantFilterInSNRPage(String Plant) throws Exception {
        businessViewPage.enterPlant(Plant);
    }

    @And("the {string} is entered into the BatchLot filter in BusinessView page")
    public void thePlantIsEnteredIntoTheBatchLotFilterInSNRPage(String BatchLot) throws Exception {
        businessViewPage.enterBatchLot(BatchLot);
    }

    @And("the {string} is entered into the Location filter in BusinessView page")
    public void theLocationtIsEnteredIntoTheLocationFilterInSNRPage(String Location) throws Exception {
        businessViewPage.enterLocation(Location);
    }

    @And("the {string} is entered into the Category filter in BusinessView page")
    public void thePlantIsEnteredIntoTheCategoryFilterInSNRPage(String Category) throws Exception {
        businessViewPage.enterCategory(Category);
    }





    @And("the {string} is entered into the QtyProv filter in BusinessView page")
    public void theQtyProvIsEnteredIntoTheQtyProvFilterInSNRPage(String QtyProv) throws Exception {
        businessViewPage.enterQtyProv(QtyProv);
    }

    @And("select the displayed row on the table")
    public void selectTheDisplayedRowOnTheTable(String checkbox) throws Exception {
        businessViewPage.selectcheckbox(checkbox);
    }

    @And("the {string} is entered into the columns filter in BusinessView page")
    public void thecolumnsIsEnteredIntoThecolumnsFilterInSNRPage(String columns) throws Exception {
        businessViewPage.entercolumns(columns);
    }

    @When("^click columnsDropDownPath button$")
    public void user_click_cloumns_dropdown_path_button() throws Throwable {
        businessViewPage.clickcolumnsDropDownPath();
    }

    @When("^click PlantDropDownPath button$")
    public void user_click_plant_dropdown_path_button() throws Throwable {
        businessViewPage.clickplantDropDownPath();
    }

    @Then("verify the {string} must be present on the table")
    public void verifyTheCheckBoxMustBePresentOnTheTable(String value) throws Exception {
        businessViewPage.validateselectedcheckboxname(value);
    }

    @Then("verify the {string} must be present on the list")
    public void verifyTheCheckBoxMustBePresentOnTheList(String columns) throws Exception {
        businessViewPage.validateselectedtextedname(columns);
    }
    @Then("verify the {string} must be present in column1")
    public void verifyTheSKUMustBePresentInColumn1(String SKU) throws Exception {
        businessViewPage.validateSKU(SKU);
    }

    @Then("verify the {string} must be present in column2")
    public void verifyTheDescriptionMustBePresentInColumn2(String Description) throws Exception {
        businessViewPage.validateDescription(Description);
    }

    @Then("verify the {string} must be present in column3")
    public void verifyThePlantMustBePresentInColumn3(String Plant) throws Exception {
        businessViewPage.validatePlant(Plant);
    }

    @Then("verify the {string} must be present in column4")
    public void verifyTheBatchLotMustBePresentInColumn4(String BatchLot) throws Exception {
        businessViewPage.validateBatchLot(BatchLot);
    }

    @Then("verify the {string} must be present in column5")
    public void verifyTheCategoryMustBePresentInColumn5(String category) throws Exception {
        businessViewPage.validatecategory(category);
    }

    @Then("verify the {string} must be present in column6")
    public void verifyTheLocationMustBePresentInColumn6(String location) throws Exception {
        businessViewPage.validatelocation(location);
    }




    @Then("^Results should be displayed according to the Filter '(.+)' selected")
    public void resultsShouldBeDisplayedAccordingToTheColumnFilterValueSelected(String value) throws Exception {
        assertTrue(businessViewPage.checkFilterValueDisplay(value));
    }

}
