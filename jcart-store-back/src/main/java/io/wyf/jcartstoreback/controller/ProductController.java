package io.wyf.jcartstoreback.controller;

import io.wyf.jcartstoreback.dto.in.ProductSearchInDTO;
import io.wyf.jcartstoreback.dto.out.PageOutDTO;
import io.wyf.jcartstoreback.dto.out.ProductListOutDTO;
import io.wyf.jcartstoreback.dto.out.ProductShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
                                                @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId){
        return null;
    }

}
