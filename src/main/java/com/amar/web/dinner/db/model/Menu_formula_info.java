package com.amar.web.dinner.db.model;
public class Menu_formula_info
{
private int id;

private float price;

private String remark;

private int menuid;


public void setId( int id )
{
this.id=id;
}

public int getId()
{
return this.id;
}

public void setPrice( float price )
{
this.price=price;
}

public float getPrice()
{
return this.price;
}

public void setRemark( String remark )
{
this.remark=remark;
}

public String getRemark()
{
return this.remark;
}

public void setMenuid( int menuid )
{
this.menuid=menuid;
}

public int getMenuid()
{
return this.menuid;
}

}