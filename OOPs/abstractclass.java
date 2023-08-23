package OOPs;

public class abstractclass {
    public static void main(String[] args) {
       Nokia n1 = new Nokia();

       samsung s1 = new samsung();
      

       
    
    }
}


abstract class TRAI{

    public void call(){
       System.out.println("I am giving you calling feature ");
   }

    abstract void fm();
}

class Nokia extends TRAI{
    public void fm(){
        System.out.println("I am fm");
    }
}

class samsung extends Nokia{

}
