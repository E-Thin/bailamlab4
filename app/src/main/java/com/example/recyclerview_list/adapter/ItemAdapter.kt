package com.example.recyclerview_list.adapter

import android.content.Context

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_list.R
import com.example.recyclerview_list.model.Affirmation

 class ItemAdapter(
    private val context: Context,
    private val dataset: List<Affirmation>
): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.id_textview)
        val imageView: ImageView = view.findViewById(R.id.item_image)
        val textView1: TextView = view.findViewById(R.id.id_textview1)
        val textView2: TextView = view.findViewById(R.id.tv_number)

    }

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
         // create a new view
         val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)

         return ItemViewHolder(adapterLayout)
     }

     override fun getItemCount(): Int {
      return dataset.size
     }

     override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
         val item = dataset[position]
         holder.textView.text = context.resources.getString(item.stringResourceId)
         holder.imageView.setImageResource(item.imageResourceId)
         holder.textView1.text = context.resources.getString(item.MessageResourceId)
         holder.textView2.text = context.resources.getString(item.NumberResourceId)



     }
 }



