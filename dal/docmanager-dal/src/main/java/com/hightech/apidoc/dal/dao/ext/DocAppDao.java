package com.hightech.apidoc.dal.dao.ext;

import java.util.List;

import com.hightech.apidoc.dal.dao.MBGDocAppDao;
import com.hightech.apidoc.model.dvo.AppAddPramDO;
import com.hightech.apidoc.model.dvo.DocApp;
import com.hightech.apidoc.model.param.AppQueryParam;

public interface DocAppDao extends MBGDocAppDao {

    /**  
     * @param appAddPramDO
     */
    void addApp(AppAddPramDO appAddPramDO);

    List<DocApp> queryAll(AppQueryParam appQueryPram);

}