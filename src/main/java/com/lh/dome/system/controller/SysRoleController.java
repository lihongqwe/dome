package com.lh.dome.system.controller;

import cn.dev33.satoken.annotation.SaCheckRole;
import com.lh.dome.common.domain.RespResult;
import com.lh.dome.common.utils.SecurityUtils;
import com.lh.dome.system.service.SysRoleService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/system/role")
public class SysRoleController {
    @Resource
    private SysRoleService sysRoleService;

    @SaCheckRole("admin")
    @GetMapping
    public RespResult getSysRoleList(){
        return RespResult.success(sysRoleService.getRoleListByUserId(SecurityUtils.getUserId()));
    }
}
