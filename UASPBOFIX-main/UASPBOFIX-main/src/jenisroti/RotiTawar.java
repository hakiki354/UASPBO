/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jenisroti;

import adonan.AdonanRotiTawar;
import fillingandtopping.Filling;
import java.lang.Math;
/**
 *
 * @author Lenovo
 */

public class RotiTawar extends AdonanRotiTawar implements Filling{
private int beratAdonanRotiTawarPcs = 400;
private double beratTepungTeriguRotiTawarPcs = beratTepungTeriguRotiTawar / (totalBeratAdonanRotiTawar/beratAdonanRotiTawarPcs);
private double beratGulaPasirRotiTawarPcs = beratGulaPasirRotiTawar / (totalBeratAdonanRotiTawar/beratAdonanRotiTawarPcs);
private double beratButterRotiTawarPcs = beratButterRotiTawar / (totalBeratAdonanRotiTawar/beratAdonanRotiTawarPcs);
private double beratRagiRotiTawarPcs = beratRagiRotiTawar / (totalBeratAdonanRotiTawar/beratAdonanRotiTawarPcs);
private double beratSusuBubukRotiTawarPcs = beratSusuBubukRotiTawar / (totalBeratAdonanRotiTawar/beratAdonanRotiTawarPcs);
private double beratSusuCairRotiTawarPcs = beratSusuCairRotiTawar / (totalBeratAdonanRotiTawar/beratAdonanRotiTawarPcs);
private double beratTelurRotiTawarPcs = beratTelurRotiTawar / (totalBeratAdonanRotiTawar/beratAdonanRotiTawarPcs);
private double beratEsBatuRotiTawarPcs = beratEsBatuRotiTawar / (totalBeratAdonanRotiTawar/beratAdonanRotiTawarPcs);
private double hargaTepungTeriguRotiTawarPcs = hargaTepungTeriguRotiTawar / (totalBeratAdonanRotiTawar/beratAdonanRotiTawarPcs);
private double hargaGulaPasirRotiTawarPcs = hargaGulaPasirRotiTawar / (totalBeratAdonanRotiTawar/beratAdonanRotiTawarPcs);
private double hargaButterRotiTawarPcs = hargaButterRotiTawar / (totalBeratAdonanRotiTawar/beratAdonanRotiTawarPcs);
private double hargaRagiRotiTawarPcs = hargaRagiRotiTawar / (totalBeratAdonanRotiTawar/beratAdonanRotiTawarPcs);
private double hargaSusuBubukRotiTawarPcs = hargaSusuBubukRotiTawar / (totalBeratAdonanRotiTawar/beratAdonanRotiTawarPcs);
private double hargaSusuCairRotiTawarPcs = hargaSusuCairRotiTawar / (totalBeratAdonanRotiTawar/beratAdonanRotiTawarPcs);
private double hargaTelurRotiTawarPcs = hargaTelurRotiTawar / (totalBeratAdonanRotiTawar/beratAdonanRotiTawarPcs);
private double hargaEsBatuRotiTawarPcs = hargaEsBatuRotiTawar / (totalBeratAdonanRotiTawar/beratAdonanRotiTawarPcs);
    
    
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

    public void varian2(int x){
        System.out.println("RotiTawar varian 2 sebanyak " + x + " pcs");
        System.out.println("=======================================");
        System.out.println("Bahan Adonan : ");
        System.out.println("Tepung Terigu " + x*beratTepungTeriguRotiTawarPcs + " gram seharga Rp " + x*hargaTepungTeriguRotiTawarPcs);
        System.out.println("Gula Pasir " + x*beratGulaPasirRotiTawarPcs + " gram seharga Rp " + x*hargaGulaPasirRotiTawarPcs);
        System.out.println("Butter " + x*beratButterRotiTawarPcs + " gram seharga Rp " + x*hargaButterRotiTawarPcs);
        System.out.println("Ragi " + x*beratRagiRotiTawarPcs + " gram seharga Rp " + x*hargaRagiRotiTawarPcs);
        System.out.println("Susu Bubuk " + x*beratSusuBubukRotiTawarPcs + " gram seharga Rp " + x*hargaSusuBubukRotiTawarPcs);
        System.out.println("Susu Cair " + x*beratSusuCairRotiTawarPcs + " gram seharga Rp " + x*hargaSusuCairRotiTawarPcs);
        System.out.println("Telur " + x*beratTelurRotiTawarPcs + " gram seharga Rp " + x*hargaTelurRotiTawarPcs);
        System.out.println("EsBatu " + x*beratEsBatuRotiTawarPcs + " gram seharga Rp " + x*hargaEsBatuRotiTawarPcs);
        System.out.println("=======================================");
        System.out.println("filling : ");
        System.out.println("Keju "+ x*80 + " gram seharga Rp " + x*this.fillingKeju(80));
        
        System.out.println("=======================================");
        System.out.println("Harga per pcs : Rp " + Math.round((150/100)*(hargaTepungTeriguRotiTawarPcs + hargaGulaPasirRotiTawarPcs + hargaButterRotiTawarPcs + hargaRagiRotiTawarPcs + hargaSusuBubukRotiTawarPcs + hargaSusuCairRotiTawarPcs + hargaTelurRotiTawarPcs + hargaEsBatuRotiTawarPcs + this.fillingKeju(80))));
        System.out.println("Harga Total : Rp " + Math.round(x * ((150/100)*(hargaTepungTeriguRotiTawarPcs + hargaGulaPasirRotiTawarPcs + hargaButterRotiTawarPcs + hargaRagiRotiTawarPcs + hargaSusuBubukRotiTawarPcs + hargaSusuCairRotiTawarPcs + hargaTelurRotiTawarPcs + hargaEsBatuRotiTawarPcs + this.fillingKeju(80)))));
    }    
}
    
