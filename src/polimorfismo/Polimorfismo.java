package polimorfismo;
public class Polimorfismo {
    public static void main(String[] args) {
        Persona pavaroti = new Persona();
        hacerCantar(pavaroti);
        Canario piolin = new Canario();
        hacerCantar(piolin);
        Burro juan = new Burro();
        hacerCantar(juan);  
    }
    public static void hacerCantar(PuedeCantar cantor) {
        cantor.cantar();
    }
}
