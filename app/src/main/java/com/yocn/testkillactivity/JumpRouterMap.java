package com.yocn.testkillactivity;

import java.util.LinkedList;

class JumpRouterMap {
    public static final String TAG = "KILL";
    public static int index0 = 0;
    public static int index1 = 0;
    public static LinkedList<Class<? extends BaseActivity>> jumpList0 = new LinkedList<>();
    public static LinkedList<Class<? extends BaseActivity>> jumpList1 = new LinkedList<>();

    static {
        jumpList0.add(BaseActivity.class);

        jumpList1.add(ActivityStandard.class);
        jumpList1.add(ActivityStandard.class);
        jumpList1.add(ActivityStandard.class);
        jumpList1.add(ActivityStandard.class);
        jumpList1.add(ActivityStandard.class);
        jumpList1.add(ActivitySingleTask.class);
    }

    public static Class<? extends BaseActivity> getNext0() {
        return jumpList0.get(index0++ % jumpList0.size());
    }

    public static Class<? extends BaseActivity> getNext1() {
        return jumpList1.get(index1++ % jumpList1.size());
    }
}
