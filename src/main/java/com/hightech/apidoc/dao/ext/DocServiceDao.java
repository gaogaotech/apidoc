package com.hightech.apidoc.dao.ext;

import com.hightech.apidoc.dao.MBGDocServiceDao;
import com.hightech.apidoc.model.dvo.DocService;
import com.hightech.apidoc.model.param.ServiceQueryParam;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DocServiceDao extends MBGDocServiceDao {

    List<DocService> queryAllByAppVersionId(ServiceQueryParam serviceQueryPram);

    /**  
     * @param docServiceList
     */
    void batchDeleteById(@Param("docServiceList") List<DocService> docServiceList);
}