public class Nurse extends Person {
    private int overtime;


    public Nurse(){}
    public Nurse(String name, String lastName, int salary, int overtime) {
        super(name, lastName, salary);
        this.overtime = overtime;
    }

    public int getOvertime() {

        return overtime;
    }

    public void setOvertime(int overtime) {

        this.overtime = overtime;
    }

    @Override
    public String toString() {

        return super.toString() + ", Nadgodziny: " + overtime;
    }
}
