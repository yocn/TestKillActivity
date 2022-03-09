package com.yocn.testkillactivity

class Activity3 : BaseActivity() {

    override fun getNext(): Class<out BaseActivity> {
        return Activity4::class.java
    }
}