package Stream_ornekler;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Stream;

public class Streamfile {
    public static void main(String[] args) throws IOException {

        String path = "src/Stream_ornekler/mars.txt";
       Stream<String> satirlar = Files.lines(Path.of("src/Stream_ornekler/mars.txt"));

       satirlar.forEach(System.out::println);

        System.out.println("===================");

       // satirlar.map(t-> t.toUpperCase()).forEach(System.out::println);
        // java da file okumak yazdirmak zordur
        // buyuk harf yazdirdik hepsini
       // Files.lines(Paths.get(path)).map(t-> t.toUpperCase()).forEach(System.out::println);
        // ilk satirini buyuk harf yazdiralim.
        Files.lines(Paths.get(path)).map(t-> t.toUpperCase()).limit(1).forEach(System.out::println);

        // 3 ve 4 satiri yazdiralim = skip ilk 2 satir haric, limit= ilk 2 satiri yazdir 3 ve 4
        Files.lines(Paths.get(path)).map(t-> t.toUpperCase()).skip(2).limit(2).forEach(System.out::println);

        // kac tane "bu" var
        System.out.println(" BU kelimesinden kac adet vardir");
        System.out.println( Files.lines(Paths.get(path)).map(t-> t.toLowerCase()).filter(t-> t.contains("bu")).count());
        System.out.println("bu sayma 2 : ==========="); // dogrusu asagidadir
        System.out.println( Files.lines(Paths.get(path)).map(t-> t.toLowerCase().split(" ")).
                flatMap(Arrays::stream).
                filter(t-> t.contains("bu")).count());
        // her satirdaki 1 tane bu yu saydi. 2 adet bu varsa tek saydi.

        // kelime kelime bolum tekrarsiz olarak yazdiralim
        // split ile boldukten sonra arrayliste ekleyerek yazdirabiliriz

       Files.lines(Path.of(path)).
               map(t-> t.toLowerCase().split(" ")).
               flatMap(Arrays::stream).
               distinct().sorted().
               forEach(System.out::println);

    }
}