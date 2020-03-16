package io.wyf.jcartadministrationback.controller;

import io.wyf.jcartadministrationback.constant.ClientExceptionConstant;
import io.wyf.jcartadministrationback.dto.in.AdministratorLoginInDTO;
import io.wyf.jcartadministrationback.dto.out.AdministratorLoginOutDTO;
import io.wyf.jcartadministrationback.exception.ClientException;
import io.wyf.jcartadministrationback.po.Administrator;
import io.wyf.jcartadministrationback.service.AdministratorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
class AdministrationControllerTest {

    @Autowired
    private AdministrationController administrationController;

    @MockBean
    private AdministratorService administratorService;

    @Test
    void loginSuccess() throws ClientException {
        AdministratorLoginInDTO administratorLoginInDTO = new AdministratorLoginInDTO();
        administratorLoginInDTO.setUsername("admin");
        administratorLoginInDTO.setPassword("123456");
        Administrator mockAdministrator = new Administrator();
        mockAdministrator.setUsername("admin");
        mockAdministrator.setEncryptedPassword("$2a$12$LCQseGaU5sCdBFX98Kid.OkOvcnUYYswQrbU732Y8kN.UbWDiEua.");
        when(administratorService.getByUsername("admin")).thenReturn(mockAdministrator);
        AdministratorLoginOutDTO loginOutDTO = administrationController.login(administratorLoginInDTO);
        assertNotNull(loginOutDTO);

    }

    @Test
    void loginWrongUsername(){
        AdministratorLoginInDTO administratorLoginInDTO = new AdministratorLoginInDTO();
        administratorLoginInDTO.setUsername("admin110");
        administratorLoginInDTO.setPassword("123456");
        try {
            AdministratorLoginOutDTO loginOutDTO = administrationController.login(administratorLoginInDTO);
        }catch (ClientException ex){
            String errCode = ex.getErrCode();
            assertEquals(ClientExceptionConstant.ADMINISTRATOR_USERNAME_NOT_EXIST_ERRCODE, errCode);
        }
    }

    @Test
    void loginWrongPassword(){
        AdministratorLoginInDTO administratorLoginInDTO = new AdministratorLoginInDTO();
        administratorLoginInDTO.setUsername("admin");
        administratorLoginInDTO.setPassword("abcdef");
        try {
            AdministratorLoginOutDTO loginOutDTO = administrationController.login(administratorLoginInDTO);
        }catch (ClientException ex){
            String errCode = ex.getErrCode();
            assertEquals(ClientExceptionConstant.ADMINISTRATOR_PASSWORD_INVALID_ERRCODE, errCode);
        }
    }
}