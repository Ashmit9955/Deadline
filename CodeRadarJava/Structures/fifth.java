import java.util.*;
class Student{
    int roll;
    String name;
    float marks;
}
public class fifth{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student arr[] = new Student[n];
        for(int i=0; i<n; i++){
            arr[i] = new Student();
            arr[i].roll = sc.nextInt();
            arr[i].name = sc.next();
            arr[i].marks = sc.nextFloat();
        }
        int target = sc.nextInt();
        int flag = 0;
        for(int i=0 ;i<n ;i++){
            if(arr[i].roll == target){
                flag = 1;
                System.out.printf("Roll Number: %d, Name: %s, Marks: %.2f",arr[i].roll, arr[i].name , arr[i].marks);
            }
        }
    }
}