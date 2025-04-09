// package WeekOne;
public class ClassObject{
    public static void main(String args[]){
       
        Student student1 = new Student();
        student1.name = "Riya";
        student1.roll = 1;
        student1.marks = 99.99f;
        student1.Grade = 'O';

        Student student2 = new Student();
        student2.name = "Ashmit";
        student2.roll = 2;
        student2.marks = 99.88f;
        student2.Grade = 'A';

        System.out.println(student2.name);
        System.out.println(student1.name);

        
    }
}

class Student {
    int roll;
    String name;
    float marks;
    char Grade;
}




//
