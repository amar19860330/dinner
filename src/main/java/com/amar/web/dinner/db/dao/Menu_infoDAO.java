package com.amar.web.dinner.db.dao;
import java.util.List;
import com.amar.web.dinner.db.model.Menu_info;

public interface Menu_infoDAO
{

public List<Menu_info> findMenu_info( Menu_info menu_info );

public void deleteMenu_info( Menu_info menu_info );

public void addMenu_info( Menu_info menu_info );

public void editMenu_info( Menu_info menu_info );

}
