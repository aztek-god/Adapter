package pj.sdv.com.adapter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import pj.sdv.com.adapter.render.ItemModel
import pj.sdv.com.adapter.render.RenderAdapter
import pj.sdv.com.adapter.render.my.ItemRender

class MainActivity : AppCompatActivity() {
    private val itemAdapter: RenderAdapter<Item, ItemRender.ViewHolder> = RenderAdapter(
        ::compareItemId,
        ::compareItemContent
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        itemAdapter.registerRender(0, ItemRender())

        with(recyclerView) {
            adapter = itemAdapter
            layoutManager = verticalLayoutManager(this@MainActivity)
        }

        itemAdapter.updateData(ItemGenerator.getData())

        button.setOnClickListener {
            updateFirst()
        }
    }

    private fun compareItemId(oldItem: Item, newItem: Item) = oldItem.id == newItem.id

    private fun compareItemContent(oldItem: Item, newItem: Item): Boolean = oldItem == newItem

    private fun updateFirst() {
        ItemGenerator.changeAt(0, Item(1, "Sergey", "Dvurechenskiy"))

        val list = ItemGenerator.getData()

        itemAdapter.updateData(list)
    }
}

data class Item(val id: Int, val name: String, val surname: String) : ItemModel {
    override val type: Int
        get() = 0
}
