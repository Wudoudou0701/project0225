package io.wyf.jcartstoreback.service;

import com.github.pagehelper.Page;
import io.wyf.jcartstoreback.po.Return;

public interface ReturnService {
    Integer create(Return aReturn);

    Page<Return> getPageByCustomerId(Integer customerId, Integer pageNum);

    Return getById(Integer returnId);
}
