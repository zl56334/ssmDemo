package com.example.ssmdemo.module.transaction.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * <p>
 * 
 * </p>
 *
 * @author Fylan
 * @since 2022-05-06
 */
@TableName("module_transaction")
@ApiModel(value = "ModuleTransaction对象", description = "")
@Data
@ToString
public class ModuleTransaction implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    @TableId(value = "transaction_id", type = IdType.AUTO)
    private Long transactionId;

    @ApiModelProperty("订单号")
    private String orderNo;

    @ApiModelProperty("发起时间")
    private LocalDateTime timestamp;

    @ApiModelProperty("用户id")
    private Long userId;

    @ApiModelProperty("用户")
    private String username;

    @ApiModelProperty("价格")
    private BigDecimal price;

    @ApiModelProperty("状态")
    private Integer status;
}
