package com.amar.web.dinner.db.dao;
import java.util.List;
import com.amar.web.dinner.db.model.User_info;

public interface User_infoDAO
{

public List<User_info> findUser_info( User_info user_info );

public void deleteUser_info( User_info user_info );

public void addUser_info( User_info user_info );

public void editUser_info( User_info user_info );

}
