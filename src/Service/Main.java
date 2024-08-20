package Service;
  import Model.Libro;
public class Main {
  public static void main(String[] args){

   Libro libro1 = new Libro("El Quijote","Miguel Cervantes",500f,10);
   Libro libro2 = new Libro("Cien anios de soledad","Gabriel Garcia Marquez",700f,5);


   libro1.imprimir();
   libro2.imprimir();

   libro1.venta(3);
   libro1.imprimir();

   libro2.venta(8);

   libro2.nuevaCopia(5);
   libro2.imprimir();



  }



}