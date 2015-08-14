package com.wandae.relay.lighthouse;

import javax.annotation.PostConstruct;
import javax.ejb.Startup;
import javax.inject.Inject;
import javax.inject.Singleton;

import com.wandae.common.lighthouse.Lighthouse;

import java.net.URL;

@Singleton
@Startup
public class ContactLighthouse {

    @Lighthouse
    @Inject
    private URL lighthouseUrl;
    
    @PostConstruct
    private void startUp(){
        
    }
    
    
}
