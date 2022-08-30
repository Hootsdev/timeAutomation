package com.deadspace.ext.jira.webwork;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.atlassian.jira.web.action.JiraWebActionSupport;

public class ExtConfig extends JiraWebActionSupport
{
    private static final Logger log = LoggerFactory.getLogger(ExtConfig.class);

    @Override
    public String doExecute() throws Exception {
        log.info("eureka!");

        return SUCCESS; 
    }
}
