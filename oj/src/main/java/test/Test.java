package test;

public class Test {
    public static void main(String[] args) {
        String testCode = "public static void main(String[] args) {\n" +
                "       System.out.println(\"=========================================\");\n" +
                "       for (int i = 0; i <10000 ; i++) {\n" +
                "           i++;\n" +
                "       }\n" +
                "       System.out.println(\"=========================================\");\n" +
                "   }";
        int testCodeFirstPos = testCode.indexOf("{");
        int testCodeLastPos = testCode.lastIndexOf("}");
        testCode = testCode.substring(0,testCodeFirstPos+1) + "\n" +
                "       long concurrentTimeStart = System.nanoTime();\n" +

                "       Runtime runtime = Runtime.getRuntime();\n" +
                "       long concurrentMemoryStart = runtime.totalMemory() - runtime.freeMemory();"+
                testCode.substring(testCodeFirstPos+1,testCodeLastPos) +
                "   long concurrentTimeEnd = System.nanoTime();\n" +
                "        Runtime runtime = Runtime.getRuntime();\n" +
                "       long concurrentMemoryEnd = runtime.totalMemory() - runtime.freeMemory();\n" +
                "\n" +
                "       System.out.println(\":\"+((concurrentTimeEnd - concurrentTimeStart) / 1000000) + \" ms\");\n" +
                "       System.out.println(\":\"+((concurrentMemoryEnd - concurrentMemoryStart)/1024/1024) + \"M\");"+
                "\n}";
        System.out.println(testCode);
    }
}
