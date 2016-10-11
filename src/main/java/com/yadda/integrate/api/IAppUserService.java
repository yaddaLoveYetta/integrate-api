package com.yadda.integrate.api;

import java.util.List;

import com.yadda.integrate.model.AppUser;

public interface IAppUserService {

	/**
	 * 
	 * @Description:根据用户内码获取用户
	 * @Author:yadda
	 * @param id
	 *            用户内码
	 * @return
	 */
	AppUser getAppUserById(Integer id);

	/**
	 * 
	 * @Description:获取所有用户
	 * @Author:yadda
	 * @return
	 */
	List<AppUser> getAllAppUser();

	/**
	 * 
	 * @Description:根据用户名获取用户
	 * @Author:yadda
	 * @param number
	 * @return
	 */
	AppUser getAppUserByNumber(String number);
}
