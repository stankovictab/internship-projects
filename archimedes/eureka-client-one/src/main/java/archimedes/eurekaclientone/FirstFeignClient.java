package archimedes.eurekaclientone;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "first-feign-client", url = "https://jsonplaceholder.typicode.com/")
public interface FirstFeignClient {

	@GetMapping(value = "/posts")
	String getPosts();
}