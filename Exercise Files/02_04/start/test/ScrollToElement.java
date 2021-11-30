import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/user/Desktop/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");
        WebElement name = driver.findElement(By.id("name"));
        Actions actions = new Actions(driver);// 3shan nesta5dem moveToElemnt n3ml scroll 
        actions.moveToElement(name);
        name.sendKeys("Asmaa subuh");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("01/01/2020");


        driver.quit();
    }
}
