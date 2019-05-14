package com.basic.算法;

import java.util.*;

/**
 * @author Blse
 * @date 2019/3/23
 * @description
 */
public class Main {

    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        //有多少行数据
        int num = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num; i++) {
            //朋友圈有多少个人
            int K = sc.nextInt();
            for (int j = 0; j < K; j++) {
                int val = sc.nextInt();
                map.put(val, val);
            }
        }
        //要查询的人数
        int M = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            int val = sc.nextInt();
            if (map.get(val) == null && !list.contains(val)) {
                list.add(val);
            }
        }
        if (list.size() == 0) {
            System.out.println("No one is handsome");
        } else {
            for (int i = 0; i < list.size() - 1; i++) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println(list.get(list.size() - 1));
        }
    }

    public static void main2(String[] ars) {
        Scanner sc = new Scanner(System.in);
        //时间
        String time = sc.next();
        String[] arrs = time.split(":");
        int hours = Integer.parseInt(arrs[0]);
        String min = arrs[1];
        //当前时间-12等于要敲多少下，再加上分钟的就是总的
        int num = 0;
        if (hours >= 12 && hours <= 24) {
            num = hours - 12;
            if (!min.equals("00")) {
                num += 1;
            }
        }
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < num; i++) {
            str.append("Dang");
        }
        if (str.length() == 0) {
            System.out.println("Only " + time + ".  "+ "Too early to Dang.");
        } else {
            System.out.println(str.toString());
        }
    }

    public static void main3(String[] ars) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        if (day < 6) {
            day += 2;
            System.out.println(day);
        } else if (day == 6) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }

    public static void main4(String[] ars) {
        Scanner sc =  new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            String name = sc.next();
            int p = sc.nextInt();
            int m = sc.nextInt();
            if (p < 15 || p > 20 || m < 50 || m > 70) {
                System.out.println(name);
            }
        }
    }

    public static void main5(String[] ars) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int val = A * B;
        int result = 0;
        while (val  != 0) {
            int n = val % 10;
            result = result * 10 + n;
            val /= 10;
        }
        System.out.println(result);
    }

    public static void main6(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < num; i++) {
            int index = -1;
            for (int j = 0; j < 4; j++) {
                String str = sc.next();
                String[] arrs = str.split("-");
                if (arrs[1].equals("T")) {
                    String val = arrs[0];
                    switch (val) {
                        case  "A" :
                            index = 1;
                            break;
                        case "B" :
                            index = 2;
                            break;
                        case "C" :
                            index = 3;
                            break;
                        case "D" :
                            index = 4;
                            break;
                        default:
                            break;
                    }
                }
            }
            result.append(index);
        }
        System.out.println(result.toString());
    }


    public static void main7(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String t = sc.next();
        sc.nextLine();
        String str = sc.nextLine();
        int length = str.length();
        StringBuilder result = new StringBuilder();
        if (num > length) {
            for (int i = 0; i < num - length; i++) {
                result.append(t);
            }
            result.append(str);
        } else if (num < length) {
            int c = length - num;
            char[] chars = str.toCharArray();
            for (int i = c; i < length; i++) {
                result.append(chars[i]);
            }
        }
        System.out.println(result.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        int num = sc.nextInt();
        //存放节点对象
        HashMap<String, Node> map = new HashMap<>();
        //存放值
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            String address = sc.next();
            int val = sc.nextInt();
            String next = sc.next();
            Node node = new Node(address, val, next);
            map.put(address, node);
        }
        Node node = map.get(first);
        //去重后的链表
        LinkedList<Node> finallyNode = new LinkedList<>();
        //要删除的链表
        LinkedList<Node> deleteNode = new LinkedList<>();
        //添加第一个节点
        finallyNode.add(node);
        list.add(node.getVal());
        while (map.get(node.getNext()) != null) {
            node = map.get(node.getNext());
            int valTemp = Math.abs(node.getVal());
            if (list.contains(valTemp)) {
                deleteNode.add(node);
            } else {
                finallyNode.add(node);
            }
            list.add(valTemp);
        }
        while (!finallyNode.isEmpty()) {
            Node nodeTemp = finallyNode.poll();
            if (finallyNode.peek() != null) {
                nodeTemp.setNext(finallyNode.peek().getAddress());
            } else {
                nodeTemp.setNext("-1");
            }
            System.out.println(nodeTemp);
        }
        while (!deleteNode.isEmpty()) {
            Node nodeTemp = deleteNode.poll();
            if (deleteNode.peek() != null) {
                nodeTemp.setNext(deleteNode.peek().getAddress());
            } else {
                nodeTemp.setNext("-1");
            }
            System.out.println(nodeTemp);
        }

    }

    public static void main9(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int bag = sc.nextInt();
        int[] p = new int[num];
        int[] w = new int[num];
//        for (int i = 0; i < num; i++) {
//            p[i] = sc.nextInt();
//        }
//        for (int i = 0; i < num; i++) {
//            w[i] = sc.nextInt();
//        }
//        int val = proccess(p, w, bag);
//        System.out.println(val);
        System.out.println(maxValue1(p, w, bag));
    }

    public static int maxValue1(int[] c, int[] p, int bag) {
        return proccess2(c, p, 0, 0, bag);
    }

    public static int proccess2(int[] weights, int[] values, int i, int alreadyweight, int bag) {
        if (alreadyweight > bag) {
            return 0;
        }
        if (i == weights.length) {
            return 0;
        }
        return Math.max(

                proccess2(weights, values, i + 1, alreadyweight, bag),

                values[i] + proccess2(weights, values, i + 1, alreadyweight + weights[i], bag));
    }

    public static int proccess(int[] c, int[] p, int bag) {
        int[][] dp = new int[c.length + 1][bag + 1];
        for (int i = c.length - 1; i >= 0; i--) {
            for (int j = bag; j >= 0; j--) {
                dp[i][j] = dp[i + 1][j];
                if (j + c[i] <= bag) {
                    dp[i][j] = Math.max(dp[i][j], p[i] + dp[i + 1][j + c[i]]);
                }
            }
        }
        return dp[0][0];
    }


}

class Node {
    private String address;
    private int val;
    private String next;

    public Node(String address, int val, String next) {
        this.address = address;
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return
                "address=" + address +
                ", val=" + val +
                ", next=" + next ;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }
}