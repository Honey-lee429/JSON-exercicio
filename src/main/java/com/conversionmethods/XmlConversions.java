package com.conversionmethods;

import org.json.JSONObject;
import org.json.XML;

public class XmlConversions {
	public static void main(String[] args) {
		XMLFromExampleConversion();
	}
	
	private static void XMLFromExampleConversion() {

		/**
		 * inicializa um String com formato XML
		 */
		String string = "<0>value</0><1>5</1><2>-2.345E+68</2><3>true</3>";

		//Converte os dados xml com toJSONOBject() para  JSONObject
		JSONObject output = XML.toJSONObject(string);
		
		//imprime output
		System.out.println("Final JSONObject: " + output);
	}
	
	
	

}
