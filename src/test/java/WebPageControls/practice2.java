package WebPageControls;

public class practice2 {

	public static void main(String[] args) {
		String name="prasad";
		char[] c=name.toCharArray();
		
		String reversedName="";
		for(int i=c.length-1; i>=0; i--) {
			reversedName+=c[i];
		}
		System.out.println("After Reversed name is: " + reversedName);

	}

}
