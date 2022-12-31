/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jenisroti;

import adonan.AdonanRotiManis;
import fillingandtopping.Filling;
import fillingandtopping.Topping;
import java.lang.Math;

/**
 *
 * @author Lenovo
 */
public class RotiManis extends AdonanRotiManis implements Filling,Topping{
    private int beratAdonanRotiManisPcs = 50;
    private double beratTepungTeriguRotiManisPcs = beratTepungTeriguRotiManis / (totalBeratAdonanRotiManis/beratAdonanRotiManisPcs);
    private double beratGulaPasirRotiManisPcs = beratGulaPasirRotiManis / (totalBeratAdonanRotiManis/beratAdonanRotiManisPcs);
    private double beratButterRotiManisPcs = beratButterRotiManis / (totalBeratAdonanRotiManis/beratAdonanRotiManisPcs);
    private double beratRagiRotiManisPcs = beratRagiRotiManis / (totalBeratAdonanRotiManis/beratAdonanRotiManisPcs);
    private double beratSusuBubukRotiManisPcs = beratSusuBubukRotiManis / (totalBeratAdonanRotiManis/beratAdonanRotiManisPcs);
    private double beratSusuCairRotiManisPcs = beratSusuCairRotiManis / (totalBeratAdonanRotiManis/beratAdonanRotiManisPcs);
    private double beratTelurRotiManisPcs = beratTelurRotiManis / (totalBeratAdonanRotiManis/beratAdonanRotiManisPcs);
    private double beratEsBatuRotiManisPcs = beratEsBatuRotiManis / (totalBeratAdonanRotiManis/beratAdonanRotiManisPcs);
    private double hargaTepungTeriguRotiManisPcs = hargaTepungTeriguRotiManis / (totalBeratAdonanRotiManis/beratAdonanRotiManisPcs);
    private double hargaGulaPasirRotiManisPcs = hargaGulaPasirRotiManis / (totalBeratAdonanRotiManis/beratAdonanRotiManisPcs);
    private double hargaButterRotiManisPcs = hargaButterRotiManis / (totalBeratAdonanRotiManis/beratAdonanRotiManisPcs);
    private double hargaRagiRotiManisPcs = hargaRagiRotiManis / (totalBeratAdonanRotiManis/beratAdonanRotiManisPcs);
    private double hargaSusuBubukRotiManisPcs = hargaSusuBubukRotiManis / (totalBeratAdonanRotiManis/beratAdonanRotiManisPcs);
    private double hargaSusuCairRotiManisPcs = hargaSusuCairRotiManis / (totalBeratAdonanRotiManis/beratAdonanRotiManisPcs);
    private double hargaTelurRotiManisPcs = hargaTelurRotiManis / (totalBeratAdonanRotiManis/beratAdonanRotiManisPcs);
    private double hargaEsBatuRotiManisPcs = hargaEsBatuRotiManis / (totalBeratAdonanRotiManis/beratAdonanRotiManisPcs);
    
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
        double hargaToppingKrimVanilla = (x/beratKrimVanilla)*hargaKrimVanilla;
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
    
    @Override
    public double fillingKeju(double x) {
        double hargaFillingKeju = (x/beratKeju)*hargaKeju;
        return hargaFillingKeju;
    }

    @Override
    public double fillingCoklat(double x) {
        double hargaFillingCoklat = (x/beratCoklat)*hargaCoklat;
        return hargaFillingCoklat;
    }

    @Override
    public double fillingKrimVanilla(double x) {
        double hargaFillingKrimVanilla = (x/beratKrimVanilla)*hargaKrimVanilla;
        return hargaFillingKrimVanilla;
    }

    @Override
    public double fillingSelaiRedBean(double x) {
        double hargaFillingSelaiRedBean = (x/beratSelaiRedBean) * hargaSelaiRedBean;
        return hargaFillingSelaiRedBean;
    }

    @Override
    public double fillingSosis(double x) {
        double hargaFillingSosis = (x/beratSosis) * hargaSosis;
        return hargaFillingSosis;
    }

    @Override
    public double fillingSmokedBeef(double x) {
        double hargaFillingSmokedBeef = (x/beratSmokedBeef) * hargaSmokedBeef;
        return hargaFillingSmokedBeef;
    }

