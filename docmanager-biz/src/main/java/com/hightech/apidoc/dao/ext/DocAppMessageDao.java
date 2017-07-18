package com.hightech.apidoc.dao.ext;

import java.util.List;

import com.hightech.apidoc.dao.MBGDocAppMessageDao;
import com.hightech.apidoc.model.dvo.DocAppMessage;
import com.hightech.apidoc.model.param.AppMessageQueryParam;

public interface DocAppMessageDao extends MBGDocAppMessageDao {
    List<DocAppMessage> queryAllByAppId(AppMessageQueryParam appMessageQueryParam);

    List<DocAppMessage> queryAllWithBLOBsByAppId(AppMessageQueryParam appMessageQueryParam);

    int batchReplace(List<DocAppMessage> docAppMessages);

    int batchDelete(List<Integer> ids);
}