package webdriver.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

/**
 * Created by logachev-vv on 11.10.2016.
 */
public class Select extends BaseElement {

    public Select(final By locator, final String name) {
        super(locator, name);
    }

    public Select(String string, String name) {
        super(string, name);
    }


    protected String getElementType() {
        return getLoc("loc.select");
    }

    public boolean isEnabled(){
        return this.getElement().isEnabled();
    }

    public Select(By locator) {
        super(locator);
    }

    public void setValue(final String value)
    {
        waitForIsElementPresent();
        type(value);
    }

    public void type(final String value) {
        waitForIsElementPresent();
        info(String.format(getLoc("loc.text.typing") + " '%1$s'", value));
        if (browser.getDriver() instanceof JavascriptExecutor) {
            ((JavascriptExecutor)browser.getDriver()).executeScript("arguments[0].style.border='3px solid red'", element);
        }
        element.sendKeys(value);
    }
}