    @Override
    public double fillingBawangBombay(double x) {
        double hargaFillingBawangBombay = (x/beratBawangBombay) * hargaBawangBombay;
        return hargaFillingBawangBombay;
    }
    
    public void varian1(int x){
        System.out.println("RotiManis varian 1 sebanyak " + x + " pcs");
        System.out.println("=======================================");
        System.out.println("Bahan Adonan : ");
        System.out.println("Tepung Terigu " + x*beratTepungTeriguRotiManisPcs + " gram seharga Rp " + x*hargaTepungTeriguRotiManisPcs);
        System.out.println("Gula Pasir " + x*beratGulaPasirRotiManisPcs + " gram seharga Rp " + x*hargaGulaPasirRotiManisPcs);
        System.out.println("Butter " + x*beratButterRotiManisPcs + " gram seharga Rp " + x*hargaButterRotiManisPcs);
        System.out.println("Ragi " + x*beratRagiRotiManisPcs + " gram seharga Rp " + x*hargaRagiRotiManisPcs);
        System.out.println("Susu Bubuk " + x*beratSusuBubukRotiManisPcs + " gram seharga Rp " + x*hargaSusuBubukRotiManisPcs);
        System.out.println("Susu Cair " + x*beratSusuCairRotiManisPcs + " gram seharga Rp " + x*hargaSusuCairRotiManisPcs);
        System.out.println("Telur " + x*beratTelurRotiManisPcs + " gram seharga Rp " + x*hargaTelurRotiManisPcs);
        System.out.println("EsBatu " + x*beratEsBatuRotiManisPcs + " gram seharga Rp " + x*hargaEsBatuRotiManisPcs);
        System.out.println("=======================================");
        System.out.println("Filling : ");
        System.out.println("Keju 5 gram seharga Rp " + this.fillingKeju(5));
        System.out.println("Coklat 5 gram seharga Rp " + this.fillingCoklat(5));
        System.out.println("=======================================");
        System.out.println("Topping : ");
        System.out.println("Coklat 5 gram seharga Rp " + this.toppingCoklat(5));
        System.out.println("=======================================");
        System.out.println("Harga per pcs : Rp " + Math.round((150/100)*(hargaTepungTeriguRotiManisPcs + hargaGulaPasirRotiManisPcs + hargaButterRotiManisPcs + hargaRagiRotiManisPcs + hargaSusuBubukRotiManisPcs + hargaSusuCairRotiManisPcs + hargaTelurRotiManisPcs + hargaEsBatuRotiManisPcs + this.toppingKeju(5) + this.toppingCoklat(5) + this.toppingCoklat(5))));
        System.out.println("Harga Total : Rp " + Math.round(x * ((150/100)*(hargaTepungTeriguRotiManisPcs + hargaGulaPasirRotiManisPcs + hargaButterRotiManisPcs + hargaRagiRotiManisPcs + hargaSusuBubukRotiManisPcs + hargaSusuCairRotiManisPcs + hargaTelurRotiManisPcs + hargaEsBatuRotiManisPcs + this.toppingKeju(5) + this.toppingCoklat(5) + this.toppingCoklat(5)))));
    }

