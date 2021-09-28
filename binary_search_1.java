// 문제 출처 : https://programmers.co.kr/learn/courses/30/lessons/43238

import java.math.BigInteger;

class Solution {
 public long solution(int n, int[] times) {
        int biggest = times[0];

        for (int i = 1; i < times.length; i++)
        {
            biggest = Math.max(biggest, times[i]);
        }

        long left = 0;
        //가장 비용이 큰 케이스의 값을 구한다 (6, [7,10] 의 경우 6* 10)
        long right = (long)biggest * (long)n;

        while (left < right)
        {
            long mid = (right - left)/ 2 + left;
            // 이분탐색에서의 pivot이자 selection인 기준점,
            // 이 문제에서는 n명보다 더 많이 혹은 더 적게 심사할 수 있느냐로 판단
            long numP = numProcessed(mid, times);
            if (numP >= n)  // 더 많이 심사할 수 있을 때 최대값 감소
            {
                right = mid;
            }
            else    // 더 적게 심사할 수 있을 때 최소값 증가
            {
                left = mid + 1;
            }
        }

        return left;
    }

    //주어진 배열의 값들로 mid를 나눠서 numP에 누적
    long numProcessed(long mid, int[] times)
    {
        // 가장 비용이 큰 값을 구한 후 그 값의 중간값을 기준으로 이분탐색 하는데
        // 이때 구하고자 하는 값은 소요되는 시간의 합이므로 심사하는데 걸리는 시간을 체크
        long numP = 0;
        for (int i = 0; i < times.length; i++)
        {
            numP += mid / times[i];
        }
        return numP;
    }
}