
import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {

        int option = -1;
        final int exit = 0;
        final int addDoctor = 1;
        final int addNurse = 2;
        final int printEmployee = 3;

        Hospital hospital = new Hospital();
        Scanner input = new Scanner(System.in);

        while(option !=exit){
            System.out.println("Dostępne opcje!");
            System.out.println("0 - Wyjdz z programu");
            System.out.println("1 - Dodaj lekarza do bazy:");
            System.out.println("2 - Dodaj pielęgniarkę do bazy:");
            System.out.println("3 - Wyświetl informacje o pracownikach");

            System.out.println("Wybierz opcję!");
            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case addDoctor:
                    Doctor doctor = new Doctor();
                    System.out.println("Podaj imie: ");
                    doctor.setName(input.nextLine());
                    System.out.println("Podaj nazwisko: ");
                    doctor.setLastName(input.nextLine());
                    System.out.println("Podaj kwotę wynagrodzenia: ");
                    doctor.setSalary(input.nextInt());
                    input.nextLine();
                    System.out.println("Podaj kowotę premii: ");
                    doctor.setBonus(input.nextInt());
                    hospital.addEmployee(doctor);
                    input.nextLine();
                    break;
                case addNurse:
                    Nurse nurse = new Nurse();
                    System.out.println("Podaj imię: ");
                    nurse.setName(input.nextLine());
                    System.out.println("Podaj nazwisko: ");
                    nurse.setLastName(input.nextLine());
                    System.out.println("Podaj kwotę wynagrodzenia: ");
                    nurse.setSalary(input.nextInt());
                    input.nextLine();
                    System.out.println("Podaj ilość nadgodzin: ");
                    nurse.setOvertime(input.nextInt());
                    hospital.addEmployee(nurse);
                    input.nextLine();
                    break;
                case printEmployee:
                    System.out.println("Pracownicy szpitala: ");
                    System.out.println(hospital);
                    break;
                case exit:
                    System.out.println("Zamykam program!");
                    break;
                default:
                    System.out.println("Nie ma takiej opcji!");
            }
        }
        input.close();
    }

}
