package com.basic.算法.剑指offer;

/**
 * @author Blse
 * @date 2019/2/25
 * @description
 */
public class 翻转单词顺序列 {

    public String ReverseSentence(String str) {
        if("".equals(str.trim())) {
            return str;
        }
        String[] word=str.split(" ");

        StringBuffer result = new StringBuffer();
        for(int i = word.length-1; i >= 0; i--){
            result.append(word[i]+" ");
        }
        return result.toString().trim();
    }

}
