package com.yocn.testkillactivity

class ActivityStandard : BaseActivity() {

    override fun getNext(): Class<out BaseActivity>? {
        return JumpRouterMap.getNext1()
    }
}