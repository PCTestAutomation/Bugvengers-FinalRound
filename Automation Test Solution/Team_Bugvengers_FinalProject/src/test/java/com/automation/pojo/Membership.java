
package com.automation.pojo;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Membership {

    public String idMember;
    public String memberType;
    public Boolean unconfirmed;
    public Boolean deactivated;
    public String id;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Membership() {
    }

    /**
     * 
     * @param unconfirmed
     * @param idMember
     * @param memberType
     * @param id
     * @param deactivated
     */
    public Membership(String idMember, String memberType, Boolean unconfirmed, Boolean deactivated, String id) {
        super();
        this.idMember = idMember;
        this.memberType = memberType;
        this.unconfirmed = unconfirmed;
        this.deactivated = deactivated;
        this.id = id;
    }

}
