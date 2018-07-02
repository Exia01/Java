class castingExamples {
    public static void test1() {
        double d = 35.25;
        double dd = 35.99;

        // casting the double d into a int
        int i = (int) d;

        // casting the double dd into a int
        int ii = (int) dd;
        System.out.println(i);
        System.out.println(ii);
    }

    public static void test2() {
        long start = System.currentTimeMillis();
        Integer sum = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
        long end = System.currentTimeMillis();
        double total = (double) (end - start) / 1000;
        System.out.println("Time of execution: " + total + " seconds"); //in this case we are declaring a variable which will have to be converted to an it.
        
    }
    public static void test3() {
        long start = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
        long end = System.currentTimeMillis();
        double total = (double) (end - start) / 1000;
        System.out.println("Time of execution: " + total + " seconds");
    }


    public static void main(String[] args) {
        // test1();
        test2();
        test3();
    }
}
