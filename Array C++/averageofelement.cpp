#include <iostream>
using namespace std;

double findAverage(int arr[], int size) {
    int sum = 0; 

    for (int i = 0; i < size; i++) {
        sum += arr[i]; 
    }

    return (double)sum / size; 
}

int main() {
    int arr[] = {10, 20, 30, 40, 50}; 
    int size = sizeof(arr) / sizeof(arr[0]); 

    double average = findAverage(arr, size); 
    cout << "The average of the array elements is: " << average << endl; 

    return 0;
}
