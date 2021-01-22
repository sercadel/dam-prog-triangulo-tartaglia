
/**
 * Una clase que modela un triángulo de tartaglia
 * 
 * @author sercadel
 * @version 0.1
 */
public class Tartaglia
{
    private int filas;
    private NumeroCombinatorio nc;
    
    /**
     * Constructor para objetos de clase Tartaglia
     * 
     * @param  filas   número de filas del triángulo
     */
    public Tartaglia(int filas)
    {
        this.filas = filas;
        
        nc = new NumeroCombinatorio();
    }
    
    /**
     * Constructor para objetos de clase Tartaglia
     */
    public Tartaglia()
    {
        filas = 0;
        
        nc = new NumeroCombinatorio();
    }
    
    /**
     * Función que dibuja el triángulo en pantalla
     * 
     */
    public void dibujarTriangulo()
    {
        for (int x = 0; x < filas; x++) {
            nc.setN(x);

            escrbirTerminoVacio(filas - x);
                
            for (int y = 0; y <= x; y++) {
                nc.setM(y);
                System.out.print(nc.obtenerCombinatorio() + " ");
            }

            System.out.println("");
        }
    }
    
    /**
     * Función que dibuja el número de espacios pasados por parámetro
     * 
     * @param  cuantos   número de espacios a aplicar
     */
    private void escrbirTerminoVacio(int cuantos)
    {
        for (int i = 0; i < cuantos; i++) {
            System.out.print(" ");
        }
    }
    
    /**
     * Función que devuelve el número de filas del triángulo
     * 
     * @return     el númerode filas del triángulo
     */
    public int getFilas()
    {
        return filas;
    }
    
    /**
     * Función que establece el número de filas del triángulo
     * 
     * @param  filas   número de filas del triángulo
     */
    public void setFilas(int filas)
    {
        this.filas = filas;
    }
}
