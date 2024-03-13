package string_program;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

@Test
public class a_Emi_Calculator
{
	@Test
	public void test()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://emicalculator.net/");
		List<WebElement> ele1 = driver.findElements(By.xpath("//*[name()='g' and @class='highcharts-markers highcharts-series-2 highcharts-spline-series highcharts-tracker']/*"));
		Actions act=new Actions(driver);
		for(WebElement web:ele1)
		{
			act.moveToElement(web).perform();
			List<WebElement> tooltips = driver.findElements(By.xpath("//*[name()='g' and @class='highcharts-label highcharts-tooltip highcharts-color-undefined']//*[name()='text']/*"));
			for(WebElement web1:tooltips)
			{
				String text=web1.getText();
				System.out.println(text);
			}
		}
	}
}
