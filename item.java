private String id;
 private String tipo;
 private int fechaIngreso; 
 private int fechaSalida; 
 private double volumen;
 private double peso;
 private Bodega bodega; // Composición[span_4](start_span)[span_4](end_span)

 public Item(String id, String tipo, int fechaIngreso, int fechaSalida, double volumen, double peso, Bodega bodega) {
 this.id = id;
 this.tipo = tipo;
 this.fechaIngreso = fechaIngreso;
 this.fechaSalida = fechaSalida;
 this.volumen = volumen;
 this.peso = peso;
 this.bodega = bodega;
 }

 public String getId() { return id; }
 public String getTipo() { return tipo; }
 public int getFechaIngreso() { return fechaIngreso; }
 public int getFechaSalida() { return fechaSalida; }
 public double getVolumen() { return volumen; }
 public double getPeso() { return peso; }
 public Bodega getBodega() { return bodega; }
}
