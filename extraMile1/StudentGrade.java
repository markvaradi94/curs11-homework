package extraMile1;

public class StudentGrade {
    private final String fullName;
    private final String discipline;
    private final int grade;

    public StudentGrade(String fullName, String discipline, int grade) {
        this.fullName = fullName;
        this.discipline = discipline;
        this.grade = grade;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDiscipline() {
        return discipline;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "StudentGrade {" +
                "fullName = " + fullName + '\'' +
                ", discipline = " + discipline + '\'' +
                ", grade = " + grade +
                '}';
    }
}
