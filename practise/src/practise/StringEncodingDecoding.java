package practise;

import java.util.Base64;

public class StringEncodingDecoding {
	
	public static void main(String[] args) 
    { 
  
        // create a sample String to encode 
        String sample = "vish.p.pal@gmail.com"; 
  
        // print actual String 
        System.out.println("Sample String:\n"
                           + sample); 
  
        // Encode into Base64 format 
        String BasicBase64format = Base64.getEncoder().encodeToString(sample.getBytes()); 
  
        // print encoded String 
        System.out.println("Encoded String:\n"
                           + BasicBase64format);
        System.out.println("After decoding");
        
        decoding(BasicBase64format);
        
    } 
	
	public static void decoding(String s) {
		
		 
        // decode into String from encoded format 
        byte[] actualByte = Base64.getDecoder() 
                                .decode(s); 
  
        String actualString = new String(actualByte); 
  
        // print actual String 
        System.out.println(actualString); 
				
	}

}
