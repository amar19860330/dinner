package com.amar.web.dinner.db.dao;
import java.util.List;
import com.amar.web.dinner.db.model.Menu_dish;

public interface Menu_dishDAO
{

public List<Menu_dish> findMenu_dish( Menu_dish menu_dish );

public void deleteMenu_dish( Menu_dish menu_dish );

public void addMenu_dish( Menu_dish menu_dish );

public void editMenu_dish( Menu_dish menu_dish );

}
