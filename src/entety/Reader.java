/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entety;

/**
 *
 * @author pupil
 */
public class Reader {
    private String firstname;
    private String lastname;

    public Reader() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Reader{" + "firstname=" + firstname + ", lastname=" + lastname + '}';
    }
    
}
