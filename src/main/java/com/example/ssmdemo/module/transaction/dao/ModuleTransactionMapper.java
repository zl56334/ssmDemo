package com.example.ssmdemo.module.transaction.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.ssmdemo.module.transaction.pojo.entity.ModuleTransaction;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Fylan
 * @since 2022-05-06
 */
public interface ModuleTransactionMapper extends BaseMapper<ModuleTransaction> {
    public int insertModuleTransaction(ModuleTransaction moduleTransaction);
}
