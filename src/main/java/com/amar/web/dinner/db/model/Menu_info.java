package com.amar.web.dinner.db.model;
public class Menu_info
{
private int id;

private String name;

private String remark;

private int status;


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

public void setRemark( String remark )
{
this.remark=remark;
}

public String getRemark()
{
return this.remark;
}

public void setStatus( int status )
{
this.status=status;
}

public int getStatus()
{
return this.status;
}

}