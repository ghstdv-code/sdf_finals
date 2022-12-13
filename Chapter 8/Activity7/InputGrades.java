package Activity7;

import java.util.Scanner;

public class InputGrades {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int id = 0;
        String courseId;
        float credHours;
        char grade = 'E';
        Student[] students = new Student[10];
        CollegeCourse course = new CollegeCourse();
        for(int i = 0; i < 10; i++){
            System.out.println(String.format("Student Entry No: %d", i+1));
            System.out.print("Student ID: ");
            id = sc.nextInt();

            students[i] = new Student();
            students[i].SetId(id);
            sc.nextLine();
            System.out.println();

            for(int j = 0; j < 5; j++){
                System.out.print(String.format("Student Course #%d ID: ", j+1));
                courseId = sc.nextLine();
                System.out.print("Student Credit Hour(s): ");
                credHours = sc.nextFloat();
                sc.nextLine();
                while(CheckValid(grade) == false){
                    System.out.print("Student Grade: ");
                    grade = (sc.next().toUpperCase()).charAt(0);
                    
                    if(CheckValid(grade) == true) break;
                    else{
                        System.out.println("Invalid Grade!\n");
                    }
                }

                course.SetCourseId(courseId);
                course.SetCreditHours(credHours);
                course.SetLetterGrade(grade);
                sc.nextLine();
                System.out.println();

                grade = 'E';
            }       
        }
        sc.close();
    }

    static boolean CheckValid(char x){
        boolean b = false;
        switch(x)
        {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'F':
                b = true;
                break;
            default:
                b = false;
        }
        return b;
    }
}
