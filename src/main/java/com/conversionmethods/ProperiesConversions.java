package com.conversionmethods;

import java.util.Properties;

import org.json.JSONObject;
import org.json.Property;

public class ProperiesConversions {
	private static Properties PropertyToExampleConversion() {

	//Instancia JSONObject em novo JSONObject passando o valor string

	String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";
	JSONObject example = new JSONObject(string);

	//Coverte uma String com formato Property com toProperties() e imprime
	Properties output = Property.toProperties(example);
	System.out.println("Final Properties: " + output);
	
	return output;
	}

	private static void PropertyFromExampleConversion() {

		//Inicia Properties object do metodo PropertyToExampleConversion

		Properties input = PropertyToExampleConversion();

		//converte um JSONObject com toJSONOBject() e passa o valor input

		JSONObject output = Property.toJSONObject(input);
		System.out.println("Final JSONObject: " + output);
	}

}
