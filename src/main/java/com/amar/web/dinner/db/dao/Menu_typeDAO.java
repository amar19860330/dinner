package com.amar.web.dinner.db.dao;

import java.util.List;
import com.amar.web.dinner.db.model.Menu_type;
import com.googlecode.ehcache.annotations.Cacheable;
import com.googlecode.ehcache.annotations.TriggersRemove;
import com.googlecode.ehcache.annotations.When;

public interface Menu_typeDAO
{
	@Cacheable( cacheName = "allCache" )
	public List<Menu_type> findMenu_type( Menu_type menu_type );

	@TriggersRemove( cacheName = "allCache" , when = When.AFTER_METHOD_INVOCATION , removeAll = true )
	public void deleteMenu_type( Menu_type menu_type );

	@TriggersRemove( cacheName = "allCache" , when = When.AFTER_METHOD_INVOCATION , removeAll = true )
	public void addMenu_type( Menu_type menu_type );

	@TriggersRemove( cacheName = "allCache" , when = When.AFTER_METHOD_INVOCATION , removeAll = true )
	public void editMenu_type( Menu_type menu_type );
}
