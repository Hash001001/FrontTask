package com.example.metafrontsample.ui.adapters


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewTreeObserver
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.metafrontsample.R
import com.example.metafrontsample.databinding.GridItemBinding
import com.example.metafrontsample.databinding.GridItemHalfBinding
import com.example.metafrontsample.databinding.GridItemQuarterBinding
import com.example.metafrontsample.model.GridItem


class GridLayoutAdapter() : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items: List<GridItem> = emptyList()

    private val TYPE_FULL = 0
    private val TYPE_HALF = 1
    private val TYPE_DYNAMIC = 2
    private val TYPE_QUARTER = 3

    val spanSizeLookup: GridLayoutManager.SpanSizeLookup by lazy {
        object : GridLayoutManager.SpanSizeLookup() {
            override fun getSpanSize(position: Int): Int {
                return when (position) {
                    0, 7 -> 2 // First item in the first row (full width)
                    1, 2 -> 1
                    3, 4 -> 2
                    else -> 2 // Other items
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        when (viewType) {
            TYPE_FULL -> return GridItemsViewHolder(
                layoutInflater.inflate(
                    R.layout.grid_item,
                    parent,
                    false
                )
            )

            TYPE_HALF -> return GridItemsViewHolder(
                layoutInflater.inflate(
                    R.layout.grid_item_half,
                    parent,
                    false
                )
            )

            TYPE_DYNAMIC -> return DynamicGridViewHolder(
                GridItemHalfBinding.inflate(
                    LayoutInflater.from(
                        parent.context
                    ), parent, false
                )
            )

            TYPE_QUARTER -> return QuarterGridViewHolder(
                GridItemQuarterBinding.inflate(
                    LayoutInflater.from(
                        parent.context
                    ), parent, false
                )
            )

            else -> {
                return GridItemsViewHolder(
                    layoutInflater.inflate(
                        R.layout.grid_item,
                        parent,
                        false
                    )
                )
            }
        }

    }

    override fun getItemViewType(position: Int): Int {
        val modeEight = position % 8
        when (modeEight) {
            0, 7, 1,2, 6 -> return TYPE_FULL
            3 -> return TYPE_DYNAMIC
            4 -> return TYPE_QUARTER
        }
        return TYPE_FULL
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items.get(position)
        if (holder is GridItemsViewHolder) {
            holder.bind(item)
        } else if (holder is DynamicGridViewHolder) {

        }

    }


    fun setItems(mitems: List<GridItem>) {
        items = mitems
        notifyDataSetChanged()
    }

    class GridItemsViewHolder(var mitemView: View) :
        RecyclerView.ViewHolder(mitemView) {

        fun bind(item: GridItem) {

            mitemView.findViewById<TextView>(R.id.tvText).text = item.text
            if (item.showArrow) {
                mitemView.findViewById<ImageView>(R.id.btnArrow).visibility = View.VISIBLE
            } else {
                mitemView.findViewById<ImageView>(R.id.btnArrow).visibility = View.INVISIBLE
            }
        }

    }


    class DynamicGridViewHolder(var binding: GridItemHalfBinding) :
        RecyclerView.ViewHolder(binding.root) {
    }

    class QuarterGridViewHolder(var binding: GridItemQuarterBinding) :
        RecyclerView.ViewHolder(binding.root) {
    }

}

