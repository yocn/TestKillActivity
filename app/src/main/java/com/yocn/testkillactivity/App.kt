package com.yocn.testkillactivity

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.util.Log

class App : Application() {
    val list = ArrayList<Activity>()
    var totalNums = 0
    var currNums = 0

    override fun onCreate() {
        super.onCreate()
        registerActivityLifecycleCallbacks(object : ActivityLifecycleCallbacks {
            override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
                list.add(activity)
                totalNums++
                currNums++
                print(true, activity::class.java.simpleName)
            }

            override fun onActivityStarted(activity: Activity) {
            }

            override fun onActivityResumed(activity: Activity) {
            }

            override fun onActivityPaused(activity: Activity) {
            }

            override fun onActivityStopped(activity: Activity) {
            }

            override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {
            }

            override fun onActivityDestroyed(activity: Activity) {
                list.remove(activity)
                currNums--
                print(false, activity::class.java.simpleName)
            }
        })
    }

    fun print(add: Boolean, name: String) {
        val sb = StringBuilder()
        sb.append("一共打开过").append(totalNums).append("个Activity 存活").append(currNums).append("个 - ").append(name).append(" ").append(if (add) "added" else "removed").append(" [")
        for (a in list) {
            sb.append(a::class.java.simpleName).append(" ")
        }
        sb.append("]")
        Log.d(JumpRouterMap.TAG, sb.toString())
    }
}