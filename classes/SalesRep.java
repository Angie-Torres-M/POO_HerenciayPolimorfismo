package classes;

public class SalesRep extends Employee {

    private double salesMade;

    public SalesRep(String firstName, String lastName, int registration,
                    int age, int daysWorked, int vacationDaysTaken,
                    double salary, int yearsWorked,
                    double salesMade,  String username, String password ) {
        super(firstName, lastName, registration, age,
              daysWorked, vacationDaysTaken, salary, yearsWorked, username,  password);
        this.salesMade = salesMade;
    }

    // commission = 0.1 * salesMade
    public int calculateComission() {
        return (int) (0.1 * salesMade);
    }

    public double getSalesMade() {
        return salesMade;
    }

    public void setSalesMade(double salesMade) {
        this.salesMade = salesMade;
    }

    @Override
    public String toString() {
        return "SalesRep{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", registration=" + getRegistration() +
                ", salesMade=" + salesMade +
                '}';
    }
}
