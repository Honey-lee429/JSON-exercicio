package com.conversionmethods;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonArray {
		private static void JSONObjectToArray() {
			/**
			 * Começa instanciando JSONObject
			 */

			String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";

			JSONObject example = new JSONObject(string);
			
			//We need a list of key strings like the reverse operation
			// cria uma lista de chaves Strings do tamanho do objeto example
			JSONArray keyStrings = listNumberArray(example.length());
			
			//Converte JsonObject em JsonArray e passa os valores dos indices de chave no novo array
			JSONArray array = example.toJSONArray(keyStrings);
			
			//imprime o novo array
			System.out.println("Final JSONArray: " + array);
		}

		private static JSONArray listNumberArray(int length) {
			return null;
		}

}
