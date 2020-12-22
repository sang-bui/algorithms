import java.util.Scanner;
import java.util.ArrayList;

class SelectionSort{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int numOfNums = kb.nextInt();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i = 1; i<=numOfNums; i++)
            numbers.add(kb.nextInt());
        for(int i = 0; i<=numOfNums-1; i++){
            int minimum = i;
            for(int v = i+1; v<=numOfNums-1; v++){
                if(numbers.get(minimum)>numbers.get(v)){
                    minimum=v;
                }
            }
            int temp = numbers.get(i);
            numbers.set(i, numbers.get(minimum));
            numbers.set(minimum, temp);
        }
        System.out.println(numbers);
    }
}    