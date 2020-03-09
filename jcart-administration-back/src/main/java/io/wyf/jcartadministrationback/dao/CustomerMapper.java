package io.wyf.jcartadministrationback.dao;

import com.github.pagehelper.Page;
import io.wyf.jcartadministrationback.dto.out.CustomerListOutDTO;
import io.wyf.jcartadministrationback.po.Customer;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerMapper {
    int deleteByPrimaryKey(Integer customerId);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Integer customerId);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

    Page<CustomerListOutDTO> search(Integer pageNum);

    //custom
    Page<Customer> search(@Param("username") String username,
                          @Param("realName") String realName,
                          @Param("mobile") String mobile,
                          @Param("email") String email,
                          @Param("status") Byte status);
}