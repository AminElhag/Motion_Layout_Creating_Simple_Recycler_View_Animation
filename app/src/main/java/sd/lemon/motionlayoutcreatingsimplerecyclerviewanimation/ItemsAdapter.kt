package sd.lemon.motionlayoutcreatingsimplerecyclerviewanimation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemsAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val items = ArrayList<FoodModel>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ItemsViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.item_food, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is ItemsViewHolder) {
            val item = items[position]
            holder.imageView.setImageResource(item.imgId)
            holder.tvTitle.text = item.title
            holder.tvCalories.text = item.calories
            holder.tvDescription.text = item.description
            holder.tvRate.text = item.rate
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ItemsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.ivFood)
        val tvTitle: TextView = view.findViewById(R.id.tvTitle)
        val tvDescription: TextView = view.findViewById(R.id.tvDescription)
        val tvCalories: TextView = view.findViewById(R.id.tvCalories)
        val imageView6: ImageView = view.findViewById(R.id.imageView6)
        val imageView7: ImageView = view.findViewById(R.id.imageView7)
        val tvRate: TextView = view.findViewById(R.id.tvRate)
    }


    fun setData(data: ArrayList<FoodModel>) {
        this.items.clear()
        notifyDataSetChanged()
        this.items.addAll(data)
        notifyDataSetChanged()
    }
}