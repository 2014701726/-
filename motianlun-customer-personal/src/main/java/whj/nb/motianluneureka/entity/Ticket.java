package whj.nb.motianluneureka.entity;


public class Ticket {

  private String checkTickedId;
  private String ticketName;
  private double ticketPrice;
  private String ticketType;
  private String ticketDiscount;


  public String getCheckTickedId() {
    return checkTickedId;
  }

  public void setCheckTickedId(String checkTickedId) {
    this.checkTickedId = checkTickedId;
  }


  public String getTicketName() {
    return ticketName;
  }

  public void setTicketName(String ticketName) {
    this.ticketName = ticketName;
  }


  public double getTicketPrice() {
    return ticketPrice;
  }

  public void setTicketPrice(double ticketPrice) {
    this.ticketPrice = ticketPrice;
  }


  public String getTicketType() {
    return ticketType;
  }

  public void setTicketType(String ticketType) {
    this.ticketType = ticketType;
  }


  public String getTicketDiscount() {
    return ticketDiscount;
  }

  public void setTicketDiscount(String ticketDiscount) {
    this.ticketDiscount = ticketDiscount;
  }

}
