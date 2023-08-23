package OOPs;

public class acessModifiers {
    public static void main(String[] args) {
       bank c1 = new bank();

       c1.setPassword(1234 , 999);

      

       System.out.println(c1.getPassword());

    netbanking nb = new netbanking();

   

       
    }
}

class bank{
    private int password;
    private int key = 999;
    public String name ;
    protected int bankBalance;


    public void setPassword(int password , int key ){  // setter method 
        if(this.key==key){
        this.password = password;
        System.out.println("Password changed succesfully");
        }else{
            System.out.println("Incorrect passwrd");
        }
    }

    public int getPassword(){
        return this.password;
    }
}

class netbanking extends bank{

}
