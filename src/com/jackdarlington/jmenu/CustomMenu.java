/*
 * Created by Jack Darlington | 2023
 */

package com.jackdarlington.jmenu;

/**
 * @author Jack Darlington
 * Student ID: 19082592
 * Date: 22/03/2023
 */

public class CustomMenu extends Menu {

    public CustomMenu() {
        super();
    }
    
    public CustomMenu(Menu back) {
        super(back);
    }
    
    public CustomMenu(String title) {
        super(title);
    }
    
    public CustomMenu(String title, Menu back) {
        super(title, back);
    }
    
    public CustomMenu(String title, String description) {
        super(title, description);
    }
    
    public CustomMenu(String title, String description, Menu back) {
        super(title, description, back);
    }
    
    @Override
    public void run() {
        this.customOperation();
    }
    
    public void customOperation() {
        // @Override for custom code execution.
        System.out.println("@Override to allow custom code execution!");
    }
    
}
