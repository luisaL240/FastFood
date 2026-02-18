import java.util.Scanner;

public class metodos{
    public objFastFood[][] Ingresarpedidos(int n, Scanner sc){

    
        objFastFood[][] m = new objFastFood[n][n];
            metodos M = new metodos();
            int Tipo = 0, opt=0;
            int Tamano = 0;
            int Cantidad = 0;
            Double PrecioUnidad = 0.0;
            Double TotalPagar = 0.0;
            
 
        for (int i=0; i<m.length; i++){
            for (int j=0; j<m.length; j++){
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
            objFastFood o = new objFastFood (Tipo, Tamano, Cantidad, PrecioUnidad, TotalPagar);
            m[i][j]=o; 
        }
        }
        return m;
    }
    public int ValidarEntero(Scanner sc){
        while (!sc.hasNextInt()) {
            System.out.println("Por favor ingrese un número valido");
        }
        return sc.nextInt();
    }

}
