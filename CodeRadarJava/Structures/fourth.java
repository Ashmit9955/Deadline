import java.util.*;

class Student{
    int roll;
    String name;
    float marks;
}
public class fourth{
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

        float sum = 0;
        for(int i=0; i<n; i++){
            sum+= arr[i].marks;
        }
        float average = sum / n;
        System.out.printf("%.2f\n",average);
    }
}