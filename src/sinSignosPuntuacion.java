import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sinSignosPuntuacion {

    public static String eliminarPuntuacion(String palabra){
        String[] divisionPalabra = palabra.split("");
        List<String> signosDePuntuacion = new ArrayList<>();
        signosDePuntuacion.add(",");
        signosDePuntuacion.add(".");
        signosDePuntuacion.add("?");
        signosDePuntuacion.add("¿");
        signosDePuntuacion.add("!");
        signosDePuntuacion.add(":");
        signosDePuntuacion.add(";");


        List<String> listaDePalbras = Arrays.asList(divisionPalabra);
        List<String> ListaDePalabrasSinPuntuacion = listaDePalbras
                .stream()
                .map(string ->{
                    if(signosDePuntuacion.contains(string)){
                        return "";
                    }else{
                        return string;
                    }

                })
                .toList();
        return String.join("", ListaDePalabrasSinPuntuacion);
    }
}
