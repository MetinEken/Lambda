package Stream_ornekler;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Reduce01 {
    public static void main(String[] args) {
        List<Integer> rakamlar = new ArrayList<>();
        rakamlar.add(5);
        rakamlar.add(6);
        rakamlar.add(7);
        rakamlar.add(8);
        rakamlar.add(9);
        rakamlar.add(9);
        rakamlar.add(9);
        rakamlar.add(10);
        rakamlar.add(11);
        rakamlar.add(60 );
        rakamlar.add(7);
        rakamlar.add(8);
        rakamlar.add(-1);
        rakamlar.add(-7);
        rakamlar.add(-8);
        System.out.println("en buyuk");

        System.out.println(enBuyuk(rakamlar));

        dokuzSay(rakamlar);

        List<Integer> negatifler = negatifListe(rakamlar);
        System.out.println(negatifler);

    }

    public static int enBuyuk(List<Integer> l){
        int sayi= l.stream().reduce(0, (x,y) -> x>y? x:y);
        return sayi;
    }

    public static void dokuzSay(List<Integer> l){
        System.out.println("9 ");
        System.out.println(l.stream().filter(x-> x==9).count());
    }

    public static List<Integer> negatifListe(List<Integer> l){
        return l.stream().filter(x -> x<0).collect(Collectors.toList());
    }
}
