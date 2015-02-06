package com.amar.web.dinner.db.model;
import java.util.Date;

public class Menu_user_order
{
private int id;

private int userid;

private String booktimestart;

private String booktimeend;

private Date booktime;

private float pricetotal;

private String itemtotal;

private int menuid;


public void setId( int id )
{
this.id=id;
}

public int getId()
{
return this.id;
}

public void setUserid( int userid )
{
this.userid=userid;
}

public int getUserid()
{
return this.userid;
}

public void setBooktimestart( String booktimestart )
{
this.booktimestart=booktimestart;
}

public String getBooktimestart()
{
return this.booktimestart;
}

public void setBooktimeend( String booktimeend )
{
this.booktimeend=booktimeend;
}

public String getBooktimeend()
{
return this.booktimeend;
}

public void setBooktime( Date booktime )
{
this.booktime=booktime;
}

public Date getBooktime()
{
return this.booktime;
}

public void setPricetotal( float pricetotal )
{
this.pricetotal=pricetotal;
}

public float getPricetotal()
{
return this.pricetotal;
}

public void setItemtotal( String itemtotal )
{
this.itemtotal=itemtotal;
}

public String getItemtotal()
{
return this.itemtotal;
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