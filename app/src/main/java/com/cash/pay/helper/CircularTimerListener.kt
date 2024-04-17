package com.cash.pay.helper

interface CircularTimerListener {
    fun updateDataOnTick(remainingTimeInMs: Long): String?
    fun onTimerFinished()
}