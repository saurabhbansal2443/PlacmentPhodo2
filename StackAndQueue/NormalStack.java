package StackAndQueue;

import java.util.Arrays;

public class NormalStack {
    public static void main(String[] args) {
        myStack st = new myStack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();

      

        st.display();

    }
}

class myStack {

    int[] arr;
    int tos;

    myStack() {
        arr = new int[10];
        tos = -1;
    }

    public void push(int ele) {
        if (tos == -1) {
            tos++;
            arr[tos] = ele;
        } else if (tos < arr.length - 1) {
            tos++;
            arr[tos] = ele;
        } else {
            int[] narr = new int[arr.length * 2];

            for (int i = 0; i < arr.length; i++) {
                narr[i] = arr[i];
            }
            arr = narr;
            tos++;
            arr[tos] = ele;

        }
    }

    public int pop() {
        if (tos == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int ele = arr[tos];
            tos--;
            return ele;
        }
    }

    public int peek() {
        if (tos == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int ele = arr[tos];
            return ele;
        }
    }

    public int size() {
        return tos + 1;
    }

    public void display() {
        if (tos == -1) {
            System.out.println("Stack is empty ");
        } else {
            for (int i = tos; i >= 0; i--) {
                System.out.print(arr[i] + "  ");
            }
        }
    }
}
