
/**
 * Una clase que modela número combinatorio
 * 
 * @author sercadel
 * @version 0.1
 */
public class NumeroCombinatorio
{
    private int n;
    private int m;
    
    /**
     * Constructor para objetos de clase NumeroCombinatorio
     */
    public NumeroCombinatorio()
    {
        n = 0;
        m = 0;
    }
    
    /**
     * Calcula el factorial de un número pasado por parámetro
     * 
     * @param   numero  número para calcular su factorial
     * @return          el factorial de un número
     */
    private int factorial(int numero)
    {
        if (numero == 0) {
            return 1;
            
        } else {
            
            int auxiliar = 1;
            
            for (int x = 1; x <= numero; x++) {
                auxiliar = auxiliar * x;
            }
            
            return auxiliar;
        }
    }
    
    /**
     * Calcula y devuelve el valor del número combinatorio representado por n y m
     * 
     * @return     valor del número combinatorio 
     */
    public int obtenerCombinatorio()
    {
        return factorial(n) / (factorial(m) * factorial(n - m));
    }
    
    /**
     * Establece el valor para la variable n
     * 
     * @param  n   valor de la variable n
     */
    public void setN(int n)
    {
        this.n = n;
    }
    
    /**
     * Establece el valor para la variable m
     * 
     * @param  m   valor de la variable m
     */
    public void setM(int m)
    {
        this.m = m;
    }
    
    /**
     * Devuelve el valor asignado a la variable n
     * 
     * @return     el valor de n
     */
    public int getN()
    {
        return n;
    }
    
    /**
     * Devuelve el valor asignado a la variable m
     * 
     * @return     el valor de m
     */
    public int getM()
    {
        return m;
    }
    
    
}
