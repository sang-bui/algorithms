import java.util.Scanner;
import java.util.ArrayList;



class MergeSort{
    public static ArrayList<Integer> mergeSort(ArrayList<Integer> arr){

        if(arr.size() == 1)
            return arr;


        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();  

        for(int l = 0; l <= (arr.size() - 1) / 2; l++)
            left.add(arr.get(l));
        for(int r = ((arr.size() - 1) / 2) + 1; r<=arr.size() - 1; r++)
            right.add(arr.get(r));

        mergeSort(left);
        mergeSort(right);

        int rightPointer,leftPointer,arrPointer;
        rightPointer = leftPointer = arrPointer = 0;

        while(rightPointer<right.size() || leftPointer<left.size()){
            if(rightPointer<right.size() && leftPointer<left.size()){
                if(left.get(leftPointer) < right.get(rightPointer)){
                    arr.set(arrPointer++, left.get(leftPointer++));
                }else{
                    arr.set(arrPointer++,right.get(rightPointer++));
                }
            }else if(rightPointer<right.size()){
                arr.set(arrPointer++,right.get(rightPointer++));
            }else if(leftPointer < left.size()){
                arr.set(arrPointer++,left.get(leftPointer++));
            }
        }
        return arr;

    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int numOfNums = kb.nextInt();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i = 1; i<=numOfNums; i++)
            numbers.add(kb.nextInt());
        System.out.println(mergeSort(numbers));
        
    }
}
