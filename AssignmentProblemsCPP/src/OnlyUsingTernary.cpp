//#include <iostream>
//#include <iomanip>
//using namespace std;
//
//// Absolute value using ternary only
//int absolute(int n)
//{
//    return (n < 0) ? -n : n;
//}
//
//// Clamp using nested ternary only
//int clamp(int val, int lo, int hi)
//{
//    return (val < lo) ? lo : (val > hi) ? hi : val;
//}
//
//int main()
//{
//    std::cout << std::left
//              << std::setw(8)  << "Value"
//              << std::setw(8)  << "lo"
//              << std::setw(8)  << "hi"
//              << std::setw(12) << "Absolute(val)"
//              << std::setw(12) << "Clampp(val, lo, hi)"
//              << std::endl;
//
//    std::cout << "---------------------------------------------\n";
//
//    // Test cases
//    int values[] = { -15, 0, 25, -3 };
//    int los[]    = { -10, -10, -10, 0 };
//    int his[]    = {  10,  10,  10, 5 };
//
//    for (int i = 0; i < 4; i++)
//    {
//        int val = values[i];
//        int lo  = los[i];
//        int hi  = his[i];
//
//        std::cout << std::left
//                  << std::setw(8)  << val
//                  << std::setw(8)  << lo
//                  << std::setw(8)  << hi
//                  << std::setw(12) << absolute(val)
//                  << std::setw(12) << clamp(val, lo, hi)
//                  << std::endl;
//    }
//
//    return 0;
//}
