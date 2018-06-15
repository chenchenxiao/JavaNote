package com.basic.jvm.类加载;

/**
 * @author Blse
 * @date 2018/1/15
 * @description     在加载类时，会按顺序加载属性，先赋值为默认值，然后再赋实际值
 *  类的加载顺序 singleton = 类的加载顺序.getSingleton(); 这行代码会加载类，然后count1和count2都加1
 *   public static int count1 ;
 *  public static int count2 = 0;  然后count2再赋值为0，所以输出结果是1，0
 *
 */
public class 类的加载顺序 {

    public static 类的加载顺序 singleton = new 类的加载顺序();
    public static int count1 ;
    public static int count2 = 0;

    private 类的加载顺序(){
        count1 ++ ;
        count2 ++ ;
    }

    public static 类的加载顺序 getSingleton() {
        return singleton;
    }

    public static void main(String[] args) {
        类的加载顺序 singleton = 类的加载顺序.getSingleton();
        System.out.println(类的加载顺序.count1 ++ );
        System.out.println(类的加载顺序.count2 ++ );
    }
}
