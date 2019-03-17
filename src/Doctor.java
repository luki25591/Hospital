public class Doctor extends Person {

    private double bonus;



    public Doctor(String name, String lastName, int salary, double bonus) {
        super(name, lastName, salary);
        this.bonus = bonus;
    }

    public double getBonus() {

        return bonus;
    }

    public void setBonus(int bonus){
        this.bonus = bonus;
    }

    public Doctor(){}

    @Override
    public String toString() {
        return super.toString() + ", Premia: " + bonus;
    }
}
