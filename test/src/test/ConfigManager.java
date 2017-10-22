package test;

import org.json.JSONException;
import org.json.JSONObject;

public class ConfigManager {

	 public static void main(String[] args) throws JSONException {
		  
		 Config cs = new Config("cs","c:\\Projects","true","file","false","zip","directory","c:\\MyArchieves","");
	     JSONObject csconfigs = new JSONObject(cs);
	     System.out.println("csconfigs: " + csconfigs);
		 
	     Config docx = new Config("docx","c:\\Documents","true","file","false","encode","db","","MyConnectionString");
	     JSONObject docxconfigs = new JSONObject(docx);
	     System.out.println("docxconfigs: " + docxconfigs);
	     
	     Config jpg = new Config("jpg","c:\\Pictures","true","file","false","","directory","c:\\MyArchieves","");
	     JSONObject jpgconfigs = new JSONObject(jpg);
	     System.out.println("jpgconfigs: " + jpgconfigs);
         
	 }
}