package com.dcsg.fulfillment.optimus;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public ItemAvailability getItemAvailability(String itemName) {

		String sql =	"select \n" + 
							"ia6.store_group_quantity, ia6.supplier_group_quantity, ia6.dc_group_quantity \n" + 
						"from i_availability_6 ia6 \n" + 
						"join item_cbo ic on ia6.item_id = ic.item_id \n" + 
						"where item_name = ?";

		try {
			ItemAvailability itemAvailability = jdbcTemplate.queryForObject(sql, 
					new Object[] { itemName }, new ItemAvailabilityRowMapper());

			return itemAvailability;

		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}
}

class ItemAvailabilityRowMapper implements RowMapper<ItemAvailability> {

	@Override
	public ItemAvailability mapRow(ResultSet rs, int rowNum) throws SQLException {
		ItemAvailability itemAvailability = new ItemAvailability();
		itemAvailability.setStoreGroupQuantity(rs.getInt("store_group_quantity"));
		itemAvailability.setSupplierGroupQuantity(rs.getInt("supplier_group_quantity"));
		itemAvailability.setDcGroupQuantity(rs.getInt("dc_group_quantity"));
		return itemAvailability;
	}
}
