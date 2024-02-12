package com.indonesia.pages.provisions;

import com.indonesia.SeleniumUI5TestUtil;
import com.indonesia.pages.Page;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.stream.Collectors;

public class ProvisionsPage extends Page {

    private By SKUID = By.xpath("//*[@id='sku']");
    private By DescriptionID = By.xpath("//*[@id='description'][@type='text']");

    private By PlantID = By.xpath("//*[@id='plant'][@type='text']");

    private By BatchLotID = By.xpath("//*[@id='batchLot']");
    private By LocationID = By.xpath("//*[@id='location']");
    private By CategoryID = By.xpath("//*[@id='category'][@type='text']");

    private By QtyProvID = By.xpath("//*[@id='qtyProv']");
    private By NameID = By.xpath("//*[@class='inputbox inputborder saveScenName']");
    private By Save = By.xpath("//*[@class='btn btn-primary btn-big btn btn-primary']");
    private By cancel = By.xpath("//*[@class='btn btn-primary btn-big width-auto btn btn-primary']");
    private By clickOnArrowbutton = By.xpath("//div//span[@class='c']");

    private By searchbutton = By.xpath("//*[@class='upose-select__value-container upose-select__value-container--is-multi upose-select__value-container--has-value css-hlgwow']");
    private By columnsID = By.xpath("//input[@class='upose-select__input']");

    private By SearchboxID = By.xpath("//div[@class='svalue']//div[text()='Search']");

    private By DetailledView = By.xpath("//a[@href='/DetailedView']");

    private By Maximum = By.xpath("//*[@id='controlled-tab-example-tabpane-business_view']/div/div/div[2]/div/div[1]/div[2]/span[2]/span/img");

    private By CAH = By.xpath("//div[text()='Please select sku's to create a list']");
    private By CBPBtn = By.xpath("//button[@class='btn-slim btn-published  ']");
    public static By dropDownPath = By.xpath("//div[@class = 'custom_checkbox']");
    public static By PRdropDownPath = By.xpath("//div[@class = 'custom_radio']");
    public static By businessgroupDropDownPath = By.xpath("//*[@id='businessGroup']/div[1]/button");
    public static By columnsDropDownPath = By.xpath("//div[contains(@id,'custom_column_filter')]");
    public static By plantDropDownPath = By.xpath("//div[contains(@id,'plant')]");
    public static By categoryDropDownPath = By.xpath("//div[contains(@id,'category')]");
    public static By expirydateDropDownPath = By.xpath("//div[@css='[object Object]' and @id='expiryCategory']");
    public static By provisionquantityDropDownPath = By.xpath("//div[contains(@id,'quantityFilter')]");
    public static By losstreeDropDownPath = By.xpath("//div[contains(@id,'lossTree')]");



    private By DetailedViewPageNavigationButton = By.xpath("//div[text()='Detailed View']");
    private By ERVPageNavigationButton = By.xpath("//ul//li//div[text()='ERV']");
    private By BusinessViewPageNavigationButton = By.xpath("//*[@class='nav-item' and @role='presentation'][1]");
    private By ProvisionsPageNavigationButton = By.xpath("//*[@class='nav-item' and @role='presentation'][2]");
    Actions actions = new Actions(SeleniumUI5TestUtil.getConfig().getDriver());

    public void navigateToDetailedViewPage() throws Exception {
        clickElement(DetailedViewPageNavigationButton);

    }
    public void navigateToERVPage() throws Exception {
        clickElement(ERVPageNavigationButton);
    }



    public void navigateToProvisionsPage() throws Exception {
        clickElement(ProvisionsPageNavigationButton);
    }

    public boolean checkColumnDisplayonprovisions(String columnName) throws Exception {
        waitForPageToLoad();
        waitForTableToLoad();
        boolean flag = false;
        if (getElements(By.xpath("//*[@id='root']/div/div/div[2]/div/div[2]/div/div/div[1]/div/div/div/div")).size() > 0) {
            flag = true;
        }
        return flag;
    }

