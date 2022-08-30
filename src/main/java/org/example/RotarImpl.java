package org.example;

import com.example.grpc.RotarGrpc;
import com.example.grpc.RotarOuterClass;
import io.grpc.stub.StreamObserver;

/**
 * server application
 */
public class RotarImpl extends RotarGrpc.RotarImplBase {
    @Override
    public void greeting(RotarOuterClass.HelloRequest request,
                         StreamObserver<RotarOuterClass.HelloResponse> responseObserver) {
        System.out.println(request);
        RotarOuterClass.HelloResponse response = RotarOuterClass.HelloResponse
                .newBuilder().setGreting("hello from server " + request.getName())
                .build();
        // get response
        responseObserver.onNext(response);
        responseObserver.onCompleted();


    }
}
