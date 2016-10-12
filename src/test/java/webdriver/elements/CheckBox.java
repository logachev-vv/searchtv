package webdriver.elements;

import org.openqa.selenium.By;

/**
 * Created by logachev-vv on 11.10.2016.
 */
public class CheckBox extends BaseElement {

    public CheckBox(final By locator, final String name) {
        super(locator, name);
    }

    public CheckBox(String string, String name) {
        super(string, name);
    }


    protected String getElementType() {
        return getLoc("loc.checkbox");
    }

    public boolean isEnabled(){
        return this.getElement().isEnabled();
    }

    public CheckBox(By locator) {
        super(locator);
    }

}
