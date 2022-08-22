public class Cuenta {

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    private String titular;
    private double cantidad;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar ( double cantidad)
    {
        if (cantidad >= 0){
        this.cantidad = this.cantidad + cantidad;

            System.out.println("Su cuenta tiene con la cantidad ingresada " + this.cantidad );
    }
    else
        {System.out.println("La cantidad introducida es negativa, Su cuenta tiene con la cantidad ingresada " + this.cantidad);}


    }


    public void retirar ( double cantidad)
    {  double total = this.cantidad - cantidad;
     if (total>=0) {
          this.cantidad = this.cantidad - cantidad;
         System.out.println("Su cuenta tiene con la cantidad retirada " + this.cantidad );

     } else {
         this.cantidad = 0;
         System.out.println("La cantidad actual es negativa con la cantidad retirada y pasa a ser 0, Su cuenta tiene con la cantidad retirada " + this.cantidad);

     }


    }
}
