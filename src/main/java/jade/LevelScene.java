package jade;

public class LevelScene extends Scene{

    public LevelScene(){
        System.out.println("Inside Level Scene");
        Window.get().r = 1;
        Window.get().g = 1;
        Window.get().b = 1;
    }

    @Override
    public void update(float dt) {

    }

}
