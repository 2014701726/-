package whj.nb.motianluneureka.entity;

import java.io.Serializable;

/**
 * (Theme)实体类
 *
 * @author makejava
 * @since 2020-08-25 18:51:38
 */
public class Theme implements Serializable {
    private static final long serialVersionUID = -93944324578993352L;
    /**
     * 专题ID
     */
    private Integer themeId;
    /**
     * 专题名称
     */
    private String themeName;
    /**
     * 专题简介
     */
    private String themeDetail;
    /**
     * 专题图片
     */
    private String themeImg;


    public Integer getThemeId() {
        return themeId;
    }

    public void setThemeId(Integer themeId) {
        this.themeId = themeId;
    }

    public String getThemeName() {
        return themeName;
    }

    public void setThemeName(String themeName) {
        this.themeName = themeName;
    }

    public String getThemeDetail() {
        return themeDetail;
    }

    public void setThemeDetail(String themeDetail) {
        this.themeDetail = themeDetail;
    }

    public String getThemeImg() {
        return themeImg;
    }

    public void setThemeImg(String themeImg) {
        this.themeImg = themeImg;
    }

}