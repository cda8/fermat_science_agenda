package fr.afpa.fermatscience.agenda.entity;

public class Tag {

    private int idTag;
    private String nameTag;


    public Tag() {
    }

    public Tag(String nameTag) {
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
