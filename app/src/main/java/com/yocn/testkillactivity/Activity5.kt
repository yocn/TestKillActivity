package com.yocn.testkillactivity

class Activity5 : BaseActivity() {

    override fun getNext(): Class<out BaseActivity>? {
        return Activity6::class.java
    }
}