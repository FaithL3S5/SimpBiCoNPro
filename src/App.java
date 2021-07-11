import java.util.*;

class bitCount{

	public static void main(String[] args)
	{
		scanInput();
	}

    public static void scanInput() {
		
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the Integer value: " );  
        int number = sc.nextInt();  
        
        String binary = Integer.toBinaryString(number);
        int binarys = Integer.parseInt(binary);
        System.out.println("The number is: " + number);       
        System.out.println("Binary Conversion: " + binarys);
        System.out.println("Number of 1's bit are: " +Integer.bitCount(number));
    }

}