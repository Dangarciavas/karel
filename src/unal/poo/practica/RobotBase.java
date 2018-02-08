package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class RobotBase
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("gotham.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,0, 2, Direction.WEST,10);
            //Girar  180 grados
            rotacion(180);
            movimiento(1);
            for(int i = 0; i<3;i++){
            rotacion(270);
            movimiento(3);            
            }
            rotacion(270);
            movimiento(2);
            rotacion(180);
            
            
            
	}
        
        public static void movimiento(int cantidad){
            for(int i = 0;i < cantidad; i++)
                   estudiante.move();
        }
        public static void rotacion (int grados){
        int gradtemp = grados/90;
        for(int i = 0; i<gradtemp;i++)
            estudiante.turnLeft();
        }
}

