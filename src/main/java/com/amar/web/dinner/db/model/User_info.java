package com.amar.web.dinner.db.model;
import java.util.Date;

public class User_info
{
private int id;

private String name;

private String pw;

private String phone;

private String email;

private String registtimestart;

private String registtimeend;

private Date registtime;


public void setId( int id )
{
this.id=id;
}

public int getId()
{
return this.id;
}

public void setName( String name )
{
this.name=name;
}

public String getName()
{
return this.name;
}

public void setPw( String pw )
{
this.pw=pw;
}

public String getPw()
{
return this.pw;
}

public void setPhone( String phone )
{
this.phone=phone;
}

public String getPhone()
{
return this.phone;
}

public void setEmail( String email )
{
this.email=email;
}

public String getEmail()
{
return this.email;
}

public void setRegisttimestart( String registtimestart )
{
this.registtimestart=registtimestart;
}

public String getRegisttimestart()
{
return this.registtimestart;
}

public void setRegisttimeend( String registtimeend )
{
this.registtimeend=registtimeend;
}

public String getRegisttimeend()
{
return this.registtimeend;
}

public void setRegisttime( Date registtime )
{
this.registtime=registtime;
}

public Date getRegisttime()
{
return this.registtime;
}

}