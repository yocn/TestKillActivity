package com.yocn.testkillactivity

class Activity6 : BaseActivity() {

    override fun getNext(): Class<out BaseActivity>? {
        return Activity7::class.java
    }
}