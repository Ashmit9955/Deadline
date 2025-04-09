import java.util.*;

class Student{
    String book;
    String Author;
    float price;
}
public class twelth{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student arr[] = new Student [n];
        
        for(int i=0; i<n; i++){
            arr[i] = new Student();
            arr[i].book = sc.next();
            arr[i].Author = sc.next();
            arr[i].price = sc.nextFloat();
        }
        float cost = sc.nextFloat();
        for(int i=0; i<n ;i++){
            if(arr[i].price > cost){
                System.out.printf("Title: %s, Author: %s, Price: %.2f\n",arr[i].book,arr[i].Author,arr[i].price);
            }
        }
    }
}