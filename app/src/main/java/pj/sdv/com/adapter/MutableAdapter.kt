package pj.sdv.com.adapter

interface MutableAdapter<T> {
    fun updateData(newData: List<T>)
    fun addData(newData: List<T>)
}