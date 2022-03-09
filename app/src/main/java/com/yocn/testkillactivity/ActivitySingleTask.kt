package com.yocn.testkillactivity

class ActivitySingleTask : BaseActivity() {

    override fun getNext(): Class<out BaseActivity>? {
        return JumpRouterMap.getNext1()
    }
}