package com.zyf.springboot0616.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 
 * @TableName sys_customer_grade_product_rel
 */
@TableName(value ="sys_customer_grade_product_rel")
@Data
public class SysCustomerGradeProductRel {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 客户经理等级信息编号
     */
    private String customer_manager_grade_information_number;

    /**
     * 客户经理等级
     */
    private String customer_manager_grade;

    /**
     * 个人额度
     */
    private Integer personal_credit_limit;

    /**
     * 对公额度
     */
    private Integer corporate_credit_limit;

    /**
     * 产品编号
     */
    private String product_number;
}