    public void varian2(int x){
        System.out.println("RotiManis varian 2 sebanyak " + x + " pcs");
        System.out.println("=======================================");
        System.out.println("Bahan Adonan : ");
        System.out.println("Tepung Terigu " + x*beratTepungTeriguRotiManisPcs + " gram seharga Rp " + x*hargaTepungTeriguRotiManisPcs);
        System.out.println("Gula Pasir " + x*beratGulaPasirRotiManisPcs + " gram seharga Rp " + x*hargaGulaPasirRotiManisPcs);
        System.out.println("Butter " + x*beratButterRotiManisPcs + " gram seharga Rp " + x*hargaButterRotiManisPcs);
        System.out.println("Ragi " + x*beratRagiRotiManisPcs + " gram seharga Rp " + x*hargaRagiRotiManisPcs);
        System.out.println("Susu Bubuk " + x*beratSusuBubukRotiManisPcs + " gram seharga Rp " + x*hargaSusuBubukRotiManisPcs);
        System.out.println("Susu Cair " + x*beratSusuCairRotiManisPcs + " gram seharga Rp " + x*hargaSusuCairRotiManisPcs);
        System.out.println("Telur " + x*beratTelurRotiManisPcs + " gram seharga Rp " + x*hargaTelurRotiManisPcs);
        System.out.println("EsBatu " + x*beratEsBatuRotiManisPcs + " gram seharga Rp " + x*hargaEsBatuRotiManisPcs);
        System.out.println("=======================================");
        System.out.println("Filling : ");
        System.out.println("Red Bean 10  gram seharga Rp " + this.fillingSelaiRedBean(10));
        System.out.println("=======================================");
        System.out.println("Topping : ");
        System.out.println("Krim Vanilla 5 gram seharga Rp " + this.toppingKrimVanilla(5));
        System.out.println("=======================================");
        System.out.println("Harga per pcs : Rp " + Math.round((150/100)*(hargaTepungTeriguRotiManisPcs + hargaGulaPasirRotiManisPcs + hargaButterRotiManisPcs + hargaRagiRotiManisPcs + hargaSusuBubukRotiManisPcs + hargaSusuCairRotiManisPcs + hargaTelurRotiManisPcs + hargaEsBatuRotiManisPcs + this.toppingSelaiRedBean(10) + this.toppingKrimVanilla(5))));
        System.out.println("Harga Total : Rp " + Math.round(x * ((150/100)*(hargaTepungTeriguRotiManisPcs + hargaGulaPasirRotiManisPcs + hargaButterRotiManisPcs + hargaRagiRotiManisPcs + hargaSusuBubukRotiManisPcs + hargaSusuCairRotiManisPcs + hargaTelurRotiManisPcs + hargaEsBatuRotiManisPcs + this.toppingSelaiRedBean(10) + this.toppingKrimVanilla(5)))));
    }

    public void varian3(int x){
        System.out.println("RotiManis varian 3 sebanyak " + x + " pcs");
        System.out.println("=======================================");
        System.out.println("Bahan Adonan : ");
        System.out.println("Tepung Terigu " + x*beratTepungTeriguRotiManisPcs + " gram seharga Rp " + x*hargaTepungTeriguRotiManisPcs);
        System.out.println("Gula Pasir " + x*beratGulaPasirRotiManisPcs + " gram seharga Rp " + x*hargaGulaPasirRotiManisPcs);
        System.out.println("Butter " + x*beratButterRotiManisPcs + " gram seharga Rp " + x*hargaButterRotiManisPcs);
        System.out.println("Ragi " + x*beratRagiRotiManisPcs + " gram seharga Rp " + x*hargaRagiRotiManisPcs);
        System.out.println("Susu Bubuk " + x*beratSusuBubukRotiManisPcs + " gram seharga Rp " + x*hargaSusuBubukRotiManisPcs);
        System.out.println("Susu Cair " + x*beratSusuCairRotiManisPcs + " gram seharga Rp " + x*hargaSusuCairRotiManisPcs);
        System.out.println("Telur " + x*beratTelurRotiManisPcs + " gram seharga Rp " + x*hargaTelurRotiManisPcs);
        System.out.println("EsBatu " + x*beratEsBatuRotiManisPcs + " gram seharga Rp " + x*hargaEsBatuRotiManisPcs);
        System.out.println("=======================================");
        System.out.println("Filling : ");
        System.out.println("Keju 10  gram seharga Rp " + this.fillingKeju(10));
        System.out.println("Sosis 10  gram seharga Rp " + this.fillingSosis(10));
        System.out.println("=======================================");
        System.out.println("Harga per pcs : Rp " + Math.round((150/100)*(hargaTepungTeriguRotiManisPcs + hargaGulaPasirRotiManisPcs + hargaButterRotiManisPcs + hargaRagiRotiManisPcs + hargaSusuBubukRotiManisPcs + hargaSusuCairRotiManisPcs + hargaTelurRotiManisPcs + hargaEsBatuRotiManisPcs + this.toppingKeju(10) + this.toppingSosis(10))));
        System.out.println("Harga Total : Rp " + Math.round(x * ((150/100)*(hargaTepungTeriguRotiManisPcs + hargaGulaPasirRotiManisPcs + hargaButterRotiManisPcs + hargaRagiRotiManisPcs + hargaSusuBubukRotiManisPcs + hargaSusuCairRotiManisPcs + hargaTelurRotiManisPcs + hargaEsBatuRotiManisPcs + this.toppingKeju(10) + this.toppingSosis(10)))));
    }
}
