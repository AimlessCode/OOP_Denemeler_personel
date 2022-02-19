package com.emin.repository.entity;

import java.util.Date;

public class Satis {
    String urun;
    String musteri;
    int adet;
    double fiyat;
    double toplamfiyat;
    Date satistarihi;
    Date islemtarihi;


    public String getUrun() {
        return urun;
    }

    public void setUrun(String urun) {
        this.urun = urun;
    }

    public String getMusteri() {
        return musteri;
    }

    public void setMusteri(String musteri) {
        this.musteri = musteri;
    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet,String username)
    {
        if (username=="Admin") {
            this.adet = adet;
        }
            else{
            System.out.printf("Yetkisiz Erişim");
    }
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public double getToplamfiyat() {
        return toplamfiyat;
    }

    public void setToplamfiyat(double toplamfiyat) {
        this.toplamfiyat = toplamfiyat;
    }

    public Date getSatistarihi() {
        return satistarihi;
    }

    public void setSatistarihi(Date satistarihi) {
        this.satistarihi = satistarihi;
    }

    public Date getIslemtarihi() {
        return islemtarihi;
    }

    public void setIslemtarihi(Date islemtarihi) {
        this.islemtarihi = islemtarihi;
    }
}
