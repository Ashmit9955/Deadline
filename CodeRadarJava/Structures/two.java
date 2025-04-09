import java.util.Scanner;

class Student{
    int roll;
    String name;
    float marks;
}

public class two{
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

        float MaxMarks = 0;
        int index = 0;
        for(int i=0; i<n; i++){
            if(arr[i].marks > MaxMarks){
                MaxMarks = arr[i].marks;
                index = i;
            }
        }
        System.out.print("Top Scorer: Roll Number: "+arr[index].roll+", Name: "+arr[index].name+", Marks: "+arr[index].marks);
    }
}