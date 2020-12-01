package day07;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RadioButtonTest {
    // 1.Bir class oluşturun : RadioButtonTest
    // 2. Gerekli yapiyi olusturun ve aşağıdaki görevi tamamlayın.
    //  - https://www.facebook.com adresine gidin
    //  - “Create an Account” button’una basin
    //  - “radio buttons” elementlerini locate edin
    //  - Secili degilse cinsiyet butonundan size uygun olani secin
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
    @Test
    public void adreseGit(){
        driver.get("https://www.facebook.com");
        //  - “Create an Account” button’una basin
        driver.findElement(By.id("u_0_2")).click();
        //  - “radio buttons” elementlerini locate edin
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement femaleButtonu= driver.findElement(By.id("u_1_4"));

        //  WebElement maleButtonu= driver.findElement(By.id("u_1_5"));
        //   WebElement CUSTOMbUTTONU= driver.findElement(By.id("u_1_6"));

        //  - Secili degilse cinsiyet butonundan size uygun olani secin
        if(!femaleButtonu.isSelected()){
            femaleButtonu.click();
        }
    }

    @After
    public void tearDown(){
        driver.close();
    }




}
