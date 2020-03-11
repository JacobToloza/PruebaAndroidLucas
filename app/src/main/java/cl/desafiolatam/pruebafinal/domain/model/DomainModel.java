package cl.desafiolatam.pruebafinal.domain.model;


public class DomainModel {


    private String nombre;
    private int type;
    private String descripcion;
    private String videoUrl;
    private String imageUrl;
    private String fecha;

    @Override
    public String toString() {
        return "DomainModel{" +
                "nombre='" + nombre + '\'' +
                ", type=" + type +
                ", descripcion='" + descripcion + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", fecha='" + fecha + '\'' +
                '}';
    }
    //==========================================================


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

   //=====================================================================


    public DomainModel(String nombre, int type, String descripcion, String videoUrl, String imageUrl, String fecha) {
        this.nombre = nombre;
        this.type = type;
        this.descripcion = descripcion;
        this.videoUrl = videoUrl;
        this.imageUrl = imageUrl;
        this.fecha = fecha;
    }


}
