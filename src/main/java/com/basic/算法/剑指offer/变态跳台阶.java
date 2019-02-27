package com.basic.算法.剑指offer;

/**
 * @author Blse
 * @date 2018/12/17
 * @description 通过数学推理可得 f(n) = 2 * f(n - 1)
 */
public class 变态跳台阶 {

    public int JumpFloorII(int target) {
        if (target < 0) {
            return 0;
        }
        if (target > 2) {
            return 2 * JumpFloorII(target - 1);
        } else {
            return target;
        }
    }

}
