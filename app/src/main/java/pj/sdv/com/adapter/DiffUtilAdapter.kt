package pj.sdv.com.adapter

import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView


abstract class DiffUtilAdapter<T, VH : RecyclerView.ViewHolder> : RecyclerView.Adapter<VH>(), MutableAdapter<T> {

    private val mData: MutableList<T> = mutableListOf()

    protected val dataList: List<T> get() = mData

    override fun updateData(newData: List<T>) {
        val diffUtilCallback = DiffUtilCallback(dataList, newData)
        val productDiffResult = DiffUtil.calculateDiff(diffUtilCallback)
        mData.update(newData)
        productDiffResult.dispatchUpdatesTo(this)
    }

    override fun addData(newData: List<T>) {
        val diffUtilCallback = DiffUtilCallback(dataList, newData)
        val productDiffResult = DiffUtil.calculateDiff(diffUtilCallback)
        mData.addAll(newData)
        productDiffResult.dispatchUpdatesTo(this)
    }

    abstract fun areItemsTheSame(oldItem: T, newItem: T): Boolean
    abstract fun areContentsTheSame(oldItem: T, newItem: T): Boolean

    private inner class DiffUtilCallback(private val mOldList: List<T>, private val mNewList: List<T>) :
        DiffUtil.Callback() {

        override fun getOldListSize() = mOldList.size

        override fun getNewListSize() = mNewList.size

        override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
            return this@DiffUtilAdapter.areItemsTheSame(mOldList[oldItemPosition], mNewList[newItemPosition])
        }

        override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
            return this@DiffUtilAdapter.areContentsTheSame(mOldList[oldItemPosition], mNewList[newItemPosition])
        }
    }
}