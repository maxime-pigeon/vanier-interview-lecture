class Page {
    String title;
    Page parent;

    Page(String title, Page parent) {
        this.title = title;
        this.parent = parent;
    }

    String trail() {
        if (parent == null) {
            return title;
        } else {
            return parent.trail() + " > " + title;
        }
    }

    public static void main(String[] args) {
        Page home = new Page("Home", null);
        System.out.println(home.trail());
        // => "Home"

        Page departments = new Page("Departments", home);
        System.out.println(departments.trail());
        // => "Home > Departments"

        Page compSci = new Page("Computer Science", departments);
        System.out.println(compSci.trail());
        // => "Home > Departments > Computer Science"
    }

}
