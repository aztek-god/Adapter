package pj.sdv.com.adapter.render.composite

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import pj.sdv.com.adapter.render.RenderAdapter
import pj.sdv.com.adapter.render.ViewRender

//class CompositeViewRender<M : CompositeItemModel, VH : RecyclerView.ViewHolder>(type: Int) : ViewRender<M, VH>(type) {
//
//    private val mRenderAdapter: RenderAdapter<M, VH> =
//        RenderAdapter({ oldItem, newItem -> true }, { oldItem, newItem -> true })
//
//
//
//    @SuppressWarnings("unchecked")
//    override fun bindView(model: M, holder: VH) {
//        mRenderAdapter.updateData(model.items as List<M>)
//    }
//
//    override fun createViewHolder(viewGroup: ViewGroup): VH {
//
//    }
//}