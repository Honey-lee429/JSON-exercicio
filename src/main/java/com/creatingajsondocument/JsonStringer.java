package com.creatingajsondocument;

import org.json.JSONObject;
import org.json.JSONStringer;

public class JsonStringer {
	private static void JSONExampleStringer() {

		
		/**
		 * inicializa o JSONStringer
		 */
		JSONStringer jsonStringer = new JSONStringer();

		// inicializa o processo adicionando elementos com .object()
        jsonStringer.object();

        // adiciona elementos como chaves e valores com  .key() e .values() 
        jsonStringer.key("trueValue").value(true);
        jsonStringer.key("falseValue").value(false);
        jsonStringer.key("nullValue").value(null);
        jsonStringer.key("stringValue").value("hello world!");
        jsonStringer.key("complexStringValue").value("h\be\tllo w\u1234orld!");
        jsonStringer.key("intValue").value(42);
        jsonStringer.key("doubleValue").value(-23.45e67);

        //encerra o processo com endObject()
        jsonStringer.endObject();

        // Converte JSONStringer em JSONObject gerando uma String e usando seu construtor
        String str = jsonStringer.toString();
        JSONObject jsonObject = new JSONObject(str);
        // imprime final JSONObject
       System.out.println("Final JSONOBject: " + jsonObject);
	}

}
