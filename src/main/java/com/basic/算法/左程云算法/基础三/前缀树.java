package com.basic.算法.左程云算法.基础三;

/**
 * @author Blse
 * @date 2018/12/10
 * @description
 */
public class 前缀树 {

    public static void main(String[] args) {
        Trie trie = new Trie();
        System.out.println(trie.search("zuo"));
        trie.insert("zuo");
        System.out.println(trie.search("zuo"));
        trie.delete("zuo");
        System.out.println(trie.search("zuo"));
        trie.insert("zuo");
        trie.insert("zuo");
        trie.delete("zuo");
        System.out.println(trie.search("zuo"));
        trie.delete("zuo");
        System.out.println(trie.search("zuo"));
        trie.insert("zuoa");
        trie.insert("zuoac");
        trie.insert("zuoab");
        trie.insert("zuoad");
        trie.delete("zuoa");
        System.out.println(trie.search("zuoa"));
        System.out.println(trie.prefixNumber("zuo"));
    }


    public static class  TrieNode{
        public int path;
        public int end;
        public TrieNode[] next;

        public TrieNode() {
            end = 0;
            path = 0;
            next = new TrieNode[26];
        }
    }

    public static class Trie{
        private TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        public void insert(String str) {
            if (str == null) {
                return;
            }
            char[] arr = str.toCharArray();
            TrieNode node = root;
            for (int i = 0; i < arr.length; i++) {
                int index = arr[i] - 'a';
                if (node.next[index] == null) {
                    node.next[index] = new TrieNode();
                }
                node = node.next[index];
                node.path++;
            }
            node.end++;
        }

        public int search(String str) {
            if (str == null) {
                return 0;
            }
            char[] arr = str.toCharArray();
            TrieNode node = root;
            for (int i = 0; i < arr.length; i++) {
                int index = arr[i] - 'a';
                if (node.next[index] == null) {
                    return 0;
                }
                node = node.next[index];
            }
            return node.end;
        }

        public void delete(String str) {
            if (search(str) != 0) {
                char[] arr = str.toCharArray();
                TrieNode node = root;
                for (int i = 0; i < arr.length; i++) {
                    int index = arr[i] - 'a';
                    if (--node.next[index].path == 0) {
                        node.next[index] = null;
                        return;
                    }
                    node = node.next[index];
                }
                node.end--;
            }
        }

        public int prefixNumber(String str) {
            if (search(str) != 0) {
                return 0;
            }
            char[] arr = str.toCharArray();
            TrieNode node = root;
            for (int i = 0; i < arr.length; i++) {
                int index = arr[i] - 'a';
                if (node.next[index] == null) {
                    return 0;
                }
                node = node.next[index];
            }
            return node.path;
        }

    }


}
