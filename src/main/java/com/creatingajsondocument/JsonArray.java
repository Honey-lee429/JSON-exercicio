package com.creatingajsondocument;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonArray {
	private static void JSONExampleArray1() {
		
		/**
		 * Declara um array numa String e cria um JSONObject da String contendo um array de objetos usando JSONArray
		 */

		 String arrayStr = 
		            "["+"true,"+"false,"+ "\"true\","+ "\"false\","+"\"hello\","+"23.45e-4,"+
		                "\"23.45\","+"42,"+"\"43\","+"["+"\"world\""+"],"+
		            		"{"+
		                    "\"key1\":\"value1\","+
		                    "\"key2\":\"value2\","+
		                    "\"key3\":\"value3\","+
		                    "\"key4\":\"value4\""+
		                "},"+
		                "0,"+"\"-1\""+
		            "]";

		 
		 /**
		  * Converte o array em um objeto Json
		  * inicializa o JSONArray e imprime
		  */

		  JSONArray array = new JSONArray();
		  System.out.println("Values array: "+ array);

		  //Here we will use an auxiliary function to get one for the example.
		  
		  /**
		   *  cria um metodo JSONArray do tamanho respecitivo do array utilizando o length
		   *  imprime Label Array retornando uma string representada pela coleção de elementro do array
		   */
		  JSONArray list = listNumberArray(array.length());
		  System.out.println("Label Array: "+ list.toString());
		  
		  
		  /**
		   * contrui um object Json usando ambos os valores do array e da label array acima 
		   */
		  JSONObject object = array.toJSONObject(list);
		  System.out.println("Final JSONOBject: " + object);
	}


	/**
	 * 
	 * @param max
	 * @return metodo cria um JsonArray das lables de cada um gerado por sua respectiva posição
	 * O valor das labels deve retornar uma String em ordem para funcionar
	 */
	private static JSONArray listNumberArray(int max){
		 JSONArray res = new JSONArray();
		for (int i=0; i<max;i++) {
			res.put(String.valueOf(i));
		}
		return res;
	}

}
