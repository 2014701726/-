package whj.nb.motianluneureka.entity;

import java.io.Serializable;

/**
 * (City)实体类
 *
 * @author makejava
 * @since 2020-08-27 09:01:17
 */
public class City implements Serializable {
    private static final long serialVersionUID = 707511003681639008L;
    /**
     * 城市ID
     */
    private Integer cityId;
    /**
     * 城市名称
     */
    private String cityName;
    /**
     * 城市首字母
     */
    private String cityAZ;


    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityAZ() {
        return cityAZ;
    }

    public void setCityAZ(String cityAZ) {
        this.cityAZ = cityAZ;
    }

}