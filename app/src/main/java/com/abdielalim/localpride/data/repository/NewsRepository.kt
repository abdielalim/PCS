package com.abdielalim.localpride.data.repository

import android.app.DownloadManager
import com.abdielalim.localpride.data.model.ActionState
import com.abdielalim.localpride.data.model.News
import com.abdielalim.localpride.data.remote.NewsServis
import com.abdielalim.localpride.data.remote.RetrofitApi
import retrofit2.await

class NewsRepository {
    private val newsServis: NewsServis by lazy { RetrofitApi.newsService() }

    suspend fun listNews() : ActionState<List<News>> {
        return try {
            val list =  newsServis.listNews().await()
            ActionState(list.data)
        } catch (e: Exception) {
            ActionState(message = e.message, isSuccess = false)
        }
    }

    suspend fun detailNews(url: String) : ActionState<News> {
        return try {
            val list = newsServis.detailNews(url).await()
            ActionState(list.data.first())
        } catch (e: Exception) {
            ActionState(message = e.message, isSuccess = false)
        }
    }

    suspend fun searchNews(query: String) : ActionState<List<News>> {
        return try {
            val list = newsServis.searchNews(query).await()
            ActionState(list.data)
        } catch (e: Exception) {
            ActionState(message = e.message, isSuccess = false)
        }
    }
}