/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaslingkaran;

/**
 *
 * @author ASUS ROG
 */
public class Tabung extends Lingkaran {
    public double Tinggi = 0;
    public double luasTabung = 0;
    public double volTabung = 0;
    
    public double hitungluastabung (String baru, double t, double r)
    {
        this.Tinggi = t;
        if(("y".equals(baru))||("Y".equals(baru)))
        {
            luasTabung = super.menghitungkelilinglingkaran(r)*this.Tinggi;
        }
        else
        {
            luasTabung = super.kelilingLingkaran*this.Tinggi;
        }
        return luasTabung;
    }
    
    public double hitungvolumetabung (String baru, double t, double r)
    {
        this.Tinggi = t;
        if(("y".equals(baru))||("Y".equals(baru)))
        {
            volTabung = super.menghitungluaslingkaran(r)*this.Tinggi;
        }
        else
        {
            volTabung = super.luasLingkaran*this.Tinggi;
        }
        return volTabung;
    }
}
