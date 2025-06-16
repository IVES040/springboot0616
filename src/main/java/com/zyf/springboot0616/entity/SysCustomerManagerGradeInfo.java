package com.zyf.springboot0616.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 客户经理等级信息表
 * @TableName sys_customer_manager_grade_info
 */
@TableName(value ="sys_customer_manager_grade_info")
@Data
public class SysCustomerManagerGradeInfo {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 客户经理等级信息编号
     */
    private String client_manager_grade_information_number;

    /**
     * 客户经理等级
     */
    private String customer_manager_grade;

    /**
     * 个人贷款额度
     */
    private BigDecimal personal_loan_limit;

    /**
     * 对公额度
     */
    private Integer corporate_credit_limit;
}