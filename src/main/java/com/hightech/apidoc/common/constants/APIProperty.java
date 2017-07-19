package com.hightech.apidoc.common.constants;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by zhaoyun on 17/7/19.
 */
@Component
@ConfigurationProperties(prefix="apidoc")
public class APIProperty {

    /**
     * maven私库snap
     */
    private String snapDepot;
    /**
     * maven私库public
     */
    private String publicDepot;

    public String getSnapDepot() {
        return snapDepot;
    }

    public void setSnapDepot(String snapDepot) {
        this.snapDepot = snapDepot;
    }

    public String getPublicDepot() {
        return publicDepot;
    }

    public void setPublicDepot(String publicDepot) {
        this.publicDepot = publicDepot;
    }
}
