package com.shanzhu.music.service;


import com.shanzhu.music.entity.po.Song;
import com.shanzhu.music.entity.po.SongList;
import com.shanzhu.music.utils.recommend.dto.ProductDTO;
import com.shanzhu.music.utils.recommend.dto.RelateDTO;

import java.util.List;

/**
 * 歌单推荐服务
 *
 * @author: ShanZhu
 * @date: 2024-07-25
 */
public interface RecommendSongListService {

    /**
     * 获取评分记录
     */
    List<RelateDTO> getRankData();

    /**
     * 获取歌单数据
     */
    List<ProductDTO> getSongListData();

    /**
     * 根据用户评分推荐歌单
     */
    List<SongList> recommendSongListByRank(Integer userId);

    /**
     * 根据用户收藏进行歌单推荐
     */
    List<SongList> recommendSongListByCollect(Integer userId);

    /**
     * 推荐歌曲
     */
    List<Song> recommendSongs(Integer userId);

    /**
     * 获取歌曲数据
     * @return
     */
    List<ProductDTO> getSongData();

    /**
     * 获取用户收藏歌曲
     */
    List<RelateDTO> getCollectData();

}
