package com.example.hotelmanagementsystem.beans;

public class ResponseBean {

	private int code;
	private String message;
	private String description;
	private BookinInfoBean bookinInfoBean;
	private HotelInfoBean hotelInfoBean;
	private RoomInfoBean roomInfoBean;
	private UserBean userBean;
	private UserDetailsBean userDetailsBean;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BookinInfoBean getBookinInfoBean() {
		return bookinInfoBean;
	}
	public void setBookinInfoBean(BookinInfoBean bookinInfoBean) {
		this.bookinInfoBean = bookinInfoBean;
	}
	public HotelInfoBean getHotelInfoBean() {
		return hotelInfoBean;
	}
	public void setHotelInfoBean(HotelInfoBean hotelInfoBean) {
		this.hotelInfoBean = hotelInfoBean;
	}
	public RoomInfoBean getRoomInfoBean() {
		return roomInfoBean;
	}
	public void setRoomInfoBean(RoomInfoBean roomInfoBean) {
		this.roomInfoBean = roomInfoBean;
	}
	public UserBean getUserBean() {
		return userBean;
	}
	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}
	public UserDetailsBean getUserDetailsBean() {
		return userDetailsBean;
	}
	public void setUserDetailsBean(UserDetailsBean userDetailsBean) {
		this.userDetailsBean = userDetailsBean;
	}
	
	
	
}
