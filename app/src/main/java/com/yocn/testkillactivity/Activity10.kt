package com.yocn.testkillactivity

class Activity10 : BaseActivity() {

    override fun getNext(): Class<out BaseActivity>? {
        return Activity1::class.java
    }
}