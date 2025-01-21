/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biblioteca2025;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author alu05d
 */
public class FernandezDiazÓscar{
 
    private ArrayList <Libro> libros;
    private ArrayList <Usuario> usuarios;
    private ArrayList <Prestamo> prestamos;
    private ArrayList <Prestamo> prestamosHist;

    public FernandezDiazÓscar() {
        this.libros = new ArrayList();
        this.usuarios = new ArrayList();
        this.prestamos = new ArrayList();
         this.prestamosHist = new ArrayList();
    }
    
    public static void main(String[] args) {
       FernandezDiazÓscar b= new FernandezDiazÓscar();
       b.cargaDatos(); 
       b.menu();
       b.fueraPlazo();
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
            System.out.println("\t\t\t\t5 - ORDENAR LIBROS ALFABETICAMENTE");
            System.out.println("\t\t\t\t6 - GENEROS LIBROS");
            System.out.println("\t\t\t\t9 - VOLVER");
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
                case 5:{
                    ordenarLibros();
                    break;
                } 
                 case 6:{
                    generoLibros();
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
            System.out.println("\t\t\t\t3 - LISTADOS");
            System.out.println("\t\t\t\t4 - MODIFICAR TELEFONO USUARIO");
            System.out.println("\t\t\t\t5 - ORDENAR USUARIOS POR ORDEN ALFABETICO");
            System.out.println("\t\t\t\t9 - VOLVER");
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
                    listaUsuarios();
                    break;
                } 
               case 4:{
                    modificarusuario();
                    break;
                }
               case 5:{
                   ordenarUsuarios1();
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
            System.out.println("\t\t\t\t2 - PRORROGA PRESTAMO");           
            System.out.println("\t\t\t\t3 - DEVOLUCION PRESTAMO");
            System.out.println("\t\t\t\t4 - LISTADOS PRESTAMOS GENERAL");
            System.out.println("\t\t\t\t5 - LISTADOS PRESTAMOS USUARIO");
            System.out.println("\t\t\t\t6 - LISTAS PRESTAMOS LIBRO");
            System.out.println("\t\t\t\t7 - LIBRO/S MAS LEIDO/S");
            System.out.println("\t\t\t\t8 - USUARIO/S MAS LECTOR/ES");
            System.out.println("\t\t\t\t9 - LIBRO/S MENOS LEIDO/S");
            System.out.println("\t\t\t\t10 - USUARIO/S MENOS LECTOR/ES");
            System.out.println("\t\t\t\t11 - VECES QUE HA SIDO LEIDO UN LIBRO");
            System.out.println("\t\t\t\t14 - VOLVER");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:{
                    nuevoPrestamo();
                    break;
                }   
                case 2:{
                    prorrogaPrestamo();
                    break;
                }
                case 3:{
                    devolucionPrestamo();
                    break;
                }
                case 4:{
                    listaPrestamos();
                    break;
                }
                case 5:{
                    listaPrestamosUsu();
                    break;
                }
                case 6:{
                    listaPrestamosLibroUsuario();
                    break;
                }
               
                 case 7        :{
                    libroMasLeido() ;
                    break;
                }
                 case 8        :{
                    usuarioMasLector() ;
                    break;
                } 
                 case 9        :{
                    libroMenosLeido() ;
                    break;
                }                 
                 case 10        :{
                    usuarioMenosLector();
                     break;
                 }
               case 11        :{
                     vecesleido();
                     break;
                 }
            }
        }while (opcion != 14);
    
        
        }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="GESTION LIBROS">
    private void nuevoLibro() {
        Scanner sc=new Scanner(System.in);           
        System.out.println("Nuevo libro:");
        System.out.println("ISBN: ");
        String isbn= sc.nextLine();
        System.out.println("Titulo: ");
        String titulo=sc.nextLine();
        System.out.println("Autor: ");
        String autor=sc.nextLine();
        System.out.println("Genero:");
        String genero=sc.nextLine();
        System.out.println("Ejemplares:");
        int ejemplares=sc.nextInt();
        
           System.out.println("El siguiente libro ha sido añadido a la biblioteca: "+ new Libro(isbn,titulo,autor,genero,ejemplares));
       libros.add(new Libro(isbn,titulo,autor,genero,ejemplares));
    }

    private void eliminarLibro() {
         Scanner sc=new Scanner(System.in);  
        System.out.println("ISBN del libro a eliminar: ");
        String isbn= sc.nextLine();
        
        int pos= buscaIsbn(isbn);
        if(pos==-1){
            System.out.println("El libro que buscas no esta registrado");
        }else{
            System.out.println("Esta seguro de que desea borrar el libro   " +libros.get(pos) +"   ?");
            System.out.println("TECLEE SI/NO");
            String confirmacion = sc.nextLine();
            if (confirmacion.equalsIgnoreCase("si")){
                System.out.println("El siguiento libro ha sido eliminado: "+libros.get(pos));
                libros.remove(pos);
            }else{
                System.out.println("Operacion cancelada con exito");
            }
            
        }
    }

    private void modificarLibros() {
        Scanner sc=new Scanner(System.in); 
        System.out.println("Dime el ISBN del libro que quieres modificar: ");
        String isbn= sc.nextLine();
        
        int pos= buscaIsbn(isbn);
        if (pos==-1) {
            System.out.println("El libro que buscas no esta registrado");
        } else {
            System.out.println("Pulsa + si quieres aumentar el numero de ejemplares o - si quieres disminuir la cantidad de estos");
            String confirm= sc.nextLine();
           
                 if (confirm.equals("+")) {
                System.out.println("Cuantos ejemplares quieres añadir?");
                int mas= sc.nextInt();
                int ejemplar= libros.get(pos).getEjemplares();
                int calculo2= ejemplar + mas;  
                libros.get(pos).setEjemplares(calculo2);
                System.out.println("Operacion realizada con exito");
             } 
               else if (confirm.equals("-")) {
                System.out.println("¿Cuantos ejemplares quieres quitar?");
                int menos=sc.nextInt();
                int ejemplar= libros.get(pos).getEjemplares();
                int calculo2= ejemplar - menos; 
                libros.get(pos).setEjemplares(calculo2);
                System.out.println("Operacion realizada con exito");
          
            }
             else{
                     System.out.println("No se ha detectado ningún símbolo +/-");
            }
           
          
        }
    }
    

    private void listaLibros() {
        for (Libro l : libros) {
            System.out.println(l);
        }
    }
        private void ordenarLibros(){
         libros.sort(Comparator.comparing(Libro::getTitulo));
         System.out.println("Los libros han sido ordenados por orden alfabetico: ");
            for (Libro libro : libros) {
                System.out.println(libro);
            }
    }
        private void generoLibros(){
        String aventuras="Aventuras";
        String drama="Drama";
        String ficcion="Ficcion";
        String misterio="Misterio";
            System.out.println("LIBROS AVENTURAS");
            for (Libro l : libros) {
                if (l.getGenero().equalsIgnoreCase(aventuras)) {
                    System.out.println(l);
                }
            }
            System.out.println();
            System.out.println("LIBROS DRAMA");
            for (Libro l : libros) {
                if (l.getGenero().equalsIgnoreCase(drama)) {
                    System.out.println(l);
                }
            }
            System.out.println();
            System.out.println("LIBROS FICCION");
            for (Libro l : libros) {
                 if (l.getGenero().equalsIgnoreCase(ficcion)) {
                    System.out.println(l);
                }
            }
            System.out.println();
            System.out.println("LIBROS MISTERIO");
             for (Libro l : libros) {
                 if (l.getGenero().equalsIgnoreCase(misterio)) {
                    System.out.println(l);
                }
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
        
           System.out.println("El siguiente usuario ha sido añadido a la biblioteca: "+new Usuario(DNI,nombre,email,telefono));
       usuarios.add(new Usuario(DNI,nombre,email,telefono));
    }

    private void eliminarUsuario() {
         Scanner sc=new Scanner(System.in);  
        System.out.println("DNI del usuario a eliminar: ");
        String dni= sc.nextLine();
        
        int pos= buscaDni(dni);
        if(pos==-1){
            System.out.println("El usuario que buscas no esta registrado");
        }else{
            System.out.println("Esta seguro de que desea borrar el usuario "+usuarios.get(pos)+"?");
            System.out.println("TECLEE SI/NO");
            String confirmacion = sc.nextLine();
            if (confirmacion.equalsIgnoreCase("si")){
                System.out.println("El siguiente usuario ha sido eliminado: "+usuarios.get(pos));
                usuarios.remove(pos);
            }else{
                System.out.println("Operacion cancelada con exito");
            }
            
        }
    }
    private void modificarusuario(){
       Scanner sc=new Scanner(System.in);  
       System.out.println("Dime el DNI del usuario que quieres modificar: ");
       String dni=solicitaDni();
       int pos= buscaDni(dni);
       if(pos==-1){
            System.out.println("El usuario que buscas no esta registrado");
        }else{
           System.out.println("Introduce el telefono que quieres modificar: ");
           String telefono= sc.nextLine();
        for (Usuario u : usuarios) {
            if (u.getDni().equalsIgnoreCase(dni)) {
                u.setTelefono(telefono);
            }
        }
        System.out.println("El siguiente usuario ha sido modificado con exito: "+usuarios.get(pos));
       }
    }
    
    private void ordenarUsuarios1(){
         usuarios.sort(Comparator.comparing(Usuario::getNombre));
         System.out.println("Los usuarios han sido ordenados por orden alfabetico: ");
         for (Usuario u : usuarios) {
             System.out.println(u);
        }
    }
    
    private void listaUsuarios() {
        for (Usuario u : usuarios) {
            System.out.println(u);
        }
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="GESTION PRESTAMOS">
    private void nuevoPrestamo() {
        String dni=solicitaDni();
        int posUsuario = buscaDni(dni);
        if (posUsuario==-1){
            System.out.println("No es aun usuario de la biblioteca");
            }else{
            String isbn=solicitaIsbn();
            int posLibro=buscaIsbn(isbn);
        if (posLibro==-1){
            System.out.println("El ISBN pertenece a un libro inexistente");
            }else{    
            boolean existePrestamo = true;
              for (Prestamo p : prestamos) {
                    if (p.getUsuarioPrest().getDni().equals(dni)&&p.getLibroPrest().getIsbn().equals(isbn)) {  
                        System.out.println("El libro elegido ya se encuentra en posesion del usuario");
                    existePrestamo = false;
                    }    
              }
          if (existePrestamo) {
            if(libros.get(posLibro).getEjemplares()>0){
                LocalDate hoy=LocalDate.now();
                prestamos.add(new Prestamo(libros.get(posLibro),usuarios.get(posUsuario),hoy,hoy.plusDays(15)));
                libros.get(posLibro).setEjemplares(libros.get(posLibro).getEjemplares()-1);
                System.out.println("El siguiente prestamo ha sido añadido a la biblioteca: "+ new Prestamo(libros.get(posLibro),usuarios.get(posUsuario),hoy,hoy.plusDays(15))); 
                }else{
                    System.out.println("No quedan unidades disponibles del libro");
                    }
               }
           }
        }
     }   


     
    private void prorrogaPrestamo(){
        System.out.println("Datos para la prorroga del prestamo:");
        int pos=buscaPrestamo(solicitaDni(),solicitaIsbn());
            if (pos==-1) {
                System.out.println("No hay ningun préstamo con esos datos");
            }else{
                prestamos.get(pos).setFechaDev(prestamos.get(pos).getFechaDev().plusDays(15));
                prestamos.get(pos).setFechaPrest((LocalDate.now()));
                System.out.println("Operacion realizada con exito");
            }
    }
    
    private void devolucionPrestamo(){
        System.out.println("Datos para la devolucion del prestamo:");
        String dni=solicitaDni();
         String isbnLibro=solicitaIsbn();
         int pos=buscaPrestamo(dni,isbnLibro);
            if (pos==-1) {
                System.out.println("No hay ningun prestamo con esos datos");
            }else{
                prestamos.get(pos).setFechaDev(LocalDate.now());
                libros.get(buscaIsbn(isbnLibro)).setEjemplares(libros.get(buscaIsbn(isbnLibro)).getEjemplares()+1);        
                prestamosHist.add(prestamos.get(pos));
                prestamos.remove(pos);
                System.out.println("Operacion realizada con exito");
            }
    }
   
     private void listaPrestamosUsu(){
        String dni=solicitaDni();
        int pos=buscaDni(dni);
        
        if (pos==-1){
            System.out.println("El usuario que buscas no esta registrado");
        }else{
            System.out.println("Prestamos activos de "+ usuarios.get(pos).getNombre()+": ");
                    
            for (Prestamo p : prestamos) {
                if (p.getUsuarioPrest().getDni().equals(dni)){
                    if (p.getFechaDev().isBefore(LocalDate.now())){
                        System.out.print("Libro fuera de plazo: ");
                    }
                    System.out.println(p);  
                }
            }
            System.out.println("Prestamos ya devueltos por "+usuarios.get(pos).getNombre()+" : ");
                    
            for (Prestamo p : prestamosHist) {
                if (p.getUsuarioPrest().getDni().equals(dni)){
                    System.out.println(p);  
                }
            }
        }
    }
    private void listaPrestamosLibroUsuario() {
        String isbn=solicitaIsbn();
        int pos=buscaIsbn(isbn);
        if (pos==-1) {
            System.out.println("El libro que buscas no esta registrado");
        } else {
                 System.out.println("Usuarios/as que ya lo han leido");
                for (Prestamo p : prestamos) {
                if (p.getLibroPrest().getIsbn().equals(isbn)){
                    System.out.println(p.getUsuarioPrest());
             }
            }
        }
    }
    private void vecesleido(){
        String libro=solicitaIsbn();
        int pos= buscaIsbn(libro);
        int contador1= 0;
        if (pos==-1) {
            System.out.println("El libro que buscas no esta registrado");
        }else {
           for (Prestamo p : prestamos) {
               if(p.getLibroPrest()==libros.get(pos)) {
                   contador1++;
               }
           }
            for (Prestamo p : prestamosHist) {
               if(p.getLibroPrest()==libros.get(pos)) {
                   contador1++;
               }
        }
        System.out.println("El/los libro/s "+libros.get(pos)+" ha/n sido leido/s "+contador1+" vez/es");
    } 
    }

     private void libroMasLeido(){
        ArrayList <Integer> contadoresLibros=new ArrayList();
        int contador;
        for (Libro l : libros) {
            contador=0;
            for (Prestamo p:prestamos) {
                if (l==p.getLibroPrest()){
                    contador++;
                }
            }
            for (Prestamo p:prestamosHist) {
                if (l==p.getLibroPrest()){
                    contador++;
                }
            }
            contadoresLibros.add(contador);
        }
        
        int max=0;
        for (int c:contadoresLibros){
            if (c>max){
                max=c;
            }
        }
        System.out.println("El libro/s mas leido/s con " + max + " prestamos es/son: " );
               
        for (int i = 0; i < contadoresLibros.size(); i++) {
            if (contadoresLibros.get(i)==max){
                System.out.println(libros.get(i));
            }
        }
    }
    
    private void usuarioMasLector(){
        ArrayList <Integer> contadoresUsuarios=new ArrayList();
        int contador;
        for (Usuario u : usuarios) {
            contador=0;
            for (Prestamo p:prestamos) {
                if (u==p.getUsuarioPrest()){
                    contador++;
                }
            }
            for (Prestamo p:prestamosHist) {
                if (u==p.getUsuarioPrest()){
                    contador++;
                }
            }
            contadoresUsuarios.add(contador);
        }
        
        int max=0;
        for (int c:contadoresUsuarios){
            if (c>max){
                max=c;
            }
        }
        System.out.println("Los usuarios/as mas lectores/as con " + max + " prestamos son: " );
               
        for (int i = 0; i < contadoresUsuarios.size(); i++) {
            if (contadoresUsuarios.get(i)==max){
                System.out.println(usuarios.get(i));
            }
        }
    }
     
     private void libroMenosLeido(){
        ArrayList <Integer> contadoresLibros=new ArrayList();
        int contador;
        for (Libro l : libros) {
            contador=0;
            for (Prestamo p:prestamos) {
                if (l==p.getLibroPrest()){
                    contador++;
                }
            }
            for (Prestamo p:prestamosHist) {
                if (l==p.getLibroPrest()){
                    contador++;
                }
            }
            contadoresLibros.add(contador);
        }
        
        int min=0;
        for (int c:contadoresLibros){
            if (c==min){
                min=c;
            }
        }
        System.out.println("El libro/s menos leido/s con " + min+ " prestamos es/son: " );
               
        for (int i = 0; i < contadoresLibros.size(); i++) {
            if (contadoresLibros.get(i)==min){
                System.out.println(libros.get(i));
            }
        }
    }
     private void usuarioMenosLector(){
        ArrayList <Integer> contadoresUsuarios=new ArrayList();
        int contador;
        for (Usuario u : usuarios) {
            contador=0;
            for (Prestamo p:prestamos) {
                if (u==p.getUsuarioPrest()){
                    contador++;
                }
            }
            for (Prestamo p:prestamosHist) {
                if (u==p.getUsuarioPrest()){
                    contador++;
                }
            }
            contadoresUsuarios.add(contador);
        }
        
        int min=0;
        for (int c:contadoresUsuarios){
            if (c==min){
               min=c;
            }
        }
        System.out.println("Los usuarios/as menos lectores/as con " + min + " prestamos son: " );
               
        for (int i = 0; i < contadoresUsuarios.size(); i++) {
            if (contadoresUsuarios.get(i)==min){
                System.out.println(usuarios.get(i));
            }
        }
    }             
    
    private void listaPrestamos() {
        for (Prestamo p : prestamos) {
            System.out.println(p);  
        }
    }
//</editor-fold>
    
 
    
    
    //<editor-fold defaultstate="collapsed" desc="METODOS AUXILIARES">
    /**
     * Método para saber los prestamos que están fuera de plazo
     */
    public void fueraPlazo(){
        System.out.println("Prestamos fuera de plazo:");
        for (Prestamo p : prestamos) {
            if (p.getFechaDev().isBefore(LocalDate.now())){
                    System.out.println(p);
            }
        }
    }
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
        
        libros.add(new Libro("1-22","El Silmarillon","JRR Tolkien","Aventuras",3)); 
        libros.add(new Libro("1-33","El Medico","N. Gordon","Aventuras",4)); 
        libros.add(new Libro("1-44","Chaman","N. Gordon","Aventuras",3)); 
        libros.add(new Libro("1-55","Momo","M. Ende","Aventuras",2)); 
        libros.add(new Libro("1-66","Paraiso inhabitado","A.M.Matute","Aventuras",2)); 
        libros.add(new Libro("1-77","Olvidado Rey Gudu","A.M.Matute","Aventuras",2)); 
        libros.add(new Libro("1-88","El ultimo barco","D.Villar","Drama",3)); 
        libros.add(new Libro("1-99","Ojos de agua","D.Villar","Drama",0)); 
        libros.add(new Libro("2-01","Cien anos de soledad","G. Garcia Marquez","Drama",5));
        libros.add(new Libro("2-02","Rayuela","Julio Cortazar","Ficcion",4));
        libros.add(new Libro("2-03","El nombre de la rosa","Umberto Eco","Misterio",6));
        libros.add(new Libro("2-04","La sombra del viento","Carlos Ruiz Zafon","Drama",7));
        libros.add(new Libro("2-05","Fahrenheit 451","Ray Bradbury","Ficcion",3));
        libros.add(new Libro("1-11","El Hobbit","JRR Tolkien","Aventuras",3));     
        libros.add(new Libro("2-07", "La Metamorfosis", "Franz Kafka", "Ficcion", 3));

        usuarios.add(new Usuario("11","Ana","ana@email.com","621111111")); 
        usuarios.add(new Usuario("103","Fernando","fernando@email.com","623451777"));
        usuarios.add(new Usuario("22","David","david@email.com","622222222")); 
        usuarios.add(new Usuario("33","Bea","bea@email.com","623333333")); 
        usuarios.add(new Usuario("101","Lucas","lucas@email.com","621444444")); 
        usuarios.add(new Usuario("102","Enol","enol@email.com","625733333")); 
        usuarios.add(new Usuario("88","Jorge","jorge@email.com","62999999999")); 
        usuarios.add(new Usuario("99","Manuel","manuel@email.com","62122222222"));        
        usuarios.add(new Usuario("44","Lucas","lucas@email.com","624444444")); 
        usuarios.add(new Usuario("55","Carlota","carlota@email.com","625555555")); 
        usuarios.add(new Usuario("66","Juan","juan@email.com","626666666"));
        usuarios.add(new Usuario("77","Marcos","marcos@email.com","627777777")); 
        
        LocalDate hoy= LocalDate.now();
        prestamos.add(new Prestamo(libros.get(2),usuarios.get(0), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(8),usuarios.get(2), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(5),usuarios.get(4), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(5),usuarios.get(0), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(6),usuarios.get(2), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(2),usuarios.get(1), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(1),usuarios.get(3), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(3),usuarios.get(6), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(7),usuarios.get(11), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(9),usuarios.get(10), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(0),usuarios.get(5), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(13),usuarios.get(1), hoy,hoy.plusDays(15)));
    }
}
//</editor-fold>
   

