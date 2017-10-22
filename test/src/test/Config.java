package test;

public class Config {

	 private String ext, location, subDirectory, unit, remove, handler, destination, dir ,connectionString;
 
     public Config(String ext, String location, String subDirectory,String unit,String remove,String handler,String destination,String dir,String connectionString) {
         setConfig(ext, location, subDirectory, unit, remove, handler, destination, dir ,connectionString);
     }
 
	   public String getExt() {
	         return ext;
	     }
	   
	   public void setExt(String ext) {
	         this.ext = ext;
	     }
	
	   public String getLocation() {
	         return location;
	     }
	   
	   public void setLocation(String location) {
	         this.location = location;
	     }
	   
	   public String getSubDirectory() {
	         return subDirectory;
	     }
	   
	   public void setSubDirectory(String subDirectory) {
	         this.subDirectory = subDirectory;
	     }
	   
	   public String getUnit() {
	         return unit;
	     }
	   
	   public void setUnit(String unit) {
	         this.unit = unit;
	     }
	   
	   public String getRemove() {
	         return remove;
	     }
	   
	   public void setRemove(String remove) {
	         this.remove = remove;
	     }
	   
	   public String getHandler() {
	         return handler;
	     }
	   
	   public void setHandler(String handler) {
	         this.handler = handler;
	     }
	   
	   public String getDestination() {
	         return destination;
	     }
	   
	   public void setDestination(String destination) {
	         this.destination = destination;
	     }
	   
	   public String getDir() {
		   return dir;
	   }
	   
	   public void setDir(String dir) {
		   this.dir = dir;
	   }
	   
	   public String getConnectionString() {
		   return connectionString;
	   }
	   
	   public void setConnectionString(String connectionString) {
		   this.connectionString = connectionString;
	   }
	   
	 public void setConfig(String ext, String location, String subDirectory,String unit,String remove,String handler,String destination,String dir,String connectionString) {
		 setExt(ext);
		 setLocation(location);
		 setSubDirectory(subDirectory);
		 setUnit(unit);
		 setRemove(remove);
		 setHandler(handler);
		 setDestination(destination);
		 setDir(dir);
		 setConnectionString(connectionString);
		 
     }
}
