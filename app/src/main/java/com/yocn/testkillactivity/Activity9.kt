package com.yocn.testkillactivity

class Activity9 : BaseActivity() {

    override fun getNext(): Class<out BaseActivity>? {
        return Activity10::class.java
    }
}