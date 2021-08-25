import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class CreateProject {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://crm.geekbrains.space/user/login");
        driver.findElement(By.name("_username")).sendKeys("Applanatest1");
        driver.findElement(By.name("_password")).sendKeys("Student2020!");
        driver.findElement(By.id("_submit")).click();
        {
            WebElement element = driver.findElement(By.xpath("//a/span[text()=\'Проекты\']"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.linkText("Мои проекты")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Создать проект")).click();
        driver.findElement(By.xpath("//input[@name=\'crm_project[name]\']")).sendKeys("Yf");

        driver.findElement(By.className("select2-chosen")).click();
        driver.findElement(By.xpath("//div[text()=\'«Все организации»\']")).click();
        {
            WebElement dropdown = driver.findElement(By.xpath("//select[@name=\'crm_project[priority]\']"));
            dropdown.findElement(By.xpath("//option[. = 'Средний']")).click();
        }
        {
            WebElement dropdown = driver.findElement(By.xpath("//select[@name=\'crm_project[financeSource]\']"));
            dropdown.findElement(By.xpath("//option[. = 'Из средств заказчика']")).click();
        }
        {
            WebElement dropdown = driver.findElement(By.xpath("//select[@name=\'crm_project[businessUnit]\']"));
            dropdown.findElement(By.xpath("//option[. = 'Research & Development']")).click();
        }
        {
            WebElement dropdown = driver.findElement(By.xpath("//select[@name=\'crm_project[curator]\']"));
            dropdown.findElement(By.xpath("//option[. = 'Андреев Сергей']")).click();
        }
        {
            WebElement dropdown = driver.findElement(By.xpath("//select[@name=\'crm_project[rp]\']"));
            dropdown.findElement(By.xpath("//option[. = 'Амелин Владимир']")).click();
        }
        {
            WebElement dropdown = driver.findElement(By.xpath("//select[@name=\'crm_project[manager]\']"));
            dropdown.findElement(By.xpath("//option[. = 'Антонов Дмитрий']")).click();
        }
        driver.findElement(By.cssSelector(".btn-group:nth-child(4) > .btn")).click();
        driver.quit();
    }
}
