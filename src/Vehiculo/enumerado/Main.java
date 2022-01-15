package Vehiculo.enumerado;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        Vehiculo miVehiculo = new Vehiculo();
        String marca, matricula;
        Scanner teclado = new Scanner(System.in);

        System.out.println("objeto creado por defecto");
        System.out.println("Marca " + miVehiculo.getMarcaString() + " matricula " + miVehiculo.getMatricula() );

//le cambio la marca y la matricula a mi coche pidiéndola por consola usando String
        System.out.println("Introduzca la marca del vehiculo ");
        marca=teclado.nextLine();
        miVehiculo.setMarcaString(marca.toLowerCase());

        System.out.println("Introduzca la matrícula del vehiculo ");
        matricula=teclado.nextLine();
        miVehiculo.setMatriculaString(matricula.toUpperCase());

        System.out.println("ahora mi vehiculo es: ");
        System.out.println("Marca " + miVehiculo.getMarcaString() + " matricula " + miVehiculo.getMatricula() );

//hago lo mismo pero usando el enumerado como parámetro y le pongo a cascoporro que es un Seat
        miVehiculo.setMarca(Vehiculo.MarcaDeVehiculo.SEAT);
        System.out.println("ahora mi vehiculo es: ");
        System.out.println("Marca " + miVehiculo.getMarca().toString() + " matricula " + miVehiculo.getMatricula() );




    }
}
