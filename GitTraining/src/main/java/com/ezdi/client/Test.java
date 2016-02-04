package com.ezdi.client;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {

		Map<String, String> codeMap = new HashMap<String, String>();
		codeMap.put("A00.0", "Vibrio cholerae 01<OR>biovar cholerae");
		codeMap.put("A01", "Typhoid<AND>paratyphoid fevers");
		codeMap.put("A15.5", "Tuberculosis<AND>(larynx<OR>trachea<AND>bronchus)");
		codeMap.put("A06.4", "Amebic liver abscess");
		codeMap.put("A01.01", "Typhoid meningitis");
		codeMap.put("A01.02", "Typhoid fever<AND>heart involvement");
		codeMap.put("A01.03", "Abdominal  aortic <AND> aneurysm");
	codeMap.put("A01.02", "Typhoid fever<AND>heart involvement7787");
		codeMap.put("A01.03", "Abdominal  aortic <AND> aneurysm");
codeMap.put("A01.02", "Typhoid fever<AND>heart involvement7787");
		codeMap.put("A01.03", "Abdominal  aortic <AND> aneurysm");

		String query = "Abdominal  aortic <AND> aneurysm";

		String value = codeMap.get("A01.02");
		if (value != null) {
			query = query + " || (" + value + ")";
		}
		System.out.println("query: " + query);
		System.out.println("value: " + value);

	}

}
