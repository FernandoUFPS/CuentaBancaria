public class Main {
    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta(100000, "Luis Remolina");
        cuenta.getDatosCuenta();
        cuenta.setIngreso(5000000.0);
        cuenta.setIngreso(2.0);
        cuenta.getDatosCuenta();
        cuenta.setRetiro(999999.0);
        cuenta.getDatosCuenta();


    }
    }

// System.out.println("Numero de cuenta: "+cuenta.getNumeroDeCuenta()+" \nsaldo cuenta: " + cuenta.getSaldoDeCuenta() +
   //      "\ntitular de la cuenta: "+cuenta.getNombreDelTitular());
      //   cuenta.setIngreso(5000.0);
      //   System.out.println("Numero de cuenta: "+cuenta.getNumeroDeCuenta()+" \nsaldo cuenta: " + cuenta.getSaldoDeCuenta() +
     //    "\ntitular de la cuenta: "+cuenta.getNombreDelTitular());
    //     cuenta.setRetiro(80000.0);
      //   System.out.println("Numero de cuenta: "+cuenta.getNumeroDeCuenta()+" \nsaldo cuenta: " + cuenta.getSaldoDeCuenta() +
        // "\ntitular de la cuenta: "+cuenta.getNombreDelTitular());