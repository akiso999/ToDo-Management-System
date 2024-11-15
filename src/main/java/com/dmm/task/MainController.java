
package com.dmm.task;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
	    
	    // 前月分の LocalDateを求める
	    DayOfWeek w = day.getDayOfWeek();  // 当該日の曜日を取得
	    day = day.minusDays(w.getValue());  // 1日からマイナスして 10/27を取得
	    
	    
	    //繰り返す
	    for(int i = 1; i <= 7; i++) {
	    
	    	//最終週かどうかの判定
	    	if (条件式){
	    		  
	    		}else{
	    		  
	    		}
	    	
	    	// 1週目（1日ずつ増やして 週のリストに格納していく）
	    	for(int j = 1; j <= 7; j++) {
	    		week.add(day);  // 週のリストへ格納
	    		day = day.plusDays(1);  // 1日進める
	    	}
	    	month.add(week);  // 1週目のリストを、月のリストへ格納する

	    	week = new ArrayList<>();  // 次週のリストを新しくつくる
	    
	    	
	    }
	    return "main";
	   
	}
		
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}

}