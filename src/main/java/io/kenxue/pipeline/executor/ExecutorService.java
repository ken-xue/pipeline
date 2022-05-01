package io.kenxue.pipeline.executor;

import io.kenxue.pipeline.resolver.Result;

import java.util.concurrent.FutureTask;

public interface ExecutorService {
    Result execute(FutureTask futureTask);
}
