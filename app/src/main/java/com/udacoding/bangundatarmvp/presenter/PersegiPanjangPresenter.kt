package com.udacoding.bangundatarmvp.presenter

import com.udacoding.bangundatarmvp.model.Hasil

// todo 7 membuat construct di bagian presesnter
class PersegiPanjangPresenter(var ppView: PersegiPanjangView) {
    // todo 3 buat function hitung
    fun hitung(panjang : String, lebar : String){
        // todo 4 convert dari tipe data string ke integer
        val cPanjang = panjang.toInt()
        val cLebar = lebar.toInt()
        val total= cPanjang.times(cLebar)

        // todo 5 hasil parameter masukan ke dalam model
        val hasil = Hasil()
        hasil.total = total


        // todo 8 masukan model ke interface
        ppView.hasilHitung(hasil)
    }
}