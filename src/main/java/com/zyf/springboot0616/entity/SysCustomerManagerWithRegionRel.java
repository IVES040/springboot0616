package com.zyf.springboot0616.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 客户经理管理区域表
 * @TableName sys_customer_manager_with_region_rel
 */
@TableName(value ="sys_customer_manager_with_region_rel")
@Data
public class SysCustomerManagerWithRegionRel {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 用户编号
     */
    private String user_number;

    /**
     * 用户登录名
     */
    private String name;

    /**
     * 区域编号
     */
    private String area_code;

    /**
     * 管理区域类型
     */
    private String management_area_type;

    /**
     * 客户总数
     */
    private Long customers_nums;

    /**
     * 个人贷款余额
     */
    private Integer personal_loan_balance;

    /**
     * 对公贷款余额
     */
    private Integer corporate_loans_balance;
}