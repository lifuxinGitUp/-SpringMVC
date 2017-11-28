package com.lanou.mapper;

import com.lanou.domain.Post;

/**
 * Created by dllo on 17/11/9.
 */
public interface PostMapper {
    /**
     * 根据职务id查询职务对象
     */
    Post findById(String postId);




}
