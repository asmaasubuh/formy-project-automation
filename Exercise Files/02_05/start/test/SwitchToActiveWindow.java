import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/user/Desktop/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");
        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click();

        String originalHandle = driver.getWindowHandle(); // to get the current window handle

        for(String handle1: driver.getWindowHandles()){
            driver.switchTo().window(handle1);
        }// to skip to the second tab that is opened we used this for loop

        driver.switchTo().window(originalHandle); // get back to the original handle
        driver.quit();
    }
}
