package pj.sdv.com.adapter.render

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

abstract class ViewRender<M : ItemModel, VH : RecyclerView.ViewHolder>(val type: Int) {
    abstract fun bindView(model: M, holder: VH)
    abstract fun createViewHolder(viewGroup: ViewGroup): VH
}