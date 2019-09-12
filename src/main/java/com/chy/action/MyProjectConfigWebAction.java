package com.chy.action;

import com.atlassian.jira.web.action.ProjectActionSupport;

/**
 * Created by chy on 19/9/12.
 */
public class MyProjectConfigWebAction extends ProjectActionSupport {

    @Override
    public String execute() throws Exception {
        return INPUT; //returns SUCCESS
    }

}
