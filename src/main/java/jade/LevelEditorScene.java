package jade;

import java.awt.event.KeyEvent;

public class LevelEditorScene extends Scene{

    private String vertexShaderSrc = "#version 330 core\n" +
            "    layout (location=0) in vec3 aPos;\n" +
            "    layout (location=1) in vec4 aColor;\n" +
            "\n" +
            "    out vec4 fColor;\n" +
            "\n" +
            "    void main(){\n" +
            "        fColor = aColor;\n" +
            "        gl_Position = vec4(aPos, 1.0);\n" +
            "\n" +
            "    }\n";


    private String fragmentShaderSrc = "#version 330 core\n" +
            "\n" +
            "    in vec4 fColor;\n" +
            "\n" +
            "    out vec4 color;\n" +
            "\n" +
            "    void main(){\n" +
            "        color = fColor;\n" +
            "    }";

    private int vertexId, fragmentId, shaderProgram;

    public LevelEditorScene(){
        System.out.println("Inside Level Editor Scene");

    }

    @Override
    public void update(float dt) {
    }


}
