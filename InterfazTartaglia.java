
/**
 * Una clase que modela la interfaz del triángulo de tartaglia
 * 
 * @author sercadel
 * @version 0.1
 */

import java.util.Scanner;

public class InterfazTartaglia
{
    final char SI = 's';
    private Scanner teclado;
    private Tartaglia triangulo;

    /**
     * Constructor para objetos de clase InterfazTartaglia
     */
    public InterfazTartaglia()
    {
        triangulo = new Tartaglia();
        teclado = new Scanner(System.in);
    }

    /**
     * Bucle inicial que ejecuta la lógica de la aplicación
     * 
     */
    public void ejecutar()
    {
        do {
            borrarPantalla();
            System.out.println(".:: Triángulo de Tartaglia ::.");
            System.out.println(" ");
            System.out.println("Escribe el número de filas:");

            triangulo.setFilas(leerFilas());
            System.out.println(" ");
            triangulo.dibujarTriangulo();
            
            System.out.println(" ");
            System.out.println("¿Quieres ver otro triángulo?");
            System.out.println("  s = Sí            n = No");
            System.out.println(" ");
        } while (continuar() == SI);
    }
    
    /**
     * Función que lee el número introducido por el usuario por teclado
     * 
     * @return     el número introducido por el usuario
     */
    private int leerFilas()
    {
        return teclado.nextInt();
    }
    
    /**
     * Función que lee una entrada del usuario por teclado
     * 
     * @return     el primer caracter de la entrada del usuario por teclado
     */
    private char continuar()
    {
        return teclado.next().charAt(0);
    }
    
    /**
     * Función que borra la salida de la consola
     * 
     */
    private void borrarPantalla()
    {
        System.out.print('\u000C');
    }
}
