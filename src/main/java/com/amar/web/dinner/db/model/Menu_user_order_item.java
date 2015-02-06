package com.amar.web.dinner.db.model;
public class Menu_user_order_item
{
private int id;

private int userorderid;

private int dishid;


public void setId( int id )
{
this.id=id;
}

public int getId()
{
return this.id;
}

public void setUserorderid( int userorderid )
{
this.userorderid=userorderid;
}

public int getUserorderid()
{
return this.userorderid;
}

public void setDishid( int dishid )
{
this.dishid=dishid;
}

public int getDishid()
{
return this.dishid;
}

}