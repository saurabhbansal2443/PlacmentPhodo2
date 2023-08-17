package OOPs;

public class basics {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Yuvraj";
        s1.age = 45;
        s1.course = "Phd";
        s1.fee = true;

        // s1.walk();

        // System.out.println(s1.name + " " + s1.age);

        Student s2 = new Student();

        s2.name = "ram";
        s2.age = 56 ;

        s2.walk(45);
        Student s3 = new Student();
    }
}

class Student {
    String name;
    int age;
    String course;
    boolean fee;

    void walk (){
        System.out.println(name + " is walking ");
    }

    void walk (int steps){
        System.out.println(name + " is walking " + steps);
    }

}
