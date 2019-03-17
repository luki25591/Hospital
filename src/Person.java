public class Person {
    private String name;
    private String lastName;
    private int salary;

    public void setName(String name) {

        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(int salary) {

        this.salary = salary;
    }

    public String getName() {

        return name;
    }

    public String getLastName() {

        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public Person(String name, String lastName, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
    }

    public Person(){}

    @Override
    public String toString() {

        return "Imię: " + name + " Nazwisko: " + lastName + ", Wynagrodzenie: " + salary;
    }

}
