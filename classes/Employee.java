package classes;

public class Employee implements User {

    // Atributos privados
    private String firstName;
    private String lastName;
    private int registration;
    private int age;
    private int daysWorked;
    private int vacationDaysTaken;
    private double salary;
    private int yearsWorked;

    // Credenciales de login
    private String username;
    private String password;

    // Constructor con username y password
    public Employee(String firstName, String lastName, int registration,
                    int age, int daysWorked, int vacationDaysTaken,
                    double salary, int yearsWorked,
                    String username, String password) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.age = age;
        this.daysWorked = daysWorked;
        this.vacationDaysTaken = vacationDaysTaken;
        this.salary = salary;
        this.yearsWorked = yearsWorked;

        this.username = username;
        this.password = password;
    }

    // ====== LÓGICA DE NEGOCIO ======

    // time to retirement = min(60 - age, 40 - yearsWorked)
    public int timeToRetirement() {
        int byAge = 60 - age;
        int byYears = 40 - yearsWorked;
        return Math.min(byAge, byYears);
    }

    // vacation time left = (daysWorked/360) * (30 - vacationDaysTaken)
    public int vacationTimeLeft() {
        double yearsEquivalent = (double) daysWorked / 360.0;
        double remainingDays = 30 - vacationDaysTaken;
        double result = yearsEquivalent * remainingDays;
        return (int) Math.floor(result);
    }

    // bonus = 0.022 * salary
    public int calculateBonus() {
        return (int) (0.022 * salary);
    }

    // Implementación de login (interfaz User)
    @Override
    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    // toString
    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", registration=" + registration +
                ", age=" + age +
                ", daysWorked=" + daysWorked +
                ", vacationDaysTaken=" + vacationDaysTaken +
                ", salary=" + salary +
                ", yearsWorked=" + yearsWorked +
                ", username='" + username + '\'' +
                '}';
    }

    // ===== GETTERS y SETTERS =====

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public int getRegistration() { return registration; }
    public void setRegistration(int registration) { this.registration = registration; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public int getDaysWorked() { return daysWorked; }
    public void setDaysWorked(int daysWorked) { this.daysWorked = daysWorked; }

    public int getVacationDaysTaken() { return vacationDaysTaken; }
    public void setVacationDaysTaken(int vacationDaysTaken) { this.vacationDaysTaken = vacationDaysTaken; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public int getYearsWorked() { return yearsWorked; }
    public void setYearsWorked(int yearsWorked) { this.yearsWorked = yearsWorked; }
}
