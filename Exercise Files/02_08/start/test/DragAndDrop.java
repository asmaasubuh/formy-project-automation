import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/user/Desktop/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dragdrop");
        WebElement image = driver.findElement(By.id("image"));

        WebElement box = driver.findElement(By.id("box"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(image,box).build().perform(); //drag and drop takes to elements source and destination then we add build and perform function for it to run


        driver.quit();
    }
}

