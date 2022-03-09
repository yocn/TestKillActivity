package com.yocn.testkillactivity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

open class BaseActivity : Activity() {
    val list = ArrayList<ByteArray>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)

        findViewById<TextView>(R.id.tv_name).text = javaClass.simpleName
        findViewById<TextView>(R.id.tv_main).text = updateRAM()
        findViewById<Button>(R.id.btn).setOnClickListener {
            list.add(ByteArray(1024 * 1024 * 40))
            updateRAM()
            getNext()?.let {
                val intent = Intent(this, it)
                this.startActivity(intent)
            }
        }
        Log.d(JumpRouterMap.TAG, "onCreate:" + this.javaClass.simpleName)

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(JumpRouterMap.TAG, "save:" + this.javaClass.simpleName)
    }

    open fun getNext(): Class<out BaseActivity>? {
        return BaseActivity::class.java
    }

    fun updateRAM(): String {
        System.gc()
        val runtime = Runtime.getRuntime()
        val dalvikMax = runtime.maxMemory() / 1000 / 1000
        val dalvikTotal = runtime.totalMemory() / 1000 / 1000
        val dalvikFree = runtime.freeMemory() / 1000 / 1000
        val dalvikUsed = dalvikTotal - dalvikFree
        return "Max:$dalvikMax  dalvikTotal:$dalvikTotal  Free:$dalvikFree  Used:$dalvikUsed"
    }

}