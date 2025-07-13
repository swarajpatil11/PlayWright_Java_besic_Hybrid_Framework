package utilities;

import java.nio.file.Paths;

import com.base.baseclass;
import com.microsoft.playwright.Page;

public class Screenshot extends baseclass {

	public static String screenshot(String name) {

		String path = System.getProperty("user.dir") + "/target/screenshot/" + name + ".png";

		page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get(path)).setFullPage(true));

		return path;

	}

}
