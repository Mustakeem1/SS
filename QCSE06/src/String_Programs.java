
public class String_Programs {

	public static void main(String[] args) {
		
	String s = "mustakim";
	String s1 ="";
	
	for(int i=s.length()-1; i>=0; i--) {
		s1=s1+s.charAt(i);
	}

	char [] s3 = s1.toCharArray();
	System.out.println(s1);
	for(int i=s3.length-1; i>=0; i--) {
		System.out.print(s3[i]);
	}
	
	}
	

}
