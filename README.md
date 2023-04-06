<a href="https://github.com/jackdar/JMenu"><img align="right" width="100px" src="https://github.com/jackdar/JMenu/blob/main/JMenu.png"></img></a>
# JMenu
 A lightweight CLI menu library for Java
 
 # Classes
 
 ## Menu
 
 ### AbstractMenu <kbd>jmenu.AbstractMenu</kbd>

```java
abstract class AbstractMenu
```

AbstractMenu is the root of the Menu class heirarchy. All Menu objects must implement these methods.

**Constructors**
```java
AbstractMenu()
AbstractMenu(AbstractMenu back)
AbstractMenu(String title)
AbstractMenu(String title, AbstractMenu back)
AbstractMenu(String title, String description)
AbstractMenu(String title, String description, AbstractMenu back)
```

**Methods**
- `void printTitle()` Prints menus title
- `void printDescription()` Prints menu description
- `void print()` Prints an `AbstractMenu` instance
- `void run()` Calls `print()' <kbd>**overriden**</kbd>
- `static void clearConsole()` Clears console
- `void select()` Selects a menu `Option`
- `void resetSelection()` Resets menu selection

### OptionMenu <kbd>jmenu.OptionMenu</kbd>

```java
public class OptionMenu
```

OptionMenu is a child of AbstractMenu and implements all methods from AbstractMenu.\
This menu kind is for implementing a list of `Option`.

**Constructors**
```java
OptionMenu()
OptionMenu(AbstractMenu back)
OptionMenu(String title)
OptionMenu(String title, AbstractMenu back)
OptionMenu(String title, String description)
OptionMenu(String title, String description, AbstractMenu back)
```

**Methods**
- `void add(AbstractMenu menu)` Adds a new `Option` as an `AbstractMenu` link
- `void remove(AbstractMenu menu)` Removes an `AbstractMenu` `Option`
- `void print()` Prints an `OptionMenu` instance <kbd>**overriden**</kbd>
- `void run()` Runs the `OptionMenu` instance <kbd>**overriden**</kbd>

### CustomMenu

## Option

### AbstractOption

### MenuOption

### CustomOption