    public boolean dropDownsContainsValues(
            List<WebElement> dropDowns, List<String> requiredDropDown) {
        List<String> dropDownNames =
                dropDowns.stream().map(WebElement::getText).collect(Collectors.toList());
        return dropDownNames.containsAll(requiredDropDown);
    }
    public void clickCBPBtn() throws Exception {
        waitForPageToLoad();
        clickElement(CBPBtn);
        waitForPageToLoad();
    }

    public WebElement getCBTElement() throws Exception {
        waitForPageToLoad();
        return getElement(CBPBtn);
    }

//    public void clickDisabledBtn() throws Exception {
//        waitForPageToLoad();
//        WebElement element=portalDriver.findElement(By.xpath("//button[@class='btn-slim btn-published  ']")).isDisabled();
//        Assertions.isTrue("The element should not be enabled", isElementDisabled);
//    }

    public void clickandhold() throws Exception {
        waitForPageToLoad();
        clickAndHold(CAH);
        waitForPageToLoad();
    }

    public void clickcancel() throws Exception {
        waitForPageToLoad();
        clickElement(cancel);
    }
    public void clickOnArrowbutton() throws Exception {
        waitForPageToLoad();
        clickElement(clickOnArrowbutton);
    }

    public void selectDropDownOption(String filterValue) throws Exception {
        clickElement(By.xpath("//div[text()='" + filterValue + "' and @class='custom_checkbox']"));
    }

    public void selectDropDownOptionForColumnsFilter(String filterValue) throws Exception {
        clickElement(By.xpath("//div[text()='Select all' and @class='custom_checkbox']"));
        clickElement(By.xpath("//div[text()='" + filterValue + "' and @class='custom_checkbox']"));
    }


    public void clickDropDown(String column) throws Exception {
        waitForPageToLoad();
        //WebElement dropDownElement = null;
        switch (column) {
            case "Business Group":
                clickElement(By.xpath("//*[@id='businessGroup']/div[1]/button"));
                break;
            case "Plant":
                clickElement(By.xpath("//div[contains(@id,'plant')]"));
                 //getElement(plantDropDownPath);
                break;
            case "Category filter":
                clickElement(By.xpath("//div[contains(@id,'category')]"));
//                getElement(categoryDropDownPath);
                break;
            case "Expiry date":
                clickElement(By.xpath("//div[contains(@id,'expiryCategory')]"));
//                getElement(expirydateDropDownPath);
                break;
            case "Provision Quantity":
                getElement(provisionquantityDropDownPath);
                break;
            case "Loss Tree":
                getElement(losstreeDropDownPath);
                break;
            case "Columns":
                clickElement(By.xpath("//div[contains(@id,'custom_column_filter')]"));
//                getElement(columnsDropDownPath);
                break;
        }
    }

    public void clickDetailledView() throws Exception {
        waitForPageToLoad();
        clickElement(DetailledView);
    }
    public void clickButtonMaximum(String maximum) throws Exception {
        waitForPageToLoad();
        clickElement(Maximum);
    }

    public List<WebElement> getDropDowns1(String dropDown) throws Exception {
        waitForTableToLoad();
        WebElement dropDownElement = null;
        switch (dropDown) {
            case "Business Group":
                dropDownElement = getElement(businessgroupDropDownPath);
                break;
            case "Plant":
                dropDownElement = getElement(plantDropDownPath);
                break;
            case "Category filter":
                dropDownElement = getElement(categoryDropDownPath);
                break;
            case "Expiry date":
//                clickElement(By.xpath("//div[contains(@id,'expiryCategory')]"));
               dropDownElement = getElement(expirydateDropDownPath);
                break;
            case "Provision Quantity":
                dropDownElement = getElement(provisionquantityDropDownPath);
                break;
            case "Loss Tree":
                dropDownElement = getElement(losstreeDropDownPath);
                break;
            case "Columns":
                dropDownElement = getElement(columnsDropDownPath);
                break;
        }
        assert dropDownElement != null;
        dropDownElement.click();
        waitForElementToLoad();
        return getElements(dropDownPath);
    }

