package io.wang.jpa.repository;

import io.wang.jpa.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description: TODO
 * @Auther: shanpeng.wang
 * @Create: 2020/12/8 10:46
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {


    List<Customer> findByCustNameAndCustLevel(String custName, String custLevel);

    List<Customer> findByCustNameOrCustPhone(String custName, String custPhone);

    List<Customer> CustLevelBetween(int max, int min); //客户等级在min和max之间

    List<Customer> findByCustLevelLessThan(int max);  //  <

    List<Customer> findByCustLevelGreaterThan(int min);




    /**
     * 分页查询
     * @param custId
     * @param custName
     * @param pageable
     * @return
     */
    Page<Customer> findAllByCustIdLikeAndCustNameLike(String custId, String custName, Pageable pageable);
}
