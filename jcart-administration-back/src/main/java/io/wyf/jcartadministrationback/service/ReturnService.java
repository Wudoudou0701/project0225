package io.wyf.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.wyf.jcartadministrationback.dto.in.ReturnSearchInDTO;
import io.wyf.jcartadministrationback.po.Return;

public interface ReturnService {

    Page<Return> search(ReturnSearchInDTO returnSearchInDTO, Integer pageNum);

    Return getById(Integer returnId);

    void update(Return aReturn);
}
