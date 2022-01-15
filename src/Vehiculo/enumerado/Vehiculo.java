package Vehiculo.enumerado;

public class Vehiculo {
    enum MarcaDeVehiculo {BMW, MERCEDES, AVENSIS, TOYOTA, SEAT, NISSAN, AUDI, NO_CONOCIDO}

    ;
    private MarcaDeVehiculo marca;
    private String matricula;
//constructores

    public Vehiculo() {
        this.marca = MarcaDeVehiculo.NO_CONOCIDO;
        this.matricula = "";
        System.out.println(marca.name());
    }

    //getter abd setter
    public void setMarcaString(String marca) {
        switch (marca) {
            case "audi":
                this.marca = MarcaDeVehiculo.AUDI;
                break;
            case "bmw":
                this.marca = MarcaDeVehiculo.BMW;
                break;
            case "mercedes":
                this.marca = MarcaDeVehiculo.MERCEDES;
                break;
            case "avensis":
                this.marca = MarcaDeVehiculo.AVENSIS;
                break;
            case "toyota":
                this.marca = MarcaDeVehiculo.TOYOTA;
                break;
            case "seat":
                this.marca = MarcaDeVehiculo.SEAT;
                break;
            case "nissan":
                this.marca = MarcaDeVehiculo.NISSAN;
                break;
            default:
                this.marca = MarcaDeVehiculo.NO_CONOCIDO;
                break;
        }

    }

    public void setMatriculaString(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public String  getMarcaString() {

//        return marca.toString().toUpperCase();
        var s = marca.name().toUpperCase();
        return s;
    }

  /*  //ToString
    public String toString() {
        String resultado;
        return resultado = ( "el vehiculo de marca " + this.marca + " tiene la matricula " + this.matricula );
    }

   */

    public void setMarca(MarcaDeVehiculo marca) {
        this.marca=marca;

    }
    public MarcaDeVehiculo getMarca() {
        return this.marca;

    }
}