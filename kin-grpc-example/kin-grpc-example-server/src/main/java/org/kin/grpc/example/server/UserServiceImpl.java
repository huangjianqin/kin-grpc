package org.kin.grpc.example.server;

import com.google.protobuf.StringValue;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.kin.grpc.example.UserPb;
import org.kin.grpc.example.UserServiceGrpc;
import org.springframework.beans.factory.annotation.Value;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author huangjianqin
 * @date 2022/7/5
 */
@GrpcService
public class UserServiceImpl extends UserServiceGrpc.UserServiceImplBase {
    @Value("${instanceId:unknown}")
    private String instanceId;

    @Override
    public void findByPb(StringValue request, StreamObserver<UserPb> responseObserver) {
        UserPb ret = UserPb.newBuilder().setName(instanceId.concat("-").concat("ABC")).setAge(ThreadLocalRandom.current().nextInt(100)).build();
        responseObserver.onNext(ret);
        responseObserver.onCompleted();
    }
}
