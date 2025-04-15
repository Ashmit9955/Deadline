import java.util.Scanner;

public class Palindrome{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        int flag = 1;
        for(int i=0; i<len/2; i++){
            if(str.charAt(i) != str.charAt(len-i-1)){
                System.out.println("Not Palindrome");
                flag = 0;
                break;
            }
        }
        if(flag == 1){
            System.out.println("Palindrome String");
        }
    }
}