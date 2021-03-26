package br.com.gilbercs.exemplokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import br.com.gilbercs.exemplokotlin.container.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun listaSimple(view: View){
        val abrir = Intent(applicationContext, ListViewActivity::class.java)
        startActivity(abrir)
    }
    fun listaGridView(view: View){
        val abrir = Intent(applicationContext, GridViewActivity::class.java)
        startActivity(abrir)
    }
    fun searchViewA(view: View){
        val abrir = Intent(applicationContext, SearchViewActivity::class.java)
        startActivity(abrir)
    }
    fun customView(view: View){
        val abrir = Intent(applicationContext, CustomActivity::class.java)
        startActivity(abrir)
    }
    fun navWebView(view: View){
        val abrir = Intent(applicationContext, WebViewActivity::class.java)
        startActivity(abrir)
    }
    fun buscarViewToolbar(view: View){
        val abrir = Intent(applicationContext, SearchViewToobar::class.java)
        startActivity(abrir)
    }
}
