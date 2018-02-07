class Car {
    String color = "black";
    String name = "ks";
    int x_pos = 0;

    public void goForward(int forward) {
        int x_pos;
        x_pos = this.x_pos;
    }

    public int getcarposition() {
        return x_pos;
    }

    public String getcarcolor() {
        return color;
    }

    public String getName() {
        return name;
    }
}