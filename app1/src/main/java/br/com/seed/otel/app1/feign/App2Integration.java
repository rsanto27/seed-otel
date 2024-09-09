package br.com.seed.otel.app1.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "app2-integration", url = "http://localhost:8082")
public interface App2Integration {

    @GetMapping("app2/{message}")
    String getMessage(@PathVariable("message") String message);
}
