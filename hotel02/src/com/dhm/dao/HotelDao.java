package com.dhm.dao;
/**
 * 酒店类接口
 * @author 77089
 *
 */

import java.util.List;

import com.dhm.model.Hotel;
import com.dhm.model.ResultMes;

public interface HotelDao {
	/**
	 * 显示所有的酒店信息
	 */
	List<Hotel> findHotelAll();
	
	/**
	 * 输入项：酒店名称，房型
	 * 返回订单信息
	 */
	ResultMes showOrder(Hotel hotel);
}
