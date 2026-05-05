package ch02;

public class Typeconversion {

	public static void main(String[] args) {
		byte b = 127;
		int i = 100;
		
		System.out.println(b+i);
		System.out.println((double)10/4);
		System.out.println(10.0/4);
		System.out.println((char)0x12340041); //2바이트이므로 앞에가 잘림, 따라서 0041 = 65, 65를 cha로 바꾼다.
		System.out.println((byte)(b+i));
		System.out.println((int)2.9+1.8);
		System.out.println((int)(2.9+1.8));
		System.out.println((int)2.9 + (int)1.8);
		System.out.println();
	}

	
	
	
	
}
