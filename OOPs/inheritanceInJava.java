package OOPs;
public class inheritanceInJava {
    public static void main(String[] args) {
        smartphone s1 = new smartphone(10,20,30);

       System.out.println(s1.music +" "+ s1.number +"  "+ s1.signal);

    }
}

class telephone { // grand parent class

    telephone() {
        System.out.println("I am telephone");
    }

    int number;

     telephone(int n ) {
       number = n;
    }

    public void calling() {
        System.out.println("I am calling");
    }

    public void dialing() {
        System.out.println("I am dialing ");
    }

    public void fm() {
        System.out.println("Playing FM of telephone");
    }
}

// single level inheritance
class featurePhone extends telephone { // parent class
    int signal;
    featurePhone() {
        System.out.println("I am feature Phone");
    }

    featurePhone(int num , int sign){
        super(num);
        signal=sign;

    
    }
   @Override
    public void fm() {  // run time polymorphism 
        System.out.println("Playing FM of feature phone ");
    }

    public void torch() {
        System.out.println("I am having a torch");
    }
}

class chinese {
    public void torch() {
        System.out.println("I am having a torch");
    }
}

// multilevel inheritance

class smartphone extends featurePhone { // child class
    int music ;
    smartphone(int n , int num , int sign ){
          super(num , sign );
        music=n;
    }
    smartphone() {
        System.out.println("I am smartphone");
    }

    public void camera() {
        System.out.println("I am having a camera");
    }

    public void game() {
        System.out.println("I have games too");
    }
}
