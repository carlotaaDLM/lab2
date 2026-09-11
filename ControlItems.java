public class ControlItems {
 
 public void registrarItem(Item item) {
 item.getBodega().getListaItems().add(item);
 }

 public void listarItems(Bodega bodega) {
 System.out.println("\nListar Items de la Bodega: " + bodega.getNombre());
 for (int i = 0; i < bodega.getListaItems().size(); i++) {
 Item it = bodega.getListaItems().get(i);
 System.out.println("ID: " + it.getId() + " | Tipo: " + it.getTipo() + " | Volumen: " + it.getVolumen());
 }
 }

 public void calculoCostoAlmacen(Item item) {
 // Implementación de la fórmula del PDF
 double costoXmesMt = item.getBodega().getCostoXDiaMt() * 30; 
 double costoAlmacenItem = costoXmesMt * ((item.getFechaSalida() - item.getFechaIngreso()) / 30.0);
 System.out.println("Costo de almacenaje para el ítem " + item.getId() + ": " + costoAlmacenItem);
 }
}
