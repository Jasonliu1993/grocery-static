package com.jwebcoder.grocerystatic.rpc;

import com.jwebcoder.grocerystatic.domain.NavigatationMenu;
import com.jwebcoder.grocerystatic.dto.ResponseMessage;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("groceryMain")
public interface GroceryAuthRpc {

    @GetMapping("/common/nav")
    ResponseMessage<List<NavigatationMenu>> getNav(@RequestParam(name = "token", required = false) String token, @RequestParam(name = "uri") String uri);

}
