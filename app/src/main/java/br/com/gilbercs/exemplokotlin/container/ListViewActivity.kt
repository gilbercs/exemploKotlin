package br.com.gilbercs.exemplokotlin.container

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import br.com.gilbercs.exemplokotlin.R

class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)
        //faz referencia a lista criada no layout atraves do findviewbyid
        val listView = findViewById<ListView>(R.id.idListView)
        //criar uma lista
        val itensLista = arrayOf("item 01", "item 02", "item 03 ", "item 04",
            "item 05","item 06","item 07","item 08","item 09","item 10")
        val adapterLista: ArrayAdapter<String> = ArrayAdapter(applicationContext, android.R.layout.simple_list_item_1, itensLista)
        //atribuir itens
        listView.adapter = adapterLista
        //evento de clique
        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this@ListViewActivity,"item clicado $id",
            Toast.LENGTH_SHORT).show()
        }
    }
}