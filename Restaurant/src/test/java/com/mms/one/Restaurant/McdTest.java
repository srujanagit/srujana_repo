package com.mms.one.Restaurant;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import db.dao.imp.McdMenu;
import db.dao.imp.McdMenuDao;

public class McdTest {
	

	public static void main(String[]args){
		/*Restaurant mcd=new Mcd();
		mcd.cook();*/
		
	ApplicationContext context =new FileSystemXmlApplicationContext("C:\\Java\\spring\\Restaurant\\appContext.xml");
	
	Restaurant restaurant =(Restaurant) context.getBean("restaurant");
	restaurant.cook();
	System.out.println("completed using Spring flow");
	System.out.println("---------------------");
	
	McdMenuDao mcdMenuDao= (McdMenuDao) context.getBean("mcdMenuDao");
	int cnt= mcdMenuDao.numOfItems();
	System.out.println("number of items:" + cnt);
	System.out.println("---------------------");
	String drinks= mcdMenuDao.getDrinksAvailable("$$1.00");
	System.out.println("your order is:" + drinks);
	System.out.println("---------------------");
	
//	mcdMenuDao.updateMenu(8, "Brownies", "$3.99", "snacks");
//	System.out.println("update completed");
//	System.out.println("---------------------");
//	
	List<McdMenu> mcMenu= mcdMenuDao.listOfitems();
	for(McdMenu menu: mcMenu){
	System.out.println("mcd menu:" + menu.toString());
	
	}
	
	/*McdMenu no9 =new McdMenu(9,"pepsi","$0.89","drinks");
	McdMenu no10 =new McdMenu(10,"venila_shake","$1.89","drinks");
	McdMenu no11 =new McdMenu(11,"sandwich","$1.09","food");
	
	List<McdMenu> itemsList= new ArrayList<McdMenu>();
	itemsList.add(no9);
	itemsList.add(no10);
	itemsList.add(no11);
	 

	int ins = mcdMenuDao.insertItems(itemsList);
	System.out.println("newly inserted records:" + ins);*/
	 
	McdMenu mc= mcdMenuDao.storedProc(drinks);
	System.out.println("-------------");
	System.out.println("mcd_food:" + mc);
	
	}

}
