package com.example.ssmdemo.module.transaction.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("module_transaction")
public class Transaction {
    @TableId
    private Integer transaction_id;
    private String order_no;
    private Integer timestamp;
    private Integer user_id;
    private String username;
    private Float price;
    private Integer status;
}
