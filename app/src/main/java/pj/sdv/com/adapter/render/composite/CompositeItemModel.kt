package pj.sdv.com.adapter.render.composite

import pj.sdv.com.adapter.render.ItemModel

interface CompositeItemModel: ItemModel {
    val items: List<ItemModel>
}