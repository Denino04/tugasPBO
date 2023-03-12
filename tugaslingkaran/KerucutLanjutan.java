/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaslingkaran;

/**
 *
 * @author ASUS ROG
 */
public class KerucutLanjutan extends Kerucut{
    public double Tinggipancung;
    public double Tinggiselisih;
    public double Miringpancung;
    public double luasterpancung;
    public double volterpancung;
    
    public double hitungluasterpancung (String baru, double t, double tt, double R, double r)
    {
        this.Tinggi = t;
        this.Tinggipancung = tt;
        Miring = Math.sqrt(Math.pow(R, 2)+Math.pow(t, 2));
        Miringpancung = Math.sqrt(Math.pow(r, 2)+Math.pow(tt, 2));
        luasSelimut = Lingkaran.PI*(Miring - Miringpancung)*(R+r);
        luasterpancung = super.menghitungluaslingkaran(R)+super.menghitungluaslingkaran(r)+luasSelimut;
        return luasterpancung;
    }
    
    public double hitungvolumeterpancung (String baru, double t, double tt, double R, double r)
    {
        this.Tinggi = t;
        this.Tinggipancung = tt;
        Tinggiselisih = t-tt;
        volterpancung = super.hitungvolumekerucut(baru, Tinggiselisih, r)+super.hitungvolumekerucut(baru, Tinggiselisih, R)+(0.333*Lingkaran.PI*r*R*Tinggiselisih);
        return volterpancung;
    }
}
