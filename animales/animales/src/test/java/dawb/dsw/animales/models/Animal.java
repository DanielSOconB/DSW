package dawb.dsw.animales.models;

public class Animal {
    private String id;
    private String nombre;
    private int vidaMedia;
    private boolean  extinto;

    public Animal() {
    }

    public Animal(String id, String nombre, int vidaMedia, boolean extinto) {
        this.id = id;
        this.nombre = nombre;
        this.vidaMedia = vidaMedia;
        this.extinto = extinto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVidaMedia() {
        return vidaMedia;
    }

    public void setVidaMedia(int vidaMedia) {
        this.vidaMedia = vidaMedia;
    }

    public boolean isExtinto() {
        return extinto;
    }

    public void setExtinto(boolean extinto) {
        this.extinto = extinto;
    }
}
