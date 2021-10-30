package chap11.example.sec110505;

public class SystemEnvExample {
	public static void main(String[] args) {
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println("JAVA_HOME: " + javaHome);
		
		
		String driverData = System.getenv("DriverData");
		String path = System.getenv("Path"); 
		System.out.println("DriverDate:" + driverData + ",///"
				+ " " + "Path:" + path);
	}
}

