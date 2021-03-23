package br.com.gilbercs.exemplokotlin.container

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import br.com.gilbercs.exemplokotlin.R
import br.com.gilbercs.exemplokotlin.adapter.CustomAdapter
import br.com.gilbercs.exemplokotlin.model.ModelListaCustom

class CustomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom)
        //referencia a activity_custom
        val listaView = findViewById<ListView>(R.id.idListaPersonalizada)
        val listaPersolinada = ArrayList<ModelListaCustom>()
        val listaPersonalizadaModelo  = CustomAdapter(this, listaPersolinada)
        listaPersolinada.add(ModelListaCustom(R.drawable.flutter_icon_00,"Flutter"))
        listaPersolinada.add(ModelListaCustom(R.drawable.kotlin_icon_01,"Kotlin"))
        listaPersolinada.add(ModelListaCustom(R.drawable.imagen02,"gitHub"))
        listaPersolinada.add(ModelListaCustom(R.drawable.imagen03,"java"))
        listaPersolinada.add(ModelListaCustom(R.drawable.imagens04,"php"))
        listaView.adapter = listaPersonalizadaModelo
        listaView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            Toast.makeText(applicationContext,"Selecionado",Toast.LENGTH_SHORT).show()
        }
    }
}