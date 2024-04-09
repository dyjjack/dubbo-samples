package org.apache.dubbo.benchmark.agent;

import org.apache.skywalking.apm.agent.core.boot.OverrideImplementor;
import org.apache.skywalking.apm.agent.core.sampling.SamplingService;

@OverrideImplementor(SamplingService.class)
public class SimpleControlExtendService extends SamplingService {

    private static volatile boolean closeSamplingService = false;

    @Override
    public boolean trySampling(final String operationName) {
        if (closeSamplingService) {
            return false;
        }
        return super.trySampling(operationName);
    }

    @Override
    public void forceSampled() {
        if (closeSamplingService) {
            return;
        }
        super.forceSampled();
    }

    public static void close() {
        closeSamplingService = true;
    }

    public static void open() {
        closeSamplingService = false;
    }

}


