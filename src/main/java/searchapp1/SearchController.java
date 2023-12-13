package searchapp1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SearchController {

	@RequestMapping("/home")
	public String home() {
		System.out.println("hdjdjd");
		return "home";
	}

}
