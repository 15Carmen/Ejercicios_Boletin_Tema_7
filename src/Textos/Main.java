package Textos;

public class Main {

    public static void main (String args[]){
/**
 * Creo una texto de 20 de longitud y voy añadiendo contendo hasta que formo la frase "hola, ¿qué tal está?
 * finalmente cuento las vocales que tiene el texto
 */
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
