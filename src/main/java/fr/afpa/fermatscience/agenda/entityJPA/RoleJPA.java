package fr.afpa.fermatscience.agenda.entityJPA;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Role")
@Table(name="Role")
public class RoleJPA {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRole;
    private String libelleRole;

    public RoleJPA() {
    }

    public RoleJPA(String libelleRole) {
        this.libelleRole = libelleRole;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public String getLibelleRole() {
        return libelleRole;
    }

    public void setLibelleRole(String libelleRole) {
        this.libelleRole = libelleRole;
    }
}
