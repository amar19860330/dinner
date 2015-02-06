package com.amar.web.dinner.db.dao;
import java.util.List;
import com.amar.web.dinner.db.model.Menu_type;

public interface Menu_typeDAO
{

public List<Menu_type> findMenu_type( Menu_type menu_type );

public void deleteMenu_type( Menu_type menu_type );

public void addMenu_type( Menu_type menu_type );

public void editMenu_type( Menu_type menu_type );

}
