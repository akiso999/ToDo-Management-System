
package com.dmm.task;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/create")
	public String index() {
		return "create";
	}

	@RequestMapping("/edit")
	public String edit() {
		return "edit2";
	}
	
//	@RequestMapping("/testedit")
//	public String test() {
//		return "edit";
//	}

	@RequestMapping("/main")
	public String main() {
		return "main";
	}

	@RequestMapping("/login")
	public String login() {
		return "login";
	}

}