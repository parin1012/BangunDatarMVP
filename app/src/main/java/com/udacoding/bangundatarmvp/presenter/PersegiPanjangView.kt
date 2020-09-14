package com.udacoding.bangundatarmvp.presenter

import com.udacoding.bangundatarmvp.model.Hasil


// todo 6 membuat sebuah interface untuk notify activity(view) kalau hasil logic sudah selesai
interface PersegiPanjangView {
    fun hasilHitung(hasil: Hasil)
}