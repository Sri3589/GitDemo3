public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {10,20,30,40,50};
		for (int i=0; i<a.length; i++) {
			System.out.println("a["+i+"]"+a[i]);
		}
	}

}

__________________________________________________________

Nested for Loop:

package Practice;

public class Array {

	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
		String st[] = {"Srikanth","Tejaswi","Samarth","Chinnu","Chikki"};
			for(int j = 0; j<a.length; j++) {
				for(int i = 0 ; i < st.length ; i++) {
					System.out.println("st["+i+"]" +" "+st[i] + "st["+j+"]"+" "+ a[j]);}				}
}

}

_____________________________________________________________




































