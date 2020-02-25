package com.wyf.jcartstore.controller;

import com.wyf.jcartstore.dto.in.StoreUpdateProfileDTO;
import com.wyf.jcartstore.dto.out.StoreGetProfileOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/interviewProduct")
public class StoreController {

    @GetMapping("/search")
    public String product(@RequestParam String product_name,@RequestParam String product_code){
            return null;
    }

    @GetMapping("/addproduct")
    public String addProduct(){
        return null;
    }

    @PostMapping("/updateProduct")
    public void updatePro(@RequestBody StoreUpdateProfileDTO storeUpdateProfileDTO){

    }

}
