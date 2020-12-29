import java.util.Scanner;
import java.util.ArrayList;


class InsertionSort{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int numOfNums = kb.nextInt();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i = 1; i<=numOfNums; i++)
            numbers.add(kb.nextInt());
        for(int i = 0; i<numOfNums; i++){
            int j = i; // For our while loop.
            while(j>0 && numbers.get(j) < numbers.get(j-1)){
                // Swap positions.
                int temp = numbers.get(j);
                numbers.set(j, numbers.get(j-1));
                numbers.set(j-1, temp);
                j--;
            }
        }
        System.out.println(numbers);
    }
}