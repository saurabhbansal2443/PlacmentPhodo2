package OOPs;

public class constructorInJava{
    public static void main(String[] args) {
        Employee e1 = new Employee("Harsh", "HR");

        System.out.println(e1.name);
    }
}

class Employee{

    String name ;
    String Department;
   
    Employee(){
        System.out.println("Constructor is called");
    }
    Employee(String name ){
           
        this.name = name;
    }

    Employee(String name , String Department){
        this.name = name;
       this.Department = Department;
    }
   
}