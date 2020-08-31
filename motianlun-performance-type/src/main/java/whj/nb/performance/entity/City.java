package whj.nb.performance.entity;

import java.io.Serializable;

/**
 * (City)实体类
 *
 * @author makejava
 * @since 2020-08-25 12:03:07
 */
public class City implements Serializable {
    private static final long serialVersionUID = 815281493401101392L;
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