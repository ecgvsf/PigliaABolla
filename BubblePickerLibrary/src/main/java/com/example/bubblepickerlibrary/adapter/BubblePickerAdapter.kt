package com.example.bubblepickerlibrary.adapter

import com.example.bubblepickerlibrary.model.PickerItem

/**
 * Created by irinagalata on 5/22/17.
 */
interface BubblePickerAdapter {

    val totalCount: Int

    fun getItem(position: Int): PickerItem

}