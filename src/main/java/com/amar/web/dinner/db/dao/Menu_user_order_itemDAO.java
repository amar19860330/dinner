package com.amar.web.dinner.db.dao;
import java.util.List;
import com.amar.web.dinner.db.model.Menu_user_order_item;

public interface Menu_user_order_itemDAO
{

public List<Menu_user_order_item> findMenu_user_order_item( Menu_user_order_item menu_user_order_item );

public void deleteMenu_user_order_item( Menu_user_order_item menu_user_order_item );

public void addMenu_user_order_item( Menu_user_order_item menu_user_order_item );

public void editMenu_user_order_item( Menu_user_order_item menu_user_order_item );

}
