


class Queue{

    private int top;
    private int back;
    private int size;
    private int[] queue;

    public Queue(int n){
        top = 0;
        back = 0;
        size = n;
        queue = new int[size];
    }
    
    public void enqueue(int a){
        if(back == size)
            System.out.println("The Queue is full!");
        else{
            queue[back] = a;
            back++;
        }
    }
    
    public void dequeue(){
        if(top == back){
            System.out.println("The queue is empty.");
        }
        else{
            top++;
        }
    }

    public int getElement(){
        return queue[top];
    }

}


class QueueImplementation{
    public static void main(String[] args) {
        Queue a = new Queue(5);
        a.enqueue(3);
        a.enqueue(9);
        a.enqueue(1);
        a.enqueue(4);
        a.enqueue(9);
        System.out.println(a.getElement());
        a.dequeue();
        a.dequeue();
        System.out.println(a.getElement());
    }

}