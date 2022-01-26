package fr.afpa.fermatscience.agenda.entityJPA;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Tag")
@Table(name="Tag")
public class TagJPA {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)	
    private int idTag;
    private String nameTag;


    public TagJPA() {
    }

    public TagJPA(String nameTag) {
        this.nameTag = nameTag;
    }

    public int getIdTag() {
        return idTag;
    }

    public void setIdTag(int idTag) {
        this.idTag = idTag;
    }

    public String getNameTag() {
        return nameTag;
    }

    public void setNameTag(String nameTag) {
        this.nameTag = nameTag;
    }


}
