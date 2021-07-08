package org.table.search;

/**
 * 你是产品经理，目前正在带领一个团队开发新的产品。不幸的是，你的产品的最新版本没有通过质量检测。由于每个版本都是基于之前的版本开发的，所以错误的版本之后的所有版本都是错的。
 *
 * 假设你有 n 个版本 [1, 2, ..., n]，你想找出导致之后所有版本出错的第一个错误的版本。
 *
 * 你可以通过调用bool isBadVersion(version)接口来判断版本号 version 是否在单元测试中出错。实现一个函数来查找第一个错误的版本。你应该尽量减少对调用 API 的次数。
 *
 */
public class FirstBadVersion_0278 {
    int bad;

    public int firstBadVersion(int n, int bad) {
        this.bad = bad;
        int i = 1, j = n;
        while(i < j) {
            int m = i + (j - i) / 2;
            if (!isBadVersion(m)) {
                i = m + 1;
            } else {
                j = m;
            }
        }
        return i;
    }

    private boolean isBadVersion(int version) {
        return version >= bad;
    }

    public static void main(String[] args) {
        FirstBadVersion_0278 o = new FirstBadVersion_0278();
        System.out.println(o.firstBadVersion(2126753390, 1702766719));
    }
}
