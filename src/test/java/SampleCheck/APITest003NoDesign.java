package SampleCheck;

public class APITest003NoDesign {
        public void step1(){
            System.out.println("step 1");
        }

    public void step2(){
        System.out.println("step 2");
    }

    public void step3(){
        System.out.println("step 3");
    }

    public static void main(String[] args) {
        APITest003NoDesign np = new APITest003NoDesign();
        np.step1();
        np.step2();
        np.step3();
    }
    }

