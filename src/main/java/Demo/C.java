package Demo;

public class C {
	public static void main(String[] args) {
		int count=0;
		String name="D E E P A K";
		for(int i=1; i<=name.length()-1;i++) {
		char ch = name.charAt(i);
		if(ch==' ') {
			count++;
		}
		}
		System.out.println(count);
	}

}
