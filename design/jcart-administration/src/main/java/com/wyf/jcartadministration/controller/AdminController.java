package com.wyf.jcartadministration.controller;

import com.wyf.jcartadministration.dto.in.AdminLoginDTO;
import com.wyf.jcartadministration.dto.in.AdminUpdateProfileDTO;
import com.wyf.jcartadministration.dto.out.AdminGetProfileOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/interview")
public class AdminController {

    @GetMapping("/UserList")
    public String userList(@RequestParam String userName,@RequestParam String real_name, @RequestParam String email){
            return null;
    }

    @GetMapping("/login")
    public String login(AdminLoginDTO adminLoginDTO){
        return null;
    }

    @GetMapping("/getProfile")
    public AdminGetProfileOutDTO getProfile(Integer administrator_id){
        return null;
    }



}
