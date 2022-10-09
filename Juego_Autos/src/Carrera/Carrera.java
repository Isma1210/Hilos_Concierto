
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
        while(true){
            aforo+=20;
            try{
                
                sleep((int)(Math.random() * 1000));
                grupo1 = auto.getPrimerAuto().getLocation().x;
                grupo2 = auto.getSegundoAuto().getLocation().x;
                
                if(grupo1 < auto.getBArrera1().getLocation().x - 125 && grupo2 < auto.getBArrera2().getLocation().x - 125){
                    etiqueta.setLocation(etiqueta.getLocation().x+50, etiqueta.getLocation().y-10);
                    auto.repaint();
                } else {
                    
                    break;
                    
                }
                
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
