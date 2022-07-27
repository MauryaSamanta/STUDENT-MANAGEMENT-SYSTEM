/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.attendnace;

/**
 *
 * @author DOLA GANGULY
 */
public class user2 {
      private String Date,Status;
    
    public user2(String Date,String Status ){
    this.Date=Date;
    this.Status=Status;
    
    
    }
     
    public String getDate(){
    return Date;
    
    }
    public String getStatus(){
        if(Integer.parseInt(Status)==1)
            return "Present";
        else if(Integer.parseInt(Status)==0)
            return "Absent";
        else
            return "Not Registered";
    //return Status;
    }
    
    
}
