package StackAndQueue;
import java.util.*;

public class StackFromQueuePopEfficient {
    public static void main(String[] args) {
        st s = new st();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        System.out.println(s.pop());
         System.out.println(s.pop());
         System.out.println(s.pop());
    }
}

class st{

    private Queue<Integer> main;
    private Queue<Integer> helper;

    st(){
        main = new ArrayDeque<>();
        helper = new ArrayDeque<>();
    }

    public void push(int ele){
        if(main.size()==0){
            main.add(ele);   
        }else{
            while(main.size()>0){
                helper.add(main.remove());
            }

            main.add(ele);

            while(helper.size()>0){
                main.add(helper.remove());
            }
        }
    }

    public int pop(){
        return main.remove();
    }

    public int peek(){
        return main.peek();
    }

    public int size(){
        return main.size();
    }

    public void display(){
        System.out.println(main);
    }
}
