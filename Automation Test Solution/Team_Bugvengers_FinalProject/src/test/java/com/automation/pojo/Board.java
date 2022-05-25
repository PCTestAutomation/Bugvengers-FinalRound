
package com.automation.pojo;

import java.util.List;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Board {

    public String id;
    public String name;
    public String desc;
    public Object descData;
    public Boolean closed;
    public Object dateClosed;
    public String idOrganization;
    public Object idEnterprise;
    public Object limits;
    public Boolean pinned;
    public Boolean starred;
    public String url;
    public Prefs prefs;
    public String shortLink;
    public Boolean subscribed;
    public LabelNames labelNames;
    public List<Object> powerUps = null;
    public String dateLastActivity;
    public String dateLastView;
    public String shortUrl;
    public List<Object> idTags = null;
    public Object datePluginDisable;
    public String creationMethod;
    public String ixUpdate;
    public Object templateGallery;
    public Boolean enterpriseOwned;
    public Object idBoardSource;
    public List<String> premiumFeatures = null;
    public String idMemberCreator;
    public List<Membership> memberships = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Board() {
    }

    /**
     * 
     * @param descData
     * @param idTags
     * @param pinned
     * @param labelNames
     * @param shortUrl
     * @param dateLastActivity
     * @param datePluginDisable
     * @param dateClosed
     * @param shortLink
     * @param idBoardSource
     * @param memberships
     * @param creationMethod
     * @param subscribed
     * @param starred
     * @param idOrganization
     * @param dateLastView
     * @param id
     * @param limits
     * @param powerUps
     * @param templateGallery
     * @param premiumFeatures
     * @param url
     * @param prefs
     * @param enterpriseOwned
     * @param ixUpdate
     * @param idEnterprise
     * @param name
     * @param closed
     * @param idMemberCreator
     * @param desc
     */
    public Board(String id, String name, String desc, Object descData, Boolean closed, Object dateClosed, String idOrganization, Object idEnterprise, Object limits, Boolean pinned, Boolean starred, String url, Prefs prefs, String shortLink, Boolean subscribed, LabelNames labelNames, List<Object> powerUps, String dateLastActivity, String dateLastView, String shortUrl, List<Object> idTags, Object datePluginDisable, String creationMethod, String ixUpdate, Object templateGallery, Boolean enterpriseOwned, Object idBoardSource, List<String> premiumFeatures, String idMemberCreator, List<Membership> memberships) {
        super();
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.descData = descData;
        this.closed = closed;
        this.dateClosed = dateClosed;
        this.idOrganization = idOrganization;
        this.idEnterprise = idEnterprise;
        this.limits = limits;
        this.pinned = pinned;
        this.starred = starred;
        this.url = url;
        this.prefs = prefs;
        this.shortLink = shortLink;
        this.subscribed = subscribed;
        this.labelNames = labelNames;
        this.powerUps = powerUps;
        this.dateLastActivity = dateLastActivity;
        this.dateLastView = dateLastView;
        this.shortUrl = shortUrl;
        this.idTags = idTags;
        this.datePluginDisable = datePluginDisable;
        this.creationMethod = creationMethod;
        this.ixUpdate = ixUpdate;
        this.templateGallery = templateGallery;
        this.enterpriseOwned = enterpriseOwned;
        this.idBoardSource = idBoardSource;
        this.premiumFeatures = premiumFeatures;
        this.idMemberCreator = idMemberCreator;
        this.memberships = memberships;
    }

}
