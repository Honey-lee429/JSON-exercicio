package com.creatingajsondocument;

import org.json.JSONObject;

public class JsonObject {
	private static void JSONExampleObject2() {

		// Instancia um json example
		JSONObject example = new JSONObject();


		//adiciona chaves e valores 
		example.put("key", "value");

		//associa os valores
		example.put("key2", 5);
		example.put("key3", -23.45e67);
		example.put("trueValue", true);


		//imprime example valores
		 System.out.println("Final JSONOBject: " + example);
	}
}
