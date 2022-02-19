package com.emin;

import com.emin.repository.entity.Satis;
import com.emin.repository.entity.Urun;

public class Runner {
    public static void main(String[] args) {
/**
 *İlk Olarak nesne türetilir
 */

        Urun urun = new Urun();
        /**
         * Bir nesne içindeki bilgilerin erişime açılması
         * onun erişim belirteçlerinin düzei ile ilgilidir
         * Access Modifier
         */
urun.ad ="ürün1";
        Satis satis =new Satis();
        satis.setAdet(445,"Admin");
        satis.getAdet();
        System.out.printf("Adet = "+satis.getAdet());

    }
}
