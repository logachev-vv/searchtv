package demo.test;

import demo.test.forms.OnlinerByCatalogPage;
import demo.test.forms.OnlinerByMainPageForm;
import demo.test.forms.OnlinerByResultPage;
import webdriver.BaseTest;

public class DemoTest extends BaseTest {

	
	public void runTest() throws InterruptedException {
		logger.step(1);
		OnlinerByMainPageForm obmpf = new OnlinerByMainPageForm();
		obmpf.clickOnLabel();
		logger.step(2);
		OnlinerByCatalogPage obcp = new OnlinerByCatalogPage();
		obcp.clickOnLabel();
		logger.step(3);
		OnlinerByResultPage obrp=new OnlinerByResultPage();
		obrp.setParametres();
		logger.step(4);
		obrp.analysisSearchResults();
	}
}
