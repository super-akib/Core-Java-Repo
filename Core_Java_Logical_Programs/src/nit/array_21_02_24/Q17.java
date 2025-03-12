package nit.array_21_02_24;
//String convert predefine data type
public class Q17 
{
      public static void main(String[] args) 
      {
		 String str = "121";  
		 String str1 = "12.1";
		 //converting String to byte
		 byte b = Byte.parseByte(str);
		 System.out.println("byte:"+b); // -128 to 127 value more then limit it throw exception  
		 
		//converting String to short
		 short s = Short.parseShort(str);
		 System.out.println("short:"+s);//-32768 to 32767
		 
		//converting String to integer
		 int i = Integer.parseInt(str);
		System.out.println("int :"+i);
		
		//converting String to Long
		long l = Long.parseLong(str);
		System.out.println("long:"+l);
		
		//converting String to float
		float f = Float.parseFloat(str1);
		System.out.println("float:"+f);
		
		//converting String to double
		double d = Double.parseDouble(str1);
		System.out.println("double:"+d);
	  }
}
