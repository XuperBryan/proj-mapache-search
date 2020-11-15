package edu.ucsb.mapache.documents;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "users")
public class SlackUser {
    private String id;
    private String name;
    private String real_name;
    private SlackUserProfile profile;

    public SlackUser(){ }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReal_name() {
        return real_name;
    }

    public void setReal_name(String real_name) {
        this.real_name = real_name;
    }

    public SlackUserProfile getProfile() {
        return profile;
    }

    public void setProfile(SlackUserProfile profile) {
        this.profile = profile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SlackUser slackUser = (SlackUser) o;
        return Objects.equals(id, slackUser.id) &&
                Objects.equals(name, slackUser.name) &&
                Objects.equals(real_name, slackUser.real_name) &&
                Objects.equals(profile, slackUser.profile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, real_name, profile);
    }

    @Override
    public String toString() {
        return "SlackUser{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", real_name='" + real_name + '\'' +
                ", profile=" + profile +
                '}';
    }

}
