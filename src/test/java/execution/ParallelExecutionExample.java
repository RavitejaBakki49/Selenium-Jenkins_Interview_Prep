package execution;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelExecutionExample {

    @Test
    public void test1() throws InterruptedException {
        System.out.println("Test 1: " + Thread.currentThread().getId());
        Thread.sleep(3000);
    }

    @Test
    public void test2() throws InterruptedException {
        System.out.println("Test 2: " + Thread.currentThread().getId());
        Thread.sleep(3000);
    }


}
