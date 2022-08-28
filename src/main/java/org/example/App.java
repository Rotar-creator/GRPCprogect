package org.example;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

/**
 * server application
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, InterruptedException {
        //
        Server server = ServerBuilder.forPort(8080)
                .addService(new RotarImpl())
                //.addService(new RotarImpl())
                .build();
//hello gais
        server.start();
        System.out.println("server Started");
        server.awaitTermination();
    }
}
