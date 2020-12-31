import java.util.ArrayList;


class BinarySearch{

    private static int BS(ArrayList<Integer> arr, int start, int end, int search){
        
        int mid = (start + end) / 2;

        if(arr.get(mid) == search){
            return mid;
        }else if(arr.get(mid) > search){
            return BS(arr, start, mid-1, search);
        }else{
            return BS(arr, mid+1, end, search);
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);
        numbers.add(11);
        numbers.add(15);
        numbers.add(17);
        numbers.add(19);
        System.out.print(BS(numbers, 0, numbers.size()-1, 11));
    }
}