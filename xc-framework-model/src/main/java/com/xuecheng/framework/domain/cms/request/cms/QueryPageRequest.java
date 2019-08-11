package com.xuecheng.framework.domain.cms.request.cms;

import lombok.Data;

/**
 * @author Administrator
 * @title: QueryPageRequest
 * @projectName xc-houduan
 * @description: TODO
 * @date 2019/7/31/003114:25
 */
@Data
public class QueryPageRequest {
    //站点id
    private String siteId;
    //页面ID
    private String pageId;
    //页面名称
    private String pageName;
    //别名
    private String pageAliase;
    //模版id
    private String templateId;

}
