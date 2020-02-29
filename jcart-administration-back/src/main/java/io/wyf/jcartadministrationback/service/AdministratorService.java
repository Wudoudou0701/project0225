package io.wyf.jcartadministrationback.service;

import io.wyf.jcartadministrationback.po.Administrator;

public interface AdministratorService {

        Administrator getById(Integer administratorId);

        Administrator getByUsername(String username);

        void update(Administrator administrator);
}
