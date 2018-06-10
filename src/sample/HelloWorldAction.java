package sample;

import org.apache.commons.lang.StringUtils;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {


    private String user_name;
    private String user_pass;


    public String execute() throws Exception
    {
    	return "success";
    }

    public void validate()
    {
    	if(StringUtils.isBlank(user_name));
    	{
    		addFieldError("error.username", getText("error.username"));
    	}
    }

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_pass() {
		return user_pass;
	}

	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}



}
