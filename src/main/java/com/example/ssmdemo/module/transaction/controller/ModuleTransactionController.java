package com.example.ssmdemo.module.transaction.controller;


import com.example.ssmdemo.module.sys.pojo.Result;
import com.example.ssmdemo.module.transaction.service.IModuleTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Fylan
 * @since 2022-05-06
 */
@Controller
@RequestMapping("/transaction")
public class ModuleTransactionController {
    private static final String prefix = "module/transaction/module-transaction";
    @Autowired
    private IModuleTransactionService moduleTransactionService;

    public Result list(Long page, Long limit, String search){
        Result result = new Result();
        result.code(20000).message("success").data(moduleTransactionService.getPageList(page, limit, search));
        return result;
    }
}
