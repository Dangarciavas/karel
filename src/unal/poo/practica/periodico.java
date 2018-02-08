/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;
import becker.robots.*;

public class periodico
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("house.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,1, 2, Direction.SOUTH,10);
            //Girar  180 grados
            right();
            movimiento(1);
            left();
            movimiento(1);
            left();
            movimiento(1);
            estudiante.pickThing();
            camorientacion();
            movimiento(1);
            right();
            movimiento(1);
            right();
            movimiento(1);
            right();
            
            
            
	}
        
        public static void movimiento(int cantidad){
            for(int i = 0;i < cantidad; i++)
                   estudiante.move();
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

