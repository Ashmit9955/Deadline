// package Deadline;

class Algebra {
    int add(int a , int b){
        return (a + b);
    }
}

public class Methods{
        public int sum(int a , int b){ // Method header
            // Method body here
            return a+b;
        }
        static void welcome(){   // static is not an access modifier like public , protected, 
                                //  private , default ... static is non access modifier
            System.out.println("welcome to Room 605");
        }

    public static void main(String args[]){
        Methods result = new Methods();
        System.out.println(result.sum(68,1)); // result is an object
        welcome();

        Algebra obj1 = new Algebra();  // obj1 is an object of Algebra class
        int ans = obj1.add(2,3);
        System.out.println(ans);
    }
}


// Function is something we can normally call like Sum(a,b);
// Method is a function defined inside a class and importantly can only be called via an object 
// like example: StudentMarks.Sum(a,b); // here StudentMarks is a class having a method Sum


// There are two types of methods: 1.> User-defined, 2.> Built-in Methods
