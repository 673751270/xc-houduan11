package com.xuecheng.api.cms;

import com.xuecheng.framework.domain.cms.request.cms.QueryPageRequest;
import com.xuecheng.framework.model.response.QueryResponseResult;

/**
 * @author Administrator
 * @title: CmsPageControllerApi
 * @projectName xc-houduan
 * @description: TODO
 * @date 2019/7/31/003114:27
 */
public interface CmsPageControllerApi {

    public QueryResponseResult findList(int page, int size, QueryPageRequest queryPageRequest);

}
