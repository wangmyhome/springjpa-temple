package io.wang.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * 1.实体类和表的映射关系
 *  @Entity 声明实体类
 *  @Table：配置实体类和表的映射关系
 *      name：配置数据库表的名称
 * @Description: 实体类
 * @Auther: shanpeng.wang
 * @Create: 2020/12/8 10:28
 */

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "cst_customer")
public class Customer {

    /**
     * @Id:声明主键的配置
     *      strategy
     *          GenerationType.IDENTITY ：自增，mysql
     *                 * 底层数据库必须支持自动增长（底层数据库支持的自动增长方式，对id自增）
     *          GenerationType.SEQUENCE : 序列，oracle
     *                  * 底层数据库必须支持序列
     *          GenerationType.TABLE : jpa提供的一种机制，通过一张数据库表的形式帮助我们完成主键自增
     *          GenerationType.AUTO ： 由程序自动的帮助我们选择主键生成策略
     *
     * @Column：配置属性和字段的映射关系
     *      name：数据库中字段的名称
     *
     * @ManyToOne(cascade = CascadeType.PERSIST)	//表示多方
     * @JoinColumn(name ="role_id") //维护一个外键
     *
     * @Transient //额外字段不在数据库中
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cust_id")
    private Long custId; //客户的主键

    @Column(name = "cust_name")
    private String custName;//客户名称

    @Column(name="cust_source")
    private String custSource;//客户来源

    @Column(name="cust_level")
    private String custLevel;//客户级别

    @Column(name="cust_industry")
    private String custIndustry;//客户所属行业

    @Column(name="cust_phone")
    private String custPhone;//客户的联系方式

    @Column(name="cust_address")
    private String custAddress;//客户地址
}
