public class Main {
    public static void main(String[] args) {



        System.out.println("Hello world!");
        Cuenta cuenta1;

        cuenta1 = new Cuenta("Carlos",100);
         cuenta1.ingresar(100);
         cuenta1.ingresar(-4);
        cuenta1.ingresar(200);
        cuenta1.retirar(50);
        cuenta1.retirar(50);
        cuenta1.retirar(250);
        cuenta1.retirar(51);

    }
}