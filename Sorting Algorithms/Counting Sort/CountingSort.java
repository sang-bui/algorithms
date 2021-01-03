import java.util.Scanner;
import java.util.ArrayList;


class CountingSort{
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        int numOfNums = kb.nextInt();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i = 1; i<=numOfNums; i++) // Put's all of the input into the number arraylist
            numbers.add(kb.nextInt());

        ArrayList<Integer> count = new ArrayList<Integer>();
        ArrayList<Integer> output = new ArrayList<Integer>();

        for(int i = 0; i<numOfNums; i++){
            count.add(0);
            output.add(0);
        }

        // Count the actual numbers that are in the array.
        for(int i = 0; i<numOfNums; i++){
            count.set(numbers.get(i), count.get(numbers.get(i)) + 1);
        }

        // Gets the index of the numbers.
        for(int i = 1; i<numOfNums; i++){
            count.set(i, count.get(i) + count.get(i-1));
        }

        // Puts all the numbers into the index provided above.
        for(int i = 0; i<numOfNums; i++){
            output.set(count.get(numbers.get(i)) - 1, numbers.get(i));
            count.set(numbers.get(i), count.get(numbers.get(i)) - 1);
        }


        System.out.println(output);

    }
}