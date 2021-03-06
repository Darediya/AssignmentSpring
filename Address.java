/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentSpring;

import org.springframework.stereotype.Component;

/**
 *
 * @author Darediya
 */
@Component
public class Address {
    private String street;
    private String zip;
    private String city;

    @Override
    public String toString(){
        return "Address [Street: "+street+" zip: "+zip+" city: "+city+"]";
    }
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
