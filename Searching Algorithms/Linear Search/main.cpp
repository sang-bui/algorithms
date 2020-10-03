#include <iostream>

using namespace std;

int linearSearch(int arr[], int length, int search_value){
    for(int i; i <= length; i++){
        if(arr[i] == search_value){
            return i;
        }
    }
    return -1;
    
}

int main(){
    int arr[16] = {1, 4, 6, 7, 8, 9, 11, 14, 16, 19, 22, 23, 33, 34, 35, 37}; 
    cout<<linearSearch(arr, 15, 35);
    return 0;
}