package David_Carvajal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, numero;
        double tipo, importe;

        Cuenta cuenta1=new Cuenta();
        System.out.print("Nombre : ");
        nombre = sc.nextLine();
        System.out.print("Número de cuenta : ");
        numero = sc.nextLine();
        System.out.print("Tipo de interes : ");
        tipo = sc.nextDouble();
        System.out.print("Saldo: ");
        importe = sc.nextDouble();
        cuenta1.asignarNombreCliente(nombre);
        cuenta1.asignarNumeroCuenta(numero);
        cuenta1.asignarTipoInteres(tipo);
        cuenta1.asignarSaldo(importe);
        Cuenta cuenta2 = new Cuenta("Juan Ferrández Rubio", "12345678901234567890", 1.75, 300);
        Cuenta cuenta3 = new Cuenta(cuenta1);
        System.out.println("Datos de la cuenta 1");
        System.out.println("Nombre del titular: " + cuenta1.obtenerNombreCliente());
        System.out.println("Número de cuenta: " + cuenta1.obtenerNumeroCuenta());
        System.out.println("Tipo de interés: " + cuenta1.obtenerTipoInteres());
        System.out.println("Saldo: " + cuenta1.obtenerSaldo());
        System.out.println();
        cuenta1.ingreso(4000);
        System.out.println("Saldo: " + cuenta1.obtenerSaldo());
        System.out.println("Datos de la cuenta 2");
        System.out.println("Nombre del titular: " + cuenta2.obtenerNombreCliente());
        System.out.println("Número de cuenta: " + cuenta2.obtenerNumeroCuenta());
        System.out.println("Tipo de interés: " + cuenta2.obtenerTipoInteres());
        System.out.println("Saldo: " + cuenta2.obtenerSaldo());
        System.out.println();
        System.out.println("Datos de la cuenta 3");
        System.out.println("Nombre del titular: " + cuenta3.obtenerNombreCliente());
        System.out.println("Número de cuenta: " + cuenta3.obtenerNumeroCuenta());
        System.out.println("Tipo de interés: " + cuenta3.obtenerTipoInteres());
        System.out.println("Saldo: " + cuenta3.obtenerSaldo());
        System.out.println();
        cuenta3.transferencia(cuenta3,10);

        System.out.println("Saldo de la cuenta 2");
        System.out.println("Saldo: " + cuenta2.obtenerSaldo());
        System.out.println();
        System.out.println("Saldo de la cuenta 3");
        System.out.println("Saldo: " + cuenta3.obtenerSaldo());
        System.out.println();

    }

}
