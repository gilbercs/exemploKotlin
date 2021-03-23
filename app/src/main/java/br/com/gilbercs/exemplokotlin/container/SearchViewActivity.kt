package br.com.gilbercs.exemplokotlin.container

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SearchView
import androidx.recyclerview.widget.RecyclerView
import br.com.gilbercs.exemplokotlin.R

class SearchViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_search)
        //variavel faz referencia ao componente na codigo xml.
        val searchView = findViewById<SearchView>(R.id.idSearchView)
        val lista = findViewById<ListView>(R.id.idListViewSearchView)
        val listaArray = arrayOf("item 01", "item 02", "item 03 ", "item 04",
            "item 05","item 06","item 07","item 08","item 09","item 10")
        val listaAdp: ArrayAdapter<String> = ArrayAdapter(applicationContext,
        android.R.layout.simple_list_item_1, listaArray)
        lista.adapter = listaAdp
        searchView.setOnQueryTextListener(object: SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                listaAdp.filter.filter(newText)
                return false
            }

        })
    }
}