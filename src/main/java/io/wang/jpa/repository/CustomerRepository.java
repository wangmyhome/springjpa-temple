package io.wang.jpa.repository;

import io.wang.jpa.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
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



    //多表查询
//    @Query(nativeQuery = true,value="SELECT\n" +
//            "\ttom.id,\n" +
//            "\ttom.device_no,\n" +
//            "\ttcir.commodity_id as commodity_num,\n" +
//            "\ttci.COMMODITY_NAME as commodity_name,\n" +
//            "\ttom.CREATE_TIME,\n" +
//            "\ttom.status,\n" +
//            "\ttom.app_from,\n" +
//            "\ttom.province_id,\n" +
//            "\tcp.name_tx  as province_name\n" +
//            "FROM\n" +
//            "\t T_ORDER_MAIN tom\n" +
//            "\tLEFT JOIN T_COMMODITY_ORDER tco ON tom.ID = tco.PARENT_ORDER_ID\n" +
//            "\tLEFT JOIN T_COMMODITY_INORDER tcir ON tco.ORDER_ID = tcir.ORDER_ID\n" +
//            "\tLEFT JOIN t_commodity_info tci ON tcir.COMMODITY_ID = tci.COMMODITY_ID\n" +
//            "\tLEFT JOIN CODE_PROVINCE cp ON cp.VALUE_TX = tom.PROVINCE_ID")
//    List<OrderMainEntity> findAllByOrderMainEntity();



    //自定义返回对象查询
//    @Query(value = "SELECT new cn.gogpay.dcb.province.taxation.dto.FilingHistoryDTO(s.name, s.startDate, s.endDate) " +
//            "FROM FilingFinancialAccountingSystemEntity AS s WHERE s.userId = ?1")
//    List<FilingHistoryDTO> findAllByUserId(String userId);
}
