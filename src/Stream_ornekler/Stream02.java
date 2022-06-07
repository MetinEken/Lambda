package Stream_ornekler;

import java.util.ArrayList;
import java.util.List;

public class Stream02 {

    public static void main(String[] args) {


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

        System.out.println("tek sayilarin karesini yazdirdik");
        ciftYazdir(rakamlar);
        System.out.println("");
        System.out.println("karelerin toplami : "+toplam(rakamlar));
    }
public static int toplam(List<Integer> x){

      return   x.stream().filter(b -> b%2!=0 ).map(b -> b*b).reduce(0,(c,y) -> (c+y));
}




    public static void ciftYazdir(List<Integer> l){
        l.stream().filter(x ->x%2!=0).map(x-> x*x).distinct().forEach(Stream02::yazdir);
        // distinct koyacagimiz yer bazen onemlidir.
        // negatif sayilarin karesi alindiginda pozitif sonuc verir,
        // karesinden once -7 ve 7 farkli sayilar iken, karesi alininca ikiside 49 sonucu verir


    }

    public static void yazdir( int x){
        System.out.print(x+" ");
    }
}
