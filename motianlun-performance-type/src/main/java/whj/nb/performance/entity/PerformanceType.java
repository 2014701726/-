package whj.nb.performance.entity;

import java.io.Serializable;

/**
 * (PerformanceType)实体类
 *
 * @author makejava
 * @since 2020-08-25 12:03:07
 */
public class PerformanceType implements Serializable {
    private static final long serialVersionUID = -35590162821627343L;
    /**
    * 演出类型ID
    */
    private String performanceTypeId;
    /**
    * 演出类型
    */
    private String performanceType;


    public String getPerformanceTypeId() {
        return performanceTypeId;
    }

    public void setPerformanceTypeId(String performanceTypeId) {
        this.performanceTypeId = performanceTypeId;
    }

    public String getPerformanceType() {
        return performanceType;
    }

    public void setPerformanceType(String performanceType) {
        this.performanceType = performanceType;
    }

}