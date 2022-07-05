package org.kin.grpc.example.client;

import com.google.protobuf.StringValue;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.kin.grpc.example.UserServiceGrpc;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangjianqin
 * @date 2022/7/5
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @GrpcClient("grpc-server")
    private UserServiceGrpc.UserServiceBlockingStub userService;

    @GetMapping("/find")
    public String find(){
        return userService.findByPb(StringValue.newBuilder().setValue("test").build()).toString();
    }
}
