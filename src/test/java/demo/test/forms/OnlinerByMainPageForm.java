package demo.test.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Label;

/**
 * Created by logachev-vv on 11.10.2016.
 */
public class OnlinerByMainPageForm extends BaseForm {
    private Label lblMenuItem = new Label(By.xpath("//span[.='Каталог']"),"Catalog");

    public OnlinerByMainPageForm() {
        super(By.xpath("//input[@name='query']"), "Onliner.by");
    }

public void clickOnLabel(){
    lblMenuItem.click();
    browser.waitForPageToLoad();
}

}
