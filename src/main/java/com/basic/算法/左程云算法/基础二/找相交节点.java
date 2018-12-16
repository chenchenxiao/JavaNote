package com.basic.算法.左程云算法.基础二;

/**
 * @author Blse
 * @date 2018/11/27
 * @description     给定两个链表头结点，返回第一个相交的节点
 */
public class 找相交节点 {

    public static void main(String[] args) {
        // 1->2->3->4->5->6->7->null
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);
        head1.next.next.next.next.next = new Node(6);
        head1.next.next.next.next.next.next = new Node(7);

        // 0->9->8->6->7->null
        Node head2 = new Node(0);
        head2.next = new Node(9);
        head2.next.next = new Node(8);
        head2.next.next.next = head1.next.next.next.next.next; // 8->6
        System.out.println(getIntersectNode(head1, head2).value);

        // 1->2->3->4->5->6->7->4...
        head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);
        head1.next.next.next.next.next = new Node(6);
        head1.next.next.next.next.next.next = new Node(7);
        head1.next.next.next.next.next.next = head1.next.next.next; // 7->4

        // 0->9->8->2...
        head2 = new Node(0);
        head2.next = new Node(9);
        head2.next.next = new Node(8);
        head2.next.next.next = head1.next; // 8->2
        System.out.println(getIntersectNode(head1, head2));

        // 0->9->8->6->4->5->6..
        head2 = new Node(0);
        head2.next = new Node(9);
        head2.next.next = new Node(8);
        head2.next.next.next = head1.next.next.next.next.next; // 8->6
        System.out.println(getIntersectNode(head1, head2));

    }

    public static Node getIntersectNode(Node head1, Node head2) {
        if (head1 == null || head2 == null) {
            return null;
        }
        Node node1 = getRoopNode(head1);
        Node node2 = getRoopNode(head2);
        //判断链表是否有环
        if (node1 == null && node2 == null) {
            return noRoop(head1, head2);
        } else if (node1 != null && node2 != null) {
            return hasRoop(node1, head1, node2, head2);
        }
        return null;

    }

    private static Node hasRoop(Node loop1,Node head1, Node loop2, Node head2) {
        Node cur1 = null;
        Node cur2 = null;
        //当环相同时，相当于在无环链表中查找
        if (loop1 == loop2) {
            cur1 = head1;
            cur2 = head2;
            int n = 0;
            while (cur1 != loop1) {
                n++;
                cur1 = cur1.next;
            }
            while (cur2 != loop2) {
                n--;
                cur2 = cur2.next;
            }
            cur1 = n > 0 ? head1 : head2;
            cur2 = cur1 == head1 ? head2 : head1;
            n = Math.abs(n);
            while (n != 0) {
                n--;
                cur1 = cur1.next;
            }
            while (cur1 != cur2) {
                cur1 = cur1.next;
                cur2 = cur2.next;
            }
            return cur1;
        } else {
            cur1 = loop1.next;
            while (cur1 != loop1) {
                if (cur1 == loop2) {
                    return cur1;
                }
                cur1 = cur1.next;
            }
            return null;
        }
    }

    /**
     * 没有环
     * @param head1
     * @param head2
     */
    private static Node noRoop(Node head1, Node head2) {
        if (head1 == null || head2 == null) {
            return null;
        }
        Node node1 = head1;
        Node node2 = head2;
        int count1 = 0;
        int count2 = 0;
        while (node1 != null) {
            count1++;
            node1 = node1.next;
        }
        while (node2 != null) {
            count2++;
            node2 = node2.next;
        }
        int cha = count1 - count2;
        int i = 0;
        node1 = head1;
        node2 = head2;
        if (cha > 0) {
            while (i != cha) {
                node1 = node1.next;
                i++;
            }
        } else if (cha < 0) {
            cha = cha * -1;
            while (i != cha) {
                head2 = head2.next;
                i++;
            }
        }
        while (node1 != null && node2 != null) {
            if (node1 == node2) {
                return node1;
            }
            node1 = node1.next;
            node2 = node2.next;
        }
        return null;
    }

    /**
     * 拿到环的开始节点
     * @param head
     * @return
     */
    public static Node getRoopNode(Node head) {
        Node node1 = head.next;
        Node node2 = head.next.next;
        while (node1 != node2) {
            if (node2.next == null || node2.next.next == null) {
                return null;
            }
            node1 = node1.next;
            node2 = node2.next.next;
            if (node1 == node2) {
                node2 = head;
                while (node2 != node1) {
                    if (node1 == node2) {
                        return node1;
                    }
                    node1 = node1.next;
                    node2 = node2.next;
                }
                return node1;
            }
        }
        return null;
    }

}
