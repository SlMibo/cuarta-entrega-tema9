public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Milagros");
        cliente.setEdad(26);
        cliente.setTelefono("12345678");
        cliente.setCredito("Hipotecario");

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Ángel");
        trabajador.setEdad(30);
        trabajador.setTelefono("98765432");
        trabajador.setSalario(500);

        System.out.println("Cliente: " + cliente.getNombre() + " - " + cliente.getEdad() + " años - " + cliente.getTelefono() + " - Crédito: " + cliente.getCredito());
        System.out.println("Trabajador: " + trabajador.getNombre() + " - " + trabajador.getEdad() + " años - " + trabajador.getTelefono() + " - Salario: $" + trabajador.getSalario());
    }
}
abstract class Persona {
    String nombre;
    int edad;
    String telefono;

    abstract public void setNombre(String nombre);
    abstract public String getNombre();
    abstract public void setEdad(int edad);
    abstract public int getEdad();
    abstract public void setTelefono(String telefono);
    abstract public String getTelefono();
}

class Cliente extends Persona {
    String credito;

    public void setCredito(String credito){
        this.credito = credito;
    }
    public String getCredito(){
        return this.credito;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono() {
        return this.telefono;
    }
}

class Trabajador extends Persona {
    int salario;

    public void setSalario(int salario){
        this.salario = salario;
    }
    public int getSalario(){
        return this.salario;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono() {
        return this.telefono;
    }
}
