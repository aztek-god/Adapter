package pj.sdv.com.adapter.render.composite

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class CompositeViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    abstract val nestedRecyclerView: RecyclerView
}