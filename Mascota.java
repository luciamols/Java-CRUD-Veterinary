package veterinaria;

import java.util.ArrayList;
import java.util.List;

public class Mascota {

    private String nombreDuenio, apellidoDuenio, apodoMascota, tipoMascota; 
    private List<String>motivoVisita;
    private double pesoMascota;

    private List<String> listaMotivoVisita = new ArrayList<>();

    public Mascota(String apodo, String apellido, String nombre, String tipoMascota, double pesoMascota) {
        this.apodoMascota = apodo;
        this.apellidoDuenio = apellido;
        this.nombreDuenio = nombre;
        this.tipoMascota = tipoMascota;
        this.pesoMascota = pesoMascota;
        this.motivoVisita = new ArrayList<>();
    }

    public String getNombreDuenio(){
        return nombreDuenio;
    }
    
    public String getApellidoDuenio(){
        return apellidoDuenio;
    }
    
    public String getTipoMascota() {
        return tipoMascota;
    }
    
    public List<String> getMotivosConsulta() {
        return listaMotivoVisita;
    }

    public void setMotivosVisitas(List<String> motivosVisitas) {
        this.listaMotivoVisita = motivosVisitas;
    }

    public List<String> getMotivoConsulta() {
        return motivoVisita;
    }

    public String getApodoMascota() {
        return apodoMascota;
    }

    public double getPeso() {
        return pesoMascota;
    }

    public void setApodo(String apodo) {
        this.apodoMascota = apodo;
    }

    public void setPeso(double peso) {
        this.pesoMascota = peso;
    }

    public void agregarMotivoConsulta(String motivo) {
        motivoVisita.add(motivo);
    }
    
    @Override
    public String toString(){
        return "Información:\n"
                + "Nombre de la mascota: " + apodoMascota + "\n"
                + "Peso de la mascota: " + pesoMascota + "\n"
                + "Tipo de mascota: " + tipoMascota + "\n"
                + "Dueño: " + nombreDuenio + "," + apellidoDuenio + "\n"
                + "Motivo de visita: " + motivoVisita + "\n";
    }
}
