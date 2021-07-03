package in.anand.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestWelcomeController {
	
	@GetMapping("/welcome")
	public String welcomePage()
	{
		String msg="This is the welcome page";
		
		return msg;
	}

}
