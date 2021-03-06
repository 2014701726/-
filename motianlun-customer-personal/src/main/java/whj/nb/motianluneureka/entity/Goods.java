package whj.nb.motianluneureka.entity;


import java.sql.Date;

public class Goods {

  private long goodId;
  private String goodName;
  private String detailUrl;
  private String goodImg;
  private long lookUp;
  private java.sql.Date showTime;
  private String showAddress;
  private long goodLoveNum;
  private String detailName;
  private String skuId;
  private String goodDetail;
  private long goodCityId;
  private String performanceTypeId;
  private Integer goodPrice;


  public long getGoodId() {
    return goodId;
  }

  public void setGoodId(long goodId) {
    this.goodId = goodId;
  }


  public String getGoodName() {
    return goodName;
  }

  public void setGoodName(String goodName) {
    this.goodName = goodName;
  }


  public String getDetailUrl() {
    return detailUrl;
  }

  public void setDetailUrl(String detailUrl) {
    this.detailUrl = detailUrl;
  }


  public String getGoodImg() {
    return goodImg;
  }

  public void setGoodImg(String goodImg) {
    this.goodImg = goodImg;
  }


  public long getLookUp() {
    return lookUp;
  }

  public void setLookUp(long lookUp) {
    this.lookUp = lookUp;
  }


  public java.sql.Date getShowTime() {
    return showTime;
  }

  public void setShowTime(java.sql.Date showTime) {
    this.showTime = showTime;
  }


  public String getShowAddress() {
    return showAddress;
  }

  public void setShowAddress(String showAddress) {
    this.showAddress = showAddress;
  }


  public long getGoodLoveNum() {
    return goodLoveNum;
  }

  public void setGoodLoveNum(long goodLoveNum) {
    this.goodLoveNum = goodLoveNum;
  }


  public String getDetailName() {
    return detailName;
  }

  public void setDetailName(String detailName) {
    this.detailName = detailName;
  }


  public String getSkuId() {
    return skuId;
  }

  public void setSkuId(String skuId) {
    this.skuId = skuId;
  }


  public String getGoodDetail() {
    return goodDetail;
  }

  public void setGoodDetail(String goodDetail) {
    this.goodDetail = goodDetail;
  }


  public long getGoodCityId() {
    return goodCityId;
  }

  public void setGoodCityId(long goodCityId) {
    this.goodCityId = goodCityId;
  }


  public String getPerformanceTypeId() {
    return performanceTypeId;
  }

  public void setPerformanceTypeId(String performanceTypeId) {
    this.performanceTypeId = performanceTypeId;
  }

  public Integer getGoodPrice() {
    return goodPrice;
  }

  public void setGoodPrice(Integer goodPrice) {
    this.goodPrice = goodPrice;
  }

  public Goods() {
  }

  public Goods(long goodId, String goodName, String detailUrl, String goodImg, long lookUp, Date showTime, String showAddress, long goodLoveNum, String detailName, String skuId, String goodDetail, long goodCityId, String performanceTypeId, Integer goodPrice) {
    this.goodId = goodId;
    this.goodName = goodName;
    this.detailUrl = detailUrl;
    this.goodImg = goodImg;
    this.lookUp = lookUp;
    this.showTime = showTime;
    this.showAddress = showAddress;
    this.goodLoveNum = goodLoveNum;
    this.detailName = detailName;
    this.skuId = skuId;
    this.goodDetail = goodDetail;
    this.goodCityId = goodCityId;
    this.performanceTypeId = performanceTypeId;
    this.goodPrice = goodPrice;
  }
}
