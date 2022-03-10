

#### 测试API 28手机和API 28+的手机对Activity的回收

两个按钮分别对应两条路径：
1. 单栈只会打开同一个android:launchMode="standard"的Activity。
2. 多栈会连续打开多个android:launchMode="standard"和一个singleTask的Activity。

每个Activity都会申请持有一份40M的ByteArray对象，并且会显示当前JVM的内存情况。
分别在不同版本的手机上可以看出来对Activity的回收情况。

---

![jinmen.jpeg](jinmen.jpeg)
