package com.simba.looksgood.ui.shoppingList

import com.simba.looksgood.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}