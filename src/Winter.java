public enum Winter {

    DECEMBER("Кыштын биринчи айы"),
    JANUARY("Kыштын экинчи айы"),
    FEBRUARY("Кыштын акыркы айы");
    private String name;

    Winter(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Winter{" +
                "name='" + name + '\'' +
                '}';
    }
}



