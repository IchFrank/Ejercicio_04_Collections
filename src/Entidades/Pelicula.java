package Entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Pelicula {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //Atributos.
    private String titulo;
    private String director;
    private Integer duracion;
    //Atributos(Arraylist): 
    private ArrayList<Integer> duracionPeli = new ArrayList();
    private ArrayList<String> nombrePeli = new ArrayList();
    private ArrayList<String> directorPeli = new ArrayList();

    //Constructores.
    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Integer duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }
    //Getters/setters.

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    //Metodos.
    //Met. crearPelicula().
    public void crearPelicula() {

        System.out.println("Pelicula: ");
        titulo = leer.next();
        System.out.println("Director: ");
        director = leer.next();
        System.out.println("Duracion(hs.): ");
        duracion = leer.nextInt();
        //ArrayList.
        nombrePeli.add(titulo);
        directorPeli.add(director);
        duracionPeli.add(duracion);
    }

    //Met. mostrarPelis().
    public void mostrarPelis() {
        int numPeli = 1;
        for (int i = 0; i < nombrePeli.size(); i++) {
            System.out.println("Pelicula # " + " [" + numPeli + "]");
            numPeli = numPeli + 1;
            System.out.println("Titulo: " + nombrePeli.get(i) + " Direcccion: " + directorPeli.get(i) + " Duracion: " + duracionPeli.get(i) + " hs.");

        }
    }

    //Met. pelisMas().
    public void pelisMas() {
        for (int i = 0; i < nombrePeli.size(); i++) {
            if (duracionPeli.get(i) > 1) {
                System.out.println("Titulo: " + nombrePeli.get(i) + " Direcccion: " + directorPeli.get(i) + " Duracion: " + duracionPeli.get(i) + " hs.");

            }
        }
    }

    //Met. pelisOrd1().
    public void pelisOrd1() {

        //Array madre:
        ArrayList<String> Global = new ArrayList();
        for (int i = 0; i < nombrePeli.size(); i++) {
            Global.add("Titulo: " + nombrePeli.get(i) + " Direcccion: " + directorPeli.get(i) + " Duracion: " + duracionPeli.get(i) + " hs.");
        }
        Collections.sort(Global);
        for (int i = 0; i < nombrePeli.size(); i++) {
            System.out.println(Global.get(i));
        }

    }

    //Met. pelis.Ord2().
    public void pelisOrd2() {
        Collections.sort(duracionPeli);
        for (int i = 0; i < nombrePeli.size(); i++) {
            int j = i;
            if (j == i) {
                System.out.println("Titulo: " + nombrePeli.get(j) + " Direcccion: " + directorPeli.get(j) + " Duracion: " + duracionPeli.get(i) + " hs.");
            }

        }

    }
}
