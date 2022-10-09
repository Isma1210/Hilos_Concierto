
package Carrera;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Carrera extends Thread{
    
    private JLabel etiqueta;
    private frmCarrera auto;

    public Carrera(JLabel etiqueta, frmCarrera auto) {
        this.etiqueta = etiqueta;
        this.auto = auto;
    }
    
    @Override
    public void run(){
     int grupo1 = 0;
     int grupo2 = 0;
     int aforo=0;
        while(aforo<1000){
            aforo+=100;
            try{
                
                sleep((int)(Math.random() * 1000));
                grupo1 = auto.getPrimerAuto().getLocation().x;
                grupo2 = auto.getSegundoAuto().getLocation().x;
                
                    etiqueta.setLocation(etiqueta.getLocation().x+50, etiqueta.getLocation().y);
                    auto.repaint();
                    System.out.println(grupo1);
                    
      
                    
                
            }catch(InterruptedException e){
                System.out.println(e);
            }
            
            /*if(etiqueta.getLocation().x >= auto.getBArrera1().getLocation().x - 125){
            
                if(grupo1 > grupo2){
                    JOptionPane.showMessageDialog(null,"Gano el primero auto");
                }
                else if(grupo2 > grupo1){
                    JOptionPane.showMessageDialog(null,"Gano el segundo auto");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Empate");
                }
            }*/
            
        }
        
    }
    
}
