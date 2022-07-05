package org.kin.grpc.example.reactor.client;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.StringValue;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.kin.grpc.example.ReactorUserServiceGrpc;
import org.kin.grpc.example.UserPb;
import org.kin.grpc.example.UserServiceGrpc;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author huangjianqin
 * @date 2022/7/5
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @GrpcClient("grpc-server")
    private ReactorUserServiceGrpc.ReactorUserServiceStub userService;

    @GetMapping("/find")
    public Mono<String> find(){
        return userService.findByPb(StringValue.newBuilder().setValue("test").build()).map(AbstractMessage::toString);
    }
}
