import java.util.Scanner;

public class vucutkitleindeksi {
    public static void main(String[] args) {
        Scanner ımp=new Scanner(System.in);
        double boy ,kilo;
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz=");
        boy= ımp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz=");
        kilo=ımp.nextDouble();

        double vucutkitleindeksi=kilo/(boy*boy);
        System.out.print("Vücut kitle indeksiniz="+vucutkitleindeksi);
    }
}
