package test.train;

import java.util.Scanner;

/*问题描述
航班结束后，提取行李的过程并不琐碎。手提箱和行李箱出现在一条传送带上，数百名乘客争夺有利的位置从中找到并取回自己的所有物。近日，成田机场管理局已决定使这一过程更加高效。在重新设计行李认领区前，他们需要一个模拟程序，使得乘客认领行李时的耗时更平均。这个模拟假定乘客们走一条由直线段组成的路径并使用最少的时间走到他们的行李处。
对于这个问题，传送带被描述为一个简单多边形。在传送带的某些点上出现一件行李，然后以恒定的速度沿着传送带移动。乘客一开始在一个传送带组成的多边形外的点。在行李出现的同时，乘客以恒定的速度（大于行李移动的速度）移动去提取行李。乘客的路径可以接触但不能穿过传送带，且能让乘客在最短的时间内和行李位于同一个点。
在接下来这幅图中，传送带被描述成多边形ABCDEF。行李开始在左上角（A点）并按时针方向沿多边形边缘移动，如小箭头所示。乘客一开始在P点，并开始按最短的时间能和行李到达同一点（图中M点）的路径移动。乘客的移动路径如红色箭头所示。该图对应第一个输入样例。


输入格式
输入包含一个或多个测试点来描述领取行李的场景。一个场景描述开头一行为一个单独的整数N(3<=N<=100)，多边形的顶点数。接下来N行每行两个整数xi,yi,(|xi|,|yi|<=10000)，按逆时针顺序给出多边形顶点的坐标。多边形是简单多边形，也就是说它不自交，不重合。多边形的描述后接下来一行两个整数px,py(|px|,|py|<=10000)，乘客起始位置所在点的坐标。接下来两个正整数VL,VP(0<VL<VP<=10000)，分别是行李和乘客的速度。所有坐标的单位是米，速度的单位是米/分钟。
你可以假设乘客位于多边形外。行李将会从多变形的第一个顶点开始按逆时针顺序沿传送带移动。
输入以一行一个单独的0结束。
输出格式
对于每组数据，输出一行，包括测试数据编号（从1开始编号）和乘客取得行李的最少时间。使用格式如样例输出所示（用冒号隔开分钟和秒），四舍五入到最近的整数。秒数占两位（不足用前导0补齐）。
样例输入
6
0 40
0 0
20 0
20 20
40 20
40 40
120 40
70 100
4
0 0
10 0
10 10
0 10
100 100
10 11
0
样例输出
Case 1: Time = 1:02
Case 2: Time = 12:36
数据规模和约定
对于10%的数据，给出的多边形保证是凸多边形
对于20%的数据，3<=n<=4
对于40%的数据，3<=n<=50
对于100%的数据，3<=n<=100，数组组数<=10，坐标绝对值、速度<=10000*/
public class CollectingLuggage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int[][] loc = new int[n][2];
            for (int i = 0; i < n; i++) {
                loc[i][0] = sc.nextInt();
                loc[i][1] = sc.nextInt();
            }
            int x = sc.nextInt();
            int y = sc.nextInt();
            int vl = sc.nextInt();
            int vp = sc.nextInt();

        }
    }
}
