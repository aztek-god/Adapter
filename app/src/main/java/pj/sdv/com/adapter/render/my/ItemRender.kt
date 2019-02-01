package pj.sdv.com.adapter.render.my

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_layout.view.*
import pj.sdv.com.adapter.Item
import pj.sdv.com.adapter.R
import pj.sdv.com.adapter.inflate
import pj.sdv.com.adapter.plusAssign
import pj.sdv.com.adapter.render.ViewRender

class ItemRender : ViewRender<Item, ItemRender.ViewHolder>(0) {

    override fun bindView(model: Item, holder: ViewHolder) {
        with(holder) {
            idTv += model.id.toString()
            nameTv += model.name
            surnameTv += model.surname
        }
    }

    override fun createViewHolder(viewGroup: ViewGroup): ViewHolder {
        val view = viewGroup.inflate(R.layout.item_layout)

        return ViewHolder(view)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val idTv: TextView = view.idTv
        val nameTv: TextView = view.nameTv
        val surnameTv: TextView = view.surnameTv
    }
}