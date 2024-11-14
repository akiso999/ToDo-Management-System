
package com.dmm.task;

import java.time.LocalDate;

public class Task implements Comparable<Task>{

	private LocalDate date;
	private String task;

	public Task(LocalDate date,String task) {
		this.date = date;
		this.task = task;
	}

	// compareToメソッドをオーバーライドする
	// 日付で並び替えるため、LocalDateのcompareToを使う
	@Override
	public int compareTo(Task t) {
		return this.date.compareTo(t.date);
	}

	@Override
	public String toString() {
		return this.date + ":" + this.task;
	}
}