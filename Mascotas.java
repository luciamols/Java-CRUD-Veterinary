package veterinaria;

import java.util.HashMap;
import java.util.Map;

public class Mascotas {

    private Map<String,Mascota> mapaMascotas;

    public Mascotas() {
        this.mapaMascotas = new HashMap<>();
    }
    
    public Map<String, Mascota> getMapaMascotas(){
        return mapaMascotas;
    }

    public void buscarMascota(String apodo) {
        if (mapaMascotas.get(apodo) == null) {
            System.out.println("La mascota no está registrada");
        } else {
            System.out.println(mapaMascotas.get(apodo));
        }

    }

    public void cargarMascota(Mascota mascota) {
        if (mapaMascotas.containsKey(mascota.getApodoMascota())) {
            System.out.println("La mascota ya se encuentra registrada");
        } else {
            mapaMascotas.put(mascota.getApodoMascota(), mascota);
            System.out.println("Mascota registrada correctamente");
        }
    }

    public void borrarMascota(String apodo) {
        buscarMascota(apodo);
        mapaMascotas.remove(apodo);
        System.out.println("Mascota borrada del sistema con exito");
    }

    public void actualizarMascota(Mascota mascota) {
        buscarMascota(mascota.getApodoMascota());
        mapaMascotas.replace(mascota.getApodoMascota(), mascota);
        System.out.println("Mascota Actualizada con exito");
    }
    
    public Mascota getMascota(String apodoMascota){
        if(mapaMascotas.get(apodoMascota) == null){
            return null;
        }
        return mapaMascotas.get(apodoMascota);
    }
}
