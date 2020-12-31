import java.util.Scanner;
import java.util.ArrayList;

class QuickSort{

    private static ArrayList<Integer> quickSort(ArrayList<Integer> arr, int start, int end){
        if(end >= start){
            int partitionIndex = partition(arr, start, end);
            quickSort(arr, start, partitionIndex - 1);
            quickSort(arr, partitionIndex+1, end);
        }
        return arr;
    }
 

    private static int partition(ArrayList<Integer> arr, int start, int end){
        int i = start - 1;
        for(int j = start; j<end; j++){
            // If J is less than the pivot, than you know that I has to be greater than the pivot, so you swap them.
            if(arr.get(j) < arr.get(end)){
                i++;
                int temp = arr.get(j);
                arr.set(j, arr.get(i));
                arr.set(i, temp);
            }
        }
        // Pivot swap.
        int temp = arr.get(i+1);
        arr.set(i+1, arr.get(end));
        arr.set(end, temp);
        return i+1;
    }


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int numOfNums = kb.nextInt();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i = 1; i<=numOfNums; i++)
            numbers.add(kb.nextInt());
        System.out.print(quickSort(numbers, 0, numOfNums-1));
    }
}