package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utility.Utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopsPage extends Utilities {
    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());

    public DesktopsPage() {
        PageFactory.initElements(driver, this);
    }




    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Desktops')]")
    WebElement desktopsText;
    public ArrayList<String> getProductsNameList() {
        log.info("Select option from " + desktopsText.toString());
        List<WebElement> products = getListOfElements(By.xpath("//h2[contains(text(),'Desktops')]"));
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        return originalProductsName;
    }

    @FindBy(xpath = "//h4/a")
    List<WebElement> productsList;
    public void selectProductByName(String product) {
        log.info("Select option from " + productsList.toString());
        List<WebElement> products = getListOfElements(By.xpath("//h4/a"));
        for (WebElement e : products) {
            if (e.getText().equals(product)) {
                e.click();
                break;
            }
        }
    }
    @FindBy(id = "input-sort")
    WebElement sortBy;
    public void selectSortByOption(String option) throws InterruptedException {
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(sortBy, option);
        log.info("Select " + option + " to sort by " + sortBy.toString());
    }
    public boolean isSorted() throws InterruptedException {
        List<String> sortedList= getProductsNameList();
        Collections.sort(sortedList,String.CASE_INSENSITIVE_ORDER);
        Collections.reverse(sortedList);
        return getProductsNameList().equals(sortedList);
    }

}