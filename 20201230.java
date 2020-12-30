package com.merico.selenium.test.ee.control;

import java.io.InputStream;
import java.util.Properties;

import com.merico.selenium.test.ee.utils.Utilities;

public class RepoReportControls {
	private static Properties props = null;
    static {
        try {
            props = new Properties();
            InputStream in = ProjectGroupControls.class.getClassLoader().getResourceAsStream("repo-report-control.properties");
            props.load(in);
        } catch (Exception e) {
            throw new RuntimeException("Failed to initiate the configuration file", e);
        }
    }

    /**
     * Get configuration value
     *
     * @param propertyName
     * @return string
     */
    private static String getProperty(String propertyName) {
        return props.getProperty(propertyName);
    }

    private RepoReportControls() {
        // TODO Auto-generated constructor stub
    }
    
    /**
     * Search By Git or Address Textbox
     */
    public static final String Search_By_Git_Addr_Textbox_Css = getProperty("search_by_git_addr_textbox_css");
	
	public static final String Search_By_Git_Addr_Textbox_Css = getProperty("search_by_git_addr_textbox_css");
	
	public static final String Search_By_Git_Addr_Textbox_Css = getProperty("search_by_git_addr_textbox_css");
	
	public static final String Search_By_Git_Addr_Textbox_Css = getProperty("search_by_git_addr_textbox_css");
	
	public static final String Search_By_Git_Addr_Textbox_Css = getProperty("search_by_git_addr_textbox_css");
	
	public static final String Search_By_Git_Addr_Textbox_Css = getProperty("search_by_git_addr_textbox_css");
	
	public static final String Search_By_Git_Addr_Textbox_Css = getProperty("search_by_git_addr_textbox_css");
	
	public static final String Search_By_Git_Addr_Textbox_Css = getProperty("search_by_git_addr_textbox_css");
	
	public static final String Search_By_Git_Addr_Textbox_Css = getProperty("search_by_git_addr_textbox_css");
	
	public static final String Search_By_Git_Addr_Textbox_Css = getProperty("search_by_git_addr_textbox_css");
	
	public static final String Search_By_Git_Addr_Textbox_Css = getProperty("search_by_git_addr_textbox_css");
	
	public static final String Search_By_Git_Addr_Textbox_Css = getProperty("search_by_git_addr_textbox_css");
	
	public static final String Search_By_Git_Addr_Textbox_Css = getProperty("search_by_git_addr_textbox_css");
	
	public static final String Search_By_Git_Addr_Textbox_Css = getProperty("search_by_git_addr_textbox_css");
	
	public static final String Search_By_Git_Addr_Textbox_Css = getProperty("search_by_git_addr_textbox_css");
	
	public static final String Search_By_Git_Addr_Textbox_Css = getProperty("search_by_git_addr_textbox_css");
	
	public static final String Search_By_Git_Addr_Textbox_Css = getProperty("search_by_git_addr_textbox_css");
	
	public static final String Search_By_Git_Addr_Textbox_Css = getProperty("search_by_git_addr_textbox_css");
	
	public static final String Search_By_Git_Addr_Textbox_Css = getProperty("search_by_git_addr_textbox_css");
	
	public static final String Search_By_Git_Addr_Textbox_Css = getProperty("search_by_git_addr_textbox_css");
	
	public static final String Search_By_Git_Addr_Textbox_Css = getProperty("search_by_git_addr_textbox_css");
	
	public static final String Search_By_Git_Addr_Textbox_Css = getProperty("search_by_git_addr_textbox_css");
	
	public static final String Search_By_Git_Addr_Textbox_Css = getProperty("search_by_git_addr_textbox_css");
	
	public static final String Search_By_Git_Addr_Textbox_Css = getProperty("search_by_git_addr_textbox_css");
	
	public static final String Search_By_Git_Addr_Textbox_Css = getProperty("search_by_git_addr_textbox_css");
	
	public static final String Search_By_Git_Addr_Textbox_Css = getProperty("search_by_git_addr_textbox_css");
	
	public static final String Search_By_Git_Addr_Textbox_Css = getProperty("search_by_git_addr_textbox_css");
	
	public static final String Search_By_Git_Addr_Textbox_Css = getProperty("search_by_git_addr_textbox_css");
	
	public static final String Search_By_Git_Addr_Textbox_Css = getProperty("search_by_git_addr_textbox_css");
}
