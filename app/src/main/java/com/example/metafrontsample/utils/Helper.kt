package com.example.metafrontsample.utils

import com.example.metafrontsample.model.GridItem

object Helper {

    fun populateList() : List<GridItem>{
        val listItems = arrayListOf<GridItem>()

        listItems.add(GridItem(text = "Anrede/Firma", showArrow = true, columns = 2))
        listItems.add(GridItem(text = "Vorname", columns = 1, showArrow = false))
        listItems.add(GridItem(text = "Nachename", columns = 2))
        /*listItems.add(GridItem(text = "Plz", columns = 1))
        listItems.add(GridItem(text = "Wohnort", columns = 1))*/
        listItems.add(GridItem(text = "StraBe", columns = 1))
        listItems.add(GridItem(text = "Nr.", columns = 1))
        listItems.add(GridItem(text = "E-Mail",columns = 2))

        return listItems
    }




}