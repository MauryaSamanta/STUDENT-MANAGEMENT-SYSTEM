/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.attendnace;

/**
 *
 * @author MASTER
 */
public class splash {
    public static void sho()
    {SPLASHSC sp=new SPLASHSC();
     sp.setVisible(true);
     try{for(int i=0;i<=100;i++)
     {Thread.sleep(30);
     sp.jLabel1.setText(Integer.toString(i)+"%");
     sp.jProgressBar2.setValue(i);
     
     }
     HOME ob=new HOME();
     ob.setVisible(true);
     sp.dispose();
     
     
     }
     catch(Exception e){
     
     
     
     
     }
    
    
    }
}
