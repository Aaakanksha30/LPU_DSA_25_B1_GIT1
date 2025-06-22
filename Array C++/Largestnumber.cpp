#include <iostream>
using namespace std;

int findLargest(int arr[], int size) {
    int maxElement = arr[0]; 

    for (int i = 1; i < size; i++) {
        if (arr[i] > maxElement) {
            maxElement = arr[i]; 
        }
    }
    return maxElement;
}

int main() {
    int arr[] = {10, 45, 32, 67, 89, 21};
    int size = sizeof(arr) / sizeof(arr[0]);

    cout << "The largest element in the array is: " << findLargest(arr, size) << endl;

    return 0;
}
