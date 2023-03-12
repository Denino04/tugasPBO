/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaslingkaran;

/**
 *
 * @author ASUS ROG
 */
import java.util.*;
public class TugasLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("r = ");
          double r = sc.nextDouble();
          Lingkaran lingkaran = new Lingkaran();
          lingkaran.menghitungkelilinglingkaran(r);
          lingkaran.menghitungluaslingkaran(r);
          System.out.println(lingkaran.kelilingLingkaran);
          System.out.println(lingkaran.luasLingkaran);
        
//        System.out.print("Input Baru? ");
//        String Tbaru = sc.next();
//        if(("y".equals(Tbaru))||("Y".equals(Tbaru)))
//        {
//            System.out.print("r = ");
//            double rt = sc.nextDouble();
//            System.out.print("t = ");
//            double t = sc.nextDouble();
//            Tabung tabung = new Tabung();
//            tabung.hitungluastabung(Tbaru, t, r);
//            tabung.hitungvolumetabung(Tbaru, t, r);
//            System.out.println(tabung.luasTabung);
//            System.out.println(tabung.volTabung);
//        }
//        else
//        {
//            System.out.print("t = ");
//            double t = sc.nextDouble();
//            Tabung tabung = new Tabung();
//            System.out.println(tabung.hitungluastabung(Tbaru, t, r));
//            System.out.println(tabung.hitungvolumetabung(Tbaru, t, r));
//        }
//        
//        System.out.println("");
//        System.out.print("Input Baru? ");
//        String Kbaru = sc.next();
//        if(("y".equals(Kbaru))||("Y".equals(Kbaru)))
//        {
//            System.out.print("r = ");
//            double rk = sc.nextDouble();
//            System.out.print("t = ");
//            double t = sc.nextDouble();
//            Kerucut kerucut = new Kerucut();
//            System.out.println(kerucut.hitungluaskerucut(Kbaru, t, rk));
//            System.out.println(kerucut.hitungvolumekerucut(Kbaru, t, rk));
//        }
//        else
//        {
//            System.out.print("t = ");
//            double t = sc.nextDouble();
//            Kerucut kerucut = new Kerucut();
//            System.out.println(kerucut.hitungluaskerucut(Kbaru, t, r));
//            System.out.println(kerucut.hitungvolumekerucut(Kbaru, t, r));
//        }
        
//        System.out.println("");
//        System.out.print("Input Baru? ");
//        String Bbaru = sc.next();
//        if(("y".equals(Bbaru))||("Y".equals(Bbaru)))
//        {
//            System.out.print("r = ");
//            double rb = sc.nextDouble();
//            Bola bola = new Bola();
//            System.out.println(bola.hitungluasbola(Bbaru, rb));
//            System.out.println(bola.hitungvolumebola(Bbaru, rb));
//        }
//        else
//        {
//            Bola bola = new Bola();
//            System.out.println(bola.hitungluasbola(Bbaru, r));
//            System.out.println(bola.hitungvolumebola(Bbaru, r));
//        }
        
        String Pbaru = "y";
        System.out.print("t = ");
        double t = sc.nextDouble();
        System.out.print("tt = ");
        double tt = sc.nextDouble();
        System.out.print("R = ");
        double R = sc.nextDouble();
        System.out.print("r = ");
        double rT = sc.nextDouble();
        KerucutLanjutan terpancung =new KerucutLanjutan();
        System.out.println(terpancung.hitungluasterpancung(Pbaru, t, tt, R, rT));
        System.out.println(terpancung.hitungvolumeterpancung(Pbaru, t, tt, R, rT));
    }
    
}
