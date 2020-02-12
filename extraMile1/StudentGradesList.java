package extraMile1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StudentGradesList {
    private Scanner scanner = new Scanner(new FileReader("C:\\fasttrack\\curs11\\homework\\src\\extraMile1\\grades.txt"));
    public List<StudentGrade> studentGradeList;

    public StudentGradesList() throws FileNotFoundException {
        this.studentGradeList = new ArrayList<>();
    }

    public List<StudentGrade> readStudentList() {
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] elements = line.split("[|]");
            this.studentGradeList.add(new StudentGrade(elements[0], elements[1], Integer.parseInt(elements[2])));
        }
        return this.studentGradeList;
    }

    @Override
    public String toString() {
        return "StudentGradesList{" +
                "studentGradeList=" + studentGradeList +
                '}';
    }
}
