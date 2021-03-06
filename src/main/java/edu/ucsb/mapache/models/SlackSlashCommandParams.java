package edu.ucsb.mapache.models;

import java.util.Objects;

import org.apache.commons.lang3.builder.EqualsBuilder;


public class SlackSlashCommandParams {
    private String token;
    private String teamId;
    private String teamDomain;
    private String channelId;
    private String channelName;
    private String userId;
    private String userName;
    private String command;
    private String text;
    private String responseUrl;

    public SlackSlashCommandParams() {
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTeamId() {
        return this.teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getTeamDomain() {
        return this.teamDomain;
    }

    public void setTeamDomain(String teamDomain) {
        this.teamDomain = teamDomain;
    }

    public String getChannelId() {
        return this.channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getChannelName() {
        return this.channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCommand() {
        return this.command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getResponseUrl() {
        return this.responseUrl;
    }

    public void setResponseUrl(String responseUrl) {
        this.responseUrl = responseUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof SlackSlashCommandParams)) {
            return false;
        }
        SlackSlashCommandParams SlackSlashCommandParams = (SlackSlashCommandParams) o;
        EqualsBuilder builder = new EqualsBuilder();
        
        builder.append(token, SlackSlashCommandParams.token).append(teamId, SlackSlashCommandParams.teamId)
                .append(teamDomain, SlackSlashCommandParams.teamDomain)
                .append(channelId, SlackSlashCommandParams.channelId)
                .append(channelName, SlackSlashCommandParams.channelName)
                .append(userId, SlackSlashCommandParams.userId)
                .append(userName, SlackSlashCommandParams.userName)
                .append(command, SlackSlashCommandParams.command).append(text, SlackSlashCommandParams.text)
                .append(responseUrl, SlackSlashCommandParams.responseUrl);
                
        return builder.isEquals();
    }

    @Override
    public int hashCode() {
        return Objects.hash(token, teamId, teamDomain, channelId, channelName, userId, userName, command, text,
                responseUrl);
    }

    @Override
    public String toString() {
        return "{" + " token='" + getToken() + "'" + ", teamId='" + getTeamId() + "'" + ", teamDomain='"
                + getTeamDomain() + "'" + ", channelId='" + getChannelId() + "'" + ", channelName='" + getChannelName()
                + "'" + ", userId='" + getUserId() + "'" + ", userName='" + getUserName() + "'" + ", command='"
                + getCommand() + "'" + ", text='" + getText() + "'" + ", responseUrl='" + getResponseUrl() + "'" + "}";
    }

    // For explanation of "[\\s\\p{Z}]" see: https://stackoverflow.com/a/26713907
    public String[] getTextParts() {
        String[] textParts = this.text.split("[\\s\\p{Z}]+");
        return textParts;
    } // 


}
