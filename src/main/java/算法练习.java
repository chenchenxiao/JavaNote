import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;

import java.math.BigInteger;
import java.util.*;

/**
 * @author Blse
 * @date 2018/5/7
 * @description
 */


public class 算法练习 {

    public static void main(String[] args) {
//        ListNode listNode = new ListNode(1);
//        ListNode listNode2 = new ListNode(2);
//        ListNode listNode3 = new ListNode(3);
//        ListNode listNode4 = new ListNode(4);
//        ListNode listNode5 = new ListNode(5);
//        ListNode listNode6 = new ListNode(6);
//        ListNode listNode7 = new ListNode(7);

//        ListNode listNodeA = new ListNode(0);
//        ListNode listNodeB = new ListNode(1);
//        ListNode listNodeC = new ListNode(2);
//        ListNode listNodeD = new ListNode(3);
//        ListNode listNodeE = new ListNode(2);
//        ListNode listNodeF = new ListNode(1);
//        ListNode listNodeG = new ListNode(0);
//        listNodeA.next = listNodeB;
//        listNodeB.next = listNodeC;
//        listNodeA.next = listNodeB;
//        listNodeB.next = listNodeC;
//        listNodeC.next = listNodeD;
//        listNodeD.next = listNodeE;
//        listNodeE.next = listNodeF;
//        listNodeF.next = listNodeG;

//        listNode.next = listNode2;
//        listNode2.next = listNode3;
//        listNode3.next = listNode4;
//        listNode4.next = listNode5;
//        listNode5.next = listNode6;
//        listNode6.next = listNode7;
//        listNode.next = listNode3;
//        listNode3.next = listNode4;
//        listNode2.next = listNode5;
//        listNode4.next = listNode6;
//        listNode6.next = listNode7;
//        listNode7.next = listNode2;

//        System.out.println(printListFromTailToHead(listNode));
//        System.out.println(listNode);
        //--------------
//        ArrayList list = new ArrayList();
//        list.add(0, "1");
//        list.add(0, "2");
//        list.add(0, "3");
//        System.out.println(list);
        //--------------
//        int fibonacci = Fibonacci(39);
//        System.out.println(fibonacci);
        //--------------
//        int i = JumpFloorII(4);
//        System.out.println(i);
//        System.out.println(1<<-2);
        //--------------
//        int i = RectCover(3);
//        System.out.println(i);
        //--------------
//        int[] arrays = {1,2,3,4,5,6,7,8,9,10};
//        reOrderArray(arrays);
//        System.out.println(arrays);
        //--------------
//        ListNode listNode1 = FindKthToTail(listNode, 3);
//        System.out.println(listNode1.val);
        //--------------
//        ListNode listNode1 = ReverseListDiGui(listNode);
//        System.out.println();
        //--------------
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(5);
        listNode.next = listNode2;
        listNode2.next = listNode3;
        ListNode listNode1 = new ListNode(1);
        ListNode listNode5 = new ListNode(3);
        ListNode listNode6 = new ListNode(5);
        listNode1.next = listNode5;
        listNode5.next = listNode6;
        ListNode merge = Merge(listNode, listNode1);
//        System.out.println();
        //--------------
//        int[] array = {1,2,3,2,2,2,5,4,2};
//        int i = MoreThanHalfNum_Solution(array);
//        System.out.println(i);
        //--------------
//        findWork();
        //--------------
//        findDivThree();
        //--------------
//        System.out.println(-2 % 4);
        //--------------
//        loseWay();
        //--------------
//        numArray();
        //--------------
//        addToBag();
        //--------------
//        String aabcccccaaa = zipString("aaabbbhhhshg");
//        System.out.println(aabcccccaaa);
        //--------------
//        boolean b = checkReverseEqual("gyikezpaflxdepoqekqabgrbjqhbcgwtkecrvgtiyjjliahchyenlslsnthehzbpkofvjoyhkksdmpqqnrrpsrmhjzuatpsehbfksuranmdtlgoskdpdhbkppxnuhyfpjixrjvdxlohiychpvllqwmflckxmgsxvkdcudtgvkbbtgcspbgamlddzuhwxclemwzpqmbwnlkxmevawxatbbpyozdjeovgsdmnhdvwwwtbwuniqzycsmhqlpvcgvaglxqhurhvinrycaksmqyvqjbytqcbvkdi",
//                "abgrbjqhbcgwtkecrvgtiyjjliahchyenlslsnthehzbpkofvjoyhkksdmpqqnrrpsrmhjzuatpsehbfksuranmdtlgoskdpdhbkppxnuhyfpjixrjvdxlohiychpvllqwmflckxmgsxvkdcudtgvkbbtgcspbgamlddzuhwxclemwzpqmbwnlkxmevawxatbbpyozdjeovgsdmnhdvwwwtbwuniqzycsmhqlpvcgvaglxqhurhvinrycaksmqyvqjbytqcbvkdigyikezpaflxdepoqekq");
//        System.out.println(b);
        //--------------

//        removeNode(listNode4);
//        System.out.println();
        //--------------
//        partition(listNode, 4);
//        System.out.println("");
        //--------------
//        plusAB(listNodeA, listNodeD);
        //--------------
//        boolean palindrome = isPalindrome(listNodeA);
//        System.out.println(palindrome);
//        System.out.println("10470c3b4b1fed12c3baac014be15fac67c6e815".length());
//        int gupiao = gupiao();
//        System.out.println(gupiao);
//        int result = 独立生活();
//        System.out.println(result);
//        boolean result = 吃雪糕();
//        System.out.println(result);
//          int result = 打响指();
//          System.out.println(result);
//          小熊吃糖();
//        最大乘积();
//         A和B();
//        数字分类();
//            数素数();
//        德才论();
//        部分AB();
//        锤子石头();
//        数字黑洞();
//        Students students = new Students();
//        students.setName("A");
//        System.out.println(students.getName());
//        tes(students);
//        System.out.println(students.getName());
//        月饼();
//          个位数统计();
//        组最小数();
//         程序运行时间();
//        打印沙漏();
//        旧键盘();
//        完美数列();
//          打印正方形();
//          统计成绩学生();
//          买珠子();
//        几个PAT();
//        NowCoder数列();
//          客似云来();
//            跳台阶();
//          String regx = "\\s+|,|\\.|\\?|;|:|'";
//          String str = "一,二.三?四;五:六'七 八   九";
//          String[] split = str.split(regx);
//          System.out.println(split.toString());
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String[] arrs = str.split(regx);
//        String cihui = sc.nextLine();
//        String[] reqArrs = cihui.split("\\s+");
//        List<String> strings = Arrays.asList(reqArrs);
//        int result = 0;
//        for (int i = 0 ; i < arrs.length; i++) {
//            if (strings.contains(arrs[i])) {
//                result++;
//            }
//        }
//        System.out.println(result);
//        蜜蜂寻路();
//        表达式和素数();
//        Scanner sc = new Scanner(System.in);
//        分解因数(sc.nextInt());
//        求1数();
//        外星人的语言();
//        数位和();
//        进制回文数();
//        有假币();
//          找新娘();
//        蟠桃记();
          找大王();
//        数组循环右移();
//        素数个数();
//          素数和();
//        循环数();
//          求数根();
//        杨辉三角();
    }

