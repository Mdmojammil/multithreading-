package EducationDecode.synchronization.RannableCallable;

import java.util.concurrent.Callable;

public class CallableTask implements Callable {

    @Override
    public Object call() throws Exception {
        Thread.sleep(1);
        return 1;
    }

}
