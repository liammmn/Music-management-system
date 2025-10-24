package com.shanzhu.music.service.impl;

import com.shanzhu.music.mapper.AdminMapper;
import com.shanzhu.music.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 后台管理 服务层实现
 *
 * @author: ShanZhu
 * @date: 2023-11-25
 */
@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {

    private final AdminMapper adminMapper;

    /**
     * 验证密码是否正确
     *
     * @param username 用户名
     * @param password 密码
     * @return 验证结果
     */
    @Override
    public Boolean verifyPassword(String username, String password) {
        return adminMapper.verifyPassword(username, password) > 0;
    }

}
