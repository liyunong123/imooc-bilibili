package com.imooc.bilibili.api;

import com.imooc.bilibili.domain.JsonResponse;
import com.imooc.bilibili.domain.User;
import com.imooc.bilibili.service.UserService;
import com.imooc.bilibili.service.util.RSAUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserApi {

    @Autowired
    private UserService userService;

    /**
     * 获取RSA公钥
     */
    @GetMapping("/rsa-pks")
    public JsonResponse<String> getResaPulickey(){
        String pk = RSAUtil.getPublicKeyStr();
        return new JsonResponse<>(pk);
    }

    /**
     * 用户注册
     * @param user
     * @return
     */
    @PostMapping("/Users")
    public JsonResponse<String> addUser(@RequestBody User user){
        userService.addUser(user);
        return JsonResponse.success();
    }

}