    public static void 杨辉三角() {
        Scanner sc = new Scanner(System.in);
        int num =  sc.nextInt();
        int[] lastArrs = new int[1];
        for (int i = 1; i <= num; i++) {
            int[] newArrs = new int[i];
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    newArrs[j] = 1;
                    System.out.print(1 + " ");
                } else {
                    int val = lastArrs[j] + lastArrs[j - 1];
                    newArrs[j] = val;
                    System.out.print(val + " ");
                }
            }
            lastArrs = newArrs;
            System.out.println(" ");

        }
    }

    public static void 求数根() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 10) {
            System.out.println(num);
            return;
        }
        int result = 0;
        boolean flag = true;
        while (flag) {
            while (num > 0) {
                int temp = num % 10;
                result += temp;
                num /= 10;
            }
            if (result < 10) {
                flag = false;
            } else {
                num = result;
                result = 0;
            }
        }
        System.out.println(result);
    }

    /**
     * 判断一个数是否是循环数，例如1723，如果所求的数
     */
    public static void 循环数() {
        Scanner sc = new Scanner(System.in);
        String val = sc.next();
        String cricle = val + val;
        int temp = 0;
        for (int i = 2; i < 6; i++) {
            String str = "";
            for (int j = 0; j < val.length(); j++) {
                String v = String.valueOf(val.charAt(j));
                if (v.equals("0")) {
                    str += v;
                } else {
                    int vv = Integer.parseInt(v) * i;
                    temp = temp * 10 + vv;
                }
            }
            str += temp;
            System.out.println(str);
            if (cricle.contains(str)) {
                System.out.println(i + ": YES" );
            } else {
                System.out.println(i + ": NO" );
            }
            temp = 0;
        }
    }

    /**
     * 给定一个数N，求从0-N中的所有素数的和
     */
    public static void 素数和() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 2; i < num; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int temp = list.get(i);
            for (int j = 0; j < size; j++) {
                if (temp + list.get(j) == num) {
                    result++;
                    continue;
                }
            }
        }
        System.out.println(result / 2);
    }

    /**
     * 给定一个数N，求从0-N中的素数的个数
     */
    public static void 素数个数() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;
        for (int i = 2; i < num; i++) {
          if (isPrime(i)){
              result++;
          }
        }
        System.out.println(result);
    }

    /**
     * 给定一个数组的长度和右移的步数，求右移后的数组
     */
    public static void 数组循环右移() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int yiNum = sc.nextInt();
        int[] arrs = new int[num];
        for (int i = 1; i <= num; i++) {
            arrs[i - 1] = i;
        }
        for (int i = 0; i < yiNum; i++) {
            //保存数组当前最后一个元素
            int temp = arrs[num - 1];
            //保存数组当前第一个元素
            int tempTwo = arrs[0];
            //循环右移
            for (int j = num - 2; j > 0; j--) {
                arrs[j + 1] = arrs[j];
            }
            //把最后一个元素的值赋给第一个元素
            arrs[0] = temp;
            //把第一个元素的值赋给第二个元素
            arrs[1] = tempTwo;
        }
        System.out.println();
    }

    /**
     * 约瑟夫问题
     */
    public static void 找大王() {
        Scanner sc = new Scanner(System.in);
        //多少人
        int num = sc.nextInt();
        //第几个人死
        int perNum = sc.nextInt();
        //死亡的人的索引
        int index = 0;
        //记录数了多少个人
        int numIndex = 0;
        ArrayList list = new ArrayList();
        for (int i = 1; i <= num; i++) {
            list.add(i);
        }
        while (list.size() != 1) {
            //如果记录的索引大于总的人数，索引减总人数可以得出重头开始排的位置
            if (index >= list.size()) {
                index -= list.size();
            }
            //找到了要死亡的人
            if (numIndex == perNum - 1) {
                list.remove(index);
                numIndex = 0;
//                index--;
            } else {
                //找不到就记录数和死亡人的索引都加一
                numIndex++;
                index++;
            }
        }
        System.out.println(list.get(0));
    }


    /**
     * 第一天悟空吃掉桃子总数一半多一个，第二天又将剩下的桃子吃掉一半多一个，
     * 以后每天吃掉前一天剩下的一半多一个，到第n天准备吃的时候只剩下一个桃子。
     * 求第一天时有多少个桃子
     */
    public static void 蟠桃记() {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int result = 1;
        for (int i = 0; i < days - 1; i++) {
            result = result * 2 + 2;
        }
        System.out.println(result);
    }

    /**
     * 有N个人找，有E个人找不到，求有多少种情况
     */
    public static void 找新娘() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int errorNum = sc.nextInt();
        int result = 1;
        int temp = num - 1;
        for (int i = 0; i < num; i++) {
            if (i < 2) {
                result *= temp;
            } else {
                temp--;
                result *= temp;
            }
        }
        result = result - (num - errorNum);
        System.out.println(result);

    }

    static int find(int num) {
        if (num == 1) {
            return 1;
        } else if(num == 2) {
            return 0;
        } else {
            return (num - 1) * (find(num - 1) + find(num - 2));
        }
    }

    /**
     * 有N张纸币，其中有一张是假的，假的比真的要轻，
     * 求最多几次能找到假币
     */
    public static void 有假币() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;
        while (num  != 1) {
            num /= 2;
            result++;
        }
        System.out.println(result);
    }

    /**
     * 求一个数的二进制是否是回文数
     */
    public static void 进制回文数() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i <= 16; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            if (i == 3) {
                System.out.println();
            }
            int val = num;
            while (val > 0) {
                int temp = val % i;
                if (temp == 0) {
                    stringBuilder.append(0);
                } else {
                    stringBuilder.append(temp);
                }
                val /= i;
            }
            String str = stringBuilder.reverse().toString();
            System.out.println(str);
            char[] arrs = str.toCharArray();
            int length = arrs.length;
            int index = 0;
            for (int j = 0; j < length / 2; j++) {
                if (arrs[j] == arrs[length - j - 1]) {
                    index++;
                }
                if (index == length / 2) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("OK");
                break;
            }
        }

    }

    /**
     *  求一个数各个位数的和，最后以给定进制数的形式输出
     */
    public static void 数位和() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int r = sc.nextInt();
        int result = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (num > 0) {
            int temp = num % r;
            if (temp != 0) {
                result += temp;
            }
            num /= r;
        }
        while (result > 0) {
            int temp = result % r;
            if (temp == 0) {
                stringBuilder.append(0);
            } else {
                char s = (char) temp;
                System.out.println(s);
                stringBuilder.append(temp);
            }
            result /= r;
        }
        System.out.println(result);
        System.out.println(stringBuilder.reverse().toString());
    }

    /**
     * 把给定的数以指定进制输出
     */
    public static void 外星人的语言() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int r = sc.nextInt();
        StringBuilder stringBuilder = new StringBuilder();
        while (num > 0) {
            int temp = num % r;
            if (temp == 0) {
                stringBuilder.append(0);
            } else {
                char ch = (char) temp;
                stringBuilder.append(ch);
            }
            num /= r;
            String str = stringBuilder.reverse().toString();
            System.out.println(str);
        }
    }

    /**
     * 求一个数中1的个数
     */
    public static void 求1数() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int r = sc.nextInt();
        while (num > 0) {
            if (num % r == 1) {
                System.out.println("1");
            }
            num /= r;
        }
    }

    /**
     * 函数：判断是不是素数
     */
    static boolean isPrime(int number) {
        for(int i=2;i<number;i++) {
            if(number%i==0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 将给定的数进行因数分解
     * @param number
     */
    public static void 分解因数(int number) {
        for(int i=2;i<number;i++) {
            if(number%i==0) {
                System.out.print(i+"  ");
                //判断number/i是不是素数，如果是素数就直接输出
                if(isPrime(number/i)) {
                    System.out.print(number/i+"  ");
                }
                else {
                    分解因数(number/i);
                }
                return; //或者break
            }
        }
    }


    public static void 表达式和素数() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = 1;
        boolean flag = true;
        boolean isSushu = true;
        for (int i = x; i <= y; i++) {
            int temp = i * i + i + 41;
            if (temp % 2 == 0 || temp % 3 == 0 || temp % 5 == 0 || temp % 7 == 0) {
                isSushu = false;
            }
        }
        if (isSushu) {
            System.out.println("success");
        } else {
            System.out.println("false");
        }
    }

    public static void 蜜蜂寻路() {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int middle = end - start;
        //斐波那契
    }

    /**
     * 斐波那契问题
     */
    public static void 跳台阶() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arrs = new int[num];
        arrs[0] = 1;
        arrs[1] = 2;
        for (int i = 2; i < num; i++) {
            arrs[i] = arrs[i - 1] + arrs[i - 2];
        }
        System.out.println(arrs[num - 1]);
    }

    /**
     * 斐波那契问题
     */
    public static void 母牛的故事() {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        //迭代  arr[i] = arr[i - 1] + arr[i - 3]
    }

    /**
     * 斐波那契问题
     */
    public static void 客似云来() {
        Scanner sc = new Scanner(System.in);
        int from = sc.nextInt();
        int to = sc.nextInt();
        int[] arrs = new int[to];
        arrs[0] = 1;
        arrs[1] = 1;
        int result = 0;
        for (int i = 2; i < to; i++) {
            arrs[i] = arrs[i - 1] + arrs[i - 2];
            if (i >= from - 1) {
                result += arrs[i];
            }
        }
        System.out.println(result);
    }

    /**
     * 斐波那契问题
     */
    public static void NowCoder数列() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arrs = new int[num];
        arrs[0] = 7;
        arrs[1] = 11;
        for (int i = 2; i < num; i++) {
            arrs[i] = arrs[i - 2] + arrs[i - 1];
        }
        System.out.println(arrs[num - 1]);
    }

    /**
     * 求给定的字符串中有几个“PAT”字符
     */
    public static void 几个PAT() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arrsA = str.toCharArray();
        int numP = 0;
        int numA = 0;
        int numT = 0;
        for (int i = 0; i < arrsA.length; i++) {
            char temp = arrsA[i];
            if (temp == 'A') {
                numA++;
            } else if (temp == 'P') {
                numP++;
            } else {
                numT++;
            }
        }
        int result = numA < numP ? numA : numP;
        result = result < numT ? result : numT;
        System.out.println(result %  1000000007);
    }

    /**
     * 给一个字符串A和一个字符串B，求A是否完全包含了B，如果不是，少了几个字符，
     */
    public static void 买珠子() {  //ppRYYGrrYBR2258  YrR8RrY
        Scanner sc = new Scanner(System.in);
        String req = sc.next();
        String real = sc.next();
        char[] reqArrs = req.toCharArray();
        char[] realArrs = real.toCharArray();
        char[] arrsA = new char[127];
        char[] arrsB = new char[127];
        for (int i = 0; i < reqArrs.length; i++) {
            arrsA[reqArrs[i]] += 1;
        }
        for (int i = 0; i < realArrs.length; i++) {
            arrsB[realArrs[i]] += 1;
        }
        int resultA = 0;
        int resultB = 0;
        String isOK = "YES";
        for (int i = 0; i < arrsA.length; i++) {
            char reqTemp = arrsA[i];
            char realTemp = arrsB[i];
            int cha = reqTemp - realTemp;
            if (cha >= 0) {
                resultA += cha;
            } else {
                resultB += realTemp - reqTemp;
                isOK = "NO";
            }
        }
        if ("YES".equals(isOK)) {
            System.out.println(isOK + " " + resultA);
        } else {
            System.out.println(isOK + " " + resultB);
        }
    }

    public static void 统计成绩学生() {
        Scanner sc = new Scanner(System.in);
        int stuNum = sc.nextInt();
        int[] stuArrs = new int[stuNum];
        for (int i = 0; i < stuNum; i++) {
            stuArrs[i] = sc.nextInt();
        }
        int reqNum = sc.nextInt();
        int[] reqArrs = new int[reqNum];
        for (int i = 0; i < reqNum; i++) {
            reqArrs[i] = sc.nextInt();
        }
        for (int i = 0; i < reqNum; i++) {
            int result = 0;
            for (int j = 0; j < stuNum; j++) {
                if (reqArrs[i] == stuArrs[j]) {
                    result++;
                }
            }
            System.out.print(result + " ");
        }
    }

    /**
     * 给定行数，打印对应行规数的正方形，第一行和最后一行全部打印，
     * 每行的第一个和最后一个字符打印，其他都不打印
     */
    public static void 打印正方形() {
        Scanner scanner = new Scanner(System.in);
        int lineNum = scanner.nextInt();
        String str = scanner.nextLine();
        double mid = Math.ceil(lineNum / 2);
        System.out.println(mid);
        for (int row = 1; row <= lineNum / 2; row++) {
            for (int line = 1; line <= lineNum; line++) {
                if (row == 1 || row == lineNum / 2 ) {
                    System.out.print(str + " ");
                } else if (line == 1 || line == lineNum) {
                        System.out.print(str + " ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println(" ");
        }
    }

    /**
     * 给定一个正整数数列，和正整数p，设这个数列中的最大值是M，最小值是m，
     * 如果M <= m * p，则称这个数列是完美数列。
     * 给定参数p和一些正整数，求最多能构成多少个完美数列
     */
    public static void 完美数列() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int p = sc.nextInt();
        int result = 0;
        List<Integer> list = new ArrayList<>(num);
        for (int i = 0; i < num; i++) {
            list.add(sc.nextInt());
        }
        int minIndex = 0;
        int maxIndex = 0;
        while (num > 0){
            int min = list.get(0);
            int max = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                int val = list.get(i);
                if (val < min) {
                    min = val;
                }
                if (val > max) {
                    max = val;
                }
            }
            num--;
            System.out.println(num);
            if (num== 5) {
                System.out.println("");
            }
            int number = 0;
            if (min * p <= max){
                for (int i = 0; number < 2; i++) {
                    if (list.get(i) == min && minIndex == 0) {
                        list.remove(i);
                        number++;
                        minIndex++;
                    } else if (list.get(i) == max && maxIndex == 0) {
                        list.remove(i);
                        number++;
                        maxIndex++;
                    }
                }
                for (int i = 0; i < list.size(); i++) {
                    int val = list.get(i);
                    if (min <= val && val <= max) {
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
    }

    /**
     * 旧键盘上坏了几个键，于是在敲一段文字的时候，对应的字符就不会出现。
     * 现在给出应该输入的一段文字、以及实际被输入的文字，请你列出
     * 肯定坏掉的那些键。
     */
    public static void 旧键盘() {
        Scanner scanner = new Scanner(System.in);
        String req = scanner.next();
        String fact = scanner.next();
        req = req.toUpperCase();
        fact = fact.toUpperCase();
        char[] reqArrs = req.toCharArray();
        char[] factArrs = fact.toCharArray();
        char[] tarArrsOne = new char[127];
        char[] tarArrsTwo = new char[127];
        for (int i = 0; i < reqArrs.length; i++) {
            tarArrsOne[reqArrs[i]] += 1;
        }
       for (int i = 0; i < factArrs.length; i++) {
           tarArrsTwo[factArrs[i]] += 1;
       }
       char temp = '0';
        StringBuilder stringBuilder = new StringBuilder();
       for (int i = 0; i < 127; i++) {
            if (tarArrsOne[i] != tarArrsTwo[i]) {
                temp = (char) i;
                stringBuilder.append(temp);
            }
       }
       System.out.println(stringBuilder.toString());



    }


    public static void 打印沙漏() {
        Scanner sc = new Scanner(System.in);
        //数量
        int num = sc.nextInt();
        String str = sc.next();
        if (num == 1) {
            System.out.println(str);
            System.out.println(0);
            return ;
        }
        if (num <= 0) {
            System.out.println(0);
            return ;
        }
        //多少个可用
        int result = 0;
        //中间变量
        int temp = 1;
        //记录最高层是多少个
        int tt = 1;
        boolean flag = true;
        while (flag) {
            //每次相差两个
            tt += 2;
            //总的个数
            temp += tt * 2;
            //如果总的小于给定的，则结果就是temp
            if (temp <= num) {
                result = temp;
            } else {
                tt -= 2;
                flag = false;
            }
        }
        //剩余的
        int res = num - result;
        //记录每行前面要打印的空格数
        int index = 0;
        //遍历输出
        for (int i = tt; i > 1; i -= 2) {
            for (int j = 0 ;j < index; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(str + " ");
            }
            index++;
            System.out.println(" ");
        }
        for (int i = 1; i <= tt; i += 2) {
            for (int j = 0 ;j < index; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(str + " ");
            }
            index--;
            System.out.println(" ");
        }
        System.out.println(res);

    }

    public static void 程序运行时间() {
        Scanner scanner = new Scanner(System.in);
        final int CLK_TCK = 100;
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int mid = end - start;
        mid /= CLK_TCK;
        int hour = mid / 3600;
        mid %= 3600;
        int minute = mid / 60;
        mid %= 60;
        System.out.println(hour + ":" + minute + ":" + mid);
    }

    public static void tes(Students students) {
        students.setName("B");
        students.setName(null);
    }


    public static void 组最小数() {
        Scanner sc = new Scanner(System.in);
        int[] arrs = new int[10];
        for (int i = 0; i < 10; i++) {
            arrs[i] = sc.nextInt();
        }
        Arrays.sort(arrs);
        int result = 0;
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (arrs[i] != 0) {
                result = arrs[i];
                index = i;
                break;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (i != index) {
                result = result * 10 + arrs[i];
            }
        }
        System.out.println(result);
    }


    public static void 个位数统计() {
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
        if (val == 0) {
            System.out.println("0:1");
        }
        int[] arrs = new int[10];
        while (val > 0) {
            int temp = val % 10;
            arrs[temp] = arrs[temp] + 1;
            val /= 10;
        }
        for (int i = 0; i < 10; i++) {
            int temp = arrs[i];
            if (temp > 0) {
                System.out.println(i + ":" + temp);
            }
        }
    }

    public static void 月饼() {
        Scanner scanner = new Scanner(System.in);
        int binNum = scanner.nextInt();
        int[] bin = new int[binNum];
        float[] price = new float[binNum];
        yuebin[] yuebins = new yuebin[binNum];
        int reqNUm = scanner.nextInt();

        //月饼总量
        for (int i = 0; i < binNum; i++) {
            bin[i] = scanner.nextInt();
        }
        //月饼价格
        for (int i = 0; i < binNum; i++) {
            price[i] = scanner.nextFloat();
        }
        //计算单价
        for (int i = 0; i < binNum; i++) {
            int b = bin[i];
            float pric = price[i];
            //单价
            float val = pric / b;
            yuebins[i] = new yuebin(b, pric, val);
        }
        BinComparator bc = new BinComparator();
        Arrays.sort(yuebins, bc);
        int index = 0;
        float result = 0;
        while (reqNUm > 0) {
            yuebin currentBin = yuebins[index];
            int currentNum = currentBin.getNum();
            float currentPrice = currentBin.getPrice();
            //价格最高的总量大于所求的，则用价格最高的就行了
            if (currentNum > reqNUm) {
                result += reqNUm * currentPrice;
                reqNUm = 0;
            } else {
                result += currentNum * currentPrice;
                reqNUm -= currentNum;
                index++;
            }
        }
        System.out.println(result);
    }

    static class BinComparator implements Comparator<yuebin> {

        @Override
        public int compare(yuebin o1, yuebin o2) {
            if (o1.getPrice() < o2.getPrice()) {
                return 1;
            } else if (o1.getPrice() > o2.getPrice()) {
                return -1;
            }
            return 0;
        }
    }

    static class yuebin{
        private int num;
        private float all;
        private float price;

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public float getAll() {
            return all;
        }

        public void setAll(float all) {
            this.all = all;
        }

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        public yuebin(int num, float all, float price) {
            this.num = num;
            this.all = all;
            this.price = price;
        }
    }

    public static void 数字黑洞() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while (number != 6174) {
            List<Integer> list = new ArrayList<>();
            while (number > 0) {
                int temp = number % 10;
                number /= 10;
                list.add(temp);
            }
            Collections.sort(list);
            int size = list.size();
            int first = 0;
            int second = 0;
            for (int i = 0; i < size; i++) {
                first = first * 10 + list.get(size - 1 - i);
                second = second * 10 + list.get(i);
            }
            number = first - second;
            System.out.println(first + "-" + second + "=" + number);
        }

    }

    public static void 锤子石头() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int middle = 0;
        int close = 0;
        int jlose = 0;
        int blose = 0;
        int cwin = 0;
        int jwin = 0;
        int bwin = 0;
        for (int i = 0; i < num; i++) {
            String first = sc.next();
            String second = sc.next();
            if (first.equals(second)) {
                middle++;
            }
            if (first.equals("C") && second.equals("B")) {
                close++;
            } else if (first.equals("C") && second.equals("J")) {
                cwin++;
            } else if (first.equals("B") && second.equals("J")) {
                close++;
            } else if (first.equals("B") && second.equals("C")) {
                bwin++;
            } else if (first.equals("J") && second.equals("B")) {
                jwin++;
            } else if(first.equals("J") && second.equals("C")){
                close++;
            }
        }
        String resultFirst = null;
        String resultSecond = null;

         resultSecond = close > jlose? "B" : (jlose > blose ? "C" : "J");
         resultFirst = cwin > jwin? "C" : (jwin > bwin ? "J" : "B");

        int win = cwin + bwin + jwin;
        int lose = close + blose + jlose;
        System.out.println(win + " " + middle + " " + lose);
        System.out.println(lose + " " + middle + " " + win);
        System.out.print(resultFirst + " ");
        System.out.println(resultSecond);
    }

    public static void 部分AB() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int Da = sc.nextInt();
        int B = sc.nextInt();
        int Db = sc.nextInt();
        int ANum = 1;
        int BNum = 1;
        int resultA = 0;
        int resultB = 0;
        while (A > 0) {
            int temp = A % 10;
            if (temp == Da) {
                resultA += Da * ANum;
                ANum *= 10;
            }
            A = A / 10;
        }
        while (B > 0) {
            int temp = B % 10;
            if (temp == Db) {
                resultB += Db * BNum;
                BNum *= 10;
            }
            B = B / 10;
        }
        System.out.println(resultA);
        System.out.println(resultB);
        System.out.println(resultA + resultB);
    }

    public static void 德才论() {
        Scanner sc = new Scanner(System.in);
        //学生数量,最低录取分,一批线
        int num = sc.nextInt();
        int L = sc.nextInt();
        int H = sc.nextInt();
        Student[] arrs = new Student[num];
        ArrayList<Student> first = new ArrayList<>();
        ArrayList<Student> second = new ArrayList<>();
        ArrayList<Student> third = new ArrayList<>();
        ArrayList<Student> fourth = new ArrayList<>();
        //被录取的学生
        int realNum = 0;
        for (int i = 0; i < num; i++) {
            int number = sc.nextInt();
            int de = sc.nextInt();
            int cai = sc.nextInt();
            Student student = new Student(number, de, cai, de + cai);
            if (de >= H && cai >= H) {
                first.add(student);
                realNum++;
            } else if (de > H && cai < H) {
                second.add(student);
                realNum++;
            } else if (de < H && cai < H &&  de >= cai) {
                third.add(student);
                realNum++;
            } else if (de > L && cai > L) {
                fourth.add(student);
                realNum++;
            }
        }
        System.out.println(realNum);
        MyComparator comparator = new MyComparator();
        Collections.sort(first, comparator);
        Collections.sort(second, comparator);
        Collections.sort(third, comparator);
        Collections.sort(fourth, comparator);
        first.addAll(second);
        first.addAll(third);
        first.addAll(fourth);
        System.out.println(" ");

    }

    static class MyComparator implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            Student stuA = o1;
            Student stuB = o2;
            if (stuA.getAll() < stuB.getAll()) {
                return 1;
            }
            if (stuA.getAll() > stuB.getAll()) {
                return -1;
            }
            if (stuA.getNumber() < stuB.getNumber() ) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    static class Student {
        private int number;
        private int de;
        private int cai;
        private int all;

        public int getAll() {
            return all;
        }

        public void setAll(int all) {
            this.all = all;
        }

        public Student(int number, int de, int cai, int all) {
            this.number = number;
            this.de = de;
            this.cai = cai;
            this.all = all;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public int getDe() {
            return de;
        }

        public void setDe(int de) {
            this.de = de;
        }

        public int getCai() {
            return cai;
        }

        public void setCai(int cai) {
            this.cai = cai;
        }


    }

    public static void 数素数() {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int num = 1;
        int index = 2;
        if (start == 1) {
            System.out.print(1 + " ");
        }
       while (num <= end) {
           for (int j = 2; j <= index; j++) {
               if (index % j ==0 && index != j) {
                   break;
               }
               if (index % j == 0 && index == j) {
                   if (num >= start) {
                       System.out.print(index + " ");
                   }
                   num++;
               }
           }
           index++;
       }
    }

    public static void 数字分类() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] vals = new int[num];
        int A1 = 0;
        int A2 = 0;
        int A2Num = 0;
        int A3 = 0;
        int A4 = 0;
        int A4Num = 0;
        int A5 = 0;
        for (int i = 0; i < num; i++) {
            int value = sc.nextInt();
            vals[i] = value;
            if (value % 5 == 0 && value % 2 == 0) {
                A1 += value;
            }
            if (value % 5 == 1) {
                if (A2Num % 2 == 0) {
                    A2 += value;
                } else {
                    A2 -= value;
                }
                A2Num ++;
            }
            if (value % 5 == 2) {
                A3++;
            }
            if (value % 5 == 3) {
                A4 += value;
                A4Num ++;
            }
            if (value % 5 == 4) {
                A5 = Math.max(value,A5);
            }
        }
        String resultA = A1 > 0? String.valueOf(A1) : "N";
        String resultB = A2 > 0? String.valueOf(A2) : "N";
        String resultC = A3 > 0? String.valueOf(A3) : "N";
        String resultD = A4 > 0? String.valueOf(A4 / A4Num) : "N";
        String resultE = A5 > 0? String.valueOf(A5) : "N";
        System.out.println(resultA + " " + resultB + " " +resultC + " " + resultD + " " + resultE);

    }

    public static void A和B() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean[] flags = new boolean[num];
        for (int i = 0; i < num; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int result = A + B;
            if (result > C ) {
                flags[i] = true;
            } else {
                flags[i] = false;
            }
        }
        for (int i = 1; i <= num; i++) {
            System.out.println("Case #" + i + ":" + flags[i - 1]);
        }

    }

    public static void 小熊吃糖() {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入小熊数量和糖数量");
        int bearNum = sc.nextInt();
        int num = sc.nextInt();
        int[] bears = new int[bearNum];
        int[] nums = new int[num];
        System.out.println("输入糖的能量值");
        for (int i = 0; i < num; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("输入熊的战斗力和饥饿值");
        Map<Integer, Integer> maps = new HashMap<>();
        for (int i = 0; i < bearNum; i++) {
            int force = sc.nextInt();
            int hungeryVal = sc.nextInt();
            bears[i] = force;
            maps.put(force, hungeryVal);
        }
        int sweetIndex = 0;
        int bearIndex = 0;
        while (num > 0 || bearIndex < bearNum) {
            //熊的饥饿值
            int temp = maps.get(bears[bearIndex]);
            //糖果的能量值
            int sweetVal = nums[sweetIndex];
            //饥饿值与能量值相减
            if (temp - sweetVal > 0) {
                int hungVal = temp - sweetVal;
                maps.put(temp, hungVal);
                System.out.println("第" + bearIndex + 1 + "只熊吃了第" + sweetIndex + 1 + "颗糖");
            } else {
                for (int i = sweetIndex + 1; i < nums.length; i++) {
                    sweetVal = nums[i];
                    if (temp - sweetVal > 0) {
                        int hungVal = temp - sweetVal;
                        maps.put(temp, hungVal);
                        System.out.println("第" + bearIndex + 1 + "只熊吃了第" + sweetIndex + 1 + "颗糖");
                    }
                }
            }
            sweetIndex++;
            bearIndex++;
            num--;
        }

    }

    public static void 最大乘积() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Long max1 = Long.MIN_VALUE,max2 = Long.MIN_VALUE,max3 = Long.MIN_VALUE;
        Long min1 = Long.MAX_VALUE,min2 = Long.MAX_VALUE,min3 = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int cur = sc.nextInt();
            if(i>1){
                max3 = Math.max(max3,(cur>0?max2:min2)*cur);
                min3 = Math.min(min3,(cur<0?max2:min2)*cur);
                System.out.println("max3-->" + max3);
                System.out.println("min3-->" + min3);
            }
            if(i>0){
                max2 = Math.max(max2,(cur>0?max1:min1)*cur);
                min2 = Math.min(min2,(cur<0?max1:min1)*cur);
                System.out.println("max2-->" + max2);
                System.out.println("min2-->" + min2);
            }
            max1 = Math.max(max1,cur);
            min1 = Math.min(min1,cur);
            System.out.println("max1-->" + max1);
            System.out.println("min1-->" + min1);

        }
        System.out.println(max3);
    }

    public static int 打响指() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入有多少个小人");

        BigInteger num = scanner.nextBigInteger();
        int result = 0;
        while (num.intValue() != 1) {
            if (num.intValue() % 2 == 0) {
                num = BigInteger.valueOf(num.intValue() / 2);
                result++;
            } else {
                num = BigInteger.valueOf(num.intValue() + 1);
                result++;
            }
        }
        return result;
    }

    public static boolean 吃雪糕() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入高温天数");
        int days = scanner.nextInt();
        System.out.println("请分别输入1份，2份，3份雪糕的数量");
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        int dayVal = 6 * days;
        int reTwo = 2 * two;
        int reThree = 3 * three;
        //单独的都大于总天数
        if (one >= dayVal || reTwo >= dayVal || reThree >= dayVal) {
            return true;
        }
        //两份的加1份大于天数或3份加1份大于天数
        if (reTwo + one >= dayVal || reThree + one >= dayVal) {
            return true;
        }
        //1 2 3份一起的
        //两份加三份的
        int val = reThree + reTwo ;
        //总天数的减val
        int resVal = dayVal - val;
        //总的减总天数
        int rdVal = val - dayVal;
        //如果一份的大于减后剩余的说明可以
        if (resVal > 0 && one >= resVal) {
            return true;
        }
        if (rdVal > 0) {
            if (rdVal % 3 == 0 || rdVal % 2 == 0) {
                return true;
            }
        }
        return false;
    }

    public static int 独立生活() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入水果数");
        int fruitNum = scanner.nextInt();
        System.out.println("输入水果单价");
        int fruitPrice = scanner.nextInt();
        System.out.println("输入房租");
        int housePrice = scanner.nextInt();
        System.out.println("输入有多少钱");
        int money = scanner.nextInt();
        int result = 0;
        if (fruitNum > 0) {
            int day = money / housePrice;
            //如果水果数大于把所有钱都开房的天数
            if (fruitNum > day) {
                result = day;
                return result;
            }
            int houseNP = fruitNum * housePrice;
            money -= houseNP;
            result = fruitNum + money / (fruitPrice + housePrice);
            return result;

        }

        int all = fruitPrice + housePrice;
        result = money / all;
        return result;
    }

    public static int gupiao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入有多少种票");
        int num = scanner.nextInt();
        System.out.println("输入借了多少钱");
        int money = scanner.nextInt();
        System.out.println("输入每种股票的买入和卖出价钱");
        int[] buyMoney = new int[num];
        int[] sellMoney = new int[num];
        int[] earnMoney = new int[num];
        for (int i = 0; i < num; i++) {
            int bM = scanner.nextInt();
            int sM = scanner.nextInt();
            int eM = sM - bM;
            buyMoney[i] = bM;
            sellMoney[i] = sM;
            earnMoney[i] = eM;
        }
        int[] real = new int[num];
        Arrays.sort(earnMoney);
        for (int j = 0; j < num; j++) {
            for (int i =0; i < num; i ++) {
                int e = sellMoney[i] - buyMoney[i] ;
                if (e == earnMoney[j]) {
                    real[j] = buyMoney[i];
                }
            }
        }
        int index = 0;
        int eIndex = num - 1;
        int result = 0;
        while (money > 0 && eIndex > 0) {
            int arrVal = real[eIndex];
            int earVal = earnMoney[eIndex];
            if (earVal != 0 && earVal > 0) {
                int val = money / arrVal;
                result += val * earVal;
                money %= arrVal;
            }
            eIndex--;
        }
        return result;
    }

    //硬币
    public static int countWays(int n) {
        // write code here
        int[] v= {1,5,10,25};
        int[] dp=new int[n+1];
        dp[0]=1;
        for(int i=0;i<v.length;i++) {
            for(int j=1;j<=n;j++) {
                if(j>=v[i]) {
                    dp[j]=(dp[j]+dp[j-v[i]])%1000000007;
                }
            }
        }
        return dp[n];
    }

    public static boolean findMagicIndex(int[] A, int n) {
       /*二分法：nlogn
         当值大于下标时 右部分肯定没有索引
         当值小于下标时 左部分肯定没有索引
         */
        int start = 0;
        int end = n-1;
        while(start<=end){
            int mid = start + ((end-start)>>1);
            if(mid==A[mid]){
                return true;
            }
            //0 1 2 3 4 5 6 7 8 9
            if(A[mid] < mid){
                start = mid + 1;
            }else if (A[mid] > mid){
                end = mid - 1;
            }
        }
        return false;

    }

    public static double antsCollision(int n) {
        int num = 1;
        int val = 0;
        for (int i = n; i > 0; i--) {
            num *= 2 * i;
            val += (i - 1) * i;
        }

       return val / num;
    }

    public static boolean isPalindrome(ListNode pHead) {
        int count = 0;
        ListNode node = pHead;
        while (node != null) {
            count++;
            node = node.next;
        }
        int mid = count / 2;
        int pre = 0;
        int beh = 0;
        for (int i = 0; i < count; i++) {
            if (i < mid) {
                int val = pHead.val;
                pre += val * Math.pow(10, i);
            } else if (i > mid){
                int val = pHead.val;
                beh += val * Math.pow(10, count - i - 1);
            }
            pHead = pHead.next;
        }
        if (pre == beh) {
            return true;
        }
        return false;
    }

    public static ListNode plusAB(ListNode a, ListNode b) {
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }
        int valA = a.val;
        int valB = b.val;
        int result = 0;
        int count = 1;
        ListNode listNode = new ListNode(-1);
        ListNode resultNode = listNode;
        while (a.next != null) {
            a = a.next;
            int val = (int) (a.val * (Math.pow(10,count)));
            valA += val;
            count++;
        }
        count = 1;
        while (b.next != null) {
            b = b.next;
            int val = (int) (b.val * (Math.pow(10,count)));
            valB += val;
            count++;
        }
        result = valA + valB;
        while (result >= 1) {
            int temp = result % 10;
            result /= 10;
            resultNode.next = new ListNode(temp);
            resultNode = resultNode.next;
        }
        return listNode.next;
    }

    public static ListNode partition(ListNode pHead, int x) {
        ListNode cur = pHead;
        ListNode Shead = new ListNode(-1);
        ListNode Bhead = new ListNode(-1);
        ListNode Stmp = Shead;
        ListNode Btmp = Bhead;
        while (cur != null) {
            if (cur.val < x) {
                Stmp.next = new ListNode(cur.val);
                Stmp = Stmp.next;
            } else {
                Btmp.next = new ListNode(cur.val);
                Btmp = Btmp.next;
            }
            cur = cur.next;
        }
        Stmp.next = Bhead.next;
        return Btmp;
    }

    public static boolean removeNode(ListNode pNode) {
        if (pNode.next == null) {
            return false;
        }
        pNode = pNode.next;
        return true;
    }

    public static boolean checkReverseEqual(String s1, String s2) {
        int lengthA = s1.length();
        int lengthB = s2.length();
        if (lengthA != lengthB) {
            return false;
        }
        int[] arrA = new int[256];
        int[] arrB = new int[256];
        for (int i = 0; i < lengthA; i++) {
            arrA[s1.charAt(i)]++;
            arrB[s2.charAt(i)]++;
        }
        for (int i = 0; i < arrA.length; i++) {
            if (arrA[i] != arrB[i]) {
                return false;
            }
        }
        return true;
    }

    public static String zipString(String iniString) {
        int length = iniString.length();
        char[] arrs = iniString.toCharArray();
        char temp = arrs[0];
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;
        for (int i = 1; i < length; i++) {
            if (temp == arrs[i]) {
                count++;
            } else {
                stringBuilder.append(temp);
                stringBuilder.append(count);
                temp = arrs[i];
                count = 1;
            }
        }
        stringBuilder.append(temp);
        stringBuilder.append(count);
        String result = stringBuilder.toString();
        if (result.length() >= length) {
            return iniString;
        }
        return result;
    }

    public static void yearGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请分别输入游戏人数，玩偶数，和位置k");
        int num = scanner.nextInt();
        int toyNum = scanner.nextInt();
        int location = scanner.nextInt();


    }

    public static void addToBag() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入有几袋零食");
        int num = scanner.nextInt();
        int[] tiji  = new int[num];
        System.out.println("输入背包容量");
        int inlcude = scanner.nextInt();
        System.out.println("输入零食的体积");
        int temp = 0;
        int result = 0;
        for (int i = 0; i < num; i++) {
            tiji[i] = scanner.nextInt();
            temp += tiji[i];
        }
        if (temp < inlcude) {
            result = 1 << num;
        } else {
            for (int i = 0; i < num; i++) {
                int priVal = tiji[i];
                if (priVal < inlcude) {
                    result++;
                }
                for (int j = i + 1; j < num; j++) {
                    int val = tiji[i] + tiji[j];
                    if (val <= inlcude) {
                        result++;
                    }
                }
            }
        }
            System.out.println(result + 1);
    }

    public static void numArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入整数和模数");
        int intVal = scanner.nextInt();
        int num = scanner.nextInt();
        int result = 0;
        for (int i = 1; i <= intVal; i++) {
            for (int j = 1; j <= intVal; j++){
                int target = i % j;
                if (target >= num) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }

    public static void loseWay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入次数");
        int num = scanner.nextInt();
        System.out.println("输入转动的方向");
        String way = scanner.next();
        int length = way.length();
        if (length != num) {
            System.out.println("请输入正确的转动方向");
            return;
        }
        int temp = 0;
        for (int i = 0; i < length; i++) {
            char c = way.charAt(i);
            if ('L' == c) {
                temp--;
            } else {
                temp++;
            }
        }
        int result = temp % 4;
        if (result == 0) {
            System.out.println("现在的方向是N");
        } else if (result == 1 || result == -3) {
            System.out.println("现在的方向是E");
        } else if (result == 2 || result == -2) {
            System.out.println("现在的方向是S");
        } else {
            System.out.println("现在的方向是W");
        }
    }

    public static void findDivThree() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入区间");
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int result = 0;
        for (int i = start; i <= end; i++) {
            int num = 0;
            for (int j = 1; j <= i; j++) {
                num += j;
            }
            if (num % 3 == 0) {
                result++;
            }
        }
        System.out.println("被3整除的有" + result + "个");
    }

    public static void findWork() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入人数和工作数");
        int peopleNum = scanner.nextInt();
        int[] workAbility = new int[peopleNum];
        int workNum = scanner.nextInt();
        int[] dif = new int[workNum];
        int[] money = new int[workNum];
        System.out.println("输入工作难度和对应的酬劳");
        for (int i = 0; i < workNum; i++) {
            dif[i] = scanner.nextInt();
            money[i] = scanner.nextInt();
        }
        System.out.println("请输入每个人的能力值");
        for (int i = 0; i < peopleNum; i++) {
            workAbility[i] = scanner.nextInt();
        }
        //  1 2 5
        // tmp = 1 result = 1 tmp = 2
        // tmp = 2 result = 2 tmp = 5
        for (int i = 0; i < peopleNum; i++) {
            int ability = workAbility[i];
            //记录最终的结果的索引
            int result = 0;
            for (int j = 0; j < workNum; j++) {
                //取得对应索引的能力值
                int temp = dif[j];
                if (temp <= ability) {
                   if (dif[result] < temp) {
                       result = j;
                   }
                }
            }
            System.out.println("能力：" + ability + "，对应的酬劳是" + money[result]);
        }


    }

    public static int MoreThanHalfNum_Solution(int [] array) {
        if (array.length == 1) {
            return array[0];
        }
        int length = array.length;
        int target = length / 2;
        int result = 0;
        int num = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] == array[j]){
                    num++;
                    if (num >= target) {
                        result = array[i];
                        return result;
                    }
                }
            }
            num = 0;
        }
        return result;
    }

    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<TreeNode> queue = new ArrayList<>();
        if (root == null) {
            return list;
        }
        queue.add(root);
        while (queue.size() != 0) {
            TreeNode temp = queue.remove(0);
            if (temp.left != null){
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
            list.add(temp.val);
        }
        return list;
    }

    public static void Mirror(TreeNode root) {
        //递归
//       if (root != null) {
//           TreeNode leftNode = root.left;
//           TreeNode rightNode = root.right;
//           root.right = leftNode;
//           root.left = rightNode;
//           Mirror(rightNode);
//           Mirror(leftNode);
//       }
        //非递归用栈实现
        if(root == null) return;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.empty()) {
            TreeNode node = stack.pop();
            if(node.left != null || node.right != null) {
                TreeNode nodeLeft = node.left;
                TreeNode nodeRight = node.right;
                node.left = nodeRight;
                node.right = nodeLeft;
            }
            if(node.left != null) stack.push(node.left);
            if(node.right != null) stack.push(node.right);
        }

    }

    public static boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root2 == null || root1 == null ) {
            return false;
        }
        boolean result = false;
        if (root1.val == root2.val) {
            result = isSubTree(root1, root2);
        }
        if (!result) {
            result = HasSubtree(root1.left, root2);
        }
        if (!result) {
            result = HasSubtree(root1.right, root2);
        }
        return result;
    }

    private static boolean isSubTree(TreeNode root1, TreeNode root2) {
        if (root2 == null) {
            return true;
        }
        if (root1 == null) {
            return  false;
        }
        if (root1.val != root2.val) {
            return false;
        }
        boolean subTree = isSubTree(root1.left, root2.left);
        if (subTree) {
            subTree = isSubTree(root1.right, root2.right);
        }
        return subTree;
    }

    public static ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode listNode = null;
        if (list1.val < list2.val) {
            listNode = list1;
            list1 = list1.next;
        } else {
            listNode = list2;
            list2 = list2.next;
        }
        ListNode result = listNode;
        while (list1 != null && list2 != null) {
            int valA = list1.val;
            int valB = list2.val;
            if (valA < valB) {
                listNode.next = list1;
                list1 = list1.next;
                listNode = listNode.next;
            } else {
                listNode.next = list2;
                list2 = list2.next;
                listNode = listNode.next;
            }
        }
        if (list1 == null) {
               listNode.next = list2;
        }
        if (list2 == null) {
            listNode.next = list1;
        }
        return result;
    }

    public static ListNode ReverseListDiGui(ListNode pHead) {
        if (pHead.next == null) {
            return pHead;
        }
        ListNode listnode = ReverseListDiGui(pHead.next);
        listnode.next = pHead;
        return listnode.next;
//如果链表为空或者链表中只有一个元素
//        if(pHead==null||pHead.next==null){
//            return pHead;
//        }
//        //先反转后面的链表，走到链表的末端结点
//        ListNode pReverseNode=ReverseListDiGui(pHead.next);
//        //再将当前节点设置为后面节点的后续节点
//        pHead.next.next=pHead;
//        pHead.next=null;
//
//        return pReverseNode;
    }

    public static ListNode ReverseList(ListNode head) {
        if(head==null)
            return null;
        //head为当前节点，如果当前节点为空的话，那就什么也不做，直接返回null；
        ListNode pre = null;
        ListNode next = null;
        //当前节点是head，pre为当前节点的前一节点，next为当前节点的下一节点
        //需要pre和next的目的是让当前节点从pre->head->next1->next2变成pre<-head next1->next2
        //即pre让节点可以反转所指方向，但反转之后如果不用next节点保存next1节点的话，此单链表就此断开了
        //所以需要用到pre和next两个节点
        //1->2->3->4->5
        //1<-2<-3 4->5
        while(head!=null){
            //做循环，如果当前节点不为空的话，始终执行此循环，此循环的目的就是让当前节点从指向next到指向pre
            //如此就可以做到反转链表的效果
            //先用next保存head的下一个节点的信息，保证单链表不会因为失去head节点的原next节点而就此断裂
            next = head.next;
            //保存完next，就可以让head从指向next变成指向pre了，代码如下
            head.next = pre;
            //head指向pre后，就继续依次反转下一个节点
            //让pre，head，next依次向后移动一个节点，继续下一次的指针反转
            pre = head;
            head = next;
        }
        //如果head为null的时候，pre就为最后一个节点了，但是链表已经反转完毕，pre就是反转后链表的第一个节点
        //直接输出pre就是我们想要得到的反转后的链表
        return pre;
//        if (head == null) {
//            return null;
//        }
//        ArrayList arrayList = new ArrayList();
//        while (head != null) {
//            arrayList.add(head);
//            head = head.next;
//        }
//        ListNode listNode = (ListNode) arrayList.get(arrayList.size() - 1);
//        for (int i = arrayList.size() - 1; i > 0; i--) {
//            ListNode listNode1 = (ListNode) arrayList.get(i - 1);
//            listNode.next = listNode1;
//            listNode = listNode.next;
//        }
//        return (ListNode) arrayList.get(arrayList.size() - 1);
    }

    public static ListNode FindKthToTail(ListNode head,int k) {
        if (head == null) {
            return null;
        }
        ListNode listNode = head;
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        if (k < 1 || k > count) {
            return null;
        }
        for (int i = count; i > k; i--) {
            listNode = listNode.next;
        }

        return listNode;
    }

    public static void reOrderArray(int [] array) {
//        int valOne = 0;
//        int valTwo = 0;
//        int index = 0;
//        //0 1 2 3 4 5 6 7 8 9
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 != 0) {
//                valOne = array[index];
//                array[index] = array[i];
//                array[i] = valOne;
//                index++;
//            }
//        }
        for (int i = 0; i < array.length;i++) {
            for (int j = array.length - 1; j>i;j--) {
                int valA = array[j];
                int valB = array[j - 1];
                if (valA % 2 == 1 && valB %2 == 0){
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }

    public static int RectCover(int target) {
        if (target <= 2) {
            return target;
        }
        int result = 0;
        int valA = 1;
        int valB = 2;
        for (int i = 2; i < target; i++) {
            result = valA + valB;
            valA = valB;
            valB = result;
        }
        return result;
    }

    public static int JumpFloorII(int target) {
        int[] jump = new int[target];
        jump[0] = 1;
        jump[1] = 2;
//        jump[2] = 4;
        //1 2 3
        for (int i = 3; i < target; i++) {
            for (int j = 0; j < i; j++) {
//                jump[i] += jump[j] % 1000000007;
                jump[i] += jump[j];
            }
        }
        int result = jump[target - 1];
        return result;

    }

    public static  int Fibonacci(int n) {
//        if (n == 1 || n == 2) {
//            return 1;
//        }
//        return Fibonacci(n - 1) + Fibonacci(n - 2);
        if (n <= 2) {
            return 1;
        }
        int valA = 1;
        int valB = 1;
        int val = 0;
        for (int i = 3; i <= n; i++) {
            val = valA + valB;
            valA = valB;
            valB = val;
        }
        return val;
    }

    //从尾到头打印
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        int i = 0;
//        while (listNode.next != null) {
//            list.add(i, listNode.val);
//            listNode = listNode.next;
//            i++;
//        }
        ArrayList<Integer> list = new ArrayList<>();
        if (listNode == null) {
            return list;
        }
        list.add(0, listNode.val);
        ListNode temp = listNode.next;
        while (temp != null) {
            list.add(0, temp.val);
            temp = temp.next;
        }
        return list;
    }


}

class ListNode {
       int val;
       ListNode next = null;

         ListNode(int val) {
           this.val = val;
       }
    }
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
}

/**
 * 学生类
 */
class Students{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}