package classes;

public class Main {
    public static void main(String[] args) {

        // Crear un empleado base
        Employee e = new Employee(
                "Ana", "García", 1,
                35,
                720,
                5,
                15000.0,
                5,
                "ana123",
                "pass123"
        );

        // Mostrar información del empleado
        System.out.println(e);
        System.out.println("Años para retiro: " + e.timeToRetirement());
        System.out.println("Vacaciones restantes: " + e.vacationTimeLeft());
        System.out.println("Bono: " + e.calculateBonus());

        System.out.println("===============================================");

        // ====== SALIDA EXTRA: PRUEBA DE LOGIN ======
        System.out.println("Probando login para " + e.getFirstName() + ":");
        System.out.println("Login correcto: " + e.login("ana123", "pass123"));
        System.out.println("Login incorrecto: " + e.login("ana123", "malpass"));

        System.out.println("===============================================");

        // Crear primer representante de ventas
        SalesRep rep1 = new SalesRep(
                "Luis", "Pérez", 2,
                30, 360, 2,
                12000.0, 3,
                500000.0,
                "luis123",
                "passluis"
        );

        // Mostrar información del representante 1
        System.out.println(rep1);
        System.out.println("Años para retiro: " + rep1.timeToRetirement());
        System.out.println("Vacaciones restantes: " + rep1.vacationTimeLeft());
        System.out.println("Bono: " + rep1.calculateBonus());

        System.out.println("===============================================");
        
        // ====== SALIDA EXTRA: PRUEBA DE LOGIN ======
        System.out.println("Probando login para " + rep1.getFirstName() + ":");
        System.out.println("Login correcto: " + rep1.login("luis123", "passluis"));
        System.out.println("Login incorrecto: " + rep1.login("luis123", "malpass"));

        System.out.println("===============================================");


        // Crear segundo representante de ventas
        SalesRep rep2 = new SalesRep(
                "Marta", "López", 3,
                28, 360, 3,
                11000.0, 2,
                300000.0,
                "marta123",
                "passmarta"
        );

        // Mostrar información del representante 2
        System.out.println(rep2);
        System.out.println("Años para retiro: " + rep2.timeToRetirement());
        System.out.println("Vacaciones restantes: " + rep2.vacationTimeLeft());
        System.out.println("Bono: " + rep2.calculateBonus());

        System.out.println("===============================================");

        // Mostrar comisiones individuales
        System.out.println("Comisión rep1: " + rep1.calculateComission());
        System.out.println("Comisión rep2: " + rep2.calculateComission());

        System.out.println("===============================================");

        // Crear gerente de ventas
        SalesManager manager = new SalesManager(
                "Carlos", "Ruiz", 4,
                40, 360 * 10, 10,
                25000.0, 10,
                0.0,
                "carlos123",
                "passcarlos"
        );

        // Mostrar información del gerente
        System.out.println(manager);
        System.out.println("Años para retiro: " + manager.timeToRetirement());
        System.out.println("Vacaciones restantes: " + manager.vacationTimeLeft());
        System.out.println("Bono: " + manager.calculateBonus());

        System.out.println("===============================================");

        // Agregar representantes al equipo del gerente
        manager.addSalesRep(rep1);
        manager.addSalesRep(rep2);

        System.out.println("===============================================");

        // Mostrar comisión total del gerente basada en el equipo
        System.out.println("Comisión del manager: " + manager.calculateComission());
    }
}
