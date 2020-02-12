package extraMile1;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StudentGradesList list = new StudentGradesList();
        Letter letter = new Letter();
        Classroom classroom = new Classroom(list, letter);
        System.out.println(classroom.getGradesForDiscipline("mathematics"));
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(classroom.getGradesForStudent("Branwen Evelina"));
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(classroom.getMaxGrade("mathematics"));
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(classroom.getMaxGrade("computer science"));
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(classroom.getMaxGrade("physics"));
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(classroom.getMaxGrade());
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(classroom.getAverageGrade("mathematics"));
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(classroom.getWorstGrade("computer science"));
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(classroom.toString());
        classroom.writeLetters();
    }
}
