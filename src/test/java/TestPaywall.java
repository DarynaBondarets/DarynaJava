import com.codeborne.selenide.SelenideElement;
import org.junit.Test;

import java.util.Arrays;

import static com.codeborne.selenide.Selenide.*;

public class TestPaywall extends BaseTest {

    @Test
    public void task(){
        open ("https://stage.amomama.xyz/409163-im-waiting-for-mom-girl-says-to-park-2.html");
        sleep(500);
        $x("//button[contains(text(),\"Unlock Now\")]").click();
        sleep(500);
        $x("//*[@id=\"email\"]").setValue("daryna@gmail.com");
        sleep(500);
        switchTo().window(0).navigate();
        $x("//span[contains(text(),\"AGREE\")]").click();
        sleep(500);
        $x("//*[@id=\"Amazon\"]").selectRadio("Amazon");
        sleep(500);
        $x("//button[contains(text(),\"Purchase and Unlock\")]").click();
        sleep(500);
        $x("//button[contains(text(),\"Read for free\")]").click();
        sleep(500);
        $x("//*[@data-testid=\"related-posts\"]").scrollIntoView("{block: \"end\"}");
        sleep(500);
    }


}
