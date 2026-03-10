/*#include <stdio.h>
int main(){
	double num1;
	double num2;
	char operator;

	printf("Enter an operator (+, -, *, /): \\n");
	// Read character and store it in the 'operator' variable's address
	scanf(" %c", &operator);

	// Read an integer and store it in the 'number' variable's address
	printf("Enter two numbers: \\n");
	scanf("%lf %lf", &num1, &num2);

	switch(operator){
			case '+':
	            printf("%.2lf + %.2lf = %.2lf\\n", num1, num2, num1 + num2);
	            break;
	        case '-':
	            printf("%.2lf - %.2lf = %.2lf\\n", num1, num2, num1 - num2);
	            break;
	        case '*':
	            printf("%.2lf * %.2lf = %.2lf\\n", num1, num2, num1 * num2);
	            break;
	        case '/':
	            // Handle division by zero error
	            if (num2 != 0) {
	                printf("%.2lf / %.2lf = %.2lf\\n", num1, num2, num1 / num2);
	            } else {
	                printf("Error: Division by zero is not allowed.\\n");
	                return 1; // Exit the program with an error status
	            }
	            break;
	        // Handle invalid operator input
	        default:
	            printf("Error: Invalid operator.\\n");
	            return 1; // Exit the program with an error status
	}
	return 0;
}
*/
