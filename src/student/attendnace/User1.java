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
class User1 {
    private String Roll,Name;
    private String per; String Nc;
    public User1(String Roll,String Name,String per ){
    this.Roll=Roll;
    this.Name=Name;
    this.per=per;
    
    }
     public User1(String Roll,String Name,String per,String Nc ){
    this.Roll=Roll;
    this.Name=Name;
    this.per=per;
    this.Nc=Nc;
    }
    public String getRoll(){
    return Roll;
    
    }
    public String getName(){
    return Name;
    
    }public String getPer(){
    return per;
    
    }
    public String getNoclass(){
    return Nc;
    
    }
}
