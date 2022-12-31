/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jenisroti;

import adonan.AdonanPizza;
import fillingandtopping.Topping;
import java.lang.Math;

/**
 *
 * @author Lenovo
 */
public class Pizza extends AdonanPizza implements Topping{
private int beratAdonanPizzaPcs = 190;
private double beratTepungTeriguPizzaPcs = beratTepungTeriguPizza / (totalBeratAdonanPizza/beratAdonanPizzaPcs);
private double beratGulaPasirPizzaPcs = beratGulaPasirPizza / (totalBeratAdonanPizza/beratAdonanPizzaPcs);
private double beratButterPizzaPcs = beratButterPizza / (totalBeratAdonanPizza/beratAdonanPizzaPcs);
private double beratRagiPizzaPcs = beratRagiPizza / (totalBeratAdonanPizza/beratAdonanPizzaPcs);
private double beratSusuBubukPizzaPcs = beratSusuBubukPizza / (totalBeratAdonanPizza/beratAdonanPizzaPcs);
private double beratSusuCairPizzaPcs = beratSusuCairPizza / (totalBeratAdonanPizza/beratAdonanPizzaPcs);
private double beratTelurPizzaPcs = beratTelurPizza / (totalBeratAdonanPizza/beratAdonanPizzaPcs);
private double beratEsBatuPizzaPcs = beratEsBatuPizza / (totalBeratAdonanPizza/beratAdonanPizzaPcs);
private double hargaTepungTeriguPizzaPcs = hargaTepungTeriguPizza / (totalBeratAdonanPizza/beratAdonanPizzaPcs);
private double hargaGulaPasirPizzaPcs = hargaGulaPasirPizza / (totalBeratAdonanPizza/beratAdonanPizzaPcs);
private double hargaButterPizzaPcs = hargaButterPizza / (totalBeratAdonanPizza/beratAdonanPizzaPcs);
private double hargaRagiPizzaPcs = hargaRagiPizza / (totalBeratAdonanPizza/beratAdonanPizzaPcs);
private double hargaSusuBubukPizzaPcs = hargaSusuBubukPizza / (totalBeratAdonanPizza/beratAdonanPizzaPcs);
private double hargaSusuCairPizzaPcs = hargaSusuCairPizza / (totalBeratAdonanPizza/beratAdonanPizzaPcs);
private double hargaTelurPizzaPcs = hargaTelurPizza / (totalBeratAdonanPizza/beratAdonanPizzaPcs);
private double hargaEsBatuPizzaPcs = hargaEsBatuPizza / (totalBeratAdonanPizza/beratAdonanPizzaPcs);

    @Override
    public double toppingKeju(double x) {
        double hargaToppingKeju = (x/beratKeju)*hargaKeju;
        return hargaToppingKeju;
    }

    @Override
    public double toppingCoklat(double x) {
        double hargaToppingCoklat = (x/beratCoklat)*hargaCoklat;
        return hargaToppingCoklat;
    }

    @Override
    public double toppingKrimVanilla(double x) {
        double hargaToppingKrimVanilla = (x/beratKrimVanilla) * hargaKrimVanilla;
        return hargaToppingKrimVanilla;
    }

    @Override
    public double toppingSelaiRedBean(double x) {
        double hargaToppingSelaiRedBean = (x/beratSelaiRedBean) * hargaSelaiRedBean;
        return hargaToppingSelaiRedBean;
    }

    @Override
    public double toppingSosis(double x) {
        double hargaToppingSosis = (x/beratSosis) * hargaSosis;
        return hargaToppingSosis;
    }

    @Override
    public double toppingSmokedBeef(double x) {
        double hargaToppingSmokedBeef = (x/beratSmokedBeef) * hargaSmokedBeef;
        return hargaToppingSmokedBeef;
    }

    @Override
    public double toppingBawangBombay(double x) {
        double hargaToppingBawangBombay = (x/beratBawangBombay) * hargaBawangBombay;
        return hargaToppingBawangBombay;
    }
    
    public void varian1(int x){
        System.out.println("Pizza varian 1 sebanyak " + x + " pcs");
        System.out.println("=======================================");
        System.out.println("Bahan Adonan : ");
        System.out.println("Tepung Terigu " + x*beratTepungTeriguPizzaPcs + " gram seharga Rp " + x*hargaTepungTeriguPizzaPcs);
        System.out.println("Gula Pasir " + x*beratGulaPasirPizzaPcs + " gram seharga Rp " + x*hargaGulaPasirPizzaPcs);
        System.out.println("Butter " + x*beratButterPizzaPcs + " gram seharga Rp " + x*hargaButterPizzaPcs);
        System.out.println("Ragi " + x*beratRagiPizzaPcs + " gram seharga Rp " + x*hargaRagiPizzaPcs);
        System.out.println("Susu Bubuk " + x*beratSusuBubukPizzaPcs + " gram seharga Rp " + x*hargaSusuBubukPizzaPcs);
        System.out.println("Susu Cair " + x*beratSusuCairPizzaPcs + " gram seharga Rp " + x*hargaSusuCairPizzaPcs);
        System.out.println("Telur " + x*beratTelurPizzaPcs + " gram seharga Rp " + x*hargaTelurPizzaPcs);
        System.out.println("EsBatu " + x*beratEsBatuPizzaPcs + " gram seharga Rp " + x*hargaEsBatuPizzaPcs);
        System.out.println("=======================================");
        System.out.println("Topping : ");
        System.out.println("Keju "+ x*30 + " gram seharga Rp " + x*this.toppingKeju(30));
        System.out.println("Sosis "+ x*50 +" gram seharga Rp " + x*this.toppingSosis(50));
        System.out.println("SmokedBeef "+ x*50 +" gram seharga Rp " + x*this.toppingSmokedBeef(50));
        System.out.println("Bawang Bombay "+ x*30 + " gram seharga Rp " + x*this.toppingBawangBombay(30));
        System.out.println("=======================================");
        System.out.println("Harga per pcs : Rp " + Math.round((150/100)*(hargaTepungTeriguPizzaPcs + hargaGulaPasirPizzaPcs + hargaButterPizzaPcs + hargaRagiPizzaPcs + hargaSusuBubukPizzaPcs + hargaSusuCairPizzaPcs + hargaTelurPizzaPcs + hargaEsBatuPizzaPcs + this.toppingKeju(30) + this.toppingSosis(50) + this.toppingSmokedBeef(50) + this.toppingBawangBombay(30))));
        System.out.println("Harga Total : Rp " + Math.round(x * ((150/100)*(hargaTepungTeriguPizzaPcs + hargaGulaPasirPizzaPcs + hargaButterPizzaPcs + hargaRagiPizzaPcs + hargaSusuBubukPizzaPcs + hargaSusuCairPizzaPcs + hargaTelurPizzaPcs + hargaEsBatuPizzaPcs + this.toppingKeju(30) + this.toppingSosis(50) + this.toppingSmokedBeef(50) + this.toppingBawangBombay(30)))));
    }
}
