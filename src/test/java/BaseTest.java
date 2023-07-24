import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.nio.file.Path;

public class BaseTest {
    {
        Path browserPath = WebDriverManager.chromedriver().getBrowserPath().stream().findFirst().get();
        Configuration.browserBinary = browserPath.toString();
    }
}
