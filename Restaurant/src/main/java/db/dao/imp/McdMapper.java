package db.dao.imp;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class McdMapper implements RowMapper<McdMenu> {

	public McdMenu mapRow(ResultSet rs, int arg1) throws SQLException {
	McdMenu menu= new McdMenu(arg1, null, null, null);
	menu.setNo(rs.getInt("no"));
	menu.setOrderItem(rs.getString("order_item"));
	menu.setPrice(rs.getString("price"));
	menu.setCategory(rs.getString("category"));
		return menu;
	}

}
