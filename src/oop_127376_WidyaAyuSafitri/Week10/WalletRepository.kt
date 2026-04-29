package oop_127376_WidyaAyuSafitri.Week10

interface HasName { val name: String }
class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items.toList()
    }

    fun <T : HasName> searchByName(query: String): List<T> {
        return items.filter { item ->
            (item as HasName).name.contains(query, ignoreCase = true)
        } as List<T>
    }
}