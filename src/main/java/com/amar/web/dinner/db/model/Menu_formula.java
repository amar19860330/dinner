package com.amar.web.dinner.db.model;
public class Menu_formula
{
private int id;

private int formulainfoid;

private int menu_type;


public void setId( int id )
{
this.id=id;
}

public int getId()
{
return this.id;
}

public void setFormulainfoid( int formulainfoid )
{
this.formulainfoid=formulainfoid;
}

public int getFormulainfoid()
{
return this.formulainfoid;
}

public void setMenu_type( int menu_type )
{
this.menu_type=menu_type;
}

public int getMenu_type()
{
return this.menu_type;
}

}