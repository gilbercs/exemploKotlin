package br.com.gilbercs.exemplokotlin.container

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.core.view.MenuItemCompat
import br.com.gilbercs.exemplokotlin.R

class SearchViewToobar : AppCompatActivity() {
    lateinit var listaView: ListView
    lateinit var listaAdapter: ArrayAdapter<String>
    val listaArray = arrayOf("item 01", "item 02", "item 03 ", "item 04",
            "item 05","item 06","item 07","item 08","item 09","item 10")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_view_toobar)
        listaView = findViewById(R.id.idListViewToolbar)
        listaAdapter = ArrayAdapter(applicationContext,android.R.layout.simple_list_item_1,listaArray)
        listaView.adapter = listaAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        val menuItem = menu!!.findItem(R.id.idMenuListViewToolbar)
        var viewBuscar = MenuItemCompat.getActionView(menuItem) as SearchView
        viewBuscar.setOnQueryTextListener(object: SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                viewBuscar.clearFocus()
                if (listaArray.contains(query)){
                    listaAdapter.filter.filter(query)
                }else{
                    Toast.makeText(applicationContext,"Not Foud",
                    Toast.LENGTH_SHORT).show()
                }
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                listaAdapter.filter.filter(newText)
                return false
            }
        })

        return super.onCreateOptionsMenu(menu)
    }

}