
import java.util.ArrayList;


class LinearSearch{
    public static void main(String[] args) {
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(5);
        arr.add(3);
        arr.add(8);
        arr.add(1);
        arr.add(9);
        arr.add(2);
        arr.add(7);
        int searchVal = 9;
        for(int i = 0; i<arr.size(); i++){
            if(arr.get(i) == searchVal){
                System.out.print(i);
            }
        }

    }
}