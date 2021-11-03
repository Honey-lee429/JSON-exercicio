package com.creatingajsondocument;

import org.json.JSONWriter;

public class JsonWriter {
	private static void JSONExamplWriter() {

		//This method works in a very similar way to Object  and Stringer in the construction of the JSON.
		//The difference is that it needs a Java object called "Appendable" like StringBuilder
		
		/**
		 * instancia StringBuilder criando um objeto e adiciona o atributo write no final
		 */
		StringBuilder write = new StringBuilder();
		JSONWriter jsonWriter = new JSONWriter(write);

		// inicializa o processo adicionando elementos com .object()
		jsonWriter.object();
        // adiciona elementos como chaves e valores com  .key() e .values() 
		jsonWriter.key("trueValue").value(true);
		jsonWriter.key("falseValue").value(false);
		jsonWriter.key("nullValue").value(null);
		jsonWriter.key("stringValue").value("hello world!");
		jsonWriter.key("complexStringValue").value("h\be\tllo w\u1234orld!");
		jsonWriter.key("intValue").value(42);
		jsonWriter.key("doubleValue").value(-23.45e67);
		//encerra o processo com endObject()
		jsonWriter.endObject();
		
		// imprime o resultado que deve estar dento do objeto write retornando uma string 
		System.out.println("JSON: " + write.toString());
		
		//The difference is that we don't get a JSONObject in this one.
		
		
	}

}
