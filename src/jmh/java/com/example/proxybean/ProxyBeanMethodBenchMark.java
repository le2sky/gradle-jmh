package com.example.proxybean;

import com.example.config.NoUseProxyBeanConfiguration;
import com.example.config.UseProxyBeanConfiguration;
import org.openjdk.jmh.annotations.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class ProxyBeanMethodBenchMark {

    @Benchmark
    public void useProxyBeanMethod() {
        AnnotationConfigApplicationContext sut = new AnnotationConfigApplicationContext();
        sut.register(UseProxyBeanConfiguration.class);
        sut.refresh();
    }

    @Benchmark
    public void noUseProxyBeanMethod() {
        AnnotationConfigApplicationContext sut = new AnnotationConfigApplicationContext();
        sut.register(NoUseProxyBeanConfiguration.class);
        sut.refresh();
    }
}
