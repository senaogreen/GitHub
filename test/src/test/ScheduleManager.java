package test;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

public class ScheduleManager {

	 public static void main(String[] args) throws JSONException {
		 
		 Schedule cs = new Schedule("cs", "12:00", "Everyday");
         JSONObject csschedule = new JSONObject(cs);
         System.out.println("csschedule: " + csschedule);
         
         Schedule docx = new Schedule("docx", "20:00", "Everyday");
         JSONObject docxschedule = new JSONObject(docx);
         System.out.println("docxschedule: " + docxschedule);
         
         Schedule jpg = new Schedule("jpg", "7:00", "Monday");
         JSONObject jpgschedule = new JSONObject(jpg);
         System.out.println("jpgschedule: " + jpgschedule);
		 
	 }
}
