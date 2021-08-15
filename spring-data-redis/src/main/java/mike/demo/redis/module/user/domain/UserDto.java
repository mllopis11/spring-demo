package mike.demo.redis.module.user.domain;

import mike.demo.redis.module.user.model.UserSession;
import mike.demo.redis.module.user.web.model.UserSessionModel;

public class UserDto {

    private UserDto() {}
    
    private UserSession buildUserSession(UserSessionModel model) {
        
        var session = new UserSession();
        session.setUsername(null);
        
        return session;
    }
}
