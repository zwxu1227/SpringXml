package com.zwxu.common;


import com.zwxu.request.RequestBase;

public class InitPara {
    public static  void init(RequestBase para){
        int pageIndex = 1, pageSize = 50;
        if (para.getPageIndex() != null) {
            pageIndex = para.getPageIndex();
        }
        if (para.getPageSize() != null) {
            pageSize = para.getPageSize();
        }
        para.setPageIndex(pageIndex);
        para.setPageSize(pageSize);
        para.setSkipCount((pageIndex - 1) * pageSize);
    }
}
