package extraMile1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Letter {

    public void writeLetter(StudentGrade studentGrade) throws IOException {
        String[] name = studentGrade.getFullName().split(" ");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(name[0] + "_" + name[1] + ".result"));
        if (studentGrade.getGrade() > 4) {
            bufferedWriter.write("Dear " + studentGrade.getFullName() + ", you have passed the exam for " + studentGrade.getDiscipline() + " receiving the grade " + studentGrade.getGrade() + ".");
        } else {
            bufferedWriter.write("Dear " + studentGrade.getFullName() + ", you have failed the exam for " + studentGrade.getDiscipline() + " receiving the grade " + studentGrade.getGrade() + ".");
        }
        bufferedWriter.newLine();
        bufferedWriter.write("\n");
        bufferedWriter.write("Regards, ");
        bufferedWriter.newLine();
        bufferedWriter.write("Your teacher.");
        bufferedWriter.close();
    }
}
