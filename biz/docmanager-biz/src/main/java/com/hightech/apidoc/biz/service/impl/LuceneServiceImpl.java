package com.hightech.apidoc.biz.service.impl;

import com.hightech.apidoc.biz.service.LuceneService;
import com.hightech.apidoc.core.lucene.IndexSearch;
import com.hightech.apidoc.core.lucene.SearchIndexBean;
import com.hightech.apidoc.model.vo.SearchIndexVo;
import org.apache.lucene.queryparser.classic.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2016/8/11 10:11 10:18.
 * 未来不确定才更值得前行
 *
 * @author user
 */
@Service
public class LuceneServiceImpl implements LuceneService {
    protected static Logger LOGGER = LoggerFactory.getLogger(LuceneServiceImpl.class);

    @Override
    public List<SearchIndexVo> indexSearch(String keyword) {
        try {
            List<SearchIndexBean> searchIndexBeen = IndexSearch.searchIndex(keyword, 10);
            List<SearchIndexVo> voList = new ArrayList<>();
            for (SearchIndexBean bean : searchIndexBeen) {
                voList.add(indexBean2IndexVo(bean));
            }
            return voList;
        } catch (IOException e) {
            LOGGER.error("lucene search IOException", e);
        } catch (ParseException e) {
            LOGGER.error("lucene search ParseException", e);
        }
        return null;
    }

    private SearchIndexVo indexBean2IndexVo(SearchIndexBean bean) {
        SearchIndexVo vo = new SearchIndexVo();
        BeanUtils.copyProperties(bean, vo);
        return vo;
    }
}
