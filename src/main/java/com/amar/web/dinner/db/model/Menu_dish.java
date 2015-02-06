package com.amar.web.dinner.db.model;
public class Menu_dish
{
private int id;

private int menuid;

private int typeid;

private String name;

private String unit;

private float price;

private String remark;


public void setId( int id )
{
this.id=id;
}

public int getId()
{
return this.id;
}

public void setMenuid( int menuid )
{
this.menuid=menuid;
}

public int getMenuid()
{
return this.menuid;
}

public void setTypeid( int typeid )
{
this.typeid=typeid;
}

public int getTypeid()
{
return this.typeid;
}

public void setName( String name )
{
this.name=name;
}

public String getName()
{
return this.name;
}

public void setUnit( String unit )
{
this.unit=unit;
}

public String getUnit()
{
return this.unit;
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

}