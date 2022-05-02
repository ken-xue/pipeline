package io.kenxue.pipeline.executor;

import io.kenxue.pipeline.resolver.Result;

import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class DefaultExecutorService implements ExecutorService {

    private ThreadPoolExecutor defaultExecutor = new ThreadPoolExecutor(1,1, 60L,TimeUnit.SECONDS,new LinkedBlockingDeque<>(50));

    @Override
    public Result execute(FutureTask futureTask) {
        defaultExecutor.submit(futureTask);
        return null;
    }

}
