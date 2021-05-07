package org.table.greedy;

import java.util.Arrays;

/**
 * 第i个人的体重为people[i]，每艘船可以承载的最大重量为limit。
 *
 * 每艘船最多可同时载两人，但条件是这些人的重量之和最多为limit。
 *
 * 返回载到每一个人所需的最小船数。(保证每个人都能被船载)。
 *
 */
public class NumRescueBoats_0881 {
    //最重的人如果能跟最轻的走，那么就可以一起走，否则单独走。
    // 为什么不用找最极致的情况 比如 从小到大a,b,c,d 若 b + d < limit, a + d <limit,那么 b + c < limit, a + c <limit，对结果没影响
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0, j = people.length - 1, result = 0;
        while (i <= j) {
            result++;
            if (people[i] + people[j] <= limit) {
                i++;
            }
            j--;
        }
        return result;
    }
}
