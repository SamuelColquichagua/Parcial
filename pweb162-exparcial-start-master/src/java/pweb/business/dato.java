/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pweb.business;

import java.io.Serializable;

public class dato implements Serializable {
    private String id;
    private String Num;
    private String Exp;
    private String Seg;
  
    public dato (){
    this.id = "";
    this.Num = "";
    this.Exp ="";
    this.Seg = "";  
   
    }
    
     public dato(String id, String Num, String Exp, String Seg) {
        this.id = id;
        this.Num = Num;
        this.Exp = Exp;
        this.Seg = Seg;
       
    }
     public String getid (){
        return id;
     }
     
     public void setid(String id){
         this.id = id;
     }
    public String getNum (){
        return Num;
     }
     
     public void setNum(String Num){
         this.Num = Num;
     }
     public String getExp (){
        return Exp;
     }
     
     public void setExp(String Exp){
         this.Exp = Exp;
     }
     public String getSeg (){
        return Seg;
     }
     
     public void setSeg(String Seg){
         this.Seg = Seg;
     }
}
