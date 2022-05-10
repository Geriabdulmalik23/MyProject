package com.github.geriabdulmalik23.myapplication.common

import android.view.View
import androidx.recyclerview.widget.RecyclerView


abstract class AppViewHolder<E>(view: View) : RecyclerView.ViewHolder(view) {

    abstract fun bindItem(item: E?, position: Int)

}