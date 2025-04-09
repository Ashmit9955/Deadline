// Coverting Binary number to decimal number

// package WeekOne;
import java.util.*;
public class NumberSystem{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //Binary to Decinal code....

    //     System.out.println("Enter a Binary number for converting into decimal: ");
    //     int binary_num = sc.nextInt();
    //     int temp = binary_num;
    //     int decimal_num = 0;
    //     int num = 0;
    //     while(temp > 0){
    //         decimal_num += (Math.pow(2,num++))*(temp%10);
    //         temp = temp/10;
    //     }
    //     System.out.println("The decimal number is: ");
    //     System.out.print(decimal_num + "\n");
    // }

    // Above code ends here Bin to dec

    // Below is Decimal to Binary code
            System.out.print("Enter a Decimal number: ");
            int decimal = sc.nextInt();
            int temp = decimal;
            int binary = 0;
            int num = 0;
            while(temp > 0){
                binary = binary + ( (int)(Math.pow(10,num++)) * (temp%2));
                temp = temp / 2;
            }        
            System.out.print("Below is the binary number: "+binary);
    }
}