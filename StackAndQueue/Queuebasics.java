package StackAndQueue;
import java.util.*;

public class Queuebasics{
    public static void main(String[] args) {
        Queue<Integer> que = new ArrayDeque<>();

        que.add(10);
        que.add(20);
        que.add(30);

        que.remove();
        que.remove();
        que.remove();
        que.remove();

        System.out.println(que);


    }
}