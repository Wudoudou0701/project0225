package io.wyf.jcartadministrationback.controller;

import com.github.pagehelper.Page;
import io.wyf.jcartadministrationback.dto.in.CustomerSearchInDTO;
import io.wyf.jcartadministrationback.dto.out.CustomerListOutDTO;
import io.wyf.jcartadministrationback.dto.out.CustomerShowOutDTO;
import io.wyf.jcartadministrationback.dto.out.PageOutDTO;
import io.wyf.jcartadministrationback.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/search")
    public PageOutDTO<CustomerListOutDTO> search(CustomerSearchInDTO customerSearchInDTO, @RequestParam Integer pageNum){
        Page<CustomerListOutDTO> customerListOutPage = customerService.search(pageNum);
        PageOutDTO<CustomerListOutDTO> page = new PageOutDTO<>();
        page.setPageSize(customerListOutPage.getPageSize());
        page.setPageNum(customerListOutPage.getPageNum());
        page.setTotal(customerListOutPage.getTotal());
        page.setList(customerListOutPage);
        return page;
    }

    @GetMapping("/getById")
    public CustomerShowOutDTO getById(@RequestParam Integer customerId) {
        CustomerShowOutDTO customerShowOutDTO = customerService.getById(customerId);
        return customerShowOutDTO;
    }

    @PostMapping("/disable")
    public void disable(@RequestParam Integer customerId){
        customerService.disable(customerId);
    }


}
