import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/user/Desktop/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");
        WebElement alertWindow = driver.findElement(By.id("alert-button"));
        alertWindow.click();

        Alert alert = driver.switchTo().alert();// in order to switch driver focus to the alert window
        alert.accept();


        driver.quit();
    }
}
