package com.abdielalim.localpride.data.model

data class NewsList(
    val data: List<News> = arrayListOf(),
    val lenght: Int = 0,
    val status: Int = 0
)
