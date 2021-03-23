package br.com.gilbercs.exemplokotlin.container

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.gilbercs.exemplokotlin.R

class ExpandableActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expandable_activity)
    }
}