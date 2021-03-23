package br.com.gilbercs.exemplokotlin.adapter

import android.app.Activity
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.gilbercs.exemplokotlin.R
import br.com.gilbercs.exemplokotlin.model.ModelListaCustom

class CustomAdapter(val getContext: Context,val customItem: ArrayList<ModelListaCustom>):
        ArrayAdapter<ModelListaCustom>(getContext,0,customItem)
{
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var listaLayout = convertView
        val holder: ViewHolder
        if (listaLayout==null){
            val inflateList = (context as Activity).layoutInflater
            listaLayout = inflateList!!.inflate(R.layout.adapter_custom_activity,parent,false)
            holder = ViewHolder()
            holder.moImagem = listaLayout!!.findViewById(R.id.idImageAdaCustom)
            holder.mTexto = listaLayout!!.findViewById(R.id.idTextAdpCustom)
            listaLayout.setTag(holder)

        }else
        {
            holder = listaLayout.getTag() as ViewHolder
        }
        val listItem = customItem[position]
        holder.moImagem!!.setImageResource(listItem.mImagen)
        holder.mTexto!!.setText(listItem.mTexto)
        return listaLayout
    }
    class ViewHolder{
        internal var moImagem: ImageView? = null
        internal var mTexto: TextView? = null
    }
        }