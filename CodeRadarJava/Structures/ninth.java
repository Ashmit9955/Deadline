import java.util.*;

class Student{
    int roll;
    String name;
    float marks;
}

public class ninth{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student arr[] = new Student[n];
        for(int i=0; i<n;i++){
            arr[i] = new Student();
            arr[i].roll = sc.nextInt();
            arr[i].name = sc.next();
            arr[i].marks = sc.nextFloat();
        }
        // Storing marks of arr into a new marks arr to sort 
        // Now sorting these 
        float marksarr[] = new float[n];
        for(int i=0; i<n; i++){
            marksarr[i] = arr[i].marks;
        }
        // now sorting the above marksarray

        for(int i=0; i<=n-2; i++){
            for(int j=0; j<n-i-1; j++){
                if(marksarr[j] > marksarr[j+1]){
                    // swap
                    float temp = marksarr[j];
                    marksarr[j] = marksarr[j+1];
                    marksarr[j+1] = temp; 
                }
            }
        }

        for(int i=n-1; i>=0; i--){
            for(int j=0 ; j<n; j++){
                if(marksarr[i] == arr[j].marks){
                    System.out.printf("Roll Number: %d, Name: %s, Marks: %.2f\n",arr[j].roll,arr[j].name,arr[j].marks);
                }
            }
        }

    }
}