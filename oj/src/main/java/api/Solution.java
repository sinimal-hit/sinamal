package api;

public class Solution {
    public String longestPalindrome(String s) {
        int[] arr = new int[2];
        char[] chars = s.toCharArray();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int high = i, low = i;
            while (high < n - 1 && chars[i] == chars[high + 1]) {
                high++;
            }
            i = high;
            while (low - 1 >= 0 && high + 1 < n && chars[low - 1] == chars[high + 1]) {
                high++;
                low--;
            }
            if (high - low > arr[1] - arr[0]) {
                arr[0] = low;
                arr[1] = high;
            }
        }
        return s.substring(arr[0], arr[1] + 1);
    }
    public static void main(String[] args) {
        long concurrentTimeStart = System.nanoTime();
        Runtime runtime = Runtime.getRuntime();
        long concurrentMemoryStart = runtime.totalMemory() - runtime.freeMemory();
        Solution solution = new Solution();
        String s1 = "babad";
        String s2 = "cbbd";
        String s3 = "a";
        String s4 = "ac";
        int count = 0;
        if(solution.longestPalindrome(s1).equals("bab")){
            count++;
        }
        if(solution.longestPalindrome(s2).equals("bb")){
            count++;
        }
        if(solution.longestPalindrome(s3).equals("a")){
            count++;
        }
        if(solution.longestPalindrome(s4).equals("a")){
            count++;
        }
        if(count == 4){
            System.out.println("TestCase OK!");
        }else {
            System.out.println("TestCaseFailed!");
        }
        long concurrentTimeEnd = System.nanoTime();
        //Runtime runtime = Runtime.getRuntime();
        long concurrentMemoryEnd = runtime.totalMemory() - runtime.freeMemory();

        System.out.println(":"+((concurrentTimeEnd - concurrentTimeStart) / 1000000) + " ms");
        System.out.println(":"+((concurrentMemoryEnd - concurrentMemoryStart)/1024/1024) + "M");
    }
}
