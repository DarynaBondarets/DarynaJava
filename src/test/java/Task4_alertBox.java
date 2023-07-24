import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;

import java.nio.file.Path;

import static com.codeborne.selenide.Selenide.*;

public class Task4_alertBox extends BaseTest{
    
    @Test
    public void task(){
        open ("https://testpages.herokuapp.com/alert.html");
        sleep(500);
        $x("//*[@id=\"alertexamples\"]").click();
        sleep(500);
        switchTo().alert().accept();

    }

    @Test
    public void task1() {
        open("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
        sleep(500);
        $x("//*[@id=\"alertexamples\"]").click();
        sleep(500);
        switchTo().alert().accept();
        sleep(500);

    }

    @Test
    public void task2() {
        open("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
        sleep(500);
        $x("//*[@id=\"confirmexample\"]").click();
        sleep(500);
        switchTo().alert().accept();
        $x("//*[@id=\"confirmreturn\"]").shouldHave(Condition.text("true"));
    }

    @Test
    public void task3() {
        open("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
        sleep(500);
        $x("//*[@id=\"confirmexample\"]").click();
        sleep(500);
        switchTo().alert().dismiss();
        $x("//*[@id=\"confirmreturn\"]").shouldHave(Condition.text("false"));
    }
    @Test
    public void task4() {
        open("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
        sleep(500);
        $x("//*[@id=\"promptexample\"]").click();
        sleep(500);
        switchTo().alert().sendKeys("kek");
        $x("//*[@id=\"promptreturn\"]").shouldHave(Condition.text("kek"));
    }
}
