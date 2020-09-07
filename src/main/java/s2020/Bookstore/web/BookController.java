package s2020.Bookstore.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller

public class BookController {
	
	@GetMapping("/index")
	@ResponseBody
	public String giveIndexPage() {
		return "This is the main page";
	}

}
