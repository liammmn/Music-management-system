package com.shanzhu.music.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * 管理员 持久层
 *
 * @author: ShanZhu
 * @date: 2023-11-25
 */
@Mapper
public interface AdminMapper {

    /**
     * 验证密码是否正确
     *
     * @param username 用户名
     * @param password 密码
     * @return 结果
     */
    Integer verifyPassword(String username, String password);

}
