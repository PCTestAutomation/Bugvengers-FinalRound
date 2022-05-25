
package com.automation.pojo;

import java.util.List;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Prefs {

    public String permissionLevel;
    public Boolean hideVotes;
    public String voting;
    public String comments;
    public String invitations;
    public Boolean selfJoin;
    public Boolean cardCovers;
    public Boolean isTemplate;
    public String cardAging;
    public Boolean calendarFeedEnabled;
    public List<Object> hiddenPluginBoardButtons = null;
    public String background;
    public Object backgroundColor;
    public String backgroundImage;
    public List<BackgroundImageScaled> backgroundImageScaled = null;
    public Boolean backgroundTile;
    public String backgroundBrightness;
    public String backgroundBottomColor;
    public String backgroundTopColor;
    public Boolean canBePublic;
    public Boolean canBeEnterprise;
    public Boolean canBeOrg;
    public Boolean canBePrivate;
    public Boolean canInvite;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Prefs() {
    }

    /**
     * 
     * @param backgroundBrightness
     * @param backgroundColor
     * @param comments
     * @param backgroundTopColor
     * @param canBeEnterprise
     * @param hideVotes
     * @param backgroundImage
     * @param canBeOrg
     * @param backgroundBottomColor
     * @param voting
     * @param calendarFeedEnabled
     * @param hiddenPluginBoardButtons
     * @param backgroundTile
     * @param canBePublic
     * @param canBePrivate
     * @param backgroundImageScaled
     * @param permissionLevel
     * @param cardAging
     * @param canInvite
     * @param invitations
     * @param isTemplate
     * @param background
     * @param cardCovers
     * @param selfJoin
     */
    public Prefs(String permissionLevel, Boolean hideVotes, String voting, String comments, String invitations, Boolean selfJoin, Boolean cardCovers, Boolean isTemplate, String cardAging, Boolean calendarFeedEnabled, List<Object> hiddenPluginBoardButtons, String background, Object backgroundColor, String backgroundImage, List<BackgroundImageScaled> backgroundImageScaled, Boolean backgroundTile, String backgroundBrightness, String backgroundBottomColor, String backgroundTopColor, Boolean canBePublic, Boolean canBeEnterprise, Boolean canBeOrg, Boolean canBePrivate, Boolean canInvite) {
        super();
        this.permissionLevel = permissionLevel;
        this.hideVotes = hideVotes;
        this.voting = voting;
        this.comments = comments;
        this.invitations = invitations;
        this.selfJoin = selfJoin;
        this.cardCovers = cardCovers;
        this.isTemplate = isTemplate;
        this.cardAging = cardAging;
        this.calendarFeedEnabled = calendarFeedEnabled;
        this.hiddenPluginBoardButtons = hiddenPluginBoardButtons;
        this.background = background;
        this.backgroundColor = backgroundColor;
        this.backgroundImage = backgroundImage;
        this.backgroundImageScaled = backgroundImageScaled;
        this.backgroundTile = backgroundTile;
        this.backgroundBrightness = backgroundBrightness;
        this.backgroundBottomColor = backgroundBottomColor;
        this.backgroundTopColor = backgroundTopColor;
        this.canBePublic = canBePublic;
        this.canBeEnterprise = canBeEnterprise;
        this.canBeOrg = canBeOrg;
        this.canBePrivate = canBePrivate;
        this.canInvite = canInvite;
    }

}
