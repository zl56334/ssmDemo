package com.example.ssmdemo.module.transaction.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.ssmdemo.module.transaction.pojo.entity.ModuleTransaction;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Fylan
 * @since 2022-05-06
 */
public interface IModuleTransactionService extends IService<ModuleTransaction> {

    Map<String, Object> getPageList(Long page, Long limit, String search);
}
