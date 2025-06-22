#include <iostream>  
using namespace std; 

int reverseNumber(int n) {
    int rev = 0;  
    bool isNegative = (n < 0);  
    n = abs(n);  
    while (n > 0) {
        rev = rev * 10 + (n % 10); 
        n /= 10;  
    }

    return isNegative ? -rev : rev; 
} 
int main() {
    int num = -12345;  
    cout << "Reversed Number: " << reverseNumber(num) << endl;  
    return 0;  
}
