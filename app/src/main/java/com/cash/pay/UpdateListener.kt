package com.cash.pay

interface UpdateListener {
    fun UpdateListener(
        coin: String?,
        time: String?,
        link: String?,
        browser: String?,
        id: String?,
        index: Int,
        description: String?,
        logo: String?,
        packages: String?,
    )
}