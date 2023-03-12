/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaslingkaran;

/**
 *
 * @author ASUS ROG
 */
public class Lingkaran {
    public static final double PI=3.14159265359;
    public double kelilingLingkaran;
    public double luasLingkaran;
    public double r=5;
    
    public double menghitungkelilinglingkaran(double r)
    {
        kelilingLingkaran = 2*PI*r;
        return kelilingLingkaran;
    }
    
    public double menghitungluaslingkaran(double r)
    {
        luasLingkaran = PI*r*r;
        return luasLingkaran;
    }
}
