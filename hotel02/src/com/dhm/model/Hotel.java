package com.dhm.model;
/**
 * 酒店类
 * @author 77089
 *
 */
public class Hotel {
	private int id;//编号
	private String name;//名称
	private String address;//地址	
	private String houseType;//房型: 大床房,标间,双床房,高级大床房
	private double price;//门市价	
	private double vipPirce;//会员专享价	
	private int moneyCoupon;//代金券:10,20,30
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHouseType() {
		return houseType;
	}
	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getVipPirce() {
		return vipPirce;
	}
	public void setVipPirce(double vipPirce) {
		this.vipPirce = vipPirce;
	}
	public int getMoneyCoupon() {
		return moneyCoupon;
	}
	public void setMoneyCoupon(int moneyCoupon) {
		this.moneyCoupon = moneyCoupon;
	}
	public Hotel(int id, String name, String address, String houseType, double price, double vipPirce,
			int moneyCoupon) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.houseType = houseType;
		this.price = price;
		this.vipPirce = vipPirce;
		this.moneyCoupon = moneyCoupon;
	}
	public Hotel() {
	}
	@Override
	public String toString() {
		return "Hotel [id=" + id + ", name=" + name + ", address=" + address + ", houseType=" + houseType + ", price="
				+ price + ", vipPirce=" + vipPirce + ", moneyCoupon=" + moneyCoupon + "]";
	}
	
	
}
