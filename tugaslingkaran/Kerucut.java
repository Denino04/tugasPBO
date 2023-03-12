/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaslingkaran;

/**
 *
 * @author ASUS ROG
 */
public class Kerucut extends Lingkaran {
    public double Tinggi = 0;
    public double Miring = 0;
    public double luasSelimut = 0;
    public double luaskerucut = 0;
    public double volkerucut = 0;
    
    public double hitungluaskerucut (String baru, double t, double r)
    {
        this.Tinggi = t;
        Miring = Math.sqrt(Math.pow(r, 2)+Math.pow(t, 2));
        if(("y".equals(baru))||("Y".equals(baru)))
        {
            luasSelimut = Lingkaran.PI*r*Miring;
            luaskerucut = super.menghitungluaslingkaran(r)+luasSelimut;
        }
        else
        {
            luasSelimut = Lingkaran.PI*r*Miring;
            luaskerucut = super.luasLingkaran+luasSelimut;
        }
        return luaskerucut;
    }
    
    public double hitungvolumekerucut (String baru, double t, double r)
    {
        this.Tinggi = t;
        if(("y".equals(baru))||("Y".equals(baru)))
        {
            volkerucut = 0.333*super.menghitungluaslingkaran(r)*this.Tinggi;
        }
        else
        {
            volkerucut = 0.333*super.luasLingkaran*this.Tinggi;
        }
        return volkerucut;
    }
    
}
