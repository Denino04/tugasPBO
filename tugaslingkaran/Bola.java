/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaslingkaran;

/**
 *
 * @author ASUS ROG
 */
public class Bola extends Lingkaran {
    public double luasbola;
    public double volbola;
    
    public double hitungluasbola(String baru, double r)
    {
        if(("y".equals(baru))||("Y".equals(baru)))
        {
            luasbola = super.menghitungluaslingkaran(r)*4;
        }
        else
        {
            luasbola = super.luasLingkaran*4;
        }
        return luasbola;
    }
    
    public double hitungvolumebola (String baru, double r)
    {
        if(("y".equals(baru))||("Y".equals(baru)))
        {
            volbola = 1.333*super.menghitungluaslingkaran(r)*r;
        }
        else
        {
            volbola = 1.333*super.luasLingkaran*r;
        }
        return volbola;
    }
}
