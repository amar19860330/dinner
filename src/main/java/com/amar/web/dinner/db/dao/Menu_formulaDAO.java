package com.amar.web.dinner.db.dao;
import java.util.List;
import com.amar.web.dinner.db.model.Menu_formula;

public interface Menu_formulaDAO
{

public List<Menu_formula> findMenu_formula( Menu_formula menu_formula );

public void deleteMenu_formula( Menu_formula menu_formula );

public void addMenu_formula( Menu_formula menu_formula );

public void editMenu_formula( Menu_formula menu_formula );

}
