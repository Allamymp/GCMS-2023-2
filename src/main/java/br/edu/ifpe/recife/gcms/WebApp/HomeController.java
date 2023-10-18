package br.edu.ifpe.recife.gcms.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/")
	public @ResponseBody String greeting() {
		return "Hello, World!!!!";
	}

	@RequestMapping("/fulano")
	public @ResponseBody String greetingFulano() {
		return "Hello, Fulano!";
	}

	@RequestMapping("/rafael")
	public @ResponseBody String greetingRafael() {
		return "Hello, Rafael!?!?";
	}
	
	@RequestMapping("/hotfix")
	public @ResponseBody String greetingHotfix() {
		return "Hello, Hotfix!!!";
	}


}
