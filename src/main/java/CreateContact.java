import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class CreateContact {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://crm.geekbrains.space/user/login");
        driver.findElement(By.name("_username")).sendKeys("Applanatest1");
        driver.findElement(By.name("_password")).sendKeys("Student2020!");
        driver.findElement(By.id("_submit")).click();
        {
            WebElement element = driver.findElement(By.xpath("//a/span[text()=\'Контрагенты\']"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.xpath("//a/span[text()=\'Контактные лица\']")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Создать контактное лицо")).click();
        driver.findElement(By.xpath("//input[@name=\'crm_contact[lastName]\']")).sendKeys("Sent");
        driver.findElement(By.xpath("//input[@name=\'crm_contact[firstName]\']")).sendKeys("Alice");
        driver.findElement(By.xpath("//span[text()=\'Укажите организацию\']")).click();
        driver.findElement(By.xpath("//div[text()=\'«Все организации»\']")).click();
        driver.findElement(By.xpath("//input[@name=\'crm_contact[jobTitle]\']")).sendKeys("Хлеб");
        driver.findElement(By.cssSelector(".btn-group:nth-child(4) > .btn")).click();
        driver.quit();
    }
}
