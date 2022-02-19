package com.emin.repository.entity;

public class Urun {
    /**
     * public -> Her yerden ve herkese açık
     */
   public String ad;
   /**
     * Private -> Sadece sınıf içinde açık
     */
   private String barkod ;
    /**
     * Protected -> Bulundugu paket için açık
     */

   protected double fiyat;
    private int miktar;
    private int KDV;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBarkod() {
        return barkod;
    }

    public void setBarkod(String barkod) {
        this.barkod = barkod;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public int getKDV() {
        return KDV;
    }

    public void setKDV(int KDV) {
        this.KDV = KDV;
    }
}
