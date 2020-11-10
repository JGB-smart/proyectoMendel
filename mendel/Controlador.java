/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mendel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**Programador: Juan Galíndez
 * cl:27.665.373
 * correo:juanegalindezberlioz@gmail.com
 */
public class Controlador implements ActionListener  {
    
    private Modelo m;
    private Vista v;
    
    public Controlador(Modelo m, Vista v){
        
        this.m = m;
        this.v = v;
        
        this.v.jButton_Salir.addActionListener(this);
        this.v.jButton_Ayuda.addActionListener(this);
        this.v.jButton_ley1.addActionListener(this);
        this.v.jButton_ley2.addActionListener(this);
        this.v.jButton_ley3.addActionListener(this);

    }
    
    public void Iniciar(){      
      
        v.setTitle("APG");
        v.setLocationRelativeTo(null);
        v.setVisible(true);
        v.setResizable(false);
    }
   

  
    @Override
   public void actionPerformed(ActionEvent e){
       
       if(v.jButton_Salir == e.getSource()){
           System.exit(0);
       }
       
       if(v.jButton_Ayuda == e.getSource()){
           Ayuda();
       }
       
       if(v.jButton_ley1 == e.getSource()){
           Uniformidad();
       } 
       
       if(v.jButton_ley2 == e.getSource()){
           Segregacion();
       }
       
       if(v.jButton_ley3 == e.getSource()){
           Transmision();
       }

}
    
    public void Ayuda(){
        
       JOptionPane.showMessageDialog(null, "Bienvenido a tú Asistente de Prediccion Genética! \n"
               + "Para que sirve APG?: Podrás realizar predicciones y cálculos Bajo las 3 leyes de Mendel \n"
               + "Como se utiliza?: Simplemente ingresa el individio y las características a Estudiar");
    }
    
    public void Uniformidad(){
        
    
      
      m.Raza = JOptionPane.showInputDialog("Ingrese raza del individuo a estudiar");
      
      if(m.Raza != null){
      
              m.GD = JOptionPane.showInputDialog("Ingrese una caracteristica Fenotipica del gen Dominante");      
      }
      
      if(m.GD != null){
      
            m.gr = JOptionPane.showInputDialog("Ingrese una caracteristica Fenotipica del gen Recesivo ");
      }
      
      if(m.GD == null || m.gr == null || m.Raza == null){
          JOptionPane.showMessageDialog(null,"Operación cancelada!");
      } else {
          
             m.PD = (4 / 4) * 100;
             m.Pr = (0 / 4) * 100;
      
            JOptionPane.showMessageDialog(null,"Posibilidad de nacimiento de " + m.Raza + " con " + m.GD + " = " + m.PD + "%");
            JOptionPane.showMessageDialog(null,"Posibilidad de nacimiento de " + m.Raza + " con " + m.gr + " = " + m.Pr + "%");
            JOptionPane.showMessageDialog(null,"Numero de combinaciones de alelos: 4 \n"
                                       + "Repetición de la combinación Aa: 4");
      
            
            m.GD = null;
            m.gr = null;
            m.Raza = null;
      }

    }
    
    public void Segregacion(){
        
        JOptionPane.showMessageDialog(null,"Estimado Usuario,la opción que se leccionó todavía esta en desarrollo... \n"
                + "La versión que usted esta utilizando es una version alfa del programa \n"
                + "Varios elementos como interfaz y Lógica de procesamiento podrán cambiar en la versión final");
        
    }
    
    
    public void Transmision(){
        
         JOptionPane.showMessageDialog(null,"Estimado Usuario,la opción que se leccionó todavía esta en desarrollo... \n"
                + "La versión que usted esta utilizando es una version alfa del programa \n"
                + "Varios elementos como interfaz y Lógica de procesamiento podrán cambiar en la versión final");
    } 
}
