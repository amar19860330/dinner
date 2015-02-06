package com.amar.web.dinner.db.dao;
import java.util.List;
import com.amar.web.dinner.db.model.Menu_formula_info;

public interface Menu_formula_infoDAO
{

public List<Menu_formula_info> findMenu_formula_info( Menu_formula_info menu_formula_info );

public void deleteMenu_formula_info( Menu_formula_info menu_formula_info );

public void addMenu_formula_info( Menu_formula_info menu_formula_info );

public void editMenu_formula_info( Menu_formula_info menu_formula_info );

}
