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
 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class STUDENTATTENDNACE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
SPLASHSC sp=new SPLASHSC();
     sp.setVisible(true);
     try{for(int i=0;i<=100;i++)
     {Thread.sleep(30);
     sp.jLabel1.setText(Integer.toString(i)+"%");
     sp.jProgressBar2.setValue(i);
     
     }
     Login obj=new Login();
obj.setVisible(true);
     sp.dispose();
     
     
     }
     catch(Exception e){
     
     
     
     
     }
    
    
    }
       
}
    
    

