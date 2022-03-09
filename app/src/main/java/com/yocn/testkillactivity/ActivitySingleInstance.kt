package com.yocn.testkillactivity

class ActivitySingleInstance : BaseActivity() {

    override fun getNext(): Class<out BaseActivity>? {
        return JumpRouterMap.getNext1()
    }
}