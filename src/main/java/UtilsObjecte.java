import java.io.*;

public class UtilsObjecte {

    public static void serialitzarObjecte(Object objeto, String nombreArchivo){
        try (FileOutputStream fos = new FileOutputStream(nombreArchivo);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(objeto);
        } catch (IOException e) {
            System.out.println("Error serialitzant l'objecte. ");
            System.out.println(e.getMessage());
        }
    }

    public static Object deserialitzarObjecte(File fitxerInicial) {
        Object obj = null;
        try (FileInputStream fis = new FileInputStream(fitxerInicial);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            obj = ois.readObject();
        } catch (IOException e) {
            System.out.println("Error serialitzant l'objecte. ");
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error serialitzant l'objecte. ");
            System.out.println(e.getMessage());
        }
        return obj;
    }

}
