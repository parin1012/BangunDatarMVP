package com.udacoding.bangundatarmvp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.udacoding.bangundatarmvp.R
import com.udacoding.bangundatarmvp.model.Hasil
import com.udacoding.bangundatarmvp.presenter.PersegiPanjangPresenter
import com.udacoding.bangundatarmvp.presenter.PersegiPanjangView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), PersegiPanjangView {
    // todo 9 deklarasi presenter
    private  var presenter : PersegiPanjangPresenter? = null
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // todo 10 init preesenter
        presenter = PersegiPanjangPresenter(this)

        // todo 1 buat event click
        btnHitung.setOnClickListener {

            // todo 2 ambil inputan user
            val panjang = edInput1.text.toString()
            val lebar = edInput2.text.toString()

            // todo  11 eksekusi presenter
            presenter?.hitung(panjang, lebar)
        }

    }

    override fun hasilHitung(hasil: Hasil) {
        // todo 12 bind data ke view
        Toast.makeText(this, hasil.total.toString(), Toast.LENGTH_SHORT).show()
    }
}