/*
 * Created by Jack Darlington | 2023
 */

package com.jackdarlington.jmenu;

import java.util.Scanner;

/**
 * @author Jack Darlington
 * Student ID: 19082592
 * Date: 22/03/2023
 */

abstract public class Menu {

    private String title;
    private String description;
    public Menu back;
    
    private Control control;
    private int selection;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Menu getBack() {
        return back;
    }

    public void setBack(Menu back) {
        this.back = back;
    }

    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public int getSelection() {
        return selection;
    }

    public void setSelection(int selection) {
        this.selection = selection;
    }
    
    public Menu() {
        this.title = "";
        this.description = "";
        this.back = null;
        
        this.control = Control.NONE;
        this.selection = 0;
    }
    
    public Menu(Menu back) {
        this.title = "";
        this.description = "";
        this.back = back;
        
        this.control = Control.NONE;
        this.selection = 0;
    }
    
    public Menu(String title) {
        this.title = title;
        this.description = "";
        this.back = null;
        
        this.control = Control.NONE;
        this.selection = 0;
    }
    
    public Menu(String title, Menu back) {
        this.title = title;
        this.description = "";
        this.back = back;
        
        this.control = Control.NONE;
        this.selection = 0;
    }
    
    public Menu(String title, String description) {
        this.title = title;
        this.description = description;
        this.back = null;
        
        this.control = Control.NONE;
        this.selection = 0;
    }
    
    public Menu(String title, String description, Menu back) {
        this.title = title;
        this.description = description;
        this.back = back;
        
        this.control = Control.NONE;
        this.selection = 0;
    }
    
    public void printTitle() {
        for (int i = 0; i < this.title.length() + 4; i++) {
            System.out.print("=");
        }
        System.out.println("\n  " + this.title);
        for (int i = 0; i < this.title.length() + 4; i++) {
            System.out.print("=");
        }
        System.out.println();
    }
    
    public void printDescription() {
        if (!this.description.equals("")) {
            System.out.println("\n" + this.description);
        }
        System.out.println();
    }
    
    public void print() {
        Menu.clearConsole();
        this.printTitle();
        this.printDescription();
    }
    
    public void run() {
        this.print();
        System.out.println("@Override for menu operation!");
    }
    
    public static void clearConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
    
    public void select() {
        Scanner sc = new Scanner(System.in);
        if (this.control == Control.BACK) {
            return;
        } else {
            String input = sc.nextLine().trim();
            try {
                int tryInt = Integer.parseInt(input);
                if (tryInt > 0) {
                    this.control = Control.FORWARD;
                    this.selection = tryInt;
                }
            } catch (NumberFormatException e) {
                if (input.equalsIgnoreCase("q") || input.equalsIgnoreCase("b")) {
                    this.control = Control.BACK;
                }
                if (input.equals(" ") || input.equals("\n")) {
                    this.control = Control.RELOAD;
                }
            }
        }
    }
    
    public void resetSelection() {
        this.control = Control.NONE;
        this.selection = 0;
    }
    
}