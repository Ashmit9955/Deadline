import java.util.*;

class Student{
    int roll;
    String name;
    float marks;
}

public class One{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student arr[] = new Student[n];  // Create an null array with only n references but no object is created
        for(int i=0; i<n; i++){
            arr[i] = new Student(); // Here object gets initialized
            arr[i].roll = sc.nextInt();
            arr[i].name = sc.next();
            arr[i].marks = sc.nextFloat();
        }
        
        for(int i=0 ;i<n; i++){
            System.out.print("Roll Number: "+arr[i].roll+", Name: "+arr[i].name+", Marks: "+arr[i].marks);
            System.out.println();
        }
    }
}