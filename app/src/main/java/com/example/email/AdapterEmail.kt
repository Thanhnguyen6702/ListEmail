package com.example.email

import android.content.res.ColorStateList
import android.graphics.Color
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.List

class AdapterEmail(val emailList: MutableList<email>): RecyclerView.Adapter<AdapterEmail.Adapter_viewholder>() {

    val colors = arrayOf(
        Color.RED,
        Color.BLUE,
        Color.GREEN,
        Color.YELLOW,
        Color.CYAN,
        Color.MAGENTA
    )


    inner class Adapter_viewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var N: TextView = itemView.findViewById(R.id.textView)
        var Hour: TextView = itemView.findViewById(R.id.textView2)
        var Name: TextView = itemView.findViewById(R.id.textView3)
        var Letter: TextView = itemView.findViewById(R.id.textView5)
        var imageView: ImageView = itemView.findViewById(R.id.imageView)
        var imageView2: ImageView = itemView.findViewById(R.id.imageView2)

        var textView4: TextView = itemView.findViewById(R.id.textView4)
        var imageView1: ImageView = itemView.findViewById(R.id.remove)
        var imageView4: ImageView = itemView.findViewById(R.id.imageView4)
        init {
            itemView.setOnLongClickListener{
                if (textView4.visibility==View.GONE){
                    textView4.visibility = View.VISIBLE
                    imageView1.visibility =View.VISIBLE
                    imageView4.visibility = View.VISIBLE


                    N.visibility = View.GONE
                    Hour.visibility =View.GONE
                    Letter.visibility = View.GONE
                    Name.visibility = View.GONE
                    imageView.visibility =View.GONE
                    imageView2.visibility = View.GONE
                }
                else{
                    textView4.visibility = View.GONE
                    imageView1.visibility =View.GONE
                    imageView4.visibility = View.GONE


                    N.visibility = View.VISIBLE
                    Hour.visibility =View.VISIBLE
                    Letter.visibility = View.VISIBLE
                    Name.visibility = View.VISIBLE
                    imageView.visibility =View.VISIBLE
                    imageView2.visibility = View.VISIBLE

                }
                true
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter_viewholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return Adapter_viewholder(view)
    }

    override fun getItemCount(): Int {
        return emailList.size
    }

    override fun onBindViewHolder(holder: Adapter_viewholder, position: Int) {
        holder.N.text = emailList.get(position).getName().get(0).uppercase()
        holder.Hour.text = emailList.get(position).getHour()
        holder.Letter.text = emailList.get(position).getLetter()
        holder.Name.text = emailList.get(position).getName()

        val randomColor = colors.random()
        holder.N.backgroundTintList = ColorStateList.valueOf(randomColor)
    }
}
