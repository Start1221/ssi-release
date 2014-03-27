package com.jshand.ssi.action;

import com.jshand.ssi.service.TestService;
import com.opensymphony.xwork2.Action;

/**
 * @file_name	TestAction.java
 * @project		ssi-release
 * @author  	jshand
 * @createDate	Jun 2, 2013  12:37:18 PM
 * @version 	1.0
 * http://www.jshand.com
 *
 */

public class TestAction implements Action{

    public TestService testService = null;

    public String actionStr = "com.jshand.ssi.action.TestAction";

    //http://localhost:8080/ssi-release/test.action
    public String execute() throws Exception{
        System.out.println("execute Struts2 Action ...... && actionStr = "+actionStr);
        testService.service();
        return SUCCESS;
    }

    public String getActionStr() {
        return actionStr;
    }

    public void setActionStr(String actionStr) {
        this.actionStr = actionStr;
    }

    public TestService getTestService() {
        return testService;
    }

    public void setTestService(TestService testService) {
        this.testService = testService;
    }
}
