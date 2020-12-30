package com.abdielalim.localpride.ui.news

import android.content.Context
import android.content.Intent
import androidx.databinding.ViewDataBinding
import com.abdielalim.localpride.R
import com.abdielalim.localpride.data.model.News
import com.abdielalim.localpride.databinding.ItemNewsBinding
import com.abdielalim.localpride.ui.base.BaseAdapter
import com.bumptech.glide.Glide

class NewsAdapter(val context: Context) : BaseAdapter<News>(R.layout.item_news) {
    override fun onBind(binding: ViewDataBinding?, data: News) {
        val mBinding = binding as ItemNewsBinding
        Glide.with(context).load(data.gambar).into(mBinding.ItemPoster)
    }

    override fun onClick(binding: ViewDataBinding?, data: News) {
        val intent = Intent(context, NewsActivity::class.java)
        intent.putExtra(NewsActivity.OPEN_NEWS, data)
        context.startActivity(intent)
    }
}