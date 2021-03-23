package br.com.gilbercs.exemplokotlin.container

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.ListView
import android.widget.Toast
import br.com.gilbercs.exemplokotlin.R

class GridViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid_view)
        //faz referencia a lista criada no layout atraves do findviewbyid
        val listaGridView = findViewById<GridView>(R.id.idGridView)
        //criar uma lista
        val itensListaGrid = arrayOf("item 01", "item 02", "item 03 ", "item 04",
            "item 05","item 06","item 07","item 08","item 09","item 10")
        val adapterLista: ArrayAdapter<String> = ArrayAdapter(applicationContext, android.R.layout.simple_list_item_1, itensListaGrid)
        //atribuir itens
        listaGridView.adapter = adapterLista
        //evento de clique
        listaGridView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(applicationContext,"item clicado $id",
                Toast.LENGTH_SHORT).show()
        }
    }
}