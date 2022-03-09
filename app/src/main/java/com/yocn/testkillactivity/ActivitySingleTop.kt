package com.yocn.testkillactivity

class ActivitySingleTop : BaseActivity() {

    override fun getNext(): Class<out BaseActivity>? {
        return JumpRouterMap.getNext1()
    }
}