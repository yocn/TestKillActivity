package com.yocn.testkillactivity

class Activity4 : BaseActivity() {

    override fun getNext(): Class<out BaseActivity> {
        return Activity5::class.java
    }
}