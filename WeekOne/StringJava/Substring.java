import java.util.Scanner;

public class Substring{

    public static String Substring(String str , int start, int end){
    String substr = "";
    for(int i=start ; i<end; i++){
        substr+= str.charAt(i);
    }
    return substr;
}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // String name = "Rohit Sharma";
        // String str = Substring("Rohit Sharma" , 0, 5);
        // System.out.println(str);

        // we can also use the inbuilt method of substring for java
        
        String name = "JavaIsDead".substring(0,4);   // Again here String is class with method substring
        System.out.println(name);
    

    }
}