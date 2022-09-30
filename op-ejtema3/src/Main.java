public class Main {
    public static void main(String[] args) {
    int total;
    total = suma (10, 50, 4);
    System.out.println(total);

    Coche miCoche = new Coche();
    miCoche.AgregarPuerta();
    miCoche.AgregarPuerta();
    System.out.println(miCoche.puertas);
    }
    public static int suma(int a, int b, int c){return a + b + c;}

}
class Coche{
  public int puertas = 0;

  public void AgregarPuerta(){
      this.puertas++;
  }

}

