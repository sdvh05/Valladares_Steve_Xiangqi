/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Piezas;

/**
 *
 * @author Hp
 */
public class Rey extends Piezas {
    
     public Rey(int xPos, int yPos, boolean isRed) {
        super(xPos, yPos, isRed);
    }
     
     public boolean mover(int xPos, int yPos,int X, int Y){
         
         if (isRed) { //ReyROjo
             if (X >= 4 && X <= 6 && Y >= 1 && Y <= 3) { //Dentro del Palacio Rojo
                 
                if (X==xPos && Y == (yPos + 1) ) { //vertical
                    return true;
                } else if (Y == yPos && (X == (xPos + 1) || X == (xPos - 1))) { //horizontal
                    return true;
                }
             }
                
         }else{ //ReyNegro
             
             if (X >= 4 && X <= 6 && Y >= 8  && Y <= 10) { //Dentro del Palacio Negro
                 
                if (X == xPos && (Y == (yPos + 1) || Y == (yPos - 1)) ) { //vertical
                    return true;
                } else if (Y == yPos && (X == (xPos + 1) || X == (xPos - 1))) { //horizontal
                    return true;
                }
             }
             
         }
         return false;
     }
}
