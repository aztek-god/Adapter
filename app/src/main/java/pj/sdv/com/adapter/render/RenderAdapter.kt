package pj.sdv.com.adapter.render

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import pj.sdv.com.adapter.DiffUtilAdapter
import java.lang.RuntimeException

class RenderAdapter<M : ItemModel, VH : RecyclerView.ViewHolder>(
    private val areItemsTheSame: (oldItem: M, newItem: M) -> Boolean,
    private val areContentsTheSame: (oldItem: M, newItem: M) -> Boolean
) :
    DiffUtilAdapter<M, VH>() {

    private val mRenderMap: MutableMap<Int, ViewRender<M, VH>> = HashMap()

    override fun areItemsTheSame(oldItem: M, newItem: M): Boolean {
        return this.areItemsTheSame.invoke(oldItem, newItem)
    }

    override fun areContentsTheSame(oldItem: M, newItem: M): Boolean {
        return this.areContentsTheSame.invoke(oldItem, newItem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val render: ViewRender<M, VH>? = mRenderMap[viewType]

        return render?.createViewHolder(parent)
            ?: throw RenderException("The render is missing. The render with type of $viewType is mandatory.")
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        val renderType = dataList[position].type
        val render: ViewRender<M, VH>? = mRenderMap[renderType]
        val item = dataList[position]

        render?.bindView(item, holder)
    }

    override fun getItemViewType(position: Int): Int {
        return dataList[position].type
    }

    fun registerRender(key: Int, render: ViewRender<M, VH>) {
        if (mRenderMap.containsKey(key)) {
            throw RenderException("The render already exists. Render is is $key")
        } else {
            mRenderMap[key] = render
        }
    }

    class RenderException(message: String) : RuntimeException(message)


}