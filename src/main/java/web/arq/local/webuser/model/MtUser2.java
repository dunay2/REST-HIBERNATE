/*package web.arq.local.webuser.model;

*//**
 *
 * @author ashh412
 *//*
import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlRootElement;

*//**
 *
 * @author ashh412a
 *//*
//@XmlRootElement
@Entity(name = "MT_USER")
@Table(name = "MT_USER", uniqueConstraints = {
@UniqueConstraint(columnNames = "IDUSER")})
@XmlRootElement
public class Mt_User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idUser")
    private Integer idUser;

     @Column(name = "NAME", unique = false, nullable = false, length = 100)
    private String name;

    @Column(name = "PASSWORD", unique = false, nullable = false, length = 100)
    private String password;

    @OneToMany(mappedBy = "idrole")
    private List<Role> roles;
    
    
    public Mt_User() {
    }

    //Constructor que permite agregar admin role
    public Mt_User(String name, String password, String role) {

        this.name = name;
        this.password = password;
        //  roles = new LinkedHashSet();
        //Comprobar si el role existe
        //roles.add(Role.USER);

    }

//    @Override
//    public GrantedAuthority[] getAuthorities() {
//        List<GrantedAuthorityImpl> list = new ArrayList<GrantedAuthorityImpl>(0);
//        for (Role role : roles) {
//            list.add(new GrantedAuthorityImpl(role.getRole()));
//        }
//        return (GrantedAuthority[]) list.toArray(new GrantedAuthority[list.size()]);
//    }
//       
//       
    *//**
     * Constructor estandar para usuarios
     *
     *
     * @param name
     * @param password
     *//*
    public Mt_User(String name, String password) {

        this.name = name;
        this.password = password;
        //   roles = new LinkedHashSet();
        //  roles.add(Role.USER);

    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
//
//    public Set<Role> getRoles() {
//        return roles;
//    }
//
//    public void setRoles(Set<Role> roles) {
//        this.roles = roles;
//    }

}
*/