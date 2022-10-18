package veterinaria;

import java.util.Scanner;

public class Veterinaria {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Mascotas mascotas = new Mascotas();
        Mascota mascota;
        int seguir;
        String motivoDeVisita;
        
        do {
            try {
                System.out.println("¿Que accion desea realizar?");
                System.out.println("1: Buscar Mascota - 2: Cargar Mascota - 3: Borrar Mascota - 4: Actualizar Mascota");
                int accion = Integer.parseInt(entrada.nextLine());
                System.out.println("Ingrese el apodo de la mascota: ");
                String apodoMascota = entrada.nextLine().toLowerCase();
                switch (accion) {
                    case 1:
                        mascotas.buscarMascota(apodoMascota);
                        break;
                    case 2:
                        System.out.println("Ingrese el nombre del dueño: ");
                        String nombreDuenio = entrada.nextLine().toLowerCase();
                        System.out.println("Ingrese el apellido del dueño: ");
                        String apellidoDuenio = entrada.nextLine().toLowerCase();
                        System.out.println("Ingrese el tipo de mascota (Perro,Gato,Loro)");
                        String tipoMascota = entrada.nextLine();
                        System.out.println("Ingrese el peso de la mascota: ");
                        double pesoMascota = Integer.parseInt(entrada.nextLine());
                        System.out.println("Ingrese el motivo de visita de la mascota: ");
                        motivoDeVisita = entrada.nextLine().toLowerCase();
                        mascota = new Mascota(apodoMascota, apellidoDuenio, nombreDuenio, tipoMascota, pesoMascota);
                        mascotas.cargarMascota(mascota);
                        mascota.agregarMotivoConsulta(motivoDeVisita);
                        break;
                    case 3:
                        mascotas.borrarMascota(apodoMascota);
                        break;
                    case 4:
                        Mascota mascotaActualizada = mascotas.getMascota(apodoMascota);
                        System.out.println("Ingrese el peso actualizado");
                        double pesoMascotaMod = Integer.parseInt(entrada.nextLine());
                        System.out.println("Motivo de visita: ");
                        motivoDeVisita = entrada.nextLine().toLowerCase();
                        mascotaActualizada.setPeso(pesoMascotaMod);
                        mascotaActualizada.agregarMotivoConsulta(motivoDeVisita);
                        mascotas.actualizarMascota(mascotaActualizada);
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {

                System.out.println("Opcion no valida");
                System.out.println(e);
            }
            System.out.println("Desea realizar otra operacion? 1: Si 2: No");
            seguir = Integer.parseInt(entrada.nextLine());
        } while (seguir == 1);

    }

}
