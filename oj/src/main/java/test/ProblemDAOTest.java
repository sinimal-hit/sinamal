package test;

import problem.Problem;
import problem.ProblemDAO;

public class ProblemDAOTest {
    private static void testInsert3(){
        Problem problem = new Problem();
        problem.setId(3);
        problem.setTitle("最长回文字符串");
        problem.setLevel("中等");
        problem.setDescription("给你一个字符串 s，找到 s 中最长的回文子串。\n" +
                "\n" +
                " \n" +
                "\n" +
                "示例 1：\n" +
                "\n" +
                "输入：s = \"babad\"\n" +
                "输出：\"bab\"\n" +
                "解释：\"aba\" 同样是符合题意的答案。\n" +
                "示例 2：\n" +
                "\n" +
                "输入：s = \"cbbd\"\n" +
                "输出：\"bb\"\n" +
                "示例 3：\n" +
                "\n" +
                "输入：s = \"a\"\n" +
                "输出：\"a\"\n" +
                "示例 4：\n" +
                "\n" +
                "输入：s = \"ac\"\n" +
                "输出：\"a\"\n" +
                " \n" +
                "\n" +
                "提示：\n" +
                "\n" +
                "1 <= s.length <= 1000\n" +
                "s 仅由数字和英文字母（大写和/或小写）组成\n" +
                "\n" +
                "来源：力扣（LeetCode）\n" +
                "链接：https://leetcode-cn.com/problems/longest-palindromic-substring\n" +
                "著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。");
        problem.setTemplateCode("class Solution {\n" +
                "    public String longestPalindrome(String s) {\n" +
                "\n" +
                "    }\n" +
                "}");
        problem.setTestCode("public static void main(String[] args) {\n" +
                "        Solution solution = new Solution();\n" +
                "        String s1 = \"babad\";\n" +
                "        String s2 = \"cbbd\";\n" +
                "        String s3 = \"a\";\n" +
                "        String s4 = \"ac\";\n" +
                "        int count = 0;\n" +
                "        if(solution.longestPalindrome(s1).equals(\"bab\")){\n" +
                "            count++;\n" +
                "        }\n" +
                "        if(solution.longestPalindrome(s2).equals(\"bb\")){\n" +
                "            count++;\n" +
                "        }\n" +
                "        if(solution.longestPalindrome(s3).equals(\"a\")){\n" +
                "            count++;\n" +
                "        }\n" +
                "        if(solution.longestPalindrome(s4).equals(\"a\")){\n" +
                "            count++;\n" +
                "        }\n" +
                "        if(count == 4){\n" +
                "            System.out.println(\"TestCase OK!\");\n" +
                "        }else {\n" +
                "            System.out.println(\"TestCaseFailed!\");\n" +
                "        }\n" +
                "    }");
        ProblemDAO problemDAO = new ProblemDAO();
        problemDAO.insert(problem);
    }

    public static void main(String[] args) {
        testInsert3();

    }

}
