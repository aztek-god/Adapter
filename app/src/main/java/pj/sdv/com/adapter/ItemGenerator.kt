package pj.sdv.com.adapter

object ItemGenerator {

    private val mData: MutableList<Item> = mutableListOf(
        Item(1, "Alfreds Futterkiste", "Maria Anders"),
        Item(2, "Ana Trujillo Emparedados y helados", "Ana Trujillo"),
        Item(3, "Antonio Moreno Taquería", "Antonio Moreno"),
        Item(4, "Around the Horn", "Thomas Hardy"),
        Item(5, "Berglunds snabbköp", "Christina Berglund"),
        Item(6, "Blauer See Delikatessen", "Hanna Moos"),
        Item(7, "Blondel père et fils", "Frédérique Citeaux"),
        Item(8, "Alfreds Futterkiste", "Maria Anders"),

        Item(9, "Bon app'", "Laurence Lebihans"),
        Item(10, "Bottom-Dollar Marketse", "Elizabeth Lincoln"),
        Item(11, "B's Beverages", "Victoria Ashworth"),
        Item(12, "Cactus Comidas para llevar", "Patricio Simpson"),
        Item(13, "Centro comercial Moctezuma", "Francisco Chang"),
        Item(14, "Chop-suey Chinese", "Yang Wang"),
        Item(15, "Comércio Mineiro", "Pedro Afonso"),
        Item(16, "Consolidated Holdings", "Elizabeth Brown"),
        Item(17, "Drachenblut Delikatessend", "Sven Ottlieb"),
        Item(18, "Du monde entier", "Janine Labrune")
    )

    fun getData() = mData

    fun changeAt(index: Int, item: Item) {
        mData[index] = item
    }
}