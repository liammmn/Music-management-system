package com.shanzhu.music.service;

/**
 * 后台管理 服务层
 *
 * @author: ShanZhu
 * @date: 2023-11-25
 */
public interface AdminService {

    /**
     * 验证密码是否正确
     *
     * @param username 用户名
     * @param password 密码
     * @return 验证结果
     */
    Boolean verifyPassword(String username, String password);

}
