package com.cash.pay.csm

interface IsVideoLimitReach {
    fun onVideoLimitReach(videoLimitReach: Boolean, isError: Boolean)
}