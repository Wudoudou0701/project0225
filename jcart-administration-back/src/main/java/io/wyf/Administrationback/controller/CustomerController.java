package io.wyf.Administrationback.controller;

import io.wyf.Administrationback.dto.in.CustomerSearchInDTO;
import io.wyf.Administrationback.dto.out.CustomerListOutDTO;
import io.wyf.Administrationback.dto.out.CustomerShowOutDTO;
import io.wyf.Administrationback.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping("/search")
    public PageOutDTO<CustomerListOutDTO> search(CustomerSearchInDTO customerSearchInDTO,
                                                 @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public CustomerShowOutDTO getById(@RequestParam Integer customerId){
        return null;
    }

    @PostMapping("/disable")
    public void disable(@RequestParam Integer customerId){

    }

}
