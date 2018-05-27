package web.arq.local.webuser.model;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;



@XmlRootElement
@Entity
@SequenceGenerator(name = "USER_SEQ_GENERATOR", sequenceName = "user_sequence", initialValue = 1, allocationSize = 1)
@Table(name = "TM_USERS", uniqueConstraints = { @UniqueConstraint(columnNames = "IDUSER") })
//@org.hibernate.annotations.Entity(selectBeforeUpdate=true)
//@NamedQuery(name="UserDetails.byId", query= "from UserDetails where idUser=?")
public class UserDetails  {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_SEQ_GENERATOR")
	@Column
	private long idUser;
	@Column
	private String userName;
	@Column
	private String password;
	
	
/*	@ElementCollection
	@GenericGenerator(name="hilo-gen",strategy="hilo")
	@CollectionId(columns = { @Column(name="ROLE_ID") }, 
	generator = "hilo-gen", 
	type=@Type(type="long"))
	@JoinTable(name="TM_ROLES", joinColumns=@JoinColumn (name="IDUSER")
			)
	private Set <MtRole> roles = new HashSet<MtRole>();
	*/
	
	
	@ElementCollection(fetch=FetchType.EAGER)
	@GenericGenerator(name="hilo-gen",strategy="hilo")
	//@CollectionId(columns = { @Column(name="IDROLE") }, 
//	generator = "hilo-gen", 
	//type=@Type(type="long"))
	@JoinTable(name="TM_ROLES", joinColumns=@JoinColumn (name="IDUSER")
			)
	private Collection <MtRole> roles = new ArrayList<MtRole>();
	
	
	
	
	//@Transient
//	@Embedded
//	private List<MtRole> roles = new ArrayList<>();

	public UserDetails() {

	} 
	
	
	

	// public void addRole(MtRole role)

	/*
	 * public void addRole(String role) { //role.setId(1); //
	 * role.setRoleName("STANDAR");
	 * 
	 * roles.add(role);
	 * 
	 * }
	 */

/*	public UserDetails(long idUser, String userName, String password) {
		super();
		this.idUser = idUser;
		this.userName = userName;
		this.password = password;
	}*/

	
	 public Collection<MtRole> getRoles() {
		return roles;
	}


	public void setRoles(Collection<MtRole> roles) {
		this.roles = roles;
	}


/*	public Set<MtRole> getRoles() {
		return roles;
	}




	public void setRoles(Set<MtRole> roles) {
		this.roles = roles;
	}
*/



	public long getIdUser() {
		 return idUser; 
		 }
	 
	
	  public void setIdUser(long idUser) { 
		  this.idUser = idUser;
	  }
	 
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static enum Role {
		USER, ADMIN
	}

	public void addRole(MtRole role) {
		
		roles.add(role);

	}

	

	/**
	 * 
	 * 
	 * @Override public String toString() { return "User [UseruserName=" + userName
	 *           + ", password=" + password + ", roles=" + roles + "]"; }
	 * 
	 */
}
