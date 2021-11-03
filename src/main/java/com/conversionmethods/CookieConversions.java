package com.conversionmethods;

import org.json.Cookie;
import org.json.JSONObject;

public class CookieConversions {
	
	 public static void main(String[] args) {
	        CookieToExampleConversion();
	        CookieFromExampleConversion();
	    }
	 
	private static void CookieToExampleConversion() {

		//Instancia um objeto JSONObject
		//inicia uma String no formato json

		String string = "{\"name\":\"Cookie-Name\",\"value\":\"name\",\"1\":5,\"2\":-2.345E68,\"3\":'true'}";
		JSONObject example = new JSONObject(string);
		
		//Tranforma o example em formato String com cookie e imprime
		String output = Cookie.toString(example);
		System.out.println("Final Cookie: " + output);
	}

	private static void CookieFromExampleConversion() {

		// inicializa a String com formato Cookie
		String string = "Cookie-Name=name;1=5;2=-2.345E%2b68;3=true";


		// Converte JsonObject com toJSONOBject() e imprime
		JSONObject output = Cookie.toJSONObject(string);
		System.out.println("Final JSONObject: " + output);
	}

}
