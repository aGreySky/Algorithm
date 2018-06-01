package preContest;

import java.util.Scanner;

/*标题：堆的计数


我们知道包含N个元素的堆可以看成是一棵包含N个节点的完全二叉树。  
每个节点有一个权值。对于小根堆来说，父节点的权值一定小于其子节点的权值。  


假设N个节点的权值分别是1~N，你能求出一共有多少种不同的小根堆吗？  


例如对于N=4有如下3种：


1
/ \
2   3
/
4


1
/ \
3   2
/
4


1 
/ \
2   4
/
3


由于数量可能超过整型范围，你只需要输出结果除以1000000009的余数。  




【输入格式】
一个整数N。  
对于40%的数据，1 <= N <= 1000  
对于70%的数据，1 <= N <= 10000  
对于100%的数据，1 <= N <= 100000


【输出格式】
一个整数表示答案。  


【输入样例】
4  


【输出样例】
3




资源约定：
峰值内存消耗（含虚拟机） < 256M
CPU消耗  < 1000ms




请严格按要求输出，不要画蛇添足地打印类似：“请您输入...” 的多余内容。


所有代码放在同一个源文件中，调试通过后，拷贝提交该源码。
不要使用package语句。不要使用jdk1.7及以上版本的特性。

主类的名字必须是：Main，否则按无效代码处理。*/

//f(n) = f(n-1)f(0) + f(n-2)f(1) + f(n-3)f(2) + ... + f(1)f(n-2) + f(0)f(n-1)
public class Ten {
    static long N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextLong();
        System.out.println(combo(N));
    }
    public static long combo(long n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        long temp = 0;
        for (long i = 0; i < n - 1; i++) {
            temp += combo(n - i - 1) * combo(i + 1);
        }
        return temp;
    }
}
