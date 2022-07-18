package com.example.bubblepickerlibrary

import com.example.bubblepickerlibrary.model.PickerItem


/**
 * Created by irinagalata on 3/6/17.
 */
interface BubblePickerListener {

    fun onBubbleSelected(item: PickerItem)

    fun onBubbleDeselected(item: PickerItem)

}