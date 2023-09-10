package StackAndQueue;
import java.util.*;

public class stackfromQueuePushEfficient {
    public static void main(String[] args) {
        st2 s = new st2();

        s.push(10);
        s.push(20);
        s.push(30);


        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.pop());

    }
}

class st2{
    private Queue<Integer> main;
    private Queue<Integer> helper;

    st2(){
        main = new ArrayDeque<>();
        helper = new ArrayDeque<>();
    }

    public void push(int ele){
        main.add(ele);
    }

    public int pop(){
       
        if(main.size()==1){
            return main.remove();
        }else {
            while(main.size()>1){
                helper.add(main.remove());
            }

            int ans = main.remove();

            while(helper.size()>0){
                main.add(helper.remove());
            }

            return ans ;
        }
    }

    public int peek(){
       if(main.size()==1){
            return main.peek();
        }else {
            while(main.size()>1){
                helper.add(main.remove());
            }

            int ans = main.remove();

            helper.add(ans);

            while(helper.size()>0){
                main.add(helper.remove());
            }

            return ans ;
        }
    }

    public int size(){
        return main.size();
    }

    public void display(){
        System.out.println(main);
    }
}
