//#include <iostream>
//#include <iomanip>
//
//// Returns absolute value using ternary operator
//int absolute(int n)
//{
//    return (n < 0) ? -n : n;
//}
//
//// Clamps value between lo and hi using ternary operator only
//int clamp(int val, int lo, int hi)
//{
//    return (val < lo) ? lo : (val > hi) ? hi : val;
//}
//
//int main()
//{
//    std::cout << std::left << std::setw(10) << "Value"
//              << std::setw(12) << "Absolute"
//              << std::setw(10) << "Clamp(0,10)"
//              << std::endl;
//
//    std::cout << "----------------------------------\n";
//
//    int testValues[] = { -15, -3, 0, 5, 12 };
//
//    for (int i = 0; i < 5; i++)
//    {
//        int val = testValues[i];
//
//        std::cout << std::left << std::setw(10) << val
//                  << std::setw(12) << absolute(val)
//                  << std::setw(10) << clamp(val, 0, 10)
//                  << std::endl;
//    }
//
//    return 0;
//}
