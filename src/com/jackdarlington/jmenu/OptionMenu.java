/*
 * Created by Jack Darlington | 2023
 */

package com.jackdarlington.jmenu;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

/**
 * @author Jack Darlington
 * Student ID: 19082592
 * Date: 22/03/2023
 */

public class OptionMenu extends AbstractMenu {

    private final LinkedHashMap<Integer, AbstractMenu> options = new LinkedHashMap<>();
    private int menuOptionNum = 1;
    
    public OptionMenu() {
        super();
    }
    
    public OptionMenu(AbstractMenu back) {
        super(back);
    }
    
    public OptionMenu(String title) {
        super(title);
    }
    
    public OptionMenu(String title, AbstractMenu back) {
        super(title, back);
    }
    
    public OptionMenu(String title, String description) {
        super(title, description);
    }
    
    public OptionMenu(String title, String description, AbstractMenu back) {
        super(title, description, back);
    }
    
    public void add(AbstractMenu menu) {
        this.options.put(this.menuOptionNum, menu);
        this.menuOptionNum++;
    }
    
    public void remove(AbstractMenu menu) {
        for (Entry e : this.options.entrySet()) {
            if (e.getValue().equals(menu)) {
                this.options.remove(e.getKey());
                break;
            }
        }
    }
    
    @Override
    public void print() {
        AbstractMenu.clearConsole();
        this.printTitle();
        this.printDescription();
        for (Entry e : this.options.entrySet()) {
            System.out.println("  (" + e.getKey() + ") " + this.options.get(e.getKey()).getTitle());
        }
    }
    
    @Override
    public void run() {
        while(true) {
            this.print();
            this.select();
            switch (this.getControl()) {
                case FORWARD:
                    if (this.options.get(this.getSelection()) != null) {
                        this.options.get(this.getSelection()).run();
                    }
                    break;
                case RELOAD:
                    break;
                case BACK:
                    return;
            }
        }
    }
    
}
