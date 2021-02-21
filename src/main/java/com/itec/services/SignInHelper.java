package com.itec.services;

public class SignInHelper {
	
	
	
	public static String signIn(String user, String pass) {
		
		String[] userJohnSmiley = {"John", "Smiley"};
		String[] userSallyBirdsong = {"Sally", "Birdsong"};
		
		if(user.equals(userJohnSmiley[0])) {
			if(pass.equals(userJohnSmiley[1])) {
				return userJohnSmiley[0];
			} else {
				return "invalid";
			}
		} else if(user.equals(userSallyBirdsong[0])) {
			if(pass.equals(userSallyBirdsong[1])) {
				return userSallyBirdsong[0];
			} else {
				return "invalid";
			}
		} else {
			return "invalid";
		}
	}

}
