import java.util.Scanner;

class Student{
    int roll;
    String name;
    float marks;
}
public class tenth{
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
        int result = 1;
        for(int i=0; i<n; i++){
            if(!(arr[i].marks > 50)){
                System.out.println("Not All Passed");
                result = 0;
            }
        }
        if(result == 1){
            System.out.println("All Passed");
        }

    }
}