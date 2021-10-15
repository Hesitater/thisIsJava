package chap11.lecture.wrapper;

public class A03Parsing {
	public static void main(String[] args) {
		String s1 ="999";
		String s2 = "3.14";
		String s3 = "true";
		
		int i1 = Integer.parseInt(s1);
		double d1 = Double.parseDouble(s2);
		boolean b1 = Boolean.parseBoolean(s3);
		
		System.out.println(s1 + "," + s2 + ","+  s3);
		System.out.println(i1  + d1  + "," + b1);
	
	}
}