    public List<WebElement> getDropDowns2(String PRdropDown) throws Exception {
        waitForTableToLoad();
        WebElement dropDownElement = null;
        dropDownElement = getElement(provisionquantityDropDownPath);
        assert dropDownElement != null;
        dropDownElement.click();
        waitForElementToLoad();
        return getElements(PRdropDownPath);
    }
    public void waitForElementToLoad() throws Exception {
        portalDriver.waitFor(2000);
        portalDriver.waitForLoad();
    }

    public void enterSKU(String SKU) throws Exception {
        waitForPageToLoad();
        getElement(SKUID).sendKeys(SKU);
    }

    public void enterDescription(String Description) throws Exception {
        waitForPageToLoad();
        getElement(DescriptionID).sendKeys(Description);
    }

    public void enterPlant(String Plant) throws Exception {
        waitForPageToLoad();
        getElement(PlantID).sendKeys(Plant);
    }

    public void enterBatchLot(String BatchLot) throws Exception {
        waitForPageToLoad();
        getElement(BatchLotID).sendKeys(BatchLot);
    }

    public void enterLocation(String Location) throws Exception {
        waitForPageToLoad();
        getElement(LocationID).sendKeys(Location);
    }


    public void enterCategory(String Category) throws Exception {
        waitForPageToLoad();
        getElement(CategoryID).sendKeys(Category);
    }

    public void enterQtyProv(String QtyProv) throws Exception {
        waitForPageToLoad();
        getElement(QtyProvID).sendKeys(QtyProv);
        clickElement(By.xpath("//*[@title='Toggle Row Selected'][1]"));
        clickElement(CBPBtn);
        getElement(NameID).sendKeys("Bidding");
        clickElement(Save);
    }
    public void selectcheckbox(String filtercheckbox) throws Exception {
        clickElement(By.xpath("//*[@title='Toggle Row Selected'][1]"));
    }

    public void entercolumns(String columns) throws Exception {
        waitForPageToLoad();
//        clickElement(searchbutton);
        getElement(columnsID).sendKeys(columns);
//        JavascriptExecutor js = (JavascriptExecutor)portalDriver;
//        js.executeScript("arguments[0].value='Plant';",SearchboxID);

        //div[@class='svalue']//div[text()='Search']

    }
    public void clickcolumnsDropDownPath() throws Exception {
        clickElement(columnsDropDownPath);
    }
    public void clickplantDropDownPath() throws Exception {
        clickElement(plantDropDownPath);
    }

    public void validateDescription(String Description) throws Exception {
        waitForPageToLoad();
        int count = getElements(By.xpath("//*[@id='controlled-tab-example-tabpane-business_view']/div/div/div[2]/div/div[3]/div[1]/div/div[2]/div/div[3]/span")).size();
        for (int i = 0; i < count; i++) {
            String text = getElements(By.xpath("//*[@id='controlled-tab-example-tabpane-business_view']/div/div/div[2]/div/div[3]/div[1]/div/div[2]/div/div[3]/span")).get(i).getText();
            System.out.println(text);
            Assert.assertEquals(Description, text);
        }
    }

    public void validatePlant(String Plant) throws Exception {
        waitForPageToLoad();
        int count = getElements(By.xpath("//*[@id='controlled-tab-example-tabpane-business_view']/div/div/div[2]/div/div[3]/div[1]/div/div[2]/div[1]/div[4]/span")).size();
        for (int i = 0; i < count; i++) {
            String text = getElements(By.xpath("//*[@id='controlled-tab-example-tabpane-business_view']/div/div/div[2]/div/div[3]/div[1]/div/div[2]/div[1]/div[4]/span")).get(i).getText();
            System.out.println(text);
            Assert.assertEquals(Plant, text);
        }
    }


