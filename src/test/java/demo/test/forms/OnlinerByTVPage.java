package demo.test.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;

/**
 * Created by logachev-vv on 12.10.2016.
 */
public class OnlinerByTVPage extends BaseForm {

    public OnlinerByTVPage() {
        super(By.xpath("//h3[contains(text(),'Описание')]"), "TV page");
    }
    public void searchCorrectInfo(int i)
    {
        System.out.println("-----"+i+"-----");
        System.out.println(browser.getDriver().findElement(By.xpath("//div[@class='product-header']//h2")).getText());
        System.out.println(browser.getDriver().findElement(By.xpath("//div[@class='b-offers-desc__info-sub']/a[1]")).getText());
        System.out.println(browser.getDriver().findElement(By.xpath("//td[contains(text(),'Дата выхода')]//following-sibling::td/span")).getText());
        System.out.println(browser.getDriver().findElement(By.xpath("//td[contains(text(),'Диагональ экрана')]//following-sibling::td/span")).getText());
        System.out.println("----------");
    }

}
