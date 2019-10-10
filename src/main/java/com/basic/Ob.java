package com.basic;

/**
 * @author Blse
 * @date 2019/9/26
 * @description
 */
public class Ob  extends A{

    private String name;

    public Ob(String name){
        this.name = name + "123";
        System.out.println(this.name);
    }

    @Override
    public void methoD() {
        super.methoD();
    }

    public static void main(String[] args) {
        Ob oba=new Ob("321");
    }

}

class A{
    public void methoD() {}


}



