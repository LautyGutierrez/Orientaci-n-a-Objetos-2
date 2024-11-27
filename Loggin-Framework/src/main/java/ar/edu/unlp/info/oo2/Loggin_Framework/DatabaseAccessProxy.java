package ar.edu.unlp.info.oo2.Loggin_Framework;

import java.util.Collection;
import java.util.List;
import java.util.logging.*;

public class DatabaseAccessProxy implements DatabaseAccess{
	private DatabaseRealAccess db;
	private boolean acceso;
	private String password;
	
	public DatabaseAccessProxy(DatabaseRealAccess db, String password) {
		this.db = db;
		this.acceso = false;
		this.password = password;
	}
	
	public Collection<String> getSearchResults(String queryString){
		this.tieneAcceso();
		Logger.getLogger("bd").log(Level.INFO, "search db");
		return this.db.getSearchResults(queryString);
	}

    public int insertNewRow(List<String> rowData) {
    	this.tieneAcceso();
    	Logger.getLogger("bd").log(Level.WARNING, "insert db");
		return this.db.insertNewRow(rowData);
    }
    
    public void logIn(String password) {
    	if(this.password.equals(password)) this.acceso = true;
    }
    
    public void logOut() {
    	this.acceso = false;
    }
    
    public void tieneAcceso() {
    	if(!this.acceso) {
    		Logger.getLogger("bd").log(Level.SEVERE, "access denied");
    		throw new RuntimeException("Acceso denegado");
    	}
    }
}
