//#include <stdio.h>
//
//int main(){
//	int x = 10; int y = 20; int z = 30;
//	int *px = &x;
//	int *py = &y;
//	int *pz = &z;
//
//	printf("Before swap:\n");
//	printf("x = %d, y = %d, z = %d\n", *px, *py, *pz);
//	printf("Addresses: px = %p, py = %p, pz = %p\n\n",
//	           (void*)px, (void*)py, (void*)pz);
//
//
//    /* Swap values of x and z using pointers only */
//	int temp = *px;
//	*px = *pz;
//	*pz = temp;
//
//	printf("After swap:\n");
//	printf("x = %d, y = %d, z = %d\n", *px, *py, *pz);
//	printf("Addresses: px = %p, py = %p, pz = %p\n",
//	           (void*)px, (void*)py, (void*)pz);
//
//	return 0;
//
//}
