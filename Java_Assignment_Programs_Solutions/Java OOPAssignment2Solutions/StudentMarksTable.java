/*15. Student Marks Table
Create a program:
Requirements:
● Store marks of 3 students in 3 subjects using 2D array
● Calculate:
	○ Total per student
	○ Average marks
● Display in table format*/

public class StudentMarksTable {
    public static void main(String[] args) {

        
        int[][] marks = {
            {80, 75, 90},   
            {60, 70, 65},   
            {85, 95, 88}
        };

        System.out.println("Student\tSub1\tSub2\tSub3\tTotal\tAverage");

        for (int i = 0; i < marks.length; i++) {
            int total = 0;

            System.out.print("S" + (i + 1) + "\t");

            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + "\t");
                total += marks[i][j];
            }

            double avg = total / 3.0;

            System.out.print(total + "\t" + avg);
            System.out.println();
        }
    }
}