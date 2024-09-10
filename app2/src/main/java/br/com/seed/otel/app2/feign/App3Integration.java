package br.com.seed.otel.app2.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "app3-integration", url = "http://localhost:8083")
public interface App3Integration {

    @GetMapping("app3/{message}")
    String getMessage(@PathVariable("message") String message);
}
