package com.zz.ltcapi.entity;


public class TUserExt {

  private long id;
  private String userId;
  private double holdDongNum;
  private double fenpeiGscNum;
  private double dong;
  private double gscNum;
  private long inviteNum;
  private String invitecode;
  private String transactionCode;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private long inviteAllMoney;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public double getHoldDongNum() {
    return holdDongNum;
  }

  public void setHoldDongNum(double holdDongNum) {
    this.holdDongNum = holdDongNum;
  }


  public double getFenpeiGscNum() {
    return fenpeiGscNum;
  }

  public void setFenpeiGscNum(double fenpeiGscNum) {
    this.fenpeiGscNum = fenpeiGscNum;
  }


  public double getDong() {
    return dong;
  }

  public void setDong(double dong) {
    this.dong = dong;
  }


  public double getGscNum() {
    return gscNum;
  }

  public void setGscNum(double gscNum) {
    this.gscNum = gscNum;
  }


  public long getInviteNum() {
    return inviteNum;
  }

  public void setInviteNum(long inviteNum) {
    this.inviteNum = inviteNum;
  }


  public String getInvitecode() {
    return invitecode;
  }

  public void setInvitecode(String invitecode) {
    this.invitecode = invitecode;
  }


  public String getTransactionCode() {
    return transactionCode;
  }

  public void setTransactionCode(String transactionCode) {
    this.transactionCode = transactionCode;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.sql.Timestamp updateTime) {
    this.updateTime = updateTime;
  }


  public long getInviteAllMoney() {
    return inviteAllMoney;
  }

  public void setInviteAllMoney(long inviteAllMoney) {
    this.inviteAllMoney = inviteAllMoney;
  }

}
