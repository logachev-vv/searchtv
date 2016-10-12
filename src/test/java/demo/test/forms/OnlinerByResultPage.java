package demo.test.forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webdriver.BaseForm;
import webdriver.elements.CheckBox;
import webdriver.elements.Label;
import webdriver.elements.Select;
import webdriver.elements.TextBox;

import java.util.List;

/**
 * Created by logachev-vv on 11.10.2016.
 */
public class OnlinerByResultPage extends BaseForm {
    private CheckBox chbManufacturer = new CheckBox(By.xpath("//input[@value='samsung']/following-sibling::span"), "Manufacturer");
    private TextBox tbFirst = new TextBox(By.xpath("//input[@placeholder='до']"), "Max Price");
    private TextBox tbSecond = new TextBox(By.xpath("//input[@placeholder='2010']"), "Min Year");
    private Select sFirstDiagonal = new Select(By.xpath("//select[contains(@data-bind,'from')]"), "Min Diagonal");
    private Select sSecondDiagonal = new Select(By.xpath("//select[contains(@data-bind,'to')]"), "Max Diagonal");

    public OnlinerByResultPage() {
        super(By.xpath("//div/h1[.='Телевизоры']"), "TV result");
    }

    public void setParametres() throws InterruptedException {
        chbManufacturer.click();
        tbFirst.setText("1000");
        tbSecond.setText("2013");
        sFirstDiagonal.setValue("39\"");
        sSecondDiagonal.setValue("42\"");
        Thread.currentThread().sleep(1000) ;
    }

    public void analysisSearchResults() throws InterruptedException {

        int X=((List<WebElement>) browser.getDriver().findElements(By.xpath("//*[@id='schema-products']//span[contains(text(),'Samsung')]"))).size();
        int j=0;
        for (int i=0; i<X;i++,j++)
        {
            if (j==2)
                j++;
            Label lblTemp = new Label(By.xpath("//*[@id='schema-products']/div[" +(j+1)+ "]//span[contains(text(),'Samsung')]"), "TV"+(i+1));
            lblTemp.click();
            browser.waitForPageToLoad();
            OnlinerByTVPage obtp=new OnlinerByTVPage();
            obtp.searchCorrectInfo(i+1);
            browser.getDriver().navigate().back();
            browser.waitForPageToLoad();
        }
    }
}
