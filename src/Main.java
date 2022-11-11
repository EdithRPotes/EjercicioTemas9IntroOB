public class Main {
    public static void main(String[] args) {
       Cliente cliente = new Cliente();
        cliente.nombre="Adonai";
       cliente.edad=27;
       cliente.telefono=2337895;
       cliente.credito = 5000000;
       System.out.println("El nombre del cliente es:"+cliente.nombre+"\n"+"La edad del cliente es:"+cliente.edad+"\n"+"El telefono del cliente es:"+ cliente.telefono+"\n"+"El credito del cliente es:"
        +"$" +cliente.credito);
        Trabajador trabajador = new Trabajador();
        trabajador.nombre="Amalia";
        trabajador.edad=40;
        trabajador.telefono=24789635;
        trabajador.salario=6000000;
        System.out.println("El nombre del trabajador es:"+trabajador.nombre+"\n"+"La edad del trabajador es:"+trabajador.edad+"\n"+"El telefono del trabajador es:"+ trabajador.telefono+"\n"+"El salario del trabajador es:"
                +"$" +trabajador.salario);
    }
}

class Persona{
    int edad;
    int telefono;
    String nombre;

}
class Cliente extends Persona {
   double credito;
}

class Trabajador extends Persona {
    double salario;
}
