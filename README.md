# Veterinaria-java
Proyecto universitario inspirado en una clínica veterinaria utilizando método CRUD.

La tarea es crear datos de mascotas, actualizarlos, borrarlos, y cargarlos.

El programa tendrá una simple interfaz donde preguntara que tipo de
operación quiere realizar el usuario

Las operaciones son:

#### • Buscar mascota
◦ Las mascotas se buscan por un apodo, no puede haber 2 mascotas
con el mismo apodo. Esta operación deberá devolver toda la
información de la mascota si existe o el error: “no existe” si no se
encuentra la mascota

#### • Cargar mascota

◦ Se debe pedir nombre y apellido del dueño, apodo de la mascota,
tipo de mascota (perro, gato o loro), peso de la mascota y motivo
de la visita.
#### • Borrar mascota
◦ Se debe pedir el apodo de la mascota, si se puede borrar
exitosamente se debe indicar “la operación fue un exito” de lo
contrario el error: “no se puede encontrar la mascota con el apodo
xxx”
#### • Actualizar mascota
◦ Se debe pedir el apodo de la mascota y continuación el peso y el
motivo de la visita. En caso que la mascota no exista se debe
indicar con un mensaje de error, en caso contrario se debe
mostrar “la mascota xxx se actualizó correctamente”. Cada motivo
de visita se debe agregar en una lista que tendrá la mascota. De
manera que cuando se consulte por una mascota se muestren
todos los motivos de visita. Los motivos de visita se deben mostrar
ordenados lexicograficamente

El programa deberá preguntar si se desean realizar más operaciones o si
el usuario quiere salir del programa.
### Ayuda de implementación
 • Pueden usar un mapa para guardar las mascotas y poder
buscarlas...
◦ Map<String,Mascota> mascotas;

