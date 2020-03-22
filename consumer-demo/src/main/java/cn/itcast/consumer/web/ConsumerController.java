package cn.itcast.consumer.web;

import cn.itcast.consumer.pojo.User;
import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("consumer")
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("{id}")
    public User queryById(@PathVariable("id")Long id)
    {
        String url = "http://user-service/user/" + id;
        return restTemplate.getForObject(url, User.class);
    }

}
