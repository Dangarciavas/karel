/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;
import becker.robots.*;

public class caracol
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("caracol.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,1, 0, Direction.EAST,10);
            
            movimiento(6);
            right();
            movimiento(5);
            right();
            movimiento(5);
            right();
            movimiento(4);
            right();
            movimiento(4);
            right();
            movimiento(3);
            right();
            movimiento(3);
            right();
            
            
            
            
            
            
	}
        
        public static void pickup(){
        boolean bolas = estudiante.canPickThing();
        if(bolas){
            estudiante.pickThing();
            }
        }
        public static void movimiento(int cantidad){
            for(int i = 0;i < cantidad; i++)
                   estudiante.move();
                   pickup();
        }
        public static void left (){
              estudiante.turnLeft();
        }
        public static void right (){
            for(int i = 0; i<3; i++)  
            estudiante.turnLeft();
        }
        public static void camorientacion (){
            for(int i = 0; i<2; i++)  
            estudiante.turnLeft();
        }
        
        
}

