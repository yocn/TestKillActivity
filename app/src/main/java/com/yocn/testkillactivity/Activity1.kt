package com.yocn.testkillactivity

class Activity1 : BaseActivity() {

    override fun getNext(): Class<out BaseActivity> {
        return JumpRouterMap.getNext0()
    }
}