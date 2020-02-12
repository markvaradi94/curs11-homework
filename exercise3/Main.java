package exercise3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person mark = new Person("Mark Varadi", 26, "manager");
        Company company = new Company(mark);
        company.employ(new Person("Ion Pop", 45, "plumber"));
        company.employ(new Person("Aurel Bogdan", 37, "welder"));
        company.employ(new Person("Maria Grigorescu", 49, "carpenter"));
        company.employ(new Person("Mark Erdei", 29, "welder"));
        company.employ(new Person("Ion Bogdan", 35, "plumber"));
        List<Person> persons = company.getPersonsByName("mark");
        System.out.println(persons.toString());
        persons = company.getPersonsByPosition("welder");
        System.out.println(persons.toString());
        persons = company.getPersonsOlder(37);
        System.out.println(persons.toString());
        System.out.println(company.getTeacher());
        System.out.println("----------------");
        company.showEmployees();
    }
}
