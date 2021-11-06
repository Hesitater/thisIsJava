package chap11.example.sec110702;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class Encode_Decode_example {
	public static void main(String[] args) throws UnsupportedEncodingException {
		
//		URLEncoder.encode(문자, 변환타입);
//		URLDecoder.decode(문자, 변환타입);
	
		String val ="문자열테스트";
		String encodeVal = "";
		String decodeVal = "";
		
		encodeVal = URLEncoder.encode(val, "utf-8");
		decodeVal = URLDecoder.decode(val, "utf-8");
		
		System.out.println("인코딩 -> " + encodeVal);
		System.out.println("디코딩 -> " + decodeVal);
		
	}
}
