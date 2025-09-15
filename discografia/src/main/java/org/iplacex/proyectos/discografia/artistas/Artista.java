package org.iplacex.proyectos.discografia.artistas;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "artistas")
public class Artista {

    @Id
    private String _id;
    private String nombre;
    private String estilos;
    private int anioFundacion;
    private boolean estaActivo;

    public Artista() {}

    public String get_id() { return _id; }
    public void set_id(String _id) { this._id = _id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEstilos() { return estilos; }
    public void setEstilos(String estilos) { this.estilos = estilos; }

    public int getAnioFundacion() { return anioFundacion; }
    public void setAnioFundacion(int anioFundacion) { this.anioFundacion = anioFundacion; }

    public boolean isEstaActivo() { return estaActivo; }
    public void setEstaActivo(boolean estaActivo) { this.estaActivo = estaActivo; }
}
