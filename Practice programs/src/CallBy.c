#include <stdio.h>


struct Student{
	int rollNo;
	char name[50];
	float marks;
}

//call by value
acceptData(struct Student s){
	printf("enter roll number : ");
	scanf("%d", &s.rollNo);
	printf("enter name : ");
	scanf("%s", s.name);
	printf("enter marks");
	scanf("%f", &s.marks);

}

displayData(struct Student s){
	printf("\n Student : rollNo: %d, Name: %s, Marks: %f",s.rollNo, s.name,  s.marks );
}

int main(){

	setvbuf(stdout, NULL, _IONBF, 0);
	struct Student s1;

	//acceptData(rollno, name, marks);

	acceptData(s1);
	displayData(s1);


	return 0;
}
