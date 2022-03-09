package com.yocn.testkillactivity

class Activity7 : BaseActivity() {

    override fun getNext(): Class<out BaseActivity>? {
        return Activity8::class.java
    }
}