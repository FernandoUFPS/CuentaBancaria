public class Cuenta {

    private double saldoDeCuenta;
    private String nombreDelTitular;

    private long numeroDeCuenta;


    public Cuenta(double saldoDeCuenta, String nombreDelTitular) {
        this.saldoDeCuenta = saldoDeCuenta;
        this.nombreDelTitular = nombreDelTitular;
        asignarNumeroCuenta();


    }

    public double getSaldoDeCuenta() {
        return saldoDeCuenta;
    }

    public void setSaldoDeCuenta(double saldoDeCuenta) {
        this.saldoDeCuenta = saldoDeCuenta;
    }

    public String getNombreDelTitular() {
        return nombreDelTitular;
    }

    public void setNombreDelTitular(String nombreDelTitular) {
        this.nombreDelTitular = nombreDelTitular;
    }

    public long getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(long numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public long setCuenta(long numeroDeCuenta) {
        return numeroDeCuenta;

    }

    public double setIngreso (double ingreso){
        saldoDeCuenta = saldoDeCuenta + ingreso;
        return getSaldoDeCuenta();
    }

    public double setRetiro (double retiro){
        saldoDeCuenta = saldoDeCuenta - retiro;
        return getSaldoDeCuenta();
    }

    private void asignarNumeroCuenta(){
        this.numeroDeCuenta = (long)(Math.random()*1000000000+1);
    }

    public void getDatosCuenta() {
        System.out.println("Numero de cuenta: "+getNumeroDeCuenta()+" \nsaldo cuenta: " + getSaldoDeCuenta() +
                "\ntitular de la cuenta: "+getNombreDelTitular());



    }}

