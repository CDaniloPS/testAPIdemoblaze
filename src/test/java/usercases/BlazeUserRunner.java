package usercases;

import com.intuit.karate.junit5.Karate;

class BlazeUserRunner {
    
    @Karate.Test
    Karate testUsers() {
        return Karate.run("feature/user").relativeTo(getClass());
    }    

}

