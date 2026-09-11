import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 ControlBodega controlBodega = new ControlBodega();
 ControlItems controlItems = new ControlItems();
 int opcion = 0;

 // Bucle iterativo para el menú[span_12](start_span)[span_12](end_span)
 while (opcion != 6) {
 System.out.println("\nMENU PRINCIPAL");
 System.out.println("(1) Listar Bodegas");
 System.out.println("(2) Registrar Bodega");
 System.out.println("(3) Registrar ítem en bodega");
 System.out.println("(4) Listar ítems de una bodega");
 System.out.println("(5) Calcular costo de almacenaje");
 System.out.println("(6) Salir");
 System.out.println("****************");
 System.out.print("Ingrese la opción: ");
 
 try {
 opcion = Integer.parseInt(scanner.nextLine());
 
 switch (opcion) {
 case 1:
 System.out.println("****\nIngrese opción: 1");
 controlBodega.listarBodega();
 System.out.println("**********");
 break;
 case 2:
 System.out.println("****\nIngrese opción: 2");
 controlBodega.crearBodega(scanner);
 break;
 case 3:
 System.out.println("****\nIngrese opción: 3");
 if (controlBodega.getListaBodegas().isEmpty()) {
 System.out.println("Debe registrar una bodega primero.");
 } else {
 System.out.print("Id del ítem: ");
 String id = scanner.nextLine();
 System.out.print("Tipo: ");
 String tipo = scanner.nextLine();
 System.out.print("Día de ingreso: ");
 int diaIn = Integer.parseInt(scanner.nextLine());
 System.out.print("Día de salida: ");
 int diaOut = Integer.parseInt(scanner.nextLine());
 System.out.print("Volumen: ");
 double vol = Double.parseDouble(scanner.nextLine());
 System.out.print("Peso: ");
 double peso = Double.parseDouble(scanner.nextLine());
 
 // Por defecto, asignamos a la primera bodega creada para el ejemplo
 Bodega b = controlBodega.getListaBodegas().get(0);
 controlItems.registrarItem(new Item(id, tipo, diaIn, diaOut, vol, peso, b));
 System.out.println("Ítem registrado.");
 }
 break;
 case 4:
 System.out.println("****\nIngrese opción: 4");
 if (!controlBodega.getListaBodegas().isEmpty()) {
 controlItems.listarItems(controlBodega.getListaBodegas().get(0));
 }
 break;
 case 5:
 System.out.println("****\nIngrese opción: 5");
 if (!controlBodega.getListaBodegas().isEmpty() && !controlBodega.getListaBodegas().get(0).getListaItems().isEmpty()) {
 Item item = controlBodega.getListaBodegas().get(0).getListaItems().get(0);
 controlItems.calculoCostoAlmacen(item);
 } else {
 System.out.println("No hay ítems registrados.");
 }
 break;
 case 6:
 System.out.println("Ingrese la opción: 6");
 System.out.println("----Cerrando el programa----");
 break;
 default:
 System.out.println("Ingrese la opción: " + opcion);
 System.out.println("La opción NO es válida, ingrese nuevamente:");
 }
 } catch (Exception e) {
 System.out.println("La opción NO es válida, ingrese nuevamente:");
 }
 }
 scanner.close();
 }
}
