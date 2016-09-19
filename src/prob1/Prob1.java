package prob1;

public class Prob1 {
	static char temp;
	public static void main(String args[]) {
		
		char[] array1 = reverse("Hello World");
		System.out.println(array1);
		printCharArray(array1);
		
		char[] array2 = reverse("Java Programming!");
		System.out.println(array2);
		printCharArray(array2);
		
	}
	
	public static char[] reverse(String str){
		/* 구현코드 */
	char[] c = str.toCharArray();
	
	for(int i = 0; i < c.length/2; i++){
		temp = c[i];
		c[i] = c[c.length-i-1];
		c[c.length-i-1]= temp;
	}
		return c;
	}
	
	public static void printCharArray(char[] array){
		/* 구현코드 */
		for(int i = 0; array.length<0; i++){
			System.out.println(array[i]);
		}
	}
}
