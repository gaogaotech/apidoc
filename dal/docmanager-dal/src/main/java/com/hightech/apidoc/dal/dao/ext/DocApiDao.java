package com.hightech.apidoc.dal.dao.ext;

import com.hightech.apidoc.dal.dao.MBGDocApiDao;
import com.hightech.apidoc.model.dvo.DocApi;
import com.hightech.apidoc.model.param.ApiQueryParam;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DocApiDao extends MBGDocApiDao {

    List<DocApi> queryAllByServiceId(ApiQueryParam apiQueryPram);

    List<DocApi> queryAllWithBLOBsByServiceId(ApiQueryParam apiQueryPram);

    /**  
     * @param docApiList
     */
    void batchDeleteById(@Param("docApiList") List<DocApi> docApiList);
}