package test;

public class Schedule {

	 private String ext,time,interval;
 
     public Schedule(String ext,String time,String interval) {
         setSchedule(ext, time, interval);
     }
 
     public String getExt() {
         return ext;
     }
 
     public void setExt(String ext) {
         this.ext = ext;
     }
 
     public String getTime() {
         return time;
     }
 
     public void setTime(String time) {
         this.time = time;
     }
 
     public String getInterval() {
         return interval;
     }
 
     public void setInterval(String interval) {
         this.interval = interval;
     }
 
     public void setSchedule(String ext,String time,String interval) {
    	 setExt(ext);
         setTime(time);
         setInterval(interval);
     }


}
