#include <iostream>
#include <climits> 
using namespace std;

int findSecondLargest(int arr[], int size) {
    if (size < 2) {
        cout << "Array should have at least two elements!" << endl;
        return -1; 
    }

    int largest = INT_MIN, secondLargest = INT_MIN;

    for (int i = 0; i < size; i++) {
        if (arr[i] > largest) {
            secondLargest = largest;
            largest = arr[i];
        } else if (arr[i] > secondLargest && arr[i] != largest) {
            secondLargest = arr[i];
        }
    }

    return (secondLargest == INT_MIN) ? -1 : secondLargest;
}

int main() {
    int arr[] = {10, 45, 32, 67, 89, 21};
    int size = sizeof(arr) / sizeof(arr[0]);

    int secondLargest = findSecondLargest(arr, size);
    if (secondLargest != -1)
        cout << "The second largest element in the array is: " << secondLargest << endl;
    else
        cout << "No second largest element found!" << endl;

    return 0;
}
