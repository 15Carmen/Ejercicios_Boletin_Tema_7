package David_Carvajal;

public class Cuenta {
    private String nombreCliente;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;

    public Cuenta(){
        this.nombreCliente="";
        this.numeroCuenta="";
        this.tipoInteres=0;
        this.saldo=0;
    }
    public Cuenta(String nombreCliente, String numeroCuenta, double tipoInteres, double saldo){
        this.nombreCliente=nombreCliente;
        this.numeroCuenta=numeroCuenta;
        this.tipoInteres=tipoInteres;
        this.saldo=saldo;
    }
    public Cuenta(Cuenta copia){
        this.nombreCliente=copia.nombreCliente;
        this.numeroCuenta=copia.numeroCuenta;
        this.tipoInteres=copia.tipoInteres;
        this.saldo=copia.saldo;
    }
    public void asignarNombreCliente(String nombreCliente){
        this.nombreCliente=nombreCliente;
    }
    public void asignarNumeroCuenta(String numeroCuenta){
        this.numeroCuenta=numeroCuenta;
    }
    public void asignarTipoInteres(double tipoInteres){
        this.tipoInteres=tipoInteres;
    }
    public void asignarSaldo(double saldo){
        this.saldo=saldo;
    }
    public String obtenerNombreCliente(){
        return this.nombreCliente;
    }
    public String obtenerNumeroCuenta(){
        return this.numeroCuenta;
    }
    public double obtenerTipoInteres(){
        return this.tipoInteres;
    }
    public double obtenerSaldo(){
        return this.saldo;
    }
    public void ingreso(double cantidadIngreso){
        this.saldo=this.saldo+cantidadIngreso;
        System.out.println("true");
    }
    public void reintegro(double cantidadReintegro){
        if(this.saldo>cantidadReintegro){
            this.saldo=this.saldo-cantidadReintegro;
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    public void transferencia(Cuenta cuenta, double cantidad){
        if(this.saldo>cantidad) {
            this.saldo=this.saldo-cantidad;
            cuenta.asignarSaldo(cuenta.obtenerSaldo() + cantidad);
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

}
