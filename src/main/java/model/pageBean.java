package model;

import java.util.List;

public class pageBean<t> {
    private int count;
    private List<t> pages;

    public List<t> getPages() {
        return pages;
    }

    public void setPages(List<t> pages) {
        this.pages = pages;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
