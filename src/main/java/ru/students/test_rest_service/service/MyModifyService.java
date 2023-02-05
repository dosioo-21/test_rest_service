package ru.students.test_rest_service.service;


import org.springframework.boot.autoconfigure.security.reactive.ReactiveSecurityAutoConfiguration;
import ru.students.test_rest_service.model.Response;

public interface MyModifyService {

    Response modify(Response response);
}