    public void validateBatchLot(String BatchLot) throws Exception {
        waitForPageToLoad();
        int count = getElements(By.xpath("//*[@id='controlled-tab-example-tabpane-business_view']/div/div/div[2]/div/div[3]/div[1]/div/div[2]/div[1]/div[6]/span")).size();
        for (int i = 0; i < count; i++) {
            String text = getElements(By.xpath("//*[@id='controlled-tab-example-tabpane-business_view']/div/div/div[2]/div/div[3]/div[1]/div/div[2]/div[1]/div[6]/span")).get(i).getText();
            System.out.println(text);
            Assert.assertEquals(BatchLot, text);
        }
    }


    public void validatecategory(String category) throws Exception {
        waitForPageToLoad();
        int count = getElements(By.xpath("//*[@id='controlled-tab-example-tabpane-business_view']/div/div/div[2]/div/div[3]/div[1]/div/div[2]/div[1]/div[11]/span")).size();
        for (int i = 0; i < count; i++) {
            String text = getElements(By.xpath("//*[@id='controlled-tab-example-tabpane-business_view']/div/div/div[2]/div/div[3]/div[1]/div/div[2]/div[1]/div[11]/span")).get(i).getText();
            System.out.println(text);
            Assert.assertEquals(category, text);
        }
    }


    public void validatelocation(String category) throws Exception {
        waitForPageToLoad();
        int count = getElements(By.xpath("//*[@id='controlled-tab-example-tabpane-business_view']/div/div/div[2]/div/div[3]/div[1]/div/div[2]/div[1]/div[5]/span")).size();
        for (int i = 0; i < count; i++) {
            String text = getElements(By.xpath("//*[@id='controlled-tab-example-tabpane-business_view']/div/div/div[2]/div/div[3]/div[1]/div/div[2]/div[1]/div[5]/span")).get(i).getText();
            System.out.println(text);
            Assert.assertEquals(category, text);
        }
    }

    //*[@id="controlled-tab-example-tabpane-business_view"]/div/div/div[2]/div/div[3]/div[1]/div/div[2]/div[1]/div[4]/span
    //*[@id='controlled-tab-example-tabpane-business_view']/div/div/div[2]/div/div[3]/div[1]/div/div[2]/div[1]/div[4]/span

    public void validateselectedcheckboxname(String value) throws Exception {
        waitForPageToLoad();
        int count = getElements(By.xpath("//*[@id='controlled-tab-example-tabpane-business_view']/div/div/div[2]/div/div[3]/div[1]/div/div[1]/div/div[4]")).size();
        for (int i = 0; i < count; i++) {
            String text = getElements(By.xpath("//*[@id='controlled-tab-example-tabpane-business_view']/div/div/div[2]/div/div[3]/div[1]/div/div[1]/div/div[4]")).get(i).getText();
            System.out.println(text);
            Assert.assertEquals(value, text);
        }
    }

    public void validateselectedtextedname(String columns) throws Exception {
        waitForPageToLoad();
        int count = getElements(By.xpath("//div[@class='upose-select__menu-list upose-select__menu-list--is-multi css-qr46ko']")).size();
        for (int i = 0; i < count; i++) {
            String text = getElements(By.xpath("//div[@class='upose-select__menu-list upose-select__menu-list--is-multi css-qr46ko']")).get(i).getText();
            System.out.println(text);
            Assert.assertEquals(columns, text);
        }
    }

    public void validateSKU(String SKU) throws Exception {
        waitForPageToLoad();
        int count = getElements(By.xpath("//*[@id='controlled-tab-example-tabpane-business_view']/div/div/div[2]/div/div[3]/div[1]/div/div[2]/div/div[2]/span")).size();
        for (int i = 0; i < count; i++) {
            String text = getElements(By.xpath("//*[@id='controlled-tab-example-tabpane-business_view']/div/div/div[2]/div/div[3]/div[1]/div/div[2]/div/div[2]/span")).get(i).getText();
            System.out.println(text);
            Assert.assertEquals(SKU, text);
        }
    }

    public boolean checkFilterValueDisplay(String value) throws Exception {
        waitForPageToLoad();
        waitForTableToLoad();
        List<WebElement> elements = getElements(By.xpath("//span[text()='" + value + "']"));
        return elements.size() > 1;
    }
}