
package ejercicio1;

import java.util.Scanner;


public class Libro {
    // Atributos
    int ISBN;
    String Titulo;
    String Autor;
    int numPaginas;

    // CONSTRUCTOR
    public Libro(int ISBN, String Titulo, String Autor, int numPaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.numPaginas = numPaginas;
    }
    // CONSTRUCTOR VACIO
    public Libro() {
    }

    // GETTERS
    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }
    
    // SETTERS
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    
    public void cargarLibro() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("DATOS DEL LIBRO");
        
        System.out.print("ISBN: ");
        setISBN(entrada.nextInt());
        
        entrada.nextLine();
        
        System.out.print("Titulo: ");
        setTitulo(entrada.nextLine());
        
        System.out.print("Autor: ");
        setAutor(entrada.nextLine());
        
        System.out.print("Numero de Paginas: ");
        setNumPaginas(entrada.nextInt());
    }
    
    public void mostrarLibro(){
        System.out.println("Los datos del libros son: ");
        System.out.println("ISBN:" + getISBN());
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Numero de Paginas: " + getNumPaginas());
    }
    
}
