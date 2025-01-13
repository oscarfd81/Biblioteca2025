/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biblioteca2025;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alu05d
 */
public class Biblioteca2025 {
 
    private ArrayList <Libro> libros;
    private ArrayList <Usuario> usuarios;
    private ArrayList <Prestamo> prestamos;

    public Biblioteca2025() {
        this.libros = new ArrayList();
        this.usuarios = new ArrayList();
        this.prestamos = new ArrayList();
    }
    
    public static void main(String[] args) {
       Biblioteca2025 b= new Biblioteca2025();
       b.cargaDatos(); 
       b.menu();
    }
    
    //<editor-fold defaultstate="collapsed" desc="MENUS">
    public void menu(){
        Scanner sc=new Scanner (System.in);
        int opcion=0;
        do{
            System.out.println("\n\n\n\n\n\t\t\t\tBIBLIOTECA\n");
            System.out.println("\t\t\t\t1 - LIBROS");
            System.out.println("\t\t\t\t2 - USUARIOS");
            System.out.println("\t\t\t\t3 - PRESTAMOS");
            System.out.println("\t\t\t\t9 - SALIR");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:{
                    menuLibros();
                    break;
                }    
                case 2:{
                    menuUsuarios();
                    break;
                } 
                case 3:{
                    menuPrestamos();
                    break;
                } 
            }
        }while (opcion != 9);
    }

    private void menuLibros() {
        Scanner sc=new Scanner (System.in);
        int opcion=0;
        do{
            System.out.println("\n\n\n\n\n\t\t\t\tLIBROS\n");
            System.out.println("\t\t\t\t1 - NUEVO LIBRO");
            System.out.println("\t\t\t\t2 - ELIMINAR LIBRO");
            System.out.println("\t\t\t\t3 - MODIFICAR LIBRO");
            System.out.println("\t\t\t\t4 - LISTADOS");
            System.out.println("\t\t\t\t9 - SALIR");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:{
                    nuevoLibro();
                    break;
                }    
                case 2:{
                    eliminarLibro();
                    break;
                } 
                case 3:{
                    modificarLibros();
                    break;
                } 
                case 4:{
                    listaLibros();
                    break;
                } 
            }
        }while (opcion != 9);
    }

    private void menuUsuarios() {
        Scanner sc=new Scanner (System.in);
        int opcion=0;
        do{
            System.out.println("\n\n\n\n\n\t\t\t\tUSUARIOS");
            System.out.println("\t\t\t\t1 - NUEVO USUARIO");
            System.out.println("\t\t\t\t2 - ELIMINAR USUARIO");
            System.out.println("\t\t\t\t3 - MODIFICAR USUARIO");
            System.out.println("\t\t\t\t4 - LISTADOS");
            System.out.println("\t\t\t\t9 - SALIR");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:{
                    nuevoUsuario();
                    break;
                }    
                case 2:{
                    eliminarUsuario();
                    break;
                } 
                case 3:{
                    modificarUsuario();
                    break;
                } 
                case 4:{
                    listaUsuarios();
                    break;
                } 
               
            }
        }while (opcion != 9);
    }

    private void menuPrestamos() {
        Scanner sc=new Scanner (System.in);
        int opcion=0;
        do{
            System.out.println("\n\n\n\n\n\t\t\t\tPRESTAMOS\n");
            System.out.println("\t\t\t\t1 - NUEVO PRESTAMO");
            System.out.println("\t\t\t\t2 - ELIMINAR PRESTAMO");
            System.out.println("\t\t\t\t3 - MODIFICAR PRESTAMO");
            System.out.println("\t\t\t\t4 - LISTADOS");
            System.out.println("\t\t\t\t5 - ELIMINAR PRESTAMO");
            System.out.println("\t\t\t\t6 - PRORROGA PRESTAMO");
            System.out.println("\t\t\t\t7 - DEVOLUCION PRESTAMO");
            System.out.println("\t\t\t\t9 - SALIR");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:{
                    nuevoPrestamo();
                    break;
                }    
                case 2:{
                    eliminarPrestamo();
                    break;
                } 
                case 3:{
                    modificarPrestamo();
                    break;
                } 
                case 4:{
                    listaPrestamos();
                    break;
                } 
                case 5:{
                    eliminarPrestamo();
                    break;
                }
                case 6:{
                    prorrogaPrestamo();
                    break;
                }
                case 7:{
                    devolucionPrestamo();
                    break;
                }
            }
        }while (opcion != 9);
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="GESTION LIBROS">
    private void nuevoLibro() {
        Scanner sc=new Scanner(System.in);           
        System.out.println("Nuevo libro:");
        System.out.println("ISBN: ");
        String isbn= sc.nextLine();
        System.out.println("Título: ");
        String titulo=sc.nextLine();
        System.out.println("Autor: ");
        String autor=sc.nextLine();
        System.out.println("Género:");
        String genero=sc.nextLine();
        System.out.println("Ejemplares");
        int ejemplares=sc.nextInt();
        
           System.out.println(new Libro(isbn,titulo,autor,genero,ejemplares));
       libros.add(new Libro(isbn,titulo,autor,genero,ejemplares));
    }

    private void eliminarLibro() {
         Scanner sc=new Scanner(System.in);  
        System.out.println("ISBN del libro a eliminar");
        String isbn= sc.nextLine();
        
        int pos= buscaIsbn(isbn);
        if(pos==-1){
            System.out.println("El libro que buscas no esta registrado");
        }else{
            System.out.println("Esta seguro de que desea borrar el libro?");
            System.out.println("TECLEE SI/NO");
            String confirmacion = sc.nextLine();
            if (confirmacion.equalsIgnoreCase("si")){
                System.out.println("El libro ha sido eliminado");
                libros.remove(pos);
            }else{
                System.out.println("Operacion cancelada con exito");
            }
            
        }
    }

    private void modificarLibros() {
    }

    private void listaLibros() {
        for (Libro l : libros) {
            System.out.println(l);
        }
    }
    
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="GESTION USUARIOS">
    private void nuevoUsuario() {
        Scanner sc=new Scanner(System.in);           
        System.out.println("Nuevo usuario:");
        System.out.println("DNI: ");
        String DNI= sc.nextLine();
        System.out.println("Nombre: ");
        String nombre=sc.nextLine();
        System.out.println("Email: ");
        String email=sc.nextLine();
        System.out.println("Telefono:");
        String telefono=sc.nextLine();
        
           System.out.println(new Usuario(DNI,nombre,email,telefono));
       usuarios.add(new Usuario(DNI,nombre,email,telefono));
    }

    private void eliminarUsuario() {
         Scanner sc=new Scanner(System.in);  
        System.out.println("DNI del usuario a eliminar");
        String dni= sc.nextLine();
        
        int pos= buscaDni(dni);
        if(pos==-1){
            System.out.println("El usuario que buscas no esta en la agenda");
        }else{
            System.out.println("Esta seguro de que desea borrar el contacto?");
            System.out.println("TECLEE SI/NO");
            String confirmacion = sc.nextLine();
            if (confirmacion.equalsIgnoreCase("si")){
                System.out.println("El contacto ha sido eliminado");
                usuarios.remove(pos);
            }else{
                System.out.println("Operacion cancelada con exito");
            }
            
        }
    }

    private void modificarUsuario() {
    }

    private void listaUsuarios() {
        for (Usuario u : usuarios) {
            System.out.println(u);
        }
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="GESTION PRESTAMOS">
    private void nuevoPrestamo() {
        System.out.println("Identificación del usuario:");
        int posUsuario = buscaDni(solicitaDni());
        if (posUsuario==-1){
            System.out.println("No es aún usuario de la biblioteca");
        }else{
            System.out.println("Identificación del libro:"); 
            int posLibro=buscaIsbn(solicitaIsbn());
            if (posLibro==-1){
                System.out.println("El ISBN pertenece a un libro inexistente");
            } else if (libros.get(posLibro).getEjemplares()>0){
                LocalDate hoy=LocalDate.now();
                prestamos.add(new Prestamo(libros.get(posLibro),usuarios.get(posUsuario),hoy,hoy.plusDays(15)));
                libros.get(posLibro).setEjemplares(libros.get(posLibro).getEjemplares()-1);
                }else{
                    System.out.println("No quedan unidades disponibles del libro");
                }
        }
    }
    
    private void prorrogaPrestamo(){
        System.out.println("Datos para la prórroga del préstamo:");
        int pos=buscaPrestamo(solicitaDni(),solicitaIsbn());
            if (pos==-1) {
                System.out.println("No hay ningún préstamo con esos datos");
            }else{
                prestamos.get(pos).setFechaDev(prestamos.get(pos).getFechaDev().plusDays(15));
            }
    }
    
    private void devolucionPrestamo(){
        System.out.println("Datos para la devolución del préstamo:");
        String isbnLibro=solicitaIsbn();
        int pos=buscaPrestamo(solicitaDni(),solicitaIsbn());
            if (pos==-1) {
                System.out.println("No hay ningún préstamo con esos datos");
            }else{
                prestamos.get(pos).setFechaDev(LocalDate.now());
                libros.get(buscaIsbn(isbnLibro)) .setEjemplares(libros.get(buscaIsbn(isbnLibro)).getEjemplares()+1);
                System.out.println("Operación realizada con éxito");
            }
    }
   
    private void eliminarPrestamo() {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Datos para la eliminación del préstamo:");
        int pos=buscaPrestamo(solicitaDni(),solicitaIsbn());
            if (pos==-1) {
                System.out.println("No hay ningún préstamo con esos datos");
            }else{
                  System.out.println("Esta seguro de que desea borrar el contacto?");
                  System.out.println("TECLEE SI/NO");
                  String confirmacion = sc.nextLine();
                  if (confirmacion.equalsIgnoreCase("si")){
                System.out.println("El prestamo ha sido eliminado");
                prestamos.remove(pos);
                System.out.println("Operación realizada con éxito");
                  }
            }
    }
    
    private void modificarPrestamo() {
    }

    private void listaPrestamos() {
        for (Prestamo p : prestamos) {
            System.out.println(p);  
        }
    }
//</editor-fold>
    
 
    
    
    //<editor-fold defaultstate="collapsed" desc="METODOS AUXILIARES">
    /**
     * Método para solicitar por teclado el DNI de un usuario. pdte de validación
     * @return (String) dni del usuario tecleado
     */
    public String solicitaDni(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Teclea el dni del usuario:");
        String dni=sc.next();
        return dni;
    }
    /**
     * Método para solicitar por teclado el ISBN de un libro. pdte de validación
     * @return (String) isbn del libro tecleado
     */
    public String solicitaIsbn(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Teclea el isbn del libro:");
        String isbn=sc.next();
        return isbn;
    }
    
    /**
     * Método para buscar un dni en la colección usuarios
     * @param dni (String) del usuario a buscar en la colección
     * @return posición (int) del usuario en el Arraylist, valor -1 si no se encuentra
     */
    public int buscaDni(String dni){
        int pos=-1;
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getDni().equals(dni)){
                pos=i;
                break;
            }
        }
        return pos;       
    }
    
     /**
     * Método para buscar un libro en la colección libros
     * @param isbn (String) del libro a buscar en la colección
     * @return posición (int) del libro el Arraylist, valor -1 si no se encuentra
     */
    public int buscaIsbn(String isbn){
        int pos=-1;
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getIsbn().equals(isbn)){
                pos=i;
                break;
            }
        }
        return pos;       
    }
     /**
      * Método para buscar un préstamo en la colección de préstamos
      * @param dni(String)del usuario que realizó el préstamo
      * @param isbn (String) del libro prestado 
      * @return posición (int) del préstamo en el Arraylist,
      *         valor -1 si no se encuentra un préstamo con esos datos
      */    
    public int buscaPrestamo (String dni, String isbn){
        int pos=-1;
        for (int i = 0; i < prestamos.size(); i++) {
            if (prestamos.get(i).getUsuarioPrest().getDni().equals(dni) 
                && prestamos.get(i).getLibroPrest().getIsbn().equals(isbn)){
                pos=i;
                break;
            }
        }
        return pos;
    }
        
       public void cargaDatos(){
        libros.add(new Libro("1-11","El Hobbit","JRR Tolkien","Aventuras",3)); 
        libros.add(new Libro("1-22","El Silmarillon","JRR Tolkien","Aventuras",3)); 
        libros.add(new Libro("1-33","El Médico","N. Gordon","Aventuras",4)); 
        libros.add(new Libro("1-44","Chamán","N. Gordon","Aventuras",3)); 
        libros.add(new Libro("1-55","Momo","M. Ende","Aventuras",2)); 
        libros.add(new Libro("1-66","Paraíso inhabitado","A.M.Matute","Aventuras",2)); 
        libros.add(new Libro("1-77","Olvidado Rey Gudú","A.M.Matute","Aventuras",2)); 
        libros.add(new Libro("1-88","El último barco","D.Villar","Novela Negra",3)); 
        libros.add(new Libro("1-99","Ojos de agua","D.Villar","Novela Negra",0)); 

        usuarios.add(new Usuario("11","Ana","ana@email.com","621111111")); 
        usuarios.add(new Usuario("22","David","david@email.com","622222222")); 
        usuarios.add(new Usuario("33","Bea","bea@email.com","623333333")); 
        usuarios.add(new Usuario("44","Lucas","lucas@email.com","624444444")); 
        usuarios.add(new Usuario("55","Carlota","carlota@email.com","625555555")); 
        usuarios.add(new Usuario("66","Juan","juan@email.com","626666666"));
        
        LocalDate hoy= LocalDate.now();
        prestamos.add(new Prestamo(libros.get(2),usuarios.get(0), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(8),usuarios.get(2), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(5),usuarios.get(4), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(5),usuarios.get(0), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(6),usuarios.get(2), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(2),usuarios.get(1), hoy,hoy.plusDays(15)));
    }
//</editor-fold>
   
}
