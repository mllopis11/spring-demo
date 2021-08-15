package mike.demo.redis.module.user.model;

import java.time.ZonedDateTime;

import org.springframework.data.redis.core.RedisHash;

@RedisHash("UserSession")
public class UserSession {

    private String username;
    private Profile profile;
    private boolean connected;
    private int connectionCount;
    private ZonedDateTime lastConnectionDateTime;
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public boolean isConnected() {
        return connected;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }

    public int getConnectionCount() {
        return connectionCount;
    }

    public void setConnectionCount(int connectionCount) {
        this.connectionCount = connectionCount;
    }

    public ZonedDateTime getLastConnectionDateTime() {
        return lastConnectionDateTime;
    }

    public void setLastConnectionDateTime(ZonedDateTime lastConnectionDateTime) {
        this.lastConnectionDateTime = lastConnectionDateTime;
    }

    @Override
    public String toString() {
        var builder = new StringBuilder("User [");
        
        // @fomratter:off
        builder.append(", username=").append(username)
                .append(", profile=").append(profile)
                .append(", connected=").append(connected)
                .append(", connectionCount=").append(connectionCount)
                .append(", lastConnectionDateTime=").append(lastConnectionDateTime);
        // @fomratter:on
        
        return builder.append("]").toString();
    }
}
