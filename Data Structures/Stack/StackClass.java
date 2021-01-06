import java.util.Stack;



class StackClass{

    public static void main(String[] args) {
        Stack<Integer> a = new Stack<Integer>();
        a.push(3);
        a.push(9);
        a.push(1);
        a.push(4);
        a.push(9);
        System.out.println(a.peek());
        a.pop();
        a.pop();
        System.out.println(a.peek());
    }


}