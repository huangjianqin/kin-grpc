package org.kin.grpc.springboot.client.stubfactory;

import io.grpc.stub.AbstractStub;
import net.devh.boot.grpc.client.stubfactory.StandardJavaGrpcStubFactory;

/**
 * 创建reactor stub
 * @author huangjianqin
 * @date 2022/7/5
 */
public class ReactorStubFactory extends StandardJavaGrpcStubFactory {
    @Override
    protected String getFactoryMethodName() {
        return "newReactorStub";
    }

    @Override
    public boolean isApplicable(Class<? extends AbstractStub<?>> claxx) {
        return AbstractStub.class.isAssignableFrom(claxx) && claxx.getSimpleName().startsWith("Reactor");
    }
}
