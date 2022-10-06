public class Main {
    public static void main(String[] args) {

        int numeroIf = 1;

        if (numeroIf == 0) {
            System.out.println("La variable es igual a 0");
        } else if (numeroIf < 0) {
            System.out.println("La variable es menor a 0");
        } else {
            System.out.println("La variable es mayor a 0");
        }

        int numeroWhile = 0;
        while (numeroWhile < 3) {
           System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }

        do {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile +1;
        } while (numeroWhile < 1);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor +1){
            System.out.println(numeroFor);
        }

        String estacion = "PRIMAVERA";
        switch (estacion){
            case "VERANO":
                System.out.println("Es verano");
                break;
            case "INVIERNO":
                System.out.println("Es invierno");
                break;
            case "OTOÑO":
                System.out.println("Es otoño");
                break;
            case "PRIMAVERA":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("No pertenece a ninguna estación");
        }

    }
}
