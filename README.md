# Veterinaria-java
Proyecto academico sobre un CRUD de veterinaria

La veterinaria del barrio nos pide hacer un simple programa para cargar
las mascotas del barrio y sus dueños.

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

 • Les aconsejo crear una clase Mascotas donde tengan el mapa de
mascotas y los métodos para operar sobre ellas y la clase Mascota
con los atributos de las mismas y el listado de motivos de visita como
un List<String> motivosVisita

• Traten de dejar limpio el método main del inicializador y tener la
mayor cantidad de lógica en métodos separados. Que el que lea el
programa pueda entenderlo incluso sin saber programación. Usen
nombres de métodos descriptivos

• No usen Scanner detro de Mascota o Mascotas, úsenlo en
Inicializador para pedir por los datos al usuario

• Para ordenar los motivos de visita recuerden el uso del Comparator

• No es obligatorio, pero si pueden implementen los casos de error
como por ejemplo cuando se busca una mascota y no existe como
excepciones. Usando por ejemplo MascotaNoEncontradaException().

Luego en el código donde llaman al metodo deberían tener los
try/catchs correspondientes y informar que paso.
