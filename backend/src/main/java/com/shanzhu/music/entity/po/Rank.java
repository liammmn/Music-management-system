package com.shanzhu.music.entity.po;

import lombok.Data;

import java.io.Serializable;

/**
 * 评价
 *
 * @author: ShanZhu
 * @date: 2023-11-25
 */
@Data
public class Rank implements Serializable {

    /**
     * 主键
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer songListId;

    /**
     * 用户id
     */
    private Integer consumerId;

    /**
     * 评分
     */
    private Integer score;

}
