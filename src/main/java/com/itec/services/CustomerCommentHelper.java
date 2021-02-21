package com.itec.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.itec.pojo.CityStateZip;

@Service
public class CustomerCommentHelper {
	
	public static List<String> getZipCodes(List<CityStateZip> cRepo){
	
		List<String> zipcodes = new ArrayList<String>();
		for (CityStateZip cityStateZip : cRepo) {
			zipcodes.add(cityStateZip.getZip());
		}
		return zipcodes;
	}

}
