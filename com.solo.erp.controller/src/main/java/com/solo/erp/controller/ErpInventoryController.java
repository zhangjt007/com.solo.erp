package com.solo.erp.controller;

import com.solo.erp.controller.base.BaseController;
import com.solo.erp.manager.IErpInventoryManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventory")
public class ErpInventoryController extends BaseController {
    @Autowired
    IErpInventoryManager erpInventoryManager;


}
