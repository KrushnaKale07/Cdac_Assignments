//#include <iostream>
//using namespace std;
//
///* Function Prototype */
//void findMinMax(int a, int b, int c, int &minVal, int &maxVal);
//
//int main() {
//    int lo, hi;
//
//    int x = 15, y = 7, z = 22;
//
//    findMinMax(x, y, z, lo, hi);
//
//    cout << "Numbers: " << x << ", " << y << ", " << z << endl;
//    cout << "Minimum: " << lo << endl;
//    cout << "Maximum: " << hi << endl;
//
//    // Verifying that lo and hi were updated
//    cout << "\nAfter function call:" << endl;
//    cout << "lo = " << lo << ", hi = " << hi << endl;
//
//    return 0;
//}
//
///* Function Definition */
//void findMinMax(int a, int b, int c, int &minVal, int &maxVal) {
//    // Assume first value is both min and max
//    minVal = a;
//    maxVal = a;
//
//    // Compare with b
//    if (b < minVal)
//        minVal = b;
//    if (b > maxVal)
//        maxVal = b;
//
//    // Compare with c
//    if (c < minVal)
//        minVal = c;
//    if (c > maxVal)
//        maxVal = c;
//}
