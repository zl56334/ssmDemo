package com.example.ssmdemo.module.transaction.service.impl;



import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.ssmdemo.module.transaction.dao.ModuleTransactionMapper;
import com.example.ssmdemo.module.transaction.pojo.entity.ModuleTransaction;
import com.example.ssmdemo.module.transaction.service.IModuleTransactionService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Fylan
 * @since 2022-05-06
 */
@Service
public class ModuleTransactionServiceImpl extends ServiceImpl<ModuleTransactionMapper, ModuleTransaction> implements IModuleTransactionService {

    @Override
    public Map<String, Object> getPageList(Long page, Long limit, String search) {
        Map<String, Object> map = new HashMap<>();
        Page<ModuleTransaction> pageParam = new Page<>(page, limit);
        // from ModuleTransaction.tablename where name like '%search%'
        Wrapper<ModuleTransaction> queryWrapper = Wrappers.<ModuleTransaction>query().like("name", search);
        // select ModuleTransaction.属性 from ModuleTransaction.tablename where name like '%search%' limit page,limit
        this.page(pageParam, queryWrapper);
        Long total = baseMapper.selectCount(null);
        map.put("total", total);
        map.put("list", pageParam.getRecords());
        return map;
    }
}
