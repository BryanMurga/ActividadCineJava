package mx.edu.utez.client.model;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Customers")
@XmlAccessorType(XmlAccessType.FIELD)
public class Pelicula {

    @XmlElement
    private int id;
    @XmlElement
    private String titulo;
    @XmlElement
    private String descripcion;
    @XmlElement
    private String sinopsis;
    @XmlElement
    private int rating;
    @XmlElement
    private String dateRegister;
    @XmlElement
    private String dateUpdate;
    @XmlElement
    private int status;
    @XmlElement
    private int categoria;

    public Pelicula(){

    }

    public Pelicula(int id, String titulo, String descripcion, String sinopsis, int
            rating, String dateRegister, String dateUpdate, int status, int categoria) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.sinopsis = sinopsis;
        this.rating = rating;
        this.dateRegister = dateRegister;
        this.dateUpdate = dateUpdate;
        this.status = status;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getdateRegister() {
        return dateRegister;
    }

    public void setdateRegister(String dateRegister) {
        this.dateRegister = dateRegister;
    }

    public String getdateUpdate() {
        return dateUpdate;
    }

    public void setdateUpdate(String dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public int getstatus() {
        return status;
    }

    public void setstatus(int status) {
        this.status = status;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", sinopsis='" + sinopsis + '\'' +
                ", rating=" + rating +
                ", dateRegister='" + dateRegister + '\'' +
                ", dateUpdate='" + dateUpdate + '\'' +
                ", status=" + status +
                ", categoria=" + categoria +
                '}';
    }
}
