import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 * - Exercici 4
 *  Afegeix la funcionalitat de llegir qualsevol fitxer TXT i mostra el seu contingut per consola.
 *  - Exercici 5
 *  Ara el programa ha de serialitzar un Objecte Java a un fitxer .ser i després l’ha de desserialitzar.
 */
public class Main {
    public static void main(String[] args){

        if((args.length != 0) && args[0].toLowerCase().endsWith(".txt")) {
            // Llegim un fitxer txt
            File fitxerInicial = new File(args[0]);
            LectorFitxerTxt.llegirTxt(fitxerInicial);

        }else{

            String objStr="Un objecte/cadena a serialitzar";
            int[] arrayEntersPrimitius={1,2,3,4,5,6,7,8,9,0};

            System.out.println("\nSerialitzant objectes.....");
            System.out.println("   ...creant arxiu provaAmbStr.ser");
            System.out.println("   ...provaAmbArrayDeInt.ser");

            // Exercici 5
            // Ara el programa ha de serialitzar un Objecte Java a un fitxer .ser i després l’ha de desserialitzar.
            UtilsObjecte.serialitzarObjecte(objStr, "provaAmbStr.ser" );

            UtilsObjecte.serialitzarObjecte(arrayEntersPrimitius, "provaAmbArrayDeInt.ser" );

            System.out.println("\nDeserialitzant els arxius creats .....");
            File fitxer_1 = new File("provaAmbStr.ser");
            System.out.println((String) UtilsObjecte.deserialitzarObjecte(fitxer_1));

            File fitxer_2 = new File("provaAmbArrayDeInt.ser");
            System.out.println(Arrays.toString((int[]) UtilsObjecte.deserialitzarObjecte(fitxer_2)));

        }

    }

}
