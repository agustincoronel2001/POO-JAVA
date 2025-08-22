public class App {
    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona();
        persona1.nombre="Agustin";
        persona1.apellido="Coronel";
        persona1.edad= 53;

        Carrera carrera1 = new Carrera();
        carrera1.nombre="Ingenieria en computacion";
        carrera1.duracion = 6;
        carrera1.estaEnCurso=false;

        persona1.carrera= carrera1;

        Persona persona2 = new Persona();
        persona2.nombre = "Mariana";
        persona2.apellido="Perez";
        persona2.edad= 24;

        Carrera carrera2 = new Carrera();
        carrera2.nombre="Ingenieria en Sistemas";
        carrera2.duracion = 6;
        carrera2.estaEnCurso=true;

        persona2.carrera=carrera2;



        String saludado = "Sergie ";

        System.out.println(persona1.apellido + " , " + persona1.nombre + " tiene " + persona1.edad + " años .");
        System.out.println(persona2.apellido + " , " + persona2.nombre + " tiene " + persona2.edad + " años .");

        System.out.println(persona1.darNombreCompleto() + " tiene " + persona1.edad + " años y esta recibido de " + persona1.carrera.nombre ); 
        System.out.println(persona2.darNombreCompleto() + " tiene " + persona2.edad + " años y esta cursando " + persona2.carrera.nombre );
        System.out.println(persona2.enviarSaludo(saludado));
        System.out.println(persona2.enviarSaludo("a otro"));

        System.out.println(persona1.enviarSaludo(saludado));
        System.out.println(persona2.enviarSaludo("Luke Skywalker"));


    }
}

//esta es una forma de ingresar datos, en el proximo codigo ingresaremos los datos mediante constructores