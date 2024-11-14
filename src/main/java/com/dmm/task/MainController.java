
package com.dmm.task;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import antlr.collections.List;

@Controller
public class MainController {

	@GetMapping("/create")
	public String index() {
		return "create";
	}

	@GetMapping("/edit")
	public String test() {
		return "edit";
	}

	@GetMapping("/main")
	public String main() {

	    // 週と日を格納する二次元配列を用意する
	    List<List<LocalDate>> month = new ArrayList<>();
	    
	    // 1週間分のLocalDateを格納するListを用意する
	    List<LocalDate> week = new ArrayList<>();
	    
	 // 日にちを格納する変数を用意する
	    LocalDate day;

	    // その月の1日を取得する
	    day = LocalDate.now();  // 現在日時を取得
	    day = LocalDate.of(day.getYear(), day.getMonthValue(), 1);  // 現在日時からその月の1日を取得
	    
	    
	}
		
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}

}