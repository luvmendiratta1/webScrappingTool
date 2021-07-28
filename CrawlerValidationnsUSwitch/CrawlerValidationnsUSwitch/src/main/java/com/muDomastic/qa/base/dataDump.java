package com.muDomastic.qa.base;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.muDomastic.qa.util.TestUtil;

public class dataDump {

	public static void main(String[] args) {

		TestUtil tt = new TestUtil();
		HashMap<Object, Object> apiHit= tt.sendGetRequestWithParams("https://api-home-staging.myutilitygenius.co.uk/request/compare/uswitch/request");	
		ObjectMapper mapper = new ObjectMapper();
		try {  
			// Writing to a file   
			mapper.writeValue(new File(System.getProperty("user.dir")+"\\data.json"), apiHit);
		} catch (IOException e) {  
			e.printStackTrace();  
		}  

	}

}
