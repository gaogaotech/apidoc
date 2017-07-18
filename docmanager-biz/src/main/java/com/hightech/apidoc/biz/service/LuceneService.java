package com.hightech.apidoc.biz.service;

import com.hightech.apidoc.model.vo.SearchIndexVo;

import java.util.List;

/**
 * Created by user on 2016/8/11 10:10.
 * 未来不确定才更值得前行
 */
public interface LuceneService {
    List<SearchIndexVo> indexSearch(String keyword);
}
