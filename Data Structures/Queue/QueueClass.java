import java.util.Queue;
import java.util.LinkedList;





public class QueueClass {
    public static void main(String[] args) {
        Queue<Integer> a = new LinkedList<>();
        a.add(3);
        a.add(9);
        a.add(1);
        a.add(4);
        a.add(9);
        System.out.println(a.peek());
        a.remove();
        a.remove();
        System.out.println(a.peek());
    }    
}
