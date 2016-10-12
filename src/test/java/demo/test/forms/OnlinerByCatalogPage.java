package demo.test.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Label;

/**
 * Created by logachev-vv on 11.10.2016.
 */
public class OnlinerByCatalogPage extends BaseForm  {
    private Label lblMenuItem = new Label(By.xpath("//li/a[.='Телевизоры']"), "TV");

    public OnlinerByCatalogPage() {
        super(By.xpath("//input[@name='query']"), "Catalog page");
    }

    public void clickOnLabel() {
        lblMenuItem.click();
        browser.waitForPageToLoad();
    }
}