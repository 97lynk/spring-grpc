
package io.a97lynk.client;

import io.a97lynk.common.HelloRequest;
import io.a97lynk.common.HelloResponse;
import io.a97lynk.common.HelloServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    @GrpcClient("local-grpc-server")
    private HelloServiceGrpc.HelloServiceBlockingStub helloServiceBlockingStub;

    public String sayHello(String firstName, String lastName) {
        HelloResponse response = helloServiceBlockingStub.hello(HelloRequest.newBuilder()
                .setFirstName(firstName)
                .setLastName(lastName)
                .build());

        return response.getGreeting();
    }

}
