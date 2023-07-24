import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;

import java.nio.file.Path;
import java.util.Optional;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.cssClass;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;
import static com.codeborne.selenide.files.DownloadActions.click;
import static junit.framework.TestCase.assertEquals;


public class Task1 extends BaseTest{

    @Test
    public void task1() {


        open("https://testpages.herokuapp.com/styled/validation/input-validation.html");
        sleep(500);

        $("#firstname").setValue("Adrianna");
        $("#surname").setValue("Qweegyfugvjgv");
        $("#age").append("18"); // OR for dropdown $(By.id{"age")).selectOption(18);
        $("#country").selectOption("Angola"); // OR for dropdown $(By.id{"country")).selectOption("Angola");
        $("#notes").setValue("test");
        $x("//input[@type=\"submit\"]").click();  //OR $("button[type=submit]").click();
        sleep(1000);

        assertEquals(url(), "https://testpages.herokuapp.com/validate/input-validation");
        sleep(1000);

        $("#firstname-value").shouldHave(Condition.text("Adrianna"));
        $("#surname-value").shouldHave(Condition.text("Qweegyfugvjgv"));
        $("#age-value").shouldHave(Condition.text("18"));
        $("#country-value").shouldHave(Condition.text("Angola"));

    }

    @Test
    public void task2(){
        open ("https://testpages.herokuapp.com/styled/challenges/hard-selectors.html");
        sleep(1000);

        //$x("//button[@class=\"styled-click-button\"]").shouldHave(attribute("background-color", "green")).click();
        $x("//button[@class=\"styled-click-button\"]").click();
        sleep(1000);
        $x("//button[@class=\"styled-click-button-triggered\"]").shouldNotHave(Condition.attribute("background-color","green"));
    }


}
