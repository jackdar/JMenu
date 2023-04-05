/*
 * Created by Jack Darlington | 2023
 */

package com.jackdarlington.jmenu;

/**
 * @author Jack Darlington
 * Student ID: 19082592
 * Date: 22/03/2023
 */

public class CustomMenu extends AbstractMenu {

    public CustomMenu() {
        super();
    }
    
    public CustomMenu(AbstractMenu back) {
        super(back);
    }
    
    public CustomMenu(String title) {
        super(title);
    }
    
    public CustomMenu(String title, AbstractMenu back) {
        super(title, back);
    }
    
    public CustomMenu(String title, String description) {
        super(title, description);
    }
    
    public CustomMenu(String title, String description, AbstractMenu back) {
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
