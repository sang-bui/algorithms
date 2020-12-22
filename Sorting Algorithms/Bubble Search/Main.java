import java.util.Scanner;
import java.util.ArrayList;


class Main{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int numOfNums = kb.nextInt();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i = 1; i<=numOfNums; i++) // Put's all of the input into the number arraylist
            numbers.add(kb.nextInt());
        for(int i = 0; i<=numOfNums-1; i++){ // Controls the range to check the array.
            for(int v = 0; v<numOfNums-i-1; v++){ // Controls the actual checking.
                if(numbers.get(v) > numbers.get(v+1)){ // Checks the element V and V+1 if V is greater.
                    // If they are greater, swap the positions.
                    int temp = numbers.get(v);
                    numbers.set(v, numbers.get(v+1));
                    numbers.set(v+1, temp);
                }
            }
        }
        System.out.println(numbers);
    }
}

