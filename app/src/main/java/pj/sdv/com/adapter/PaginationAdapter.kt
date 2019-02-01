package pj.sdv.com.adapter

import androidx.recyclerview.widget.RecyclerView

abstract class PaginationAdapter<T, VH : RecyclerView.ViewHolder> : DiffUtilAdapter<T, VH>() {
}