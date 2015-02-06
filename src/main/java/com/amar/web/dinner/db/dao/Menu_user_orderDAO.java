package com.amar.web.dinner.db.dao;
import java.util.List;
import com.amar.web.dinner.db.model.Menu_user_order;

public interface Menu_user_orderDAO
{

public List<Menu_user_order> findMenu_user_order( Menu_user_order menu_user_order );

public void deleteMenu_user_order( Menu_user_order menu_user_order );

public void addMenu_user_order( Menu_user_order menu_user_order );

public void editMenu_user_order( Menu_user_order menu_user_order );

}
