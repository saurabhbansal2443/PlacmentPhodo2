package StackAndQueue;

public class implementQueue {
    public static void main(String[] args) {
        myQueue que = new myQueue(5);

        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);
        

        que.remove();

        que.add(1000);

        que.display();
   
        System.out.println(que.top());


    }
}

class myQueue{

    private int[] arr ;
    private int itr ;

    myQueue(){
        arr = new int[10];
        itr = 0 ;
    }

    myQueue(int size){
        arr = new int[size];
        itr = 0 ;
    }

    public void add (int ele){
        if(itr<arr.length){
            arr[itr]=ele;
            itr++;
        }else{
            System.out.println("Queue is full");
        }
    }

    public int remove(){
        if(itr==0){
            System.out.println("Queue is empty ");
            return -1 ;
        }else{
            int ans = arr[0];

            for(int i=1 ; i<itr;i++){
                arr[i-1]=arr[i];
            }
            itr--;
            return ans ;
        }
    }

    public int top(){
        if(itr==0){
            System.out.println("Queue is empty ");
            return -1 ;
        }else{
            
            return arr[0] ;
        }
    }

    public int size(){
        return itr ;
    }

    public void display(){
         if(itr==0){
            System.out.println("Queue is empty ");
          
        }else {
            for(int i=0;i<itr;i++){
                System.out.print(arr[i]+"  ");
            }
            System.out.println();
        }
    }
}
