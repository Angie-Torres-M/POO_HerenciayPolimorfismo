package classes;

import java.util.HashMap;
import java.util.Map;

public class SalesManager extends SalesRep {

    // Mapa de empleados: registration → SalesRep
    private HashMap<Integer, SalesRep> salesTeam = new HashMap<>();

    // Constructor
    public SalesManager(String firstName, String lastName, int registration,
                        int age, int daysWorked, int vacationDaysTaken,
                        double salary, int yearsWorked,
                        double salesMade,  String username, String password) {

        super(firstName, lastName, registration, age,
              daysWorked, vacationDaysTaken, salary, yearsWorked, salesMade, username,password);
    }

    // Getter del equipo (opcional)
    public HashMap<Integer, SalesRep> getSalesTeam() {
        return salesTeam;
    }

    // Agregar SalesRep con validación containsKey()
    public void addSalesRep(SalesRep salesRep) {

        int key = salesRep.getRegistration(); // usamos registration como ID único

        if (!salesTeam.containsKey(key)) {     // si NO existe, agrégalo
            salesTeam.put(key, salesRep);
            System.out.println("SalesRep agregado: " + salesRep.getFirstName());
        } else {
            System.out.println("Ya existe un SalesRep con registration " + key);
        }
    }

    // Comisión del manager: 8% del total vendido por el equipo
    @Override
    public int calculateComission() {

        double totalSales = 0.0;

        // Sumamos las ventas de cada rep
        for (Map.Entry<Integer, SalesRep> entry : salesTeam.entrySet()) {
            totalSales += entry.getValue().getSalesMade();
        }

        // El manager gana el 8% del total vendido por su equipo
        double managerCommission = 0.08 * totalSales;

        return (int) managerCommission; // convertido a entero como pide el ejercicio
    }



@Override
public String toString() {
    return "SalesManager{" +
            "firstName='" + getFirstName() + '\'' +
            ", lastName='" + getLastName() + '\'' +
            ", registration=" + getRegistration() +
            ", salesTeamSize=" + salesTeam.size() +
            '}';
}
} 
