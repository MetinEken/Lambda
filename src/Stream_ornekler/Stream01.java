package Stream_ornekler;

import java.util.ArrayList;
import java.util.List;

public class Stream01 {
    public static void main(String[] args) {
        System.out.println("metin");

        List<Integer> rakamlar = new ArrayList<>();
        rakamlar.add(5);
        rakamlar.add(6);
        rakamlar.add(7);
        rakamlar.add(8);
        rakamlar.add(9);
        rakamlar.add(10);
        rakamlar.add(11);
        rakamlar.add(6);
        rakamlar.add(7);
        rakamlar.add(8);
        rakamlar.add(-1);
        rakamlar.add(-7);
        rakamlar.add(-8);
        System.out.println(rakamlar);
        // once stream yaptik, tek sayilari filtreledik. foreach ile de yazdirdik.
        //method referansi ile yazdirdigimizda classs ismi ile cagirmamiz gerekiyor
        rakamlar.stream().filter(x -> x%2 != 0).forEach(Stream01::yazdir);
        System.out.println("=======CIFT MI=======");
        rakamlar.stream().filter(Stream01::ciftMi).forEach(Stream01::yazdir);
    }

    public static boolean ciftMi(int x){
        return x % 2==0;
    }

    public static void yazdir(Object x){
        // parametre turunu Object yaptim, hepsini yazdirabilir
        System.out.print(x+" ");
    }
}
