public class Concepts {
    public static void main(String[] args) {

        // strings are stored in string pool
        String str1 = "Hello";
        String str2 = "Hello";

        String str3 = new String("Hello");
        String str4 = new String("Hello");

           // == operator compares only adress not the content of string 

         boolean ans1 = str1 == str2;// this is beacuse the adress of the strings are same as they are made in stribng pool

          boolean ans2 = str3 == str2; // this is false beacuse both the strings have diffrent adress

           boolean ans3 = str3 == str4; // this is false because both the strings are getting diffrent memory location in heap 
        // System.out.println(ans3); 

           boolean ans4 = str1.equals(str2);
           boolean ans5 = str3.equals(str2);

           System.out.println(ans5);




    }
}
