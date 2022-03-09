package com.yocn.testkillactivity

class Activity2 : BaseActivity() {

    override fun getNext(): Class<out BaseActivity> {
        return Activity3::class.java
    }
}