package com.hightech.apidoc.dao.ext;

import java.util.List;

import com.hightech.apidoc.dao.MBGDocAppVersionDao;
import com.hightech.apidoc.model.dvo.DocAppVersion;
import com.hightech.apidoc.model.param.AppVersionQueryParam;

public interface DocAppVersionDao extends MBGDocAppVersionDao {

    List<DocAppVersion> queryList(AppVersionQueryParam appVersionQueryPram);

    int queryCount(AppVersionQueryParam appVersionQueryPram);

    List<String> queryAllVersionStr(AppVersionQueryParam appVersionQueryParam);
}