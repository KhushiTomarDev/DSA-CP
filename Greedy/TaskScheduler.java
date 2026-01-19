//https://leetcode.com/problems/task-scheduler/description/

package Greedy;

public class TaskScheduler {
  
    public static int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for(char ch : tasks){
            freq[ch-'A']++;
        }
        int maxFreq = Integer.MIN_VALUE;
        for(int f : freq){
            maxFreq = maxFreq > f? maxFreq:f;
        }
        int count=0;
        for(int f: freq){
            if(f==maxFreq){
                count++;
            }
        }
        //block = n+1
        //gap = maxfreq-1
        //remaining elements of maxfreq will added at last so add count
        int minInterval = (maxFreq-1)*(n+1)+count;
        return tasks.length> minInterval? tasks.length:minInterval; 
    }
    public static void main(String[] args) {
        System.out.println(leastInterval(new char[]{'A', 'C', 'A', 'A', 'B'}, 2));
    }

}

