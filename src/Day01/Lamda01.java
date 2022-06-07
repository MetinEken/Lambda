package Day01;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;

public class Lamda01 {
    public static void main(String[] args) {
        System.out.println("hello world");

        System.out.println(8*8);

        List<Integer> liste = Arrays.asList(1,2,3,4,5);

        liste.forEach(x -> System.out.print(x+" "));

    // listenin elemanlarini 2 artirarak yazdiralim
        System.out.println("");
        liste.forEach(x -> System.out.print(x+2+" "));

        // birden fazla fonksiyon yazacaksak, {} icine almaliyiz

        liste.forEach(x -> {
            int miktar=2;
            System.out.print(x + miktar + " ");

        });
        System.out.println("");
    // METHOD REFERANSI KULLANIMI , ::
        System.out.println("method referansi ile yazdirma...");
        liste.forEach(System.out::println);

        //11111
        System.out.println("method olusturarak yeni yazdirma...");
        liste.forEach(Lamda01::yazdir);




    }
    // method olusturup yukarda cagiracagiz 11111
    public static void yazdir(int x){
        System.out.print(x + " ");


    }
}
