package Textos;

enum Vocales {a,e,i,o,u,á, é, í, ó,ú,ü}

public class Texto {
    static final String VOCALES ="aeiouáéíóúü";
    private String texto="";
//la declaramos final para que no varíe el tamaño una vez que lo hayamos declarado
    private int tamañoMax=0;
     //Constructor con longitud del texto
    public Texto (int tamañoMax){
        this.texto="";
        this.tamañoMax= tamañoMax;
    }
    //añadir un carácter al principio si hay espacio
    public boolean añadirCaracterPpio(char c){
        boolean resultado=false;
        if (this.texto.length()<this.tamañoMax) {
            this.texto = c + this.texto;
            resultado=true;
        }
        return resultado;
    }
    //añadir un carácter al final si hay espacio
    public boolean añadirCaracterFinal(char c){
        boolean resultado=false;
        if (this.texto.length()<this.tamañoMax) {
            this.texto = this.texto + c;
            resultado=true;
        }
        return resultado;
    }
    //añadir una cadena al principio si hay espacio
    public boolean añadirCadenaPpio(String cadena){
        boolean resultado=false;
        if ((this.texto.length()+ cadena.length())<this.tamañoMax) {
            this.texto = cadena+ this.texto;
            resultado=true;
        }
        return resultado;
    }
    //añadir una cadena al final si hay espacio
    public boolean añadirCadenaFinal(String cadena){
        boolean resultado=false;
        if ((this.texto.length()+ cadena.length())<this.tamañoMax) {
            this.texto = this.texto + cadena;
            resultado=true;
        }
        return resultado;
    }

//Contar cuántas vocales hay en el texto.

    public int contarVocales() {
        int resultado = 0;
        for (int i = 0; i < this.texto.length(); i++) {

            if (esVocal(texto.charAt(i))) {
                resultado++;
            }
              }
        return resultado;
    }
public boolean esVocal(char c){
        c=Character.toLowerCase(c);
        boolean resultado = false;
        if (VOCALES.indexOf(c)!=-1){
            resultado=true;
         }
        return resultado;
}
//método getter
    public String getTexto(){
        return this.texto;
    }
}
