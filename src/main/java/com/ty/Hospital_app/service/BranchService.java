package com.ty.Hospital_app.service;

import com.ty.Hospital_app.dto.Branch;
import com.ty.Hospital_app.dto.Hospital;
import com.ty.Hospital_app.imp.BranchDaoImp;
import com.ty.Hospital_app.imp.HospitalDaoImp;

public class BranchService 
{
	public void savebranch(Branch branch,int hid)
	{

		BranchDaoImp daoImp = new BranchDaoImp();
		Branch branch1 = daoImp.saveBranch(hid, branch);
		if(branch1!=null)
		{
			System.out.println("data saved");

		}
		else
		{
			System.out.println("unfortunatly data not saved");
		}
	}


	public Branch getBranchById(int bid)
	{
		BranchDaoImp daoImp = new BranchDaoImp();
		Branch branch1 = daoImp.getBranchId(bid);
		if(branch1!=null)
		{
			return branch1;

		}
		else
		{
			return null;
		}
	}
	public void deleteBranchById(int bid)
	{
		BranchDaoImp daoImp = new BranchDaoImp();
		boolean flag = daoImp.deleteBranch(bid);
		if(flag)
		{
			System.out.println("data deleted");;

		}
		else
		{
			System.out.println("Data saved");
		}
	}
	public Branch updatebranchById(int bid,Branch branch)
	{
		BranchDaoImp daoImp = new BranchDaoImp();
		Branch branch1 = daoImp.updateBranch(bid, branch);
		if(branch1!=null)
		{
			return branch1;
		}
		else
		{
			return null;
		}

	}

}

