import java.util.ArrayList;

public class Bodega {
 private String id;
 private String nombre;
 private String ubicacion;
 private double capacidad;
 private ArrayList<Item> listaItems; // Uso de estructura dinámica[span_5](start_span)[span_5](end_span)
 private double costoXDiaMt;

 public Bodega(String id, String nombre, String ubicacion, double capacidad, double costoXDiaMt) {
 this.id = id;
 this.nombre = nombre;
 this.ubicacion = ubicacion;
 this.capacidad = capacidad;
 this.costoXDiaMt = costoXDiaMt;
 this.listaItems = new ArrayList<>(); // Se inicializa vacía[span_6](start_span)[span_6](end_span)
 }

 public String getId() { return id; }
 public String getNombre() { return nombre; }
 public String getUbicacion() { return ubicacion; }
 public double getCapacidad() { return capacidad; }
 public double getCostoXDiaMt() { return costoXDiaMt; }
 public ArrayList<Item> getListaItems() { return listaItems; }
}
