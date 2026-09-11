import java.util.ArrayList;
import java.util.Scanner;

public class ControlBodega {
 private ArrayList<Bodega> listaBodegas = new ArrayList<>();

 public void crearBodega(Scanner scanner) {
 System.out.println("\nRegistrar Bodega");
 System.out.print("Ingrese Id: ");
 String id = scanner.nextLine();
 System.out.print("Ingrese Nombre: ");
 String nombre = scanner.nextLine();
 System.out.print("Ingrese Ubicación: ");
 String ubicacion = scanner.nextLine();
 System.out.print("Ingrese Capacidad: ");
 double capacidad = Double.parseDouble(scanner.nextLine());
 System.out.print("Ingrese Costo diario por metro cúbico: ");
 double costo = Double.parseDouble(scanner.nextLine());

 Bodega nuevaBodega = new Bodega(id, nombre, ubicacion, capacidad, costo);
 listaBodegas.add(nuevaBodega); // Agregamos a la lista dinámica[span_8](start_span)[span_8](end_span)
 }

 public void listarBodega() {
 System.out.println("\nListar Bodegas");
 System.out.println("ID, NOMBRE, UBICACIÓN, CAPACIDAD, COSTOXDIAMT");
 // Recorrido clásico del ArrayList[span_9](start_span)[span_9](end_span)
 for (int i = 0; i < listaBodegas.size(); i++) {
 Bodega b = listaBodegas.get(i);
 System.out.println(b.getId() + ", " + b.getNombre() + ", " + b.getUbicacion() + ", " + b.getCapacidad() + ", " + b.getCostoXDiaMt());
 }
 }

 public ArrayList<Bodega> getListaBodegas() { return listaBodegas; }
}
