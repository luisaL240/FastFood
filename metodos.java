import java.util.Scanner;

public class metodos {
    public objFastFood[][] Ingresarpedidos(int n, Scanner sc) {

        objFastFood[][] m = new objFastFood[n][n];
        metodos M = new metodos();
        int Tipo = 0, opt = 0;
        int Tamano = 0;
        int Cantidad = 0;
        Double PrecioUnidad = 0.0;
        Double TotalPagar = 0.0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("Quiere implementar constuctor vacio 1, lleno 2");
                opt = sc.nextInt();
                System.out.println("Bienvenido al expendido de comidas rapidas");
                System.out.println("Selecciona el tipo de comida");
                System.out.println("1) perro");
                System.out.println("2) perra");
                System.out.println("3) Salchipapa");
                System.out.println("4) hamburguesa");
                Tipo = M.ValidarEntero(sc);

                System.out.println("Ingrese tamaño");
                System.out.println("1) Pequeño");
                System.out.println("2) Mediano");
                System.out.println("3) Grande");
                Tamano = M.ValidarEntero(sc);
                System.out.println("Ingrese la cantidad");
                Cantidad = sc.nextInt();
                System.out.println("Ingrese el precio");
                PrecioUnidad = sc.nextDouble();
                TotalPagar = Cantidad * PrecioUnidad;
                objFastFood o = new objFastFood(Tipo, Tamano, Cantidad, PrecioUnidad, TotalPagar);
                m[i][j] = o;
            }
        }
        return m;
    }

    public int ValidarEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Por favor ingrese un número valido");
        }
        return sc.nextInt();
    }

    public Double ValidarDecimal(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.println("Por favor ingrese un número valido");
        }
        return sc.nextDouble();
    }

    public objFastFood Buscarpedido (objFastFood[][]m, int numeroPedido){
        objFastFood pedido = new objFastFood();
        for (int i=0; i<m.length; i++){
            for (int j=0; j<m.length; j++){
            if (m[i][j].getNumeroPedido()== numeroPedido){
                pedido = m[i][j];
            }
        }
        }
        return pedido;
    }

    public void Mostrar(objFastFood[])

}
