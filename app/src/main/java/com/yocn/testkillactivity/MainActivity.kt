package com.yocn.testkillactivity

import android.content.Intent
import android.os.Bundle
import android.widget.Button

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.btn_low).setOnClickListener {
            val intent0 = Intent()
            intent0.setClass(this, JumpRouterMap.getNext0())
            startActivity(intent0)
        }
        findViewById<Button>(R.id.btn_high).setOnClickListener {
            val intent1 = Intent()
            intent1.setClass(this, JumpRouterMap.getNext1())
            startActivity(intent1)
        }
    }

    override fun onDestroy() {
        JumpRouterMap.index0 = 0
        JumpRouterMap.index1 = 0
        super.onDestroy()
    }
}