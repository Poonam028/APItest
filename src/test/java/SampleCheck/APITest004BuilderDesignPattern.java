package SampleCheck;

public class APITest004BuilderDesignPattern {
    public APITest004BuilderDesignPattern step1(){
        System.out.println("Step 1 started");
        System.out.println("Step 1 done");

        return this;
    }

    public APITest004BuilderDesignPattern step2(){
        System.out.println("Step 2 started");
        return this;
    }

    public APITest004BuilderDesignPattern step3(){
        System.out.println("Step 3 started");
        return this;
    }

    public static void main(String[] args) {
        APITest004BuilderDesignPattern bp = new APITest004BuilderDesignPattern();
        bp.step1().step2().step3();

    }
}
