package DTO;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DTOFactory {
	private static DTOFactory factory = null;
	private GeneralDTO dto = null;

	private DTOFactory() {
		super();
	}
	

	public static DTOFactory getInstance() {
		if (factory == null)
			factory = new DTOFactory();

		return factory;
	}


	public GeneralDTO getDTO(Tabla type, ResultSet rs) {
		try {
			switch (type) {
				case STOCK:
					dto = new StockDTO(rs.getInt("id"), rs.getString("nombre"), rs.getString("descripcion"), rs.getFloat("precio_compra"), rs.getFloat("precio_venta"), rs.getInt("cantidad"), rs.getBoolean("discontinuado"));
					break;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dto;
	}


	public GeneralDTO getDTO(Tabla type) {
		switch (type) {
			case STOCK:
				dto = new StockDTO();
				break;
			default:
				break;
		}
		return dto;
	}
}
