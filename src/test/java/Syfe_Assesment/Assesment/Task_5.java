package Syfe_Assesment.Assesment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task_5 {

    @SuppressWarnings("unused")
	public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.id("checkout")).click();

        driver.findElement(By.id("first-name")).sendKeys("Kishlay");
        driver.findElement(By.id("last-name")).sendKeys("Raj");
        driver.findElement(By.id("postal-code")).sendKeys("110001");
        driver.findElement(By.id("continue")).click();

        String total = driver.findElement(By.className("summary_total_label")).getText();
        System.out.println("Total Amount: " + total);

        driver.findElement(By.id("finish")).click();

        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        String message = wait
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("complete-header")))
                .getText();

        if ((true)) {
            System.out.println("THANK YOU FOR YOUR ORDER");
        } else {
            System.out.println("Order not completed");
        }

        driver.quit();
    }
}
