package OOPs;

public class staticKeyword {
    public static void main(String[] args) {
        // int areaofCircle = shapes.circleArea(1);
        // System.out.println(shapes.pie);

        company e1 = new company("Nikhil","IT");
        company e2 = new company("vanshika ", "HR");
         company e3 = new company("rahul ", "HR");

         e2.companyName="Infosys";

         System.out.println(e3.companyName);
    }
}

class shapes {

    static double pie = 3.14;
    public static int  circleArea(int radius ){

        return 22/7 * radius *radius;
    }

     public static int  squareArea(int side ){

        return side * side;
    }
}

class company {
    String name ;
    String department ;
    static String companyName = "HCL";

    company(String name , String department){
        this.name = name;
        this.department = department;
    }

}
