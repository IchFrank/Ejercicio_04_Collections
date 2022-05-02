/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_04_g3_javacollections;

import Entidades.Pelicula;
import java.util.Scanner;

/**
 *
 * @author 54935
 */
public class Ejercicio_04_G3_JavaCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
        //Crear una clase llamada "Pelicula".✓
        //Crear atributos de: Titulo, director, duracion(en hs).✓
        //Agregar las clases y metodos que sean necesarios para esta situacion teniendo en cuenta lo siguiente: 
        //1) En el main, deberemos crear un bucle que cree un objeto "Pelicula", pidiendole al usuario todos los datos y guardarlos en el obj. Pelicula.✓
        //2) Despues , esa pelicula se ira a guardar a una lista de peliculas, pidiendole al usuario si quiere crear otra pelicula o no.✓
        //Paso siguiente realizar las siguientes acciones: 
        //1A) Mostrar en pantalla todas las peliculas.✓
        //2A) Mostrar en pantalla todas las peliculas con una duracion mayor a 1hs.✓
        //3A) Ordenar las peliculas de acuerdo a su duracion (de mayor a menor) mostrandolo por pantalla.✓
        //4A) Ordenar las peliculas por titulo (Alfabeticamente) y mostrarlo por pantalla.
        //5A) Ordenar las peliculas por director (Alfabeticamente) y mostrarlo por pantalla.
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //Objeto global: 
        Pelicula pelis = new Pelicula();
        //Logica.
        
        //Metodos: 
        //Crear peliculas: 
        String respuesta = "s";
        do {
            System.out.println("Creacion de pelicula.");
            pelis.crearPelicula();

            System.out.println("Desea añadir otra pelicula: ? s/n. ");
            respuesta = leer.next();

        } while (respuesta.equals("s"));
        
        System.out.println("Lista de peliculas: ");
        //Mostrar peliculas: 
        pelis.mostrarPelis();
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Lista de peliculas (+1hs de duracion):  ");
        //Mostrar pelis mas de 1hra:
        pelis.pelisMas();
         System.out.println("--------------------------------------------------------------------------");
        //Mostrar pelis en orden alfabetico: 
        System.out.println("Lista de peliculas (por orden alfabetico): ");
        pelis.pelisOrd1();
         System.out.println("--------------------------------------------------------------------------");
         System.out.println("Lista de peliculas (Por orden de duracion): ");
         //Mostrar pelis en orden de duracion:
         pelis.pelisOrd2();
         //Fin ejercicio :)

    }

}
