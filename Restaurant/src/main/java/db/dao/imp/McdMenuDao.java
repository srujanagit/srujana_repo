package db.dao.imp;

import java.util.List;
import db.dao.imp.McdMenu;

public interface McdMenuDao {
	
public int numOfItems();
public String getDrinksAvailable(String category);
public void updateMenu(int no, String order_item, String price, String category);
public List<McdMenu> listOfitems();
public int insertItems(List<McdMenu> itemsList);
public McdMenu storedProc(String category);
}

