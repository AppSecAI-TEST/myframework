package com.myweb.service.xnly;


import com.myweb.pojo.mybatis.Jiashu;
import com.myweb.util.Result;
import com.myweb.pojo.mybatis.Laoren;
import com.myweb.pojo.mybatis.User;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface XiTongService {

	public List<User> getAllUsers(HttpSession session);

	public List<Laoren> getDSRLaorens(HttpSession session);

	public List<Laoren> getYMJLaorens(HttpSession session);

	public List<Laoren> getOtherLaorens(HttpSession session);

	public List<Laoren> getAllLaorens(HttpSession session);

	public List<Jiashu> getAllJiashus(HttpSession session);

	public Result editJiashu(HttpSession session, Jiashu jiashu);

	public Result deleteJiashu(HttpSession session, String ids);

	public Result getJiashu(HttpSession session, String ids, String idType);

	public Result getLaoren(HttpSession session, String ids);

	public Result getUser(HttpSession session, String ids);

	public Result editLaoren(HttpSession session, Laoren laoren);

	public Result editDSRLaoren(HttpSession session, Laoren laoren);

	public Result editYMJLaoren(HttpSession session, Laoren laoren);

	public Result editUser(HttpSession session, User user);

	public Result deleteLaoren(HttpSession session, String ids);

	public Result changeLaoren(HttpSession session, String ids);

	public Result deleteUser(HttpSession session, String ids);
}
