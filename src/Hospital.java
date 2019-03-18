public class Hospital {

    private Person[] person = new Person[MAX_EMPLOYEE];
    public static final int MAX_EMPLOYEE = 3;
    private int number = 0;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Person[] getPerson() {

        return person;
    }

    public void setPerson(Person[] person) {

        this.person = person;
    }

    public void addEmployee(Person persons) {
        if (getNumber() < MAX_EMPLOYEE) {
            getPerson()[getNumber()] = persons;
            setNumber(getNumber() + 1);
        } else {
            System.out.println("Brak miejsca w bazie!");
        }
    }

    @Override
    public String toString() {
        if(number == 0){
            System.out.println("Brak pracowników w bazie!");
        }else{
            System.out.println("Baza może przechowywać max " + person.length + " pracowników.");
        }if(number != 0) {
            System.out.println("Liczba pracowników w bazie: " + number);
        }
        String result = " ";
        for (int i = 0; i < number; i++) {
            result = result + person[i] + "\n";
        }
        return result;
    }

}
