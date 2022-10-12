public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(43);
        cliente.setNombre("Gabriel");
        cliente.setTelefono(1152698765);
        cliente.setCredito(80000);
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Telefono: " + cliente.getTelefono());
        System.out.println("Credito: $ " + cliente.getCredito());
        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(21);
        trabajador.setNombre("Sabrina");
        trabajador.setTelefono(1125879635);
        trabajador.setSalario(75000);
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Telefono: " + trabajador.getTelefono());
        System.out.println("Salario: $ " + trabajador.getSalario());


    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona {
    private int credito;

    public int getCredito(){
        return credito;
    }
    public void setCredito(int credito){
        this.credito = credito;
    }
}
class Trabajador extends Persona {
    private int salario;

    public int getSalario(){
        return salario;
    }
    public void setSalario(int salario){
        this.salario = salario;
    }
}
