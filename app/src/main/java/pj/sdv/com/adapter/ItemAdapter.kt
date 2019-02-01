package pj.sdv.com.adapter

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_layout.view.*

class ItemAdapter : DiffUtilAdapter<Item, ItemAdapter.ViewHolder>() {

    override fun areItemsTheSame(oldItem: Item, newItem: Item) = oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: Item, newItem: Item) = oldItem == newItem

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = parent.inflate(R.layout.item_layout)

        return ViewHolder(view)
    }

    override fun getItemCount() = dataList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(dataList[position]) {
            holder.idTv += id.toString()
            holder.nameTv += name
            holder.surnameTv += surname
        }
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val idTv: TextView = view.idTv
        val nameTv: TextView = view.nameTv
        val surnameTv: TextView = view.surnameTv
    }
}