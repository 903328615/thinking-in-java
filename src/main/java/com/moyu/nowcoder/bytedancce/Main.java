package com.moyu.nowcoder.bytedancce;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: thinking-in-java
 * @description:
 * @author: wangzibin
 * @create: 2019-03-14 11:10
 **/
public class Main {

    /**
     * 思路：过滤排序筛选
     */

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        Point[] p = new Point[500001];
        Point[] filter = new Point[500001];
        int count = scanner.nextInt();
        int curMaxRank = 0;
        int curMaxIndex = 0;

        /**
         * 确定过滤点
         *两个数的和一定，那么两数差越小，乘积越大。简单设计，该点x和y的和减去x和y差的绝对值越大，该点越好
         */
        for (int i = 0; i < count; i++) {
            p[i] = new Point();
            p[i].setX(scanner.nextInt());
            p[i].setY(scanner.nextInt());

        }
        for (int i = 0; i < count; i++) {
            int temp = p[i].x + p[i].y - Math.abs(p[i].x - p[i].y);
            if (temp > curMaxRank) {
                curMaxRank = temp;
                curMaxIndex = i;
            }
        }


        int fCount = 0;

        /**
         *过滤点
         */
        for (int i = 0; i < count; i++) {
            if (p[i].x >= p[curMaxIndex].x || p[i].y >= p[curMaxIndex].y) {
                filter[fCount++] = p[i];
            }
        }

        Arrays.sort(filter, 0, fCount);

        int maxx = -1;
        //y从大到小，若i点x值大于所有比其y值大的点的x值，那么i点为“最大点”。
        for (int i = fCount - 1; i >= 0; i--) {
            if (filter[i].x > maxx) {

                System.out.println(filter[i].x + " " + filter[i].y);
                maxx = filter[i].x;
            }
        }
    }

}

class Point implements Comparable<Point> {
    Integer x, y;

    /**
     * 返回-1当前对象排在前面、1排在后面，返回0相等
     */
    @Override
    public int compareTo(Point o) {
        if (this.y.equals(o.y)) {
            if (this.x > o.x) {
                return -1;
            } else {
                return 1;
            }
        } else {

            if (this.y < o.y) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
}
