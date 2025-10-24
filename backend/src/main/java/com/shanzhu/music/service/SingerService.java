package com.shanzhu.music.service;

import com.shanzhu.music.entity.po.Singer;

import java.util.List;

/**
 * 歌手 服务层
 *
 * @author: ShanZhu
 * @date: 2023-11-25
 */
public interface SingerService {

    /**
     * 添加歌手
     *
     * @param singer 歌手信息
     * @return 结果
     */
    Boolean insert(Singer singer);

    /**
     * 修改歌手
     *
     * @param singer 歌手信息
     * @return 结果
     */
    Boolean update(Singer singer);

    /**
     * 删除歌手
     *
     * @param id 歌手id
     * @return 删除结果
     */
    Boolean delete(Integer id);

    /**
     * 查询歌手
     *
     * @param id 歌手id
     * @return 歌手
     */
    Singer selectByPrimaryKey(Integer id);

    /**
     * 查询所有歌手
     *
     * @return 歌手列表
     */
    List<Singer> allSinger();

    /**
     * 根据歌手名字模糊查询列表
     *
     * @param name 歌手名称
     * @return 歌手列表
     */
    List<Singer> singerOfName(String name);

    /**
     * 根据性别查询
     *
     * @param sex 性别
     * @return 歌手列表
     */
    List<Singer> singerOfSex(Integer sex);

}
