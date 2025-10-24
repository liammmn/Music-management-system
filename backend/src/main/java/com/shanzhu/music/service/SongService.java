package com.shanzhu.music.service;

import com.shanzhu.music.entity.po.Song;

import java.util.List;

/**
 * 歌曲 服务层
 *
 * @author: ShanZhu
 * @date: 2023-11-25
 */
public interface SongService {

    /**
     * 添加歌曲
     *
     * @param song 歌曲信息
     * @return 结果
     */
    Boolean insert(Song song);

    /**
     * 修改歌曲
     *
     * @param song 歌曲信息
     * @return 删除结果
     */
    Boolean update(Song song);

    /**
     * 删除歌曲
     *
     * @param id 歌曲id
     * @return 删除结果
     */
    Boolean delete(Integer id);

    /**
     * 根据歌曲id查询歌曲对象
     *
     * @param id 歌曲id
     * @return 歌曲
     */
    Song selectByPrimaryKey(Integer id);

    /**
     * 查询所有歌曲
     *
     * @return 歌曲列表
     */
    List<Song> allSong();

    /**
     * 根据歌手名字精确查询歌曲
     *
     * @param name 歌手名
     * @return 歌曲列表
     */
    List<Song> songOfName(String name);

    /**
     * 根据歌手名字模糊查询歌曲
     *
     * @param name 歌手名称
     * @return 歌曲列表
     */
    List<Song> likeSongOfName(String name);

    /**
     * 根据歌手id查询歌曲
     *
     * @param singerId 歌手id
     * @return 歌曲列表
     */
    List<Song> songOfSingerId(Integer singerId);
}
