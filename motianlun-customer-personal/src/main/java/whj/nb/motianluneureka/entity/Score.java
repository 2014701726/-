package whj.nb.motianluneureka.entity;


import java.sql.Date;

public class Score {

  private String scoreId;
  private String scoreNum;
  private String customerId;
  private Date updateTime;
  private Integer income;
  private Integer outgo;
  private String detail;


  public String getScoreId() {
    return scoreId;
  }

  public void setScoreId(String scoreId) {
    this.scoreId = scoreId;
  }


  public String getScoreNum() {
    return scoreNum;
  }

  public void setScoreNum(String scoreNum) {
    this.scoreNum = scoreNum;
  }


  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }

  public Integer getIncome() {
    return income;
  }

  public void setIncome(Integer income) {
    this.income = income;
  }

  public Integer getOutgo() {
    return outgo;
  }

  public void setOutgo(Integer outgo) {
    this.outgo = outgo;
  }

  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }
}
