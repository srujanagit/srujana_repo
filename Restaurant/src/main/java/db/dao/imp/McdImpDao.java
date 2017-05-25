package db.dao.imp;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

public class McdImpDao implements McdMenuDao {
private DataSource dataSource;
private JdbcTemplate jdbcTemplate;
private SimpleJdbcCall proCall;

String sql= "SELECT count(*) FROM restaurant.mcd_menu";
String drinkssql= "SELECT order_item FROM restaurant.mcd_menu where price=?";
String insert ="INSERT INTO `restaurant`.`mcd_menu`(`no`,`order_item`,`price`,`category`)VALUES(?,?,?,?)";
String menuitems ="SELECT * FROM restaurant.mcd_menu";

	public int numOfItems() {
		int count= jdbcTemplate.queryForObject(sql,Integer.class);
		System.out.println("The number of items available are :" + count);
		return count;
	}
	
	public String getDrinksAvailable(String category) {
		String drinks= jdbcTemplate.queryForObject(drinkssql, new Object[]{category},String.class);
		System.out.println("Food available at your price is :" + drinks);
		return drinks;
		}
	
	public void updateMenu(int no, String order_item, String price,String category ) {
		jdbcTemplate.update(insert, no,order_item,price,category);
		}
	
	public List<McdMenu> listOfitems() {
		List<McdMenu> mcdMenu =jdbcTemplate.query(menuitems,new McdMapper());
		return mcdMenu;
	}
	
	public int insertItems(final List<McdMenu> itemsList) {
		jdbcTemplate.batchUpdate(insert, new BatchPreparedStatementSetter() {
			
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				ps.setInt(1, itemsList.get(i).getNo());
				ps.setString(2, itemsList.get(i).getOrderItem());
				ps.setString(3, itemsList.get(i).getPrice());
				ps.setString(4, itemsList.get(i).getCategory());
				
			}
			
			public int getBatchSize() {
				
				return itemsList.size();
			}
		});
		return itemsList.size();
	}
	
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	jdbcTemplate =new JdbcTemplate(dataSource);
	proCall= new SimpleJdbcCall(dataSource).withProcedureName("mcd2_food");
	}

	public McdMenu storedProc(String category) {
		 
	SqlParameterSource in = new MapSqlParameterSource().addValue("cat", category);
	Map out= proCall.execute(in);
	McdMenu mc= new McdMenu(0, category, category, category);
	mc.setOrderItem((String)out.get("food"));
	mc.setPrice((String)out.get("price"));
	return mc; 
		
	}	

}
