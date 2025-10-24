package com.shanzhu.music.service;

import com.shanzhu.music.entity.po.Consumer;
//import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.List;

/**
 * 前台用户相关 服务层
 *
 * @author: ShanZhu
 * @date: 2023-11-25
 */
public interface ConsumerService {

    /**
     * 添加前台用户
     *
     * @param consumer 前台用户信息
     * @return 结果
     */
    Boolean insert(Consumer consumer);

    /**
     * 更新前端用户
     *
     * @param consumer 前端用户
     * @return 结果
     */
    Boolean update(Consumer consumer);

    /**
     * 删除前端用户
     *
     * @param id 用户id
     * @return 结果
     */
    Boolean delete(Integer id);

    /**
     * 根据主键查询整个对象
     *
     * @param id 主键id
     * @return 前台用户
     */
    Consumer selectByPrimaryKey(Integer id);

    /**
     * 查询所有前台用户
     *
     * @return 前台用户
     */
    List<Consumer> allConsumer();

    /**
     * 查看密码是否正确
     *
     * @param username 用户名
     * @param password 密码
     * @return 结果
     */
    Boolean verifyPassword(String username, String password);

    /**
     * 根据账号查询
     *
     * @param username 账号名
     * @return 前端用户
     */
    Consumer getByUsername(String username);
}
