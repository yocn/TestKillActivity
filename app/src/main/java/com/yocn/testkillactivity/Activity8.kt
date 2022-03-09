package com.yocn.testkillactivity

class Activity8 : BaseActivity() {

    override fun getNext(): Class<out BaseActivity>? {
        return Activity9::class.java
    }
}