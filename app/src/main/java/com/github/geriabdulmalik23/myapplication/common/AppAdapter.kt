package com.github.geriabdulmalik23.myapplication.common

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.viewbinding.ViewBinding
abstract class AppAdapter<VB : ViewBinding, E : Any, VH : AppViewHolder<E>>(diffUtil: DiffUtil.ItemCallback<E>) :
    ListAdapter<E, VH>(diffUtil) {

    private lateinit var mViewBinding: VB
    protected val binding: VB
        get() = mViewBinding

    protected abstract fun onBinding(parent: ViewGroup): VB

    protected abstract fun onViewHolder(view: View): VH

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        mViewBinding = onBinding(parent)
        return onViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.bindItem(getItem(position), position)
    }

    override fun getItemId(position: Int) = position.toLong()

    override fun getItemViewType(position: Int): Int = position

}