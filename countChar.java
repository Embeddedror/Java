import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
    	
    	
    	System.out.print("Enter a series of numbers: ");
    	Scanner sc = new Scanner(System.in);
    	String str = sc.next();

    	String[] num_str = new String[str.length()]; 

    	for(int i=0;i<num_str.length;i++){ 
    		num_str[i]=Character.toString(str.charAt(i));
    	}
    	
        System.out.println("The number of 0: " + countChar(str, '0')); 
        System.out.println("The number of 1: " + countChar(str, '1')); 
        System.out.println("The number of 2: " + countChar(str, '2'));  
        System.out.println("The number of 3: " + countChar(str, '3')); 
        System.out.println("The number of 4: " + countChar(str, '4')); 
        System.out.println("The number of 5: " + countChar(str, '5')); 
        System.out.println("The number of 6: " + countChar(str, '6')); 
        System.out.println("The number of 7: " + countChar(str, '7')); 
        System.out.println("The number of 8: " + countChar(str, '8')); 
        System.out.println("The number of 9: " + countChar(str, '9')); 
 
    }
 
    public static int countChar(String str, char ch) {
        int count = 0;
 
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
 
        return count;
    }
}
