package com.itec.services;

import java.util.Calendar;

public class ModalPicker {

	public static int evenOrOdd() {
		Calendar cal = Calendar.getInstance();
		int day = cal.get(Calendar.DAY_OF_MONTH);
		return day%2;
	}
	
}
