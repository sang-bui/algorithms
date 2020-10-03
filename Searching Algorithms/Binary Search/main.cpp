#include <iostream>

using namespace std;

int binarySearch(int arr[], int begin, int end, int search_value){

    int mid = (begin + end) / 2;
    if(search_value == arr[mid]){
        return mid;
    }else if(search_value > arr[mid]){
        binarySearch(arr, mid + 1, end, search_value);
    }else if(search_value < arr[mid]){
        binarySearch(arr, begin, mid - 1, search_value);
    }else{
        return -1;
    }
}



int main(){
    int arr[16] = {1, 4, 6, 7, 8, 9, 11, 14, 16, 19, 22, 23, 33, 34, 35, 37}; 
    cout<<binarySearch(arr, 0, 15, 37);
    return 0;
}