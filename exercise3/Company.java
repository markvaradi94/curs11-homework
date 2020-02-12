package exercise3;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Person> employees;

    public Company(Person manager) {
        this.employees = new ArrayList<>();
        employ(manager.getName(), manager.getAge(), "manager");
    }

    public List<Person> getPersonsByPosition(String position) {
        List<Person> persons = new ArrayList<>();
        for (Person employee : this.employees) {
            if (employee.getPosition().equals(position)) {
                persons.add(employee);
            }
        }
        return persons;
    }

    public Person getTeacher() {
        for (Person employee : this.employees) {
            if (employee.getPosition().toLowerCase().equals("manager")) {
                return employee;
            }
        }
        return null;
    }

    public List<Person> getEmployees() {
        return this.employees;
    }

    public void showEmployees() {
        for (Person employee : this.employees) {
            System.out.println(employee.toString());
        }
    }

    public List<Person> getPersonsOlder(int age) {
        List<Person> persons = new ArrayList<>();
        for (Person employee : this.employees) {
            if (employee.getAge() >= age) {
                persons.add(employee);
            }
        }
        return persons;
    }

    public List<Person> getPersonsByName(String filterName) {
        List<Person> persons = new ArrayList<>();
        for (Person employee : this.employees) {
            String[] name = employee.getName().split(" ");
            for (String elem : name) {
                if (elem.toLowerCase().contains(filterName.toLowerCase())) {
                    persons.add(employee);
                }
            }
        }
        return persons;
    }

    public void employ(String name, int age, String position) {
        employees.add(new Person(name, age, position));
    }

    public void employ(Person person) {
        this.employees.add(person);
    }
}
