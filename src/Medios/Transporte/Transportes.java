package Medios.Transporte;

import java.sql.SQLOutput;
import java.util.Date;

enum Transporte {COCHE, CAMION, BARCO, TREN, AVION};
public class Transportes{
    public static void main (String args[]){
        Transporte t1,t2,t3;
        t1=Transporte.AVION;
        t2=Transporte.BARCO;
        t3=Transporte.AVION;
//mostramos el ordinal de cada elemento
        System.out.println("COCHE es el orden "+ Transporte.COCHE.ordinal());
        System.out.println("BARCO es el orden "+ Transporte.BARCO.ordinal());
        System.out.println("CAMION es el orden "+ Transporte.CAMION.ordinal());
        System.out.println("AVION es el orden "+ Transporte.AVION.ordinal());
//COMPARAMOS LOS MEDIOS DE TRANSPORTE
        if (t2.compareTo(t1)<0) {
            System.out.println(t2 + " es más lento que " + t1);
        }
        if (t1.compareTo(t2) > 0) {
            System.out.println(t1 + " es más rápido que " + t2);
        }
        if (t1.compareTo(t3)==0) {
            System.out.println(t1 + " es igual de rápido que " + t3);
        }
        }
    }


