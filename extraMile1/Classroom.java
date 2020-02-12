package extraMile1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Classroom {
    private StudentGradesList studentList;
    private List<StudentGrade> studentGradesList;
    private Letter letter;

    public Classroom(StudentGradesList studentList, Letter letter) {
        this.studentList = studentList;
        this.studentGradesList = studentList.readStudentList();
        this.letter = letter;
    }

    public List<Integer> getGradesForDiscipline(String discipline) {
        List<Integer> gradesList = new ArrayList<>();
        for (StudentGrade grade : studentGradesList) {
            if (grade.getDiscipline().toLowerCase().equals(discipline.toLowerCase())) {
                gradesList.add(grade.getGrade());
            }
        }
        return gradesList;
    }

    public StudentGrade getGradesForStudent(String studentName) {
        for (StudentGrade grade : studentGradesList) {
            if (grade.getFullName().toLowerCase().equals(studentName.toLowerCase())) {
                return grade;
            }
        }
        return null;
    }

    public StudentGrade getMaxGrade(String discipline) {
        int maxGrade = Collections.max(getGradesForDiscipline(discipline));
        for (StudentGrade grade : studentGradesList) {
            if (grade.getDiscipline().toLowerCase().equals(discipline.toLowerCase())) {
                if (grade.getGrade() == maxGrade) {
                    return grade;
                }
            }
        }
        return null;
    }

    public StudentGrade getMaxGrade() {
        List<Integer> grades = new ArrayList<>();
        for (StudentGrade studentGrade : studentGradesList) {
            grades.add(studentGrade.getGrade());
        }
        int maxGrade = Collections.max(grades);
        for (StudentGrade grade : studentGradesList) {
            if (grade.getGrade() == maxGrade) {
                return grade;
            }
        }
        return null;
    }

    public int getAverageGrade(String discipline) {
        List<Integer> grades = getGradesForDiscipline(discipline);
        int sum = 0;
        int n = grades.size();
        for (int grade : grades) {
            sum += grade;
        }
        return sum / n;
    }

    public StudentGrade getWorstGrade(String discipline) {
        int worstGrade = Collections.min(getGradesForDiscipline(discipline));
        for (StudentGrade grade : studentGradesList) {
            if (grade.getDiscipline().toLowerCase().equals(discipline.toLowerCase())) {
                if (grade.getGrade() == worstGrade) {
                    return grade;
                }
            }
        }
        return null;
    }

    public StudentGradesList getStudentList() {
        return studentList;
    }

    public List<StudentGrade> getStudentGradesList() {
        return studentGradesList;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "studentGradesList = " + studentGradesList +
                '}';
    }

    public void writeLetters() throws IOException {
        for (StudentGrade studentGrade : this.studentGradesList) {
            letter.writeLetter(studentGrade);
        }
    }
}
