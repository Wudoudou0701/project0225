package io.wyf.Administrationback.controller;

import io.wyf.Administrationback.dto.in.ReturnSearchInDTO;
import io.wyf.Administrationback.dto.in.ReturnUpdateActionInDTO;
import io.wyf.Administrationback.dto.out.PageOutDTO;
import io.wyf.Administrationback.dto.out.ReturnListOutDTO;
import io.wyf.Administrationback.dto.out.ReturnShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/return")
public class ReturnController {

    @GetMapping("/search")
    public PageOutDTO<ReturnListOutDTO> search(ReturnSearchInDTO returnSearchInDTO,
                                               @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ReturnShowOutDTO getById(@RequestParam Integer returnId){
        return null;
    }

    @PostMapping("/updateAction")
    public void updateAction(@RequestBody ReturnUpdateActionInDTO returnUpdateActionInDTO){

    }
}

