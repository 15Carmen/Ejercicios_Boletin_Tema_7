package Textos;

public class Main {

    public static void main (String args[]){

        Texto miTexto = new Texto(20);
//Añado un texto al final, si Ok, añado el comienzo del texto
        if (miTexto.añadirCadenaFinal("¿qué tal está")){
            if (miTexto.añadirCadenaPpio("ola,")){
                if (miTexto.añadirCaracterPpio('H')){
                    miTexto.añadirCaracterFinal('?');
                }
            }
        }
//cuanto las vocales que tiene mi texto
        System.out.println("el texto:"+ miTexto.getTexto().toString()+ " tiene "+ miTexto.contarVocales()+" vocales.");
    }
}
