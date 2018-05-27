package web.arq.local.webuser.model;

import javax.persistence.Embeddable;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement
@Embeddable
@Table(name = "TM_ROLES")
public class MtRole {

	//private long id;
	private String roleName;
	
	
	public MtRole() {

	}

	public MtRole( String roleName) {
		super();

		this.roleName = roleName;
	}
/*	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}*/
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	
	
}
