package whj.nb.motianluneureka.entity;

import java.util.List;


public class PageBean {

    private List<Theme> themeList;
    private List<Goods> allByType;
    private List<Goods> allByHot;
    private List<Goods> allByLove;
    private List<Goods> allByDiscount;
    private List<Goods> allByTime;

    public List<Theme> getThemeList() {
        return themeList;
    }

    public void setThemeList(List<Theme> themeList) {
        this.themeList = themeList;
    }

    public List<Goods> getAllByType() {
        return allByType;
    }

    public void setAllByType(List<Goods> allByType) {
        this.allByType = allByType;
    }

    public List<Goods> getAllByHot() {
        return allByHot;
    }

    public void setAllByHot(List<Goods> allByHot) {
        this.allByHot = allByHot;
    }

    public List<Goods> getAllByLove() {
        return allByLove;
    }

    public void setAllByLove(List<Goods> allByLove) {
        this.allByLove = allByLove;
    }

    public List<Goods> getAllByDiscount() {
        return allByDiscount;
    }

    public void setAllByDiscount(List<Goods> allByDiscount) {
        this.allByDiscount = allByDiscount;
    }

    public List<Goods> getAllByTime() {
        return allByTime;
    }

    public void setAllByTime(List<Goods> allByTime) {
        this.allByTime = allByTime;
    }
}
