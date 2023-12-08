import java.util.*;
import java.util.function.Function;

public class contarPalabras {

    public static void contador(String palabra){
        String[] arrayPalabra = palabra.split(" ");
        List<String> listaPalabras = Arrays.asList(arrayPalabra);

        listaPalabras
                .stream()
                .map(string-> Collections.frequency(listaPalabras,string)+" "+string)
                .distinct()
                .sorted((a,b)-> b.compareTo(a))
                .forEach(elemento -> System.out.println(elemento));






    }
}
