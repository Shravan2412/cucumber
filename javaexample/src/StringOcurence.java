
public class StringOcurence {
public static void main(String[] args) {
	String s="hi tbhis is shravan";
	int count=0;
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch=='a') {
			count=count+1;
		}
		
		
	}
	System.out.println(count);
}
}
