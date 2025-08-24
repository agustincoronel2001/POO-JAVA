public class App {
    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona();
        persona1.nombre="Patricia";
        persona1.apellido="Sosa";
        persona1.edad= 60;
        persona1.carrera.nombre= "Musica";

    

        System.out.println(persona1.darNombreCompleto() + " tiene " + persona1.edad + " años y esta recibida de " + persona1.carrera.nombre ); 

    }
}

//CON CONSTRUCTORES, proximo veremos para no tener que escribir los datos de esa forma 