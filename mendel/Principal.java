package mendel;

/**Programador: Juan Galíndez
 * cl:27.665.373
 * correo:juanegalindezberlioz@gmail.com
 */
public class Principal {
    
    public static void main (String args[]){
        
        Modelo m = new Modelo();
        Vista v = new Vista();
        Controlador c = new Controlador(m,v);
        
        c.Iniciar();
        
    
    }
    

    
}
