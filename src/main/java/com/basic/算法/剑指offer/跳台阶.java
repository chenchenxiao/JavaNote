package com.basic.算法.剑指offer;

/**
 * @author Blse
 * @date 2018/12/17
 * @description 一次能跳1阶或2阶，所以也就是看有多少种方法可以跳到前两个和前一个，因为前两个只需要跳2即可达到目标，前一个跳1阶
 */
public class 跳台阶 {

    public int JumpFloor(int target) {
        if (target < 0) {
            return 0;
        }
        if (target > 2) {
            return JumpFloor(target - 1) + JumpFloor(target - 2);
        } else {
            return target;
        }
    }

}
