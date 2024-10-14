package com.sintia.uts_sintia.model


import com.sintia.uts_sintia.R

class ModelMakanan(
    val image: Int,
    val judul: String
)

object Mocklist {
    fun getModel(): List<ModelMakanan>{
        val item1 = ModelMakanan(
            R.drawable.img1,
            "Pasta"
        )

        val item2 = ModelMakanan(
            R.drawable.img2,
            "Rendang"
        )

        val itemList: ArrayList<ModelMakanan> = ArrayList()
        itemList.add(item1)
        itemList.add(item2)
        return itemList
    }
}