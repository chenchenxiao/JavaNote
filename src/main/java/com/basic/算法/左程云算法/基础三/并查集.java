package com.basic.算法.左程云算法.基础三;

import java.util.HashMap;
import java.util.List;

/**
 * @author Blse
 * @date 2018/12/6
 * @description
 */
public class 并查集 {

    public static HashMap<Node, Node> fatherMap;
    public static HashMap<Node, Integer> sizeMap;

    public static void main(String[] args) {

    }

    public static class Node{}

    public 并查集() {
        fatherMap = new HashMap<Node, Node>();
        sizeMap = new HashMap<Node, Integer>();
    }

    public void makeSets(List<Node> nodes) {
        fatherMap.clear();
        sizeMap.clear();
        for (Node node : nodes) {
            fatherMap.put(node, node);
            sizeMap.put(node, 1);
        }
    }

    public static Node findHead(Node node) {
        Node father = fatherMap.get(node);
        if (node != null) {
            father = findHead(father);
        }
        fatherMap.put(node, father);
        return father;
    }

    public static boolean isSameSet(Node node1, Node node2) {
        return findHead(node1) == findHead(node2);
    }

    public static void union(Node node1, Node node2) {
        if (node1 == null || node2 == null) {
            return;
        }
        Node head1 = findHead(node1);
        Node head2 = findHead(node2);
        if (head1 != head2) {
            int aSetSize= sizeMap.get(head1);
            int bSetSize = sizeMap.get(head2);
            if (aSetSize <= bSetSize) {
                fatherMap.put(head1, head2);
                sizeMap.put(head2, aSetSize + bSetSize);
            } else {
                fatherMap.put(head2, head1);
                sizeMap.put(head1, aSetSize + bSetSize);
            }
        }
    }


}
