package com.epam.jmp.springfoundation.actuator.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "test")
public class TestActuatorEndpoint {
    record TestData(int id, String value) {}

    @ReadOperation
    public TestData test() {
        return new TestData(1, "test");
    }
}
