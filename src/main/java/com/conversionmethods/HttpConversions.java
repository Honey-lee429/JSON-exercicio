package com.conversionmethods;

import org.json.HTTP;
import org.json.JSONObject;

public class HttpConversions {
	private static void HTTPToExampleConversion() {

		//We start with a JSONObject
		//The JSONObject must have the minimun header for a HTTP request or header

		String string = "{\"Method\":\"POST\",\"Request-URI\":'/',\"HTTP-Version\":'HTTP/1.1',\"Value1\":true,\"Value2\":2,\"Value3\":-2.345E68}";

		JSONObject example = new JSONObject(string);

		//We obtain a String with HTTP format with toString()

		String output = HTTP.toString(example);
		System.out.println("Final HTTP: " + output);
	}

	private static void HTTPFromExampleConversion() {

		//We start with a string with  the HTTP format

		String string = "Final HTTP: POST '/' HTTP/1.1 Value3: -2.345E+68 Value1: true Value2: 2";

		//We obtain a JSONObject with toJSONOBject()

		JSONObject output = HTTP.toJSONObject(string);
		System.out.println("Final JSONObject: " + output);
	}
	

	
}
