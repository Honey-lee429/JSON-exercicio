package com.conversionmethods;

import org.json.CDL;
import org.json.JSONArray;
import org.json.JSONObject;

public class CdlConversions {
	private static void CDLToExampleConversion() {

		// Instancia JsonObject com os valores e chaves da string
		String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";
		JSONObject example = new JSONObject(string);
		
		String string2 = "{\"0\":\"value2\",\"1\":6,\"2\":-8.345E68,\"3\":false}";
		JSONObject example2 = new JSONObject(string2);
		
		//cria um JsonArray e adiciona exemple e example2

		JSONArray array = new JSONArray();
		array.put(example);
		array.put(example2);

		//converte o array em formato CDL com toString() e imprime
		String output = CDL.toString(array);
		System.out.println("Final CDL: \r\n" + output);
	}
	
	private static void CDLFromExampleConversion() {

		//inicia uma String com fomato CDL

		String string = "0,1,2,3\n"
				+ "value,5,-2.345E+68,true\n"
				+ "value2,6,-8.345E+68,false";
		
		//converte jsonArray com CDL.toJSONArray
		JSONArray output = CDL.toJSONArray(string);
		System.out.println("Final JSONArray: " + output);
	}


}
