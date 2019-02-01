package pj.sdv.com.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

fun <T> MutableList<T>.update(newList: List<T>) {
    clear()
    addAll(newList)
}

fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(this.context).inflate(layoutRes, this, attachToRoot)
}

operator fun TextView.plusAssign(text: String) {
    this.text = text
}


fun verticalLayoutManager(context: Context, isReverse: Boolean = false): RecyclerView.LayoutManager {
    return LinearLayoutManager(context, RecyclerView.VERTICAL, isReverse)
}

fun horizontalLayoutManager(context: Context, isReverse: Boolean = false): RecyclerView.LayoutManager {
    return LinearLayoutManager(context, RecyclerView.HORIZONTAL, isReverse)
}