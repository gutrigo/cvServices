package br.com.acelera.jersey.infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexaoMySqlJDBC implements ConexaoJDBC {
	// *Class.forName("com.mysql.jdbc.Driver");

	private Connection con = null;
	
	public ConexaoMySqlJDBC() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Properties properties = new Properties();
		properties.put("user", "kcmedtjpsyuaeq");
		properties.put("password", "6fcaa6021f94476afe001da4caefed2ca76d0afc29d39790ff01409c4af9aae0");
		
	//*	this.con = DriverManager.getConnection("jdbc:postgres://kcmedtjpsyuaeq:6fcaa6021f94476afe001da4caefed2ca76d0afc29d39790ff01409c4af9aae0@ec2-50-19-232-205.compute-1.amazonaws.com:5432/d9hh8t127cuc25", properties);
		this.con.setAutoCommit(false);
	}
	
	@Override
	public Connection getConnection() {
		return this.con;
	}

	@Override
	public void close() {
		if (this.con != null) {
			try {
				this.con.close();
			} catch (SQLException e) {
				Logger.getLogger(ConexaoMySqlJDBC.class.getName()).log(Level.SEVERE, null, e);
			}
		}

	}

	@Override
	public void commit() throws SQLException {
		this.con.commit();
		this.close();
	}

	@Override
	public void rollback() {
		if (this.con != null) {
			try {
				this.con.rollback();
			} catch (SQLException e) {
				Logger.getLogger(ConexaoMySqlJDBC.class.getName()).log(Level.SEVERE, null, e);
			} finally {
				this.close();
			}
		}

	}

}
