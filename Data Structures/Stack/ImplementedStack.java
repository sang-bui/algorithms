


class Stack{

    private static int size;
    private static int top;
    private static int[] stack;


    public Stack(int n) {
        size = n;
        top = -1;
        stack = new int[size];
    }

    public void push(int a){

        if(top == size-1)
            System.out.println("The stack is full.");
        else{
            top++;
            stack[top] = a;
        }
    }

    public void pop(){

        if(stack.length == 0)
            System.out.println("The stack is empty, cannot pop.");
        else{
            top--;
        }

    }


    public int getElement(){     
        return stack[top];
    }
    
}



class ImplementedStack{

    public static void main(String[] args) {
        Stack a = new Stack(5);
        a.push(3);
        a.push(9);
        a.push(1);
        a.push(4);
        a.push(9);
        System.out.println(a.getElement());
        a.pop();
        a.pop();
        System.out.println(a.getElement());

    }


}