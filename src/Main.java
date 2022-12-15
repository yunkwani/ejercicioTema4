public class Main {
    public static void main(String[] args) {

        // -- Condicion If
        System.out.println();
        System.out.println("Condicion If");
        int numeroIf = -1;

        if (numeroIf > 0) {
            System.out.println("Es positivo");
        }
        else if (numeroIf < 0){
            System.out.println("Es negativo");
        }
        else if (numeroIf == 0){
            System.out.println("Es igual a 0");
        }

        //--- Bucle While ---//

        System.out.println();
        System.out.println("Bucle While");
        int numeroWhile = 0;

        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        //--- Do While

        System.out.println();
        System.out.println("do while");
        int numeroWhile2 = 0;
        do {
            System.out.println(numeroWhile2);
            numeroWhile2++;

        } while (numeroWhile2 < 3);

        //--- Bucle For
        System.out.println();
        System.out.println("bucle for");
        for (int numeroFor=0; numeroFor<=3; numeroFor++){
            System.out.println(numeroFor);
        }

        //--- Switch Case

        System.out.println();
        System.out.println("Switch Case");

        String estacion = "INVIERNO";

        switch (estacion){
            case "INVERNO":
                System.out.println("Has elegido INVIERNO");
                break;
            case "PRIMAVERA":
                System.out.println("Has elegido PRIMAVERA");
                break;
            case "VERANO":
                System.out.println("Has elegido VERANO");
                break;
            case "OTOÑO":
                System.out.println("Has elegido OTOÑO");
                break;
            case "INVIERNO":
                System.out.println("Has elegido INVIERNO");
                break;
            default:
                System.out.println("Elección incorrecta");
        }
    }
}