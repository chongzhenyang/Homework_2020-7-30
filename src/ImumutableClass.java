public final class ImumutableClass {
    private final String name;
    private final int id;

    ImumutableClass(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public int getId(){
        return this.id;
    }
}
