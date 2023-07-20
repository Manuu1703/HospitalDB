package com.ty.Hospital_app.service;

import com.ty.Hospital_app.dto.Item;

import com.ty.Hospital_app.imp.ItemDaoImp;


public class ItemService 
{
	public void saveItem(Item item,int mid)
	{
		ItemDaoImp daoImp = new ItemDaoImp();
		Item item1 = daoImp.saveItem(mid, item);
		if(item1!=null)
		{
			System.out.println("data saved");

		}
		else
		{
			System.out.println("unfortunatly data not saved");
		}
	}
	public Item getItemById(int iid)
	{
		ItemDaoImp daoImp = new ItemDaoImp();
		Item item1 = daoImp.getItembyId(iid);
		if(item1!=null)
		{
			return item1;

		}
		else
		{
			return null;
		}
	}
	public void deleteItemBYId(int iid)
	{
		ItemDaoImp daoImp = new ItemDaoImp();
		boolean flag = daoImp.deleteItem(iid);
		if(flag)
		{
			System.out.println("data deleted");;

		}
		else
		{
			System.out.println("Data saved");
		}
	}
	public Item updateItemById(int iid,Item item)
	{
		ItemDaoImp daoImp = new ItemDaoImp();
		Item item1 = daoImp.updateItem(iid, item);
		if(item1!=null)
		{
			return item1;
		}
		else
		{
			return null;
		}

	}



}
