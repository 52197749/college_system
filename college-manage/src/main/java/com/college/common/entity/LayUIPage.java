package com.college.common.entity;

/**
 * Created by Autumn on 2020/7/10.
 */
public class LayUIPage {
    private int page = 1;
    private int limit = 5;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
