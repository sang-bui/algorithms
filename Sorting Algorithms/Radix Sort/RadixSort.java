import java.util.Scanner;
import java.util.ArrayList;


class RadixSort{

    private static void countingSort(ArrayList<Integer> arr, int place){



        ArrayList<Integer> count = new ArrayList<Integer>();
        ArrayList<Integer> output = new ArrayList<Integer>();

        for(int i = 0; i<10; i++){
            count.add(0);
            output.add(0);
        }



        for(int i = 0; i < arr.size(); i++)
            count.set((arr.get(i) / place) % 10, count.get((arr.get(i) / place) % 10) + 1);
        
        for(int i = 1; i<count.size(); i++)
            count.set(i, count.get(i) + count.get(i-1));

        for(int i = 0; i<arr.size(); i++){

            output.set(count.get((arr.get(i) / place) % 10) - 1, arr.get(i));
            count.set((arr.get(i) / place) % 10, count.get((arr.get(i) / place) % 10) - 1);

        }

        for(int i = 0; i<arr.size();i++)
            arr.set(i, output.get(i));


    }



    private static void radix(ArrayList<Integer> arr){
        
        // Get's max value in linear time
        int max = arr.get(0);
        for(int i = 1; i<arr.size(); i++){
            if(arr.get(i) < max)
                max = arr.get(i);
        }

        for(int v = 1; max / v > 0; v*=10)
            countingSort(arr, v);

    }


    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        int numOfNums = kb.nextInt();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i = 1; i<=numOfNums; i++)
            numbers.add(kb.nextInt());

        radix(numbers);
        System.out.println(numbers);

    }
}