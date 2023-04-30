import Engine.*;
import Engine.Object;
import Engine.Sphere;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.opengl.GL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.glfw.GLFW.glfwSetErrorCallback;
import static org.lwjgl.opengl.GL11.glClearColor;
import static org.lwjgl.opengl.GL20.*;

public class Proyek{
    static float yBadan=0f;
    static boolean HeadTurnX=true;
    static float HeadDegX=0f;
    static boolean HeadTurnY=true;
    static float HeadDegY=0f;
    static boolean BodyTurn=true;
    static float BodyDeg=0f;
    static boolean EyeTurnX=true;
    static float EyeDegX=0f;
    static boolean EyeTurnY=true;
    static float EyeDegY=0f;
    static boolean LegTurn=true;
    static float LegDeg=0f;
    static boolean HandTurnX=true;
    static float HandDegX=0f;
    static boolean HandTurnY=true;
    static float HandDegY=0f;
    static float x_v = 0f;
    static float y_v = 0f;
    static float z_v = 0f;
    static float vincent = 0f;
    float walkDeg =45f;
    int direction = 1;

    static float xMata=0f;
    static float yMata=0f;
    static float zMata=0f;
    static boolean down=true;
    static float blink=-115f;
    static boolean HeadTurn=true;
    static float HeadDeg=0f;
    static float kanan=0f;
    static float kiri=0f;
    static float x=0f;
    static float y=0f;
    static float z=0f;
    static boolean kakiB=true;
    static float kaki=0f;
    static boolean kakiV=true;
    static float kakiDV=0f;



    float counterDegreeKaki=45f;
    float counterDegreeKakiMekel=45f;
    float counterDegreeMata=0f;
    float counterDegreeTangan=45f;
    int gantiArahmekel = 1;
    int gantiArah = 1;
    int gantiArahTangan = 1;
    int gantiarahtanganmekel = 1;
    static float ybadan = 0f;
    static float xbadan = 0f;
    static float x_jb = 0f;
    static float y_jb = 0f;
    static float z_jb = 0f;

    static float x_mekel = 0f;
    static float y_mekel = 0f;
    static float z_mekel = 0f;
    static float x_badan_mekel = 0f;
    static float y_badan_mekel = 0f;

    public static float getyBadan() {
        return yBadan;
    }

    public static float getZ_mekel() {
        return z_mekel;
    }

    public static void setZ_mekel(float z_mekel) {
        Proyek.z_mekel += z_mekel;
    }

    public static float getX_badan_mekel() {
        return x_badan_mekel;
    }

    public static void setX_badan_mekel(float x_badan_mekel) {
        Proyek.x_badan_mekel += x_badan_mekel;
    }

    public static float getY_badan_mekel() {
        return y_badan_mekel;
    }

    public static void setY_badan_mekel(float y_badan_mekel) {
        Proyek.y_badan_mekel += y_badan_mekel;
    }

    public static float getX_mekel() {
        return x_mekel;
    }

    public static void setX_mekel(float x_mekel) {
        Proyek.x_mekel += x_mekel;
    }

    public static float getY_mekel() {
        return y_mekel;
    }

    public static void setY_mekel(float y_mekel) {
        Proyek.y_mekel += y_mekel;
    }


    public ArrayList<Object> berzier1 = new ArrayList<>();
    public ArrayList<Object> berzier2 = new ArrayList<>();
    public ArrayList<Object> berzier3 = new ArrayList<>();
    public ArrayList<Object> berzier4 = new ArrayList<>();
    public ArrayList<Object> berzier5 = new ArrayList<>();
    public ArrayList<Object> berzier6 = new ArrayList<>();
    public ArrayList<Object> berzier7 = new ArrayList<>();
    public ArrayList<Object> berzier8 = new ArrayList<>();
    public ArrayList<Object> berzier9 = new ArrayList<>();
    public ArrayList<Object> berzier10 = new ArrayList<>();
    public ArrayList<Object> berzier11 = new ArrayList<>();
    public ArrayList<Object> berzier12 = new ArrayList<>();
    public ArrayList<Object> berzier13 = new ArrayList<>();
    public ArrayList<Object> berzier14 = new ArrayList<>();
    int tes;
    public static float[][] controlBerzier1 = {
            { -0.12f, 0.01f, 0.065f},
            {-0.1f, -0.01f, 0.065f}
    };
    public static float[][] controlBerzier2 = {
            { -0.1f, -0.01f, 0.065f},
            { -0.03f, -0.02f, 0.065f}
    };
    public static float[][] controlBerzier3 = {
            { 0.1f, -0.01f, 0.065f},
            { 0.03f, -0.02f, 0.065f}
    };
    public static float[][] controlBerzier4 = {
            { 0.12f, 0.01f, 0.065f},
            {0.1f, -0.01f, 0.065f}
    };
    public static float[][] controlBerzier5 = {
            { 0.1f, -0.03f, 0.065f},
            { 0.03f, -0.03f, 0.065f}
    };
    public static float[][] controlBerzier6 = {
            { 0.12f, -0.02f, 0.065f},
            {0.1f, -0.03f, 0.065f}
    };
    public static float[][] controlBerzier7 = {
            { -0.1f, -0.03f, 0.065f},
            { -0.03f, -0.03f, 0.065f}
    };
    public static float[][] controlBerzier8 = {
            { -0.12f, -0.02f, 0.065f},
            {-0.1f, -0.03f, 0.065f}
    };
    public static float[][] controlBerzier9 = {
            { -0.1f, -0.05f, 0.065f},
            { -0.03f, -0.045f, 0.065f}
    };
    public static float[][] controlBerzier10 = {
            { -0.12f, -0.045f, 0.065f},
            {-0.1f, -0.05f, 0.065f}
    };
    public static float[][] controlBerzier11 = {
            { 0.1f, -0.05f, 0.065f},
            { 0.03f, -0.045f, 0.065f}
    };
    public static float[][] controlBerzier12 = {
            { 0.12f, -0.045f, 0.065f},
            {0.1f, -0.05f, 0.065f}
    };

    public static float[][] controlberzier13 = {
            {0.015f, 0.00001f, 0f},//scale
            {0f, -0.025f, 0.f}//translate
    };
    public static float[][] controlberzier14 = {
            {-0.015f, 0.00001f, 0f},
            {-0f, -0.025f, 0.f}
    };

    private Window window =
            new Window
                    (1920,1080,"Hello World");
    private ArrayList<Object> HK
            = new ArrayList<>();
    private ArrayList<Object> Keroppi
            = new ArrayList<>();
    private ArrayList<Object> environment
            = new ArrayList<>();

    private ArrayList<Object> objectsPointsControl
            = new ArrayList<>();
    private ArrayList<Object> Badtemaru
            = new ArrayList<>();
    private ArrayList<Object> objectsRectangle
            = new ArrayList<>();
    private ArrayList<Object> objects_chococat
            = new ArrayList<>();


    private MouseInput mouseInput;
    int countDegree = 0;
    Projection projection = new Projection(window.getWidth(),window.getHeight());
    Camera camera = new Camera();
    public void init(){
        window.init();
        GL.createCapabilities();
        mouseInput = window.getMouseInput();
        camera.setPosition(0,0,1f);
        camera.setRotation((float)Math.toRadians(0.0f),(float)Math.toRadians(0.0f));

        //Badtemaru
        {
            //Kepala
            {

                Badtemaru.add(new Sphere(
                        Arrays.asList(
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                        ),
                        new ArrayList<>(),
                        new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                        Arrays.asList(0.0f, 0.0f, 0.0f),
                        0.125f,
                        0.125f,
                        0.125f,
                        36,
                        10000
                ));
                Badtemaru.get(0).scaleObject(1f, 0.85f, 0.85f);

                //Rambut
                {
                    Badtemaru.get(0).getChildObject().add(new Cone(
                            Arrays.asList(
                                    new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                    new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                            ),
                            new ArrayList<>(),
                            new Vector4f(0.0f, 0.0f, 0.0f, 0.0f),
                            Arrays.asList(0.0f, 0.0f, 0.0f),
                            0.125f,
                            0.125f
                    ));
                    Badtemaru.get(0).getChildObject().get(0).scaleObject(0.01f, 0.01f, 0.005f);
                    Badtemaru.get(0).getChildObject().get(0).rotateObject((float) Math.toRadians(90f), 1f, 0f, 0f);
                    Badtemaru.get(0).getChildObject().get(0).rotateObject((float) Math.toRadians(-33f), 0f, 0f, 1f);
                    Badtemaru.get(0).getChildObject().get(0).translateObject(0.14f, 0.17f, 0.0f);

                    Badtemaru.get(0).getChildObject().add(new Cone(
                            Arrays.asList(
                                    new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                    new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                            ),
                            new ArrayList<>(),
                            new Vector4f(0.0f, 0.0f, 0.0f, 0.0f),
                            Arrays.asList(0.0f, 0.0f, 0.0f),
                            0.125f,
                            0.125f
                    ));
                    Badtemaru.get(0).getChildObject().get(1).scaleObject(0.01f, 0.01f, 0.005f);
                    Badtemaru.get(0).getChildObject().get(1).rotateObject((float) Math.toRadians(90f), 1f, 0f, 0f);
                    Badtemaru.get(0).getChildObject().get(1).rotateObject((float) Math.toRadians(33f), 0f, 0f, 1f);
                    Badtemaru.get(0).getChildObject().get(1).translateObject(-0.14f, 0.17f, 0.0f);

                    Badtemaru.get(0).getChildObject().add(new Cone(
                            Arrays.asList(
                                    new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                    new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                            ),
                            new ArrayList<>(),
                            new Vector4f(0.0f, 0.0f, 0.0f, 0.0f),
                            Arrays.asList(0.0f, 0.0f, 0.0f),
                            0.125f,
                            0.125f
                    ));
                    Badtemaru.get(0).getChildObject().get(2).scaleObject(0.01f, 0.01f, 0.005f);
                    Badtemaru.get(0).getChildObject().get(2).rotateObject((float) Math.toRadians(90f), 1f, 0f, 0f);
                    Badtemaru.get(0).getChildObject().get(2).rotateObject((float) Math.toRadians(10f), 0f, 0f, 1f);
                    Badtemaru.get(0).getChildObject().get(2).translateObject(-0.05f, 0.21f, 0.0f);

                    Badtemaru.get(0).getChildObject().add(new Cone(
                            Arrays.asList(
                                    new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                    new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                            ),
                            new ArrayList<>(),
                            new Vector4f(0.0f, 0.0f, 0.0f, 0.0f),
                            Arrays.asList(0.0f, 0.0f, 0.0f),
                            0.125f,
                            0.125f
                    ));
                    Badtemaru.get(0).getChildObject().get(3).scaleObject(0.01f, 0.01f, 0.005f);
                    Badtemaru.get(0).getChildObject().get(3).rotateObject((float) Math.toRadians(90f), 1f, 0f, 0f);
                    Badtemaru.get(0).getChildObject().get(3).rotateObject((float) Math.toRadians(-10f), 0f, 0f, 1f);
                    Badtemaru.get(0).getChildObject().get(3).translateObject(0.05f, 0.21f, 0.0f);

                }

                //Mata
                {
                    Badtemaru.get(0).getChildObject().add(new Sphere(
                            Arrays.asList(
                                    new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                    new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                            ),
                            new ArrayList<>(),
                            new Vector4f(1f, 1f, 1f, 1.0f),
                            Arrays.asList(0.0f, 0.0f, 0.0f),
                            0.125f,
                            0.125f,
                            0.125f,
                            36,
                            10000
                    ));
                    Badtemaru.get(0).getChildObject().get(4).scaleObject(0.35f, 0.38f, 0.35f);
                    Badtemaru.get(0).getChildObject().get(4).translateObject(-0.055f, 0.0f, 0.08f);


                    Badtemaru.get(0).getChildObject().add(new Sphere(
                            Arrays.asList(
                                    new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                    new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                            ),
                            new ArrayList<>(),
                            new Vector4f(1f, 1f, 1f, 1.0f),
                            Arrays.asList(0.0f, 0.0f, 0.0f),
                            0.125f,
                            0.125f,
                            0.125f,
                            36,
                            10000
                    ));
                    Badtemaru.get(0).getChildObject().get(5).scaleObject(0.35f, 0.38f, 0.35f);
                    Badtemaru.get(0).getChildObject().get(5).translateObject(0.055f, 0.0f, 0.08f);

                }

                //Selaput Mata
                {
                    Badtemaru.get(0).getChildObject().add(new HalfSpheare(
                            Arrays.asList(
                                    new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                    new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                            ),
                            new ArrayList<>(),
                            new Vector4f(0.0f, 0.0f, 0f, 0.0f),
                            Arrays.asList(0.0f, 0.0f, 0.0f),
                            0.125f,
                            0.125f,
                            0.125f,
                            36,
                            10000
                    ));
                    Badtemaru.get(0).getChildObject().get(6).scaleObject(0.455f, 0.455f, 0.455f);
                    Badtemaru.get(0).getChildObject().get(6).translateObject(-0.055f, 0.0f, 0.068f);
                    Badtemaru.get(0).getChildObject().get(6).rotateObjectSelf((float) Math.toRadians(-115f), 1f, 0f, 0f);


                    Badtemaru.get(0).getChildObject().add(new HalfSpheare(
                            Arrays.asList(
                                    new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                    new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                            ),
                            new ArrayList<>(),
                            new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                            Arrays.asList(0.0f, 0.0f, 0.0f),
                            0.125f,
                            0.125f,
                            0.125f,
                            36,
                            10000
                    ));
                    Badtemaru.get(0).getChildObject().get(7).scaleObject(0.455f, 0.455f, 0.455f);
                    Badtemaru.get(0).getChildObject().get(7).translateObject(0.055f, 0.0f, 0.068f);
                    Badtemaru.get(0).getChildObject().get(7).rotateObjectSelf((float) Math.toRadians(-115f), 1f, 0f, 0f);


                }

                //Titik mata
                {
                    Badtemaru.get(0).getChildObject().add(new Cylinder(
                            Arrays.asList(
                                    new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                    new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                            ),
                            new ArrayList<>(),
                            new Vector4f(0f, 0f, 0f, 1.0f),
                            Arrays.asList(0.0f, 0.0f, 0.0f),
                            0.125f,
                            0.125f,
                            0.125f,
                            36,
                            10000
                    ));
                    Badtemaru.get(0).getChildObject().get(8).scaleObject(0.1f, 0.1f, 0.1f);
                    Badtemaru.get(0).getChildObject().get(8).rotateObject((float) Math.toRadians(90f), 1f, 0f, 0f);
                    Badtemaru.get(0).getChildObject().get(8).rotateObject((float) Math.toRadians(-15f), 1f, 0f, 0f);
                    Badtemaru.get(0).getChildObject().get(8).translateObject(-0.055f, 0.016f, 0.122f);


                    Badtemaru.get(0).getChildObject().add(new Cylinder(
                            Arrays.asList(
                                    new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                    new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                            ),
                            new ArrayList<>(),
                            new Vector4f(0f, 0f, 0f, 1.0f),
                            Arrays.asList(0.0f, 0.0f, 0.0f),
                            0.125f,
                            0.125f,
                            0.125f,
                            36,
                            10000
                    ));
                    Badtemaru.get(0).getChildObject().get(9).scaleObject(0.1f, 0.1f, 0.1f);
                    Badtemaru.get(0).getChildObject().get(9).rotateObject((float) Math.toRadians(90f), 1f, 0f, 0f);
                    Badtemaru.get(0).getChildObject().get(9).rotateObject((float) Math.toRadians(-15f), 1f, 0f, 0f);
                    Badtemaru.get(0).getChildObject().get(9).translateObject(0.055f, 0.016f, 0.122f);

                }

                //Paruh
                {

                    Badtemaru.get(0).getChildObject().add(new HalfCone(
                            Arrays.asList(
                                    new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                    new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                            ),
                            new ArrayList<>(),
                            new Vector4f(1.0f, 1.0f, 0.0f, 0.0f),
                            Arrays.asList(0.0f, 0.0f, 0.0f),
                            0.125f,
                            0.125f
                    ));
                    Badtemaru.get(0).getChildObject().get(10).scaleObject(0.01f, 0.01f, 0.005f);
                    Badtemaru.get(0).getChildObject().get(10).rotateObject((float) Math.toRadians(180), 1f, 0f, 0f);
                    Badtemaru.get(0).getChildObject().get(10).translateObject(0f, -0.06f, 0.12f);

                    Badtemaru.get(0).getChildObject().add(new HalfCone(
                            Arrays.asList(
                                    new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                    new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                            ),
                            new ArrayList<>(),
                            new Vector4f(1.0f, 1.0f, 0.0f, 0.0f),
                            Arrays.asList(0.0f, 0.0f, 0.0f),
                            0.125f,
                            0.125f
                    ));
                    Badtemaru.get(0).getChildObject().get(11).scaleObject(0.01f, 0.01f, 0.005f);
                    Badtemaru.get(0).getChildObject().get(11).rotateObject((float) Math.toRadians(180), 1f, 0f, 0f);
                    Badtemaru.get(0).getChildObject().get(11).rotateObject((float) Math.toRadians(180), 0f, 0f, 1f);
                    Badtemaru.get(0).getChildObject().get(11).translateObject(0f, -0.05f, 0.12f);

                }
            }

            //Badan
            {
                Badtemaru.add(new Sphere(
                        Arrays.asList(
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                        ),
                        new ArrayList<>(),
                        new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                        Arrays.asList(0.0f, 0.0f, 0.0f),
                        0.125f,
                        0.125f,
                        0.125f,
                        36,
                        10000
                ));
                Badtemaru.get(1).scaleObject(0.5f, 1.25f, 0.5f);
                Badtemaru.get(1).rotateObject((float) Math.toRadians(-10f), 0f, 0f, 1f);
                Badtemaru.get(1).translateObject(-0.02f, -0.17f, 0.0f);


                Badtemaru.get(1).getChildObject().add(new Sphere(
                        Arrays.asList(
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                        ),
                        new ArrayList<>(),
                        new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                        Arrays.asList(0.0f, 0.0f, 0.0f),
                        0.125f,
                        0.125f,
                        0.125f,
                        36,
                        10000
                ));
                Badtemaru.get(1).getChildObject().get(0).scaleObject(0.5f, 1.25f, 0.5f);
                Badtemaru.get(1).getChildObject().get(0).rotateObject((float) Math.toRadians(10f), 0f, 0f, 1f);
                Badtemaru.get(1).getChildObject().get(0).translateObject(0.02f, -0.17f, 0.0f);

                //Tangan
                {
                    Badtemaru.get(1).getChildObject().add(new Sphere(
                            Arrays.asList(
                                    new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                    new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                            ),
                            new ArrayList<>(),
                            new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                            Arrays.asList(0.0f, 0.0f, 0.0f),
                            0.125f,
                            0.125f,
                            0.125f,
                            36,
                            10000
                    ));
                    Badtemaru.get(1).getChildObject().get(1).scaleObject(0.25f, 0.6f, 0.25f);
                    Badtemaru.get(1).getChildObject().get(1).rotateObject((float) Math.toRadians(20f), 0f, 0f, 1f);
                    Badtemaru.get(1).getChildObject().get(1).translateObject(0.1f, -0.15f, 0.0f);

                    Badtemaru.get(1).getChildObject().add(new Sphere(
                            Arrays.asList(
                                    new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                    new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                            ),
                            new ArrayList<>(),
                            new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                            Arrays.asList(0.0f, 0.0f, 0.0f),
                            0.125f,
                            0.125f,
                            0.125f,
                            36,
                            10000
                    ));
                    Badtemaru.get(1).getChildObject().get(2).scaleObject(0.25f, 0.6f, 0.25f);
                    Badtemaru.get(1).getChildObject().get(2).rotateObject((float) Math.toRadians(-20f), 0f, 0f, 1f);
                    Badtemaru.get(1).getChildObject().get(2).translateObject(-0.1f, -0.15f, 0.0f);
                }

                //Kaki
                {
                    Badtemaru.get(1).getChildObject().add(new Cylinder(
                            Arrays.asList(
                                    new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                    new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                            ),
                            new ArrayList<>(),
                            new Vector4f(1.0f, 1.0f, 0.0f, 1.0f),
                            Arrays.asList(0.0f, 0.0f, 0.0f),
                            0.125f,
                            0.125f,
                            0.125f,
                            36,
                            10000
                    ));
                    Badtemaru.get(1).getChildObject().get(3).scaleObject(0.25f, 0.1f, 0.35f);
                    Badtemaru.get(1).getChildObject().get(3).translateObject(0.04f, -0.32f, 0.015f);

                    Badtemaru.get(1).getChildObject().add(new Cylinder(
                            Arrays.asList(
                                    new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                    new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                            ),
                            new ArrayList<>(),
                            new Vector4f(1.0f, 1.0f, 0.0f, 1.0f),
                            Arrays.asList(0.0f, 0.0f, 0.0f),
                            0.125f,
                            0.125f,
                            0.125f,
                            36,
                            10000
                    ));
                    Badtemaru.get(1).getChildObject().get(4).scaleObject(0.25f, 0.1f, 0.35f);
                    Badtemaru.get(1).getChildObject().get(4).translateObject(-0.04f, -0.32f, 0.015f);

                }

                //Putih Badan
                {
                    Badtemaru.get(1).getChildObject().add(new Sphere(
                            Arrays.asList(
                                    new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                    new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                            ),
                            new ArrayList<>(),
                            new Vector4f(1.0f, 1.0f, 1.0f, 1.0f),
                            Arrays.asList(0.0f, 0.0f, 0.0f),
                            0.125f,
                            0.125f,
                            0.125f,
                            36,
                            10000
                    ));
                    Badtemaru.get(1).getChildObject().get(5).scaleObject(0.4f, 0.7f, 0.2f);
                    Badtemaru.get(1).getChildObject().get(5).rotateObject((float) Math.toRadians(5f), 1f, 0f, 0f);
                    Badtemaru.get(1).getChildObject().get(5).rotateObject((float) Math.toRadians(10f), 0f, 0f, 1f);
                    Badtemaru.get(1).getChildObject().get(5).translateObject(0.02f, -0.20f, 0.04f);

                    Badtemaru.get(1).getChildObject().add(new Sphere(
                            Arrays.asList(
                                    new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                    new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                            ),
                            new ArrayList<>(),
                            new Vector4f(1.0f, 1.0f, 1.0f, 1.0f),
                            Arrays.asList(0.0f, 0.0f, 0.0f),
                            0.125f,
                            0.125f,
                            0.125f,
                            36,
                            10000
                    ));
                    Badtemaru.get(1).getChildObject().get(6).scaleObject(0.4f, 0.7f, 0.2f);
                    Badtemaru.get(1).getChildObject().get(6).rotateObject((float) Math.toRadians(5f), 1f, 0f, 0f);
                    Badtemaru.get(1).getChildObject().get(6).rotateObject((float) Math.toRadians(-10f), 0f, 0f, 1f);
                    Badtemaru.get(1).getChildObject().get(6).translateObject(-0.02f, -0.20f, 0.04f);

                }
                //Kurva Kalung
                {
                    Badtemaru.get(1).getChildObject().add(new Kalung(Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                            new ArrayList<>(),
                            new Vector4f(0.8f, 0.8f, 0f, 1.0f),
                            Arrays.asList(
                                    new float[]{0.00f, -0.07f, 0},
                                    new float[]{0.1f, -0.02f, 0},
                                    new float[]{0.1f, 0.02f, 0},
                                    new float[]{0.00f, 0.07f, 0}

                            )
                    ));
                    Badtemaru.get(1).getChildObject().get(7).scaleObject(0.7f, 0.7f, 0.7f);
                    Badtemaru.get(1).getChildObject().get(7).rotateObject((float) Math.toRadians(90f), 1f, 0f, 0f);
                    Badtemaru.get(1).getChildObject().get(7).rotateObject((float) Math.toRadians(-90f), 0f, 1f, 0f);
                    Badtemaru.get(1).getChildObject().get(7).rotateObject((float) Math.toRadians(60f), 1f, 0f, 0f);
                    Badtemaru.get(1).getChildObject().get(7).translateObject(0.0f, -0.08f, 0.04f);


                    Badtemaru.get(1).getChildObject().add(new Kalung(Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                            new ArrayList<>(),
                            new Vector4f(0.8f, 0.8f, 0f, 1.0f),
                            Arrays.asList(
                                    new float[]{0.00f, -0.07f, 0},
                                    new float[]{0.05f, -0.02f, 0},
                                    new float[]{0.05f, 0.02f, 0},
                                    new float[]{0.00f, 0.07f, 0}

                            )
                    ));
                    Badtemaru.get(1).getChildObject().get(8).scaleObject(0.7f, 0.7f, 0.7f);
                    Badtemaru.get(1).getChildObject().get(8).rotateObject((float) Math.toRadians(90f), 1f, 0f, 0f);
                    Badtemaru.get(1).getChildObject().get(8).rotateObject((float) Math.toRadians(-90f), 0f, 1f, 0f);
                    Badtemaru.get(1).getChildObject().get(8).rotateObject((float) Math.toRadians(150f), 1f, 0f, 0f);
                    Badtemaru.get(1).getChildObject().get(8).translateObject(0.0f, -0.08f, -0.04f);
                }

            }
        }

        // ChocoCat
        {
            //Head
            {
                objects_chococat.add(new Sphere(
                        Arrays.asList(
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                        ),
                        new ArrayList<>(),
                        new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                        Arrays.asList(0.0f, 0.0f, 0.0f),
                        0.125f,
                        0.125f,
                        0.125f,
                        36,
                        1000
                ));
                objects_chococat.get(0).scaleObject(1f, 0.85f, 0.75f);
//        objects.get(0).rotateObject((float)Math.toRadians(90f),1f,0f,0f);
                objects_chococat.get(0).getChildObject().add(new Cone(//right ear
                        Arrays.asList(
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                        ),
                        new ArrayList<>(),
                        new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                        Arrays.asList(0.0f, 0.0f, 0.0f),
                        0.125f,
                        0.125f
                ));
                objects_chococat.get(0).getChildObject().get(0).scaleObject(0.012f, 0.005f, 0.0025f);
                objects_chococat.get(0).getChildObject().get(0).rotateObject((float) Math.toRadians(90f), 1f, 0f, 0f);
                objects_chococat.get(0).getChildObject().get(0).rotateObject((float) Math.toRadians(-38f), 0f, 0f, 1f);
                objects_chococat.get(0).getChildObject().get(0).translateObject(0.12f, 0.12f, 0.0f);

                objects_chococat.get(0).getChildObject().add(new Cone(//left ear
                        Arrays.asList(
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                        ),
                        new ArrayList<>(),
                        new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                        Arrays.asList(1.0f, 1.0f, 1.0f),
                        0.125f,
                        0.125f
                ));
                objects_chococat.get(0).getChildObject().get(1).scaleObject(0.012f, 0.005f, 0.0025f);
                objects_chococat.get(0).getChildObject().get(1).rotateObject((float) Math.toRadians(95f), 1f, 0f, 0f);
                objects_chococat.get(0).getChildObject().get(1).rotateObject((float) Math.toRadians(38f), 0f, 0f, 1f);
                objects_chococat.get(0).getChildObject().get(1).translateObject(-0.12f, 0.12f, 0.0f);

                objects_chococat.get(0).getChildObject().add(new Cone(//inner right ear
                        Arrays.asList(
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                        ),
                        new ArrayList<>(),
                        new Vector4f(1.0f, 1.0f, 0.0f, 1.0f),
                        Arrays.asList(0.0f, 0.0f, 0.0f),
                        0.125f,
                        0.125f
                ));
                objects_chococat.get(0).getChildObject().get(2).scaleObject(0.007f, 0.007f, 0.002f);
                objects_chococat.get(0).getChildObject().get(2).rotateObject((float) Math.toRadians(90f), 1f, 0f, 0f);
                objects_chococat.get(0).getChildObject().get(2).rotateObject((float) Math.toRadians(-38f), 0f, 0f, 1f);
                objects_chococat.get(0).getChildObject().get(2).translateObject(0.1f, 0.099f, 0.005f);

                objects_chococat.get(0).getChildObject().add(new Cone(//inner left ear
                        Arrays.asList(
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                        ),
                        new ArrayList<>(),
                        new Vector4f(1.0f, 1.0f, 0.0f, 1.0f),
                        Arrays.asList(1.0f, 1.0f, 1.0f),
                        0.125f,
                        0.125f
                ));
                objects_chococat.get(0).getChildObject().get(3).scaleObject(0.007f, 0.007f, 0.002f);
                objects_chococat.get(0).getChildObject().get(3).rotateObject((float) Math.toRadians(95f), 1f, 0f, 0f);
                objects_chococat.get(0).getChildObject().get(3).rotateObject((float) Math.toRadians(38f), 0f, 0f, 1f);
                objects_chococat.get(0).getChildObject().get(3).translateObject(-0.1f, 0.099f, 0.005f);

                objects_chococat.get(0).getChildObject().add(new Sphere( //nose
                        Arrays.asList(
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                        ),
                        new ArrayList<>(),
                        new Vector4f(0.3f, 0.1f, 0.0f, 1.0f),
                        Arrays.asList(0.0f, 0.0f, 0.0f),
                        0.125f,
                        0.125f,
                        0.125f,
                        36,
                        1000
                ));
                objects_chococat.get(0).getChildObject().get(4).scaleObject(0.07f, 0.05f, 0.075f);
                objects_chococat.get(0).getChildObject().get(4).translateObject(0.0f, -0.02f, 0.1f);

                objects_chococat.get(0).getChildObject().add(new Sphere( //right eye
                        Arrays.asList(
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                        ),
                        new ArrayList<>(),
                        new Vector4f(1.0f, 1.0f, 1.0f, 1.0f),
                        Arrays.asList(0.0f, 0.0f, 0.0f),
                        0.125f,
                        0.125f,
                        0.125f,
                        36,
                        1000
                ));
                objects_chococat.get(0).getChildObject().get(5).scaleObject(0.2f, 0.2f, 0.075f);
                objects_chococat.get(0).getChildObject().get(5).translateObject(0.033f, 0.02f, 0.09f);

                objects_chococat.get(0).getChildObject().add(new Sphere( //left eye
                        Arrays.asList(
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                        ),
                        new ArrayList<>(),
                        new Vector4f(1.0f, 1.0f, 1.0f, 1.0f),
                        Arrays.asList(0.0f, 0.0f, 0.0f),
                        0.125f,
                        0.125f,
                        0.125f,
                        36,
                        1000
                ));
                objects_chococat.get(0).getChildObject().get(6).scaleObject(0.2f, 0.2f, 0.075f);
                objects_chococat.get(0).getChildObject().get(6).translateObject(-0.033f, 0.02f, 0.09f);

                objects_chococat.get(0).getChildObject().add(new Sphere( //right pupil
                        Arrays.asList(
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                        ),
                        new ArrayList<>(),
                        new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                        Arrays.asList(0.0f, 0.0f, 0.0f),
                        0.125f,
                        0.125f,
                        0.125f,
                        36,
                        1000
                ));
                objects_chococat.get(0).getChildObject().get(7).scaleObject(0.07f, 0.07f, 0.05f);
                objects_chococat.get(0).getChildObject().get(7).translateObject(0.025f, 0.015f, 0.1f);

                objects_chococat.get(0).getChildObject().add(new Sphere( //left pupil
                        Arrays.asList(
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                        ),
                        new ArrayList<>(),
                        new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                        Arrays.asList(0.0f, 0.0f, 0.0f),
                        0.125f,
                        0.125f,
                        0.125f,
                        36,
                        1000
                ));
                objects_chococat.get(0).getChildObject().get(8).scaleObject(0.07f, 0.07f, 0.05f);
                objects_chococat.get(0).getChildObject().get(8).translateObject(-0.025f, 0.015f, 0.1f);

                objects_chococat.get(0).getChildObject().add(new Kotak( //left mustache 1
                        Arrays.asList(
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                        ),
                        new ArrayList<>(),
                        new Vector4f(0.0f,0.0f,0.0f,0.0f),
                        Arrays.asList(0.0f,0.0f,0.0f),
                        0.125f,
                        0.125f,
                        0.125f,
                        360,
                        18
                ));
                objects_chococat.get(0).getChildObject().get(9).scaleObject(0.7f, 0.05f, 0.05f);
                objects_chococat.get(0).getChildObject().get(9).translateObject(-0.13f, 0.015f, 0.06f);
                objects_chococat.get(0).getChildObject().get(9).rotateObject((float) Math.toRadians(30f), 0f, 0f, 1f);

                objects_chococat.get(0).getChildObject().add(new Kotak( //left mustache 2
                        Arrays.asList(
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                        ),
                        new ArrayList<>(),
                        new Vector4f(0.0f,0.0f,0.0f,0.0f),
                        Arrays.asList(0.0f,0.0f,0.0f),
                        0.125f,
                        0.125f,
                        0.125f,
                        360,
                        18
                ));
                objects_chococat.get(0).getChildObject().get(10).scaleObject(0.7f, 0.05f, 0.05f);
                objects_chococat.get(0).getChildObject().get(10).translateObject(-0.13f, 0.01f, 0.06f);
                objects_chococat.get(0).getChildObject().get(10).rotateObject((float) Math.toRadians(0f), 0f, 0f, 1f);

                objects_chococat.get(0).getChildObject().add(new Kotak( //right mustache 1
                        Arrays.asList(
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                        ),
                        new ArrayList<>(),
                        new Vector4f(0.0f,0.0f,0.0f,1.0f),
                        Arrays.asList(0.0f,0.0f,0.0f),
                        0.125f,
                        0.125f,
                        0.125f,
                        360,
                        18
                ));
                objects_chococat.get(0).getChildObject().get(11).scaleObject(0.7f, 0.05f, 0.05f);
                objects_chococat.get(0).getChildObject().get(11).translateObject(0.13f, 0.015f, 0.06f);
                objects_chococat.get(0).getChildObject().get(11).rotateObject((float) Math.toRadians(-30f), 0f, 0f, 1f);

                objects_chococat.get(0).getChildObject().add(new Kotak( //right mustache 2
                        Arrays.asList(
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                        ),
                        new ArrayList<>(),
                        new Vector4f(0.0f,0.0f,0.0f,1.0f),
                        Arrays.asList(0.0f,0.0f,0.0f),
                        0.125f,
                        0.125f,
                        0.125f,
                        360,
                        18
                ));
                objects_chococat.get(0).getChildObject().get(12).scaleObject(0.7f, 0.05f, 0.05f);
                objects_chococat.get(0).getChildObject().get(12).translateObject(0.13f, 0.01f, 0.06f);
                objects_chococat.get(0).getChildObject().get(12).rotateObject((float) Math.toRadians(0f), 0f, 0f, 1f);
            }
            //Body
            {
                objects_chococat.add(new Sphere(
                        Arrays.asList(
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                        ),
                        new ArrayList<>(),
                        new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                        Arrays.asList(0.0f, 0.0f, 0.0f),
                        0.125f,
                        0.125f,
                        0.125f,
                        36,
                        1000
                ));
                objects_chococat.get(1).scaleObject(0.6f, 0.75f, 0.5f);
                objects_chococat.get(1).translateObject(0.0f, -0.14f, 0.0f);

                objects_chococat.get(1).getChildObject().add(new HalfSpheare( //Collar
                        Arrays.asList(
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                        ),
                        new ArrayList<>(),
                        new Vector4f(0.0f, 0.0f, 1.0f, 1.0f),
                        Arrays.asList(0.0f, 0.0f, 0.0f),
                        0.125f,
                        0.125f,
                        0.125f,
                        36,
                        1000
                ));
                objects_chococat.get(1).getChildObject().get(0).scaleObject(0.55f, 0.07f, 0.3f);
                objects_chococat.get(1).getChildObject().get(0).translateObject(0.0f, -0.09f, 0.02f);
                objects_chococat.get(1).getChildObject().get(0).rotateObject((float) Math.toRadians(0f), 1f, 0f, 0f);

                objects_chococat.get(1).getChildObject().add(new Sphere( //Right Hand
                        Arrays.asList(
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                        ),
                        new ArrayList<>(),
                        new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                        Arrays.asList(0.0f, 0.0f, 0.0f),
                        0.125f,
                        0.125f,
                        0.125f,
                        36,
                        1000
                ));
                objects_chococat.get(1).getChildObject().get(1).scaleObject(0.5f, 0.2f, 0.2f);
                objects_chococat.get(1).getChildObject().get(1).translateObject(0.06f, -0.12f, 0.0f);
                objects_chococat.get(1).getChildObject().get(1).rotateObject((float) Math.toRadians(20f), 0f, 0f, 1f);

                objects_chococat.get(1).getChildObject().add(new Sphere( //Left Hand
                        Arrays.asList(
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                        ),
                        new ArrayList<>(),
                        new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                        Arrays.asList(0.0f, 0.0f, 0.0f),
                        0.125f,
                        0.125f,
                        0.125f,
                        36,
                        1000
                ));
                objects_chococat.get(1).getChildObject().get(2).scaleObject(0.5f, 0.2f, 0.2f);
                objects_chococat.get(1).getChildObject().get(2).translateObject(-0.06f, -0.12f, 0.0f);
                objects_chococat.get(1).getChildObject().get(2).rotateObject((float) Math.toRadians(-20f), 0f, 0f, 1f);

                objects_chococat.get(1).getChildObject().add(new Sphere( //Left Foot
                        Arrays.asList(
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                        ),
                        new ArrayList<>(),
                        new Vector4f(0.0f, 0.0f, 0.0f, 0.0f),
                        Arrays.asList(0.0f, 0.0f, 0.0f),
                        0.125f,
                        0.125f,
                        0.125f,
                        36,
                        1000
                ));
                objects_chococat.get(1).getChildObject().get(3).scaleObject(0.2f, 0.4f, 0.2f);
                objects_chococat.get(1).getChildObject().get(3).translateObject(-0.035f, -0.23f, 0.0f);
//            objects.get(1).getChildObject().get(3).rotateObject((float) Math.toRadians(40f), 0f, 0f, 1f);

                objects_chococat.get(1).getChildObject().add(new Sphere( //Right Foot
                        Arrays.asList(
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                        ),
                        new ArrayList<>(),
                        new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                        Arrays.asList(0.0f, 0.0f, 0.0f),
                        0.125f,
                        0.125f,
                        0.125f,
                        36,
                        1000
                ));
                objects_chococat.get(1).getChildObject().get(4).scaleObject(0.2f, 0.4f, 0.2f);
                objects_chococat.get(1).getChildObject().get(4).translateObject(0.035f, -0.23f, 0.0f);
//            objects.get(1).getChildObject().get(4).rotateObject((float) Math.toRadians(-40f), 0f, 0f, 1f);
                objects_chococat.get(1).getChildObject().add(new Kalung( Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                        new ArrayList<>(),
                        new Vector4f(0f,0f,0f,1.0f),
                        Arrays.asList(
                                new float[]{0.0f, 0.0f,0},
                                new float[]{0.01f, -0.01f,0},
                                new float[]{0.03f, 0.03f,0},
                                new float[]{0.05f, -0.01f, 0},
                                new float[]{0.055f, 0.01f, 0},
                                new float[]{0.06f,0.01f,0},
                                new float[]{0.10f,0.01f,0},
                                new float[]{0.11f,0.01f,0},
                                new float[]{0.12f,-0.11f,0},
                                new float[]{0.2f,-0.11f,0}
                        )
                ));
                objects_chococat.get(1).getChildObject().get(5).translateObject(0.0f, 0.2f, 0.0f);
                objects_chococat.get(1).getChildObject().get(5).rotateObject((float) Math.toRadians(180f), 0f, 0f, 1f);
                objects_chococat.get(1).getChildObject().get(5).rotateObject((float) Math.toRadians(-90f), 0f, 1f, 0f);


            }
        }

        objects_chococat.get(0).translateObject(0.5f,0f,0f);
        objects_chococat.get(1).translateObject(0.5f,0f,0f);
        setKorV(0.5f,0f,0f);

        //HelloKity
        {
            HK.add(new Sphere_jb(//kepala
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(1.0f,1.0f,1.0f,1.0f),
                    Arrays.asList(0.0f,0.0f,0.0f),
                    0.125f,
                    0.125f,
                    0.125f,
                    36,
                    18
            ));
            HK.get(0).scaleObject(0.25f,0.2f,0.1525f);
//        HK.get(0).rotateObject((float)Math.toRadians(90f),1f,0f,0f);
            HK.get(0).getChildObject().add(new Cone(//telinga kanan
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(1.0f,1.0f,1.0f,1.0f),
                    Arrays.asList(0.0f,0.0f,0.0f),
                    0.125f,
                    0.125f
            ));
            HK.get(0).getChildObject().get(0).scaleObject(0.01f,0.01f,0.0025f);
            HK.get(0).getChildObject().get(0).rotateObject((float)Math.toRadians(90f),1f,0f,0f);
            HK.get(0).getChildObject().get(0).rotateObject((float)Math.toRadians(-25f),0f,0f,1f);
            HK.get(0).getChildObject().get(0).translateObject(0.1f,0.12f,0.0f);

            HK.get(0).getChildObject().add(new Cone(//telinga kiri
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(1.0f,1.0f,1.0f,1.0f),
                    Arrays.asList(0.0f,0.0f,0.0f),
                    0.125f,
                    0.125f
            ));
            HK.get(0).getChildObject().get(1).scaleObject(0.01f,0.01f,0.0025f);
            HK.get(0).getChildObject().get(1).rotateObject((float)Math.toRadians(90f),1f,0f,0f);
            HK.get(0).getChildObject().get(1).rotateObject((float)Math.toRadians(25f),0f,0f,1f);
            HK.get(0).getChildObject().get(1).translateObject(-0.1f,0.12f,0.0f);

            HK.get(0).getChildObject().add(new Cone(//badan
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.952f, 0.447f, 0.815f,1.0f),
                    Arrays.asList(0.0f,0.0f,0.0f),
                    0.125f,
                    0.125f
            ));
            HK.get(0).getChildObject().get(2).scaleObject(0.032f,0.026f,0.006f);
            //gedutin pake y udh di rotate lebarin pake x
            HK.get(0).getChildObject().get(2).rotateObject((float)Math.toRadians(90f),1f,0f,0f);
            HK.get(0).getChildObject().get(2).translateObject(0f,-0.09f,0.0f);

            HK.get(0).getChildObject().get(2).getChildObject().add(new Cone(//kerah baju
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.686f, 0.070f, 0.517f,1.0f),
                    Arrays.asList(0.0f,0.0f,0.0f),
                    0.125f,
                    0.125f
            ));
            HK.get(0).getChildObject().get(2).getChildObject().get(0).scaleObject(0.005f,0.0005f,0.00125f);
            HK.get(0).getChildObject().get(2).getChildObject().get(0).rotateObject((float)Math.toRadians(-90),1f,0f,0f);
            HK.get(0).getChildObject().get(2).getChildObject().get(0).rotateObject((float)Math.toRadians(-37),1f,0f,0f);
            HK.get(0).getChildObject().get(2).getChildObject().get(0).translateObject(0f,-0.12f,0.045f);


            HK.get(0).getChildObject().add(new Elliptic_cone(//pita
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(1.0f,0.0f,0.0f,1.0f),
                    Arrays.asList(0.0f,0.0f,0.0f),
                    0.125f,
                    0.125f,
                    0.125f,
                    36,
                    18
            ));
//        HK.get(0).getChildObject().get(3).rotateObject((float)Math.toRadians(90),1f,0f,0f);
            HK.get(0).getChildObject().get(3).scaleObject(0.01f,0.01f,0.01f);
            HK.get(0).getChildObject().get(3).rotateObject((float)Math.toRadians(-120f),0f,0f,1f);
            HK.get(0).getChildObject().get(3).translateObject(0.06f,0.05f,0.07f);



            HK.get(0).getChildObject().add(new Cylinder(//kaki kanan
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(1.0f,1.0f,1.0f,1.0f),
                    Arrays.asList(0.0f,0.0f,0.0f),
                    0.125f,
                    0.125f,
                    0.125f,
                    36,
                    18
            ));

            HK.get(0).getChildObject().get(4).scaleObject(0.14f,0.55f,0.17f);
//        HK.get(0).getChildObject().get(4).rotateObject((float)Math.toRadians(90),0f,1f,0f);
            HK.get(0).getChildObject().get(4).translateObject(0.05f,-0.23f,-0.015f);

            HK.get(0).getChildObject().get(4).getChildObject().add(new Cylinder(//sepatu kanan
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.0f,0.0f,0.0f,1.0f),
                    Arrays.asList(0.0f,0.0f,0.0f),
                    0.125f,
                    0.125f,
                    0.125f,
                    36,
                    18
            ));
            HK.get(0).getChildObject().get(4).getChildObject().get(0).scaleObject(0.25f,0.1f,0.3f);
            HK.get(0).getChildObject().get(4).getChildObject().get(0).translateObject(0.05f,-0.29f,0.0f);

            HK.get(0).getChildObject().add(new Cylinder(//kaki kiri
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(1.0f,1.0f,1.0f,1.0f),
                    Arrays.asList(0.0f,0.0f,0.0f),
                    0.125f,
                    0.125f,
                    0.125f,
                    36,
                    18
            ));
            HK.get(0).getChildObject().get(5).scaleObject(0.14f,0.55f,0.17f);
//        HK.get(0).getChildObject().get(4).rotateObject((float)Math.toRadians(90),0f,1f,0f);
            HK.get(0).getChildObject().get(5).translateObject(-0.05f,-0.23f,-0.015f);

            HK.get(0).getChildObject().get(5).getChildObject().add(new Cylinder(//sepatu kiri
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.0f,0.0f,0.0f,1.0f),
                    Arrays.asList(0.0f,0.0f,0.0f),
                    0.125f,
                    0.125f,
                    0.125f,
                    36,
                    18
            ));
            HK.get(0).getChildObject().get(5).getChildObject().get(0).scaleObject(0.25f,0.1f,0.3f);
            HK.get(0).getChildObject().get(5).getChildObject().get(0).translateObject(-0.05f,-0.29f,0.0f);

            HK.get(0).getChildObject().add(new Sphere_jb(//tangan kanan
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(1.0f,1.0f,1.0f,1.0f),
                    Arrays.asList(0.0f,0.0f,0.0f),
                    0.125f,
                    0.125f,
                    0.125f,
                    36,
                    18
            ));
            HK.get(0).getChildObject().get(6).scaleObject(0.05f,0.06f,0.12f);
            HK.get(0).getChildObject().get(6).rotateObject((float)Math.toRadians(90f),1f,0f,0f);
            HK.get(0).getChildObject().get(6).rotateObject((float)Math.toRadians(60f),0f,0f,1f);
            HK.get(0).getChildObject().get(6).translateObject(0.07f,-0.15f,0f);

            HK.get(0).getChildObject().add(new Sphere_jb(//tangan kiri
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(1.0f,1.0f,1.0f,1.0f),
                    Arrays.asList(0.0f,0.0f,0.0f),
                    0.125f,
                    0.125f,
                    0.125f,
                    36,
                    18
            ));
            HK.get(0).getChildObject().get(7).scaleObject(0.05f,0.06f,0.12f);
            HK.get(0).getChildObject().get(7).rotateObject((float)Math.toRadians(90f),1f,0f,0f);
            HK.get(0).getChildObject().get(7).rotateObject((float)Math.toRadians(-60f),0f,0f,1f);
            HK.get(0).getChildObject().get(7).translateObject(-0.07f,-0.15f,0f);

            HK.get(0).getChildObject().add(new Sphere_jb(//mata kanan
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.0f,0.0f,0.0f,1.0f),
                    Arrays.asList(0.0f,0.0f,0.0f),
                    0.125f,
                    0.125f,
                    0.125f,
                    36,
                    18
            ));
            HK.get(0).getChildObject().get(8).scaleObject(0.024f,0.03f,0.01f);
            HK.get(0).getChildObject().get(8).translateObject(0.06f,0.0f,0.065f);

            HK.get(0).getChildObject().add(new Sphere_jb(//mata kiri
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.0f,0.0f,0.0f,1.0f),
                    Arrays.asList(0.0f,0.0f,0.0f),
                    0.125f,
                    0.125f,
                    0.125f,
                    36,
                    18
            ));
            HK.get(0).getChildObject().get(9).scaleObject(0.024f,0.03f,0.01f);
            HK.get(0).getChildObject().get(9).translateObject(-0.06f,0.0f,0.065f);

            HK.get(0).getChildObject().add(new Sphere_jb(//mulut
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(1.0f,1.0f,0.0f,1.0f),
                    Arrays.asList(0.0f,0.0f,0.0f),
                    0.125f,
                    0.125f,
                    0.125f,
                    36,
                    18
            ));
            HK.get(0).getChildObject().get(10).scaleObject(0.02f,0.014f,0.01f);
            HK.get(0).getChildObject().get(10).translateObject(0.0f,-0.035f,0.066f);

            berzier1.add(new Object(
                    Arrays.asList(
                            //shaderFile lokasi menyesuaikan objectnya
                            new ShaderProgram.ShaderModuleData
                                    ("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData
                                    ("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.0f, 0.0f, 0.0f, 0.0f)
            ));
            berzier2.add(new Object(
                    Arrays.asList(
                            //shaderFile lokasi menyesuaikan objectnya
                            new ShaderProgram.ShaderModuleData
                                    ("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData
                                    ("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.0f, 0.0f, 0.0f, 0.0f)
            ));
            berzier1.add(new Object(
                    Arrays.asList(
                            //shaderFile lokasi menyesuaikan objectnya
                            new ShaderProgram.ShaderModuleData
                                    ("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData
                                    ("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.0f, 0.0f, 0.0f, 0.0f)
            ));
            berzier2.add(new Object(
                    Arrays.asList(
                            //shaderFile lokasi menyesuaikan objectnya
                            new ShaderProgram.ShaderModuleData
                                    ("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData
                                    ("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.0f, 0.0f, 0.0f, 0.0f)
            ));berzier3.add(new Object(
                Arrays.asList(
                        //shaderFile lokasi menyesuaikan objectnya
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 0.0f)
        ));
            berzier4.add(new Object(
                    Arrays.asList(
                            //shaderFile lokasi menyesuaikan objectnya
                            new ShaderProgram.ShaderModuleData
                                    ("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData
                                    ("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.0f, 0.0f, 0.0f, 0.0f)
            ));
            berzier5.add(new Object(
                    Arrays.asList(
                            //shaderFile lokasi menyesuaikan objectnya
                            new ShaderProgram.ShaderModuleData
                                    ("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData
                                    ("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.0f, 0.0f, 0.0f, 0.0f)
            ));
            berzier6.add(new Object(
                    Arrays.asList(
                            //shaderFile lokasi menyesuaikan objectnya
                            new ShaderProgram.ShaderModuleData
                                    ("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData
                                    ("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.0f, 0.0f, 0.0f, 0.0f)
            ));
            berzier7.add(new Object(
                    Arrays.asList(
                            //shaderFile lokasi menyesuaikan objectnya
                            new ShaderProgram.ShaderModuleData
                                    ("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData
                                    ("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.0f, 0.0f, 0.0f, 0.0f)
            ));
            berzier8.add(new Object(
                    Arrays.asList(
                            //shaderFile lokasi menyesuaikan objectnya
                            new ShaderProgram.ShaderModuleData
                                    ("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData
                                    ("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.0f, 0.0f, 0.0f, 0.0f)
            ));
            berzier9.add(new Object(
                    Arrays.asList(
                            //shaderFile lokasi menyesuaikan objectnya
                            new ShaderProgram.ShaderModuleData
                                    ("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData
                                    ("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.0f, 0.0f, 0.0f, 0.0f)
            ));
            berzier10.add(new Object(
                    Arrays.asList(
                            //shaderFile lokasi menyesuaikan objectnya
                            new ShaderProgram.ShaderModuleData
                                    ("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData
                                    ("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.0f, 0.0f, 0.0f, 0.0f)
            ));
            berzier11.add(new Object(
                    Arrays.asList(
                            //shaderFile lokasi menyesuaikan objectnya
                            new ShaderProgram.ShaderModuleData
                                    ("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData
                                    ("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.0f, 0.0f, 0.0f, 0.0f)
            ));
            berzier12.add(new Object(
                    Arrays.asList(
                            //shaderFile lokasi menyesuaikan objectnya
                            new ShaderProgram.ShaderModuleData
                                    ("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData
                                    ("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.0f, 0.0f, 0.0f, 0.0f)
            ));
            berzier13.add(new Object(
                    Arrays.asList(
                            //shaderFile lokasi menyesuaikan objectnya
                            new ShaderProgram.ShaderModuleData
                                    ("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData
                                    ("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.0f, 0.0f, 0.0f, 0.0f)
            ));
            berzier14.add(new Object(
                    Arrays.asList(
                            //shaderFile lokasi menyesuaikan objectnya
                            new ShaderProgram.ShaderModuleData
                                    ("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData
                                    ("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.0f, 0.0f, 0.0f, 0.0f)
            ));

            berzier(controlBerzier1,0);
            HK.get(0).getChildObject().add(berzier1.get(0));
            berzier(controlBerzier2,1);
            HK.get(0).getChildObject().add(berzier2.get(0));
            berzier(controlBerzier3,2);
            HK.get(0).getChildObject().add(berzier3.get(0));
            berzier(controlBerzier4,3);
            HK.get(0).getChildObject().add(berzier4.get(0));
            berzier(controlBerzier5,4);
            HK.get(0).getChildObject().add(berzier5.get(0));
            berzier(controlBerzier6,5);
            HK.get(0).getChildObject().add(berzier6.get(0));
            berzier(controlBerzier7,6);
            HK.get(0).getChildObject().add(berzier7.get(0));
            berzier(controlBerzier8,7);
            HK.get(0).getChildObject().add(berzier8.get(0));
            berzier(controlBerzier9,8);
            HK.get(0).getChildObject().add(berzier9.get(0));
            berzier(controlBerzier10,9);
            HK.get(0).getChildObject().add(berzier10.get(0));
            berzier(controlBerzier11,10);
            HK.get(0).getChildObject().add(berzier11.get(0));
            berzier(controlBerzier12,11);
            HK.get(0).getChildObject().add(berzier12.get(0));


            environment.add(new Sphere_jb(//matahari
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(1.0f,1.0f,0.0f,1.0f),
                    Arrays.asList(0.0f,0.0f,0.0f),
                    0.125f,
                    0.125f,
                    0.125f,
                    36,
                    18
            ));
            environment.get(0).scaleObject(0.5f,0.5f,0.5f);
            environment.get(0).translateObject(3.3f,1.8f,-3.0f);

            environment.add(new Cone(//daun atas
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.0f,0.7f,0.0f,1.0f),
                    Arrays.asList(0.0f,0.0f,0.0f),
                    0.125f,
                    0.125f
            ));
            environment.get(1).rotateObject((float)Math.toRadians(90f),1f,0f,0f);
            environment.get(1).scaleObject(0.05f,0.02f,0.05f);
            environment.get(1).translateObject(1f,0.8f,-1f);

            environment.get(1).getChildObject().add(new Cone(//daun 2
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.0f,0.7f,0.0f,1.0f),
                    Arrays.asList(0.0f,0.0f,0.0f),
                    0.125f,
                    0.125f
            ));
            environment.get(1).getChildObject().get(0).rotateObject((float)Math.toRadians(90f),1f,0f,0f);
            environment.get(1).getChildObject().get(0).scaleObject(0.065f,0.02f,0.065f);
            environment.get(1).getChildObject().get(0).translateObject(1f,0.5f,-1f);

            environment.get(1).getChildObject().add(new Cone(//daun 3
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.0f,0.7f,0.0f,1.0f),
                    Arrays.asList(0.0f,0.0f,0.0f),
                    0.125f,
                    0.125f
            ));
            environment.get(1).getChildObject().get(1).rotateObject((float)Math.toRadians(90f),1f,0f,0f);
            environment.get(1).getChildObject().get(1).scaleObject(0.08f,0.02f,0.08f);
            environment.get(1).getChildObject().get(1).translateObject(1f,0.2f,-1f);

            environment.get(1).getChildObject().add(new Cylinder(//Batang pohon
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.443f, 0.337f, 0.337f,1.0f),
                    Arrays.asList(0.0f,0.0f,0.0f),
                    0.125f,
                    0.125f,
                    0.125f,
                    36,
                    18
            ));
            environment.get(1).getChildObject().get(2).scaleObject(0.5f,2.5f,0.5f);
            environment.get(1).getChildObject().get(2).translateObject(1f,-0.3f,-1f);

            environment.get(1).translateObject(0f,0.1f,0f);

            environment.add(new HalfSpheare(//semak2
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.0f,0.5f,0.0f,1.0f),
                    Arrays.asList(0.0f,0.0f,0.0f),
                    0.125f,
                    0.125f,
                    0.125f,
                    36,
                    72
            ));
            environment.get(2).rotateObject((float)Math.toRadians(90f),0f,1f,0f);
            environment.get(2).rotateObject((float)Math.toRadians(90f),0f,0f,1f);
            environment.get(2).scaleObject(1f,1f,2f);
            environment.get(2).translateObject(-0.3f,-0.3f,0f);

            environment.get(2).getChildObject().add(new HalfSpheare(//semak2 kiri
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.0f,0.6f,0.0f,1.0f),
                    Arrays.asList(0.0f,0.0f,0.0f),
                    0.125f,
                    0.125f,
                    0.125f,
                    36,
                    72
            ));
            environment.get(2).getChildObject().get(0).rotateObject((float)Math.toRadians(90f),0f,1f,0f);
            environment.get(2).getChildObject().get(0).rotateObject((float)Math.toRadians(90f),0f,0f,1f);
            environment.get(2).getChildObject().get(0).scaleObject(0.5f,0.5f,1.3f);
            environment.get(2).getChildObject().get(0).translateObject(-0.4f,-0.3f,0.2f);

            environment.add(new HalfSpheare(//batu
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.5f,0.5f,0.5f,1.0f),
                    Arrays.asList(0.0f,0.0f,0.0f),
                    0.125f,
                    0.125f,
                    0.125f,
                    36,
                    72
            ));
            environment.get(3).rotateObject((float)Math.toRadians(90f),0f,1f,0f);
            environment.get(3).rotateObject((float)Math.toRadians(90f),0f,0f,1f);
            environment.get(3).scaleObject(1.0f,1.0f,1.6f);
            environment.get(3).translateObject(-0.6f,-0.3f,-0.4f);

            environment.get(3).getChildObject().add(new HalfSpheare(//batu
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.5f,0.5f,0.5f,1.0f),
                    Arrays.asList(0.0f,0.0f,0.0f),
                    0.125f,
                    0.125f,
                    0.125f,
                    36,
                    72
            ));
            environment.get(3).getChildObject().get(0).rotateObject((float)Math.toRadians(90f),0f,1f,0f);
            environment.get(3).getChildObject().get(0).rotateObject((float)Math.toRadians(90f),0f,0f,1f);
            environment.get(3).getChildObject().get(0).scaleObject(1.0f,1.0f,1.6f);
            environment.get(3).getChildObject().get(0).translateObject(-0.9f,-0.3f,-0.25f);

            environment.add(new Kotak(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.376f, 0.164f, 0.164f,1.0f),
                    Arrays.asList(0.0f,0.0f,0.0f),
                    0.125f,
                    0.125f,0.125f,
                    360,18
            ));
            environment.get(4).scaleObject(50f,0.5f,50f);
//        environment.get(4).rotateObject((float)Math.toRadians(30f),1f,0f,0f);
            environment.get(4).translateObject(0f,-0.4f,0f);

        }

        HK.get(0).translateObject(-0.5f,0f,0f);
        setX_jb(-0.5f);

        //Keroppi
        {
            Keroppi.add(new Sphere_mp(//kepala
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.72f, 0.86f, 0.08f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.125f,
                    0.125f,
                    0.125f,
                    36,
                    10000
            ));
            Keroppi.get(0).scaleObject(1f, 0.8f, 0.75f);

            Keroppi.get(0).getChildObject().add(new Cone(//badan
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(1f, 1.0f, 1f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.125f,
                    0.125f
            ));
            Keroppi.get(0).getChildObject().get(0).scaleObject(0.04f, 0.025f, 0.006f);
            //gedutin pake y udh di rotate lebarin pake x
            Keroppi.get(0).getChildObject().get(0).rotateObject((float) Math.toRadians(90f), 1f, 0f, 0f);
            Keroppi.get(0).getChildObject().get(0).translateObject(0f, -0.05f, 0f);
            //x ke kanan, y ke atas, z ke blkng

            Keroppi.get(0).getChildObject().add(new Elliptic_cone(//dasi
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(1.0f, 0.0f, 0.0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.125f,
                    0.125f,
                    0.125f,
                    36,
                    10000
            ));
            Keroppi.get(0).getChildObject().get(1).scaleObject(0.01f, 0.01f, 0.004f);
            //y=x,x=y
            Keroppi.get(0).getChildObject().get(1).rotateObject((float) Math.toRadians(90f), 0f, 0f, 1f);
            Keroppi.get(0).getChildObject().get(1).translateObject(0.0f, -0.08f, 0.07f);

            Keroppi.get(0).getChildObject().get(1).getChildObject().add(new Sphere_mp(//knot dasi
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(1f, 0f, 0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.125f,
                    0.125f,
                    0.125f,
                    36,
                    10000
            ));
            Keroppi.get(0).getChildObject().get(1).getChildObject().get(0).scaleObject(0.1f, 0.1f, 0.1f);
            Keroppi.get(0).getChildObject().get(1).getChildObject().get(0).translateObject(0f, -0.08f, 0.067f);

            Keroppi.get(0).getChildObject().get(1).getChildObject().add(new Cylinder(//karet dasi
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(1f, 0f, 0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.125f,
                    0.125f,
                    0.125f,
                    36,
                    10000
            ));

            Keroppi.get(0).getChildObject().get(1).getChildObject().get(1).scaleObject(0.48f, -0.1f, 0.6f);
            //x maju (gndut), y kbawah (tinggi), z lebar (smpng)
            Keroppi.get(0).getChildObject().get(1).getChildObject().get(1).rotateObject((float) Math.toRadians(90), 0f, 1f, 0f);
            Keroppi.get(0).getChildObject().get(1).getChildObject().get(1).translateObject(0f, -0.089f, -0f);

            Keroppi.get(0).getChildObject().add(new Cylinder(//kaki kanan
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.72f, 0.86f, 0.08f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.125f,
                    0.125f,
                    0.125f,
                    36,
                    10000
            ));

            Keroppi.get(0).getChildObject().get(2).scaleObject(0.14f, 0.55f, 0.17f);
            Keroppi.get(0).getChildObject().get(2).translateObject(0.05f, -0.155f, -0.01f);

            Keroppi.get(0).getChildObject().add(new Cylinder(//kaki kiri
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.72f, 0.86f, 0.08f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.125f,
                    0.125f,
                    0.125f,
                    36,
                    10000
            ));
            Keroppi.get(0).getChildObject().get(3).scaleObject(0.14f, 0.55f, 0.17f);
//        Keroppi.get(0).getChildObject().get(4).rotateObject((float)Math.toRadians(90),0f,1f,0f);
            Keroppi.get(0).getChildObject().get(3).translateObject(-0.05f, -0.155f, -0.01f);

            Keroppi.get(0).getChildObject().get(2).getChildObject().add(new Cone(//jari kaki 1 kanan
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.72f, 0.86f, 0.08f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.125f,
                    0.125f
            ));
            Keroppi.get(0).getChildObject().get(2).getChildObject().get(0).scaleObject(0.007f, 0.005f, 0.0025f);
            Keroppi.get(0).getChildObject().get(2).getChildObject().get(0).rotateObject((float) Math.toRadians(180f), 0f, 1f, 0f);
            Keroppi.get(0).getChildObject().get(2).getChildObject().get(0).translateObject(0.05f, -0.23f, 0.033f);

            Keroppi.get(0).getChildObject().get(2).getChildObject().add(new Cone(//jari kaki 2 kanan
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.72f, 0.86f, 0.08f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.125f,
                    0.125f
            ));
            Keroppi.get(0).getChildObject().get(2).getChildObject().get(1).scaleObject(0.007f, 0.005f, 0.0025f);
            Keroppi.get(0).getChildObject().get(2).getChildObject().get(1).rotateObject((float) Math.toRadians(180f), 0f, 1f, 0f);
            Keroppi.get(0).getChildObject().get(2).getChildObject().get(1).rotateObject((float) Math.toRadians(45f), 0f, 1f, 0f);
            Keroppi.get(0).getChildObject().get(2).getChildObject().get(1).translateObject(0.092f, -0.23f, 0.027f);

            Keroppi.get(0).getChildObject().get(2).getChildObject().add(new Cone(//jari kaki 3 kanan
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.72f, 0.86f, 0.08f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.125f,
                    0.125f
            ));
            Keroppi.get(0).getChildObject().get(2).getChildObject().get(2).scaleObject(0.007f, 0.005f, 0.0025f);
            Keroppi.get(0).getChildObject().get(2).getChildObject().get(2).rotateObject((float) Math.toRadians(180f), 0f, 1f, 0f);
            Keroppi.get(0).getChildObject().get(2).getChildObject().get(2).rotateObject((float) Math.toRadians(-45f), 0f, 1f, 0f);
            Keroppi.get(0).getChildObject().get(2).getChildObject().get(2).translateObject(0.012f, -0.23f, 0.027f);

            Keroppi.get(0).getChildObject().get(3).getChildObject().add(new Cone(//jari kaki 1 kiri
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.72f, 0.86f, 0.08f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.125f,
                    0.125f
            ));
            Keroppi.get(0).getChildObject().get(3).getChildObject().get(0).scaleObject(0.007f, 0.005f, 0.0025f);
            Keroppi.get(0).getChildObject().get(3).getChildObject().get(0).rotateObject((float) Math.toRadians(180f), 0f, 1f, 0f);
            Keroppi.get(0).getChildObject().get(3).getChildObject().get(0).translateObject(-0.05f, -0.23f, 0.033f);

            Keroppi.get(0).getChildObject().get(3).getChildObject().add(new Cone(//jari kaki 2 kiri
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.72f, 0.86f, 0.08f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.125f,
                    0.125f
            ));
            Keroppi.get(0).getChildObject().get(3).getChildObject().get(1).scaleObject(0.007f, 0.005f, 0.0025f);
            Keroppi.get(0).getChildObject().get(3).getChildObject().get(1).rotateObject((float) Math.toRadians(180f), 0f, 1f, 0f);
            Keroppi.get(0).getChildObject().get(3).getChildObject().get(1).rotateObject((float) Math.toRadians(45f), 0f, 1f, 0f);
            Keroppi.get(0).getChildObject().get(3).getChildObject().get(1).translateObject(-0.004f, -0.23f, 0.027f);

            Keroppi.get(0).getChildObject().get(3).getChildObject().add(new Cone(//jari kaki 3 kiri
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.72f, 0.86f, 0.08f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.125f,
                    0.125f
            ));
            Keroppi.get(0).getChildObject().get(3).getChildObject().get(2).scaleObject(0.007f, 0.005f, 0.0025f);
            Keroppi.get(0).getChildObject().get(3).getChildObject().get(2).rotateObject((float) Math.toRadians(180f), 0f, 1f, 0f);
            Keroppi.get(0).getChildObject().get(3).getChildObject().get(2).rotateObject((float) Math.toRadians(-45f), 0f, 1f, 0f);
            Keroppi.get(0).getChildObject().get(3).getChildObject().get(2).translateObject(-0.091f, -0.23f, 0.027f);


            Keroppi.get(0).getChildObject().add(new Cone(//tangan kanan
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.72f, 0.86f, 0.08f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.125f,
                    0.125f
            ));
            Keroppi.get(0).getChildObject().get(4).scaleObject(0.005f, 0.005f, 0.0025f);
            Keroppi.get(0).getChildObject().get(4).rotateObject((float) Math.toRadians(90f), 1f, 0f, 0f);
            Keroppi.get(0).getChildObject().get(4).rotateObject((float) Math.toRadians(-45f), 0f, 0f, 1f);
            Keroppi.get(0).getChildObject().get(4).translateObject(0.13f, -0.075f, 0.0f);

            Keroppi.get(0).getChildObject().get(4).getChildObject().add(new Cone(//tangan2 kanan
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.72f, 0.86f, 0.08f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.125f,
                    0.125f
            ));
            Keroppi.get(0).getChildObject().get(4).getChildObject().get(0).scaleObject(0.005f, 0.003f, 0.003f);

            Keroppi.get(0).getChildObject().get(4).getChildObject().get(0).rotateObject((float) Math.toRadians(90f), 1f, 0f, 0f);
            Keroppi.get(0).getChildObject().get(4).getChildObject().get(0).rotateObject((float) Math.toRadians(-45f), 0f, 0f, 1f);
            Keroppi.get(0).getChildObject().get(4).getChildObject().get(0).translateObject(0.14f, -0.088f, 0.0f);

            Keroppi.get(0).getChildObject().add(new Cone(//tangan kiri
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.72f, 0.86f, 0.08f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.125f,
                    0.125f
            ));
            Keroppi.get(0).getChildObject().get(5).scaleObject(0.005f, 0.005f, 0.0025f);
            Keroppi.get(0).getChildObject().get(5).rotateObject((float) Math.toRadians(90f), 1f, 0f, 0f);
            Keroppi.get(0).getChildObject().get(5).rotateObject((float) Math.toRadians(45f), 0f, 0f, 1f);
            Keroppi.get(0).getChildObject().get(5).translateObject(-0.13f, -0.075f, 0.0f);

            Keroppi.get(0).getChildObject().get(5).getChildObject().add(new Cone(//tangan2 kiri
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.72f, 0.86f, 0.08f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.125f,
                    0.125f
            ));
            Keroppi.get(0).getChildObject().get(5).getChildObject().get(0).scaleObject(0.005f, 0.003f, 0.0025f);
            Keroppi.get(0).getChildObject().get(5).getChildObject().get(0).rotateObject((float) Math.toRadians(90f), 1f, 0f, 0f);
            Keroppi.get(0).getChildObject().get(5).getChildObject().get(0).rotateObject((float) Math.toRadians(45f), 0f, 0f, 1f);
            Keroppi.get(0).getChildObject().get(5).getChildObject().get(0).translateObject(-0.14f, -0.088f, 0.0f);

            Keroppi.get(0).getChildObject().add(new Sphere_mp(//mata kanan
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(1.0f, 1.0f, 1.0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.125f,
                    0.125f,
                    0.125f,
                    36,
                    10000
            ));
            Keroppi.get(0).getChildObject().get(6).scaleObject(0.52f, 0.55f, 0.4f);
            Keroppi.get(0).getChildObject().get(6).translateObject(-0.066f, 0.063f, 0.055f);

            Keroppi.get(0).getChildObject().get(6).getChildObject().add(new Sphere_mp(//dot mata kanan
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0f, 0f, 0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.125f,
                    0.125f,
                    0.125f,
                    36,
                    10000
            ));
            Keroppi.get(0).getChildObject().get(6).getChildObject().get(0).scaleObject(0.15f, 0.15f, 0.15f);
            Keroppi.get(0).getChildObject().get(6).getChildObject().get(0).translateObject(-0.066f, 0.063f, 0.1f);

            Keroppi.get(0).getChildObject().add(new Sphere_mp(//mata kiri
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(1.0f, 1.0f, 1.0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.125f,
                    0.125f,
                    0.125f,
                    36,
                    10000
            ));
            Keroppi.get(0).getChildObject().get(7).scaleObject(0.52f, 0.55f, 0.4f);
            Keroppi.get(0).getChildObject().get(7).translateObject(0.066f, 0.063f, 0.055f);

            Keroppi.get(0).getChildObject().get(7).getChildObject().add(new Sphere_mp(//dot mata kiri
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0f, 0f, 0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.125f,
                    0.125f,
                    0.125f,
                    36,
                    10000
            ));
            Keroppi.get(0).getChildObject().get(7).getChildObject().get(0).scaleObject(0.15f, 0.15f, 0.15f);
            Keroppi.get(0).getChildObject().get(7).getChildObject().get(0).translateObject(0.066f, 0.063f, 0.1f);

            Keroppi.get(0).getChildObject().add(new Sphere_mp(//blush kanan
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(1f, 0f, 0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.125f,
                    0.125f,
                    0.125f,
                    36,
                    10000
            ));
            Keroppi.get(0).getChildObject().get(8).scaleObject(0.26f, 0.13f, 0.15f);
            Keroppi.get(0).getChildObject().get(8).translateObject(-0.066f, 0.0f, 0.07f);

            Keroppi.get(0).getChildObject().add(new Sphere_mp(//blush kiri
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(1f, 0f, 0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.125f,
                    0.125f,
                    0.125f,
                    36,
                    10000
            ));
            Keroppi.get(0).getChildObject().get(9).scaleObject(0.26f, 0.13f, 0.15f);
            Keroppi.get(0).getChildObject().get(9).translateObject(0.066f, 0.0f, 0.07f);

            Keroppi.get(0).getChildObject().add(new Sphere_mp(//Kancing 1
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(1f, 1f, 0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.125f,
                    0.125f,
                    0.125f,
                    36,
                    10000
            ));
            Keroppi.get(0).getChildObject().get(10).scaleObject(0.1f, 0.1f, 0.1f);
            Keroppi.get(0).getChildObject().get(10).translateObject(0f, -0.125f, 0.067f);

            Keroppi.get(0).getChildObject().add(new Sphere_mp(//Kancing 2
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(1f, 1f, 0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.125f,
                    0.125f,
                    0.125f,
                    36,
                    10000
            ));
            Keroppi.get(0).getChildObject().get(11).scaleObject(0.1f, 0.1f, 0.1f);
            Keroppi.get(0).getChildObject().get(11).translateObject(0f, -0.16f, 0.067f);

            berzier13.add(new Object(
                    Arrays.asList(
                            //shaderFile lokasi menyesuaikan objectnya
                            new ShaderProgram.ShaderModuleData
                                    ("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData
                                    ("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.0f, 0.0f, 0.0f, 0.0f)
            ));
            berzier14.add(new Object(
                    Arrays.asList(
                            //shaderFile lokasi menyesuaikan objectnya
                            new ShaderProgram.ShaderModuleData
                                    ("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData
                                    ("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.0f, 0.0f, 0.0f, 0.0f)
            ));

            berzier(controlberzier13, 12);
            Keroppi.get(0).getChildObject().add(berzier13.get(0));
            Keroppi.get(0).getChildObject().get(12).translateObject(0f, -0.01f, 0.095f);

            berzier(controlberzier14, 13);
            Keroppi.get(0).getChildObject().add(berzier14.get(0));
            Keroppi.get(0).getChildObject().get(13).translateObject(0f, -0.01f, 0.095f);

        }

        Keroppi.get(0).translateObject(-0.8f,0f,0f);
        setX_mekel(-0.8f);

    }

    public void berzier(float[][] floats, int pilihan) {
        int indexBerzier = 0;
        for (float t = 0; t <= 1; t += 0.01f) {
            float x = 0;
            float y = 0;
            float z = 0;
            int n = floats.length - 1;
            for (int i = 0; i <= n; i++) {
                int koefisien = koefSegitigaPascal(n, i);
                float term = koefisien * (float) Math.pow(1 - t, n - i) * (float) Math.pow(t, i);
                x += term * floats[i][0];
                y += term * floats[i][1];
                z += term * floats[i][2];
            }
            if (tes == 0) {
                if (pilihan == 0){
                    berzier1.get(0).addVertices(new Vector3f(x, y, z));
                }
                if (pilihan == 1){
                    berzier2.get(0).addVertices(new Vector3f(x, y, z));
                }
                if (pilihan == 2){
                    berzier3.get(0).addVertices(new Vector3f(x, y, z));
                }
                if (pilihan == 3){
                    berzier4.get(0).addVertices(new Vector3f(x, y, z));
                }
                if (pilihan == 4){
                    berzier5.get(0).addVertices(new Vector3f(x, y, z));
                }
                if (pilihan == 5){
                    berzier6.get(0).addVertices(new Vector3f(x, y, z));
                }
                if (pilihan == 6){
                    berzier7.get(0).addVertices(new Vector3f(x, y, z));
                }
                if (pilihan == 7){
                    berzier8.get(0).addVertices(new Vector3f(x, y, z));
                }
                if (pilihan == 8){
                    berzier9.get(0).addVertices(new Vector3f(x, y, z));
                }
                if (pilihan == 9){
                    berzier10.get(0).addVertices(new Vector3f(x, y, z));
                }
                if (pilihan == 10){
                    berzier11.get(0).addVertices(new Vector3f(x, y, z));
                }
                if (pilihan == 11){
                    berzier12.get(0).addVertices(new Vector3f(x, y, z));
                }
                if (pilihan == 12) {
                    berzier13.get(0).addVertices(new Vector3f(x, y, z));
                }
                if (pilihan == 13) {
                    berzier14.get(0).addVertices(new Vector3f(x, y, z));
                }
            }
        }
    }
    public int koefSegitigaPascal(int n, int k) {
        if (k < 0 || k > n) {
            return 0;
        }
        int koef = 1;
        for (int i = 0; i < k; i++) {
            koef *= (n - i);
            koef /= (i + 1);
        }
        return koef;
    }
    public void input(){
        //Badetemaru
        {
        //Translasi Rotasi Scale
        {
            //Translasi
            {

                if (window.isKeyPressed(GLFW_KEY_D)) {
                    Badtemaru.get(0).translateObject(0.01f,0f,0f);
                    Badtemaru.get(1).translateObject(0.01f,0f,0f);
                    setKor(0.01f,0f,0f);
                    Move();
                }
                if (window.isKeyPressed(GLFW_KEY_A)) {
                    Badtemaru.get(0).translateObject(-0.01f,0f,0f);
                    Badtemaru.get(1).translateObject(-0.01f,0f,0f);
                    setKor(-0.01f,0f,0f);
                    Move();
                }
                if (window.isKeyPressed(GLFW_KEY_S)) {
                    Badtemaru.get(0).translateObject(0.0f,0.0f,0.01f);
                    Badtemaru.get(1).translateObject(0.0f,0.0f,0.01f);
                    setKor(0f,0.00f,0.01f);
                    Move();
                }
                if (window.isKeyPressed(GLFW_KEY_W)) {
                    Badtemaru.get(0).translateObject(0.0f,0.0f,-0.01f);
                    Badtemaru.get(1).translateObject(0.0f,0.0f,-0.01f);
                    setKor(0f,0.0f,-0.01f);
                    Move();
                }
            }
            //Rotate
            if (window.isKeyPressed(GLFW_KEY_Z)) {
                Badtemaru.get(0).rotateSendiri((float)Math.toRadians(-1f),0f,1f,0f,x,y,z);
                Badtemaru.get(1).rotateSendiri((float)Math.toRadians(-1f),0f,1f,0f,x,y,z);
                setyMata(-1f);
            }
            if (window.isKeyPressed(GLFW_KEY_C)) {
                Badtemaru.get(0).rotateSendiri((float)Math.toRadians(1f),0f,1f,0f,x,y,z);
                Badtemaru.get(1).rotateSendiri((float)Math.toRadians(1f),0f,1f,0f,x,y,z);
                setyMata(1f);
            }

        }

        //Blink
            if (window.isKeyPressed(GLFW_KEY_2)) {
                if (blink==0f)
                    setDown(false);
                else if(blink==-115f)
                    setDown(true);
                if (down){

                    Badtemaru.get(0).rotateObject((float)Math.toRadians(-yMata),0f,1f,0f);

                    Badtemaru.get(0).getChildObject().get(6).rotateObjectSelf((float)Math.toRadians(1f),1f,0f,0f);
                    Badtemaru.get(0).getChildObject().get(7).rotateObjectSelf((float)Math.toRadians(1f),1f,0f,0f);

                    Badtemaru.get(0).rotateObject((float)Math.toRadians(yMata),0f,1f,0f);


                    setBlink(1);
                }
                else{

                    Badtemaru.get(0).rotateObject((float)Math.toRadians(-yMata),0f,1f,0f);

                    Badtemaru.get(0).getChildObject().get(6).rotateObjectSelf((float)Math.toRadians(-1f),1f,0f,0f);
                    Badtemaru.get(0).getChildObject().get(7).rotateObjectSelf((float)Math.toRadians(-1f),1f,0f,0f);

                    Badtemaru.get(0).rotateObject((float)Math.toRadians(yMata),0f,1f,0f);



                    setBlink(-1);
                }
            }
        //Movement Tangan
        {
            if (window.isKeyPressed(GLFW_KEY_1)) {
                if (kiri<70f){

                    Badtemaru.get(1).rotateObject((float)Math.toRadians(-yMata),0f,1f,0f);

                    Badtemaru.get(1).getChildObject().get(1).rotateObjectSelf((float)Math.toRadians(1f),0f,0f,1f);
                    Badtemaru.get(1).getChildObject().get(1).translateObject(0.0005f,0.0007f,0f);

                    Badtemaru.get(1).rotateObject((float)Math.toRadians(yMata),0f,1f,0f);


                    setKiri(1);
                }

            }

            if (window.isKeyPressed(GLFW_KEY_Q)) {
                if (kiri>0f){

                    Badtemaru.get(1).rotateObject((float)Math.toRadians(-yMata),0f,1f,0f);

                    Badtemaru.get(1).getChildObject().get(1).rotateObjectSelf((float)Math.toRadians(-1f),0f,0f,1f);
                    Badtemaru.get(1).getChildObject().get(1).translateObject(-0.0005f,-0.0007f,0f);
                    Badtemaru.get(1).rotateObject((float)Math.toRadians(yMata),0f,1f,0f);


                    setKiri(-1);
                }

            }

            if (window.isKeyPressed(GLFW_KEY_3)) {
                if (kanan>-70f){

                    Badtemaru.get(1).rotateObject((float)Math.toRadians(-yMata),0f,1f,0f);

                    Badtemaru.get(1).getChildObject().get(2).rotateObjectSelf((float)Math.toRadians(-1f),0f,0f,1f);
                    Badtemaru.get(1).getChildObject().get(2).translateObject(-0.0005f,0.0007f,0f);
                    Badtemaru.get(1).rotateObject((float)Math.toRadians(yMata),0f,1f,0f);


                    setKanan(-1);
                }

            }


            if (window.isKeyPressed(GLFW_KEY_E)) {
                if (kanan<0f){

                    Badtemaru.get(1).rotateObject((float)Math.toRadians(-yMata),0f,1f,0f);

                    Badtemaru.get(1).getChildObject().get(2).rotateObjectSelf((float)Math.toRadians(1f),0f,0f,1f);
                    Badtemaru.get(1).getChildObject().get(2).translateObject(0.0005f,-0.0007f,0f);

                    Badtemaru.get(1).rotateObject((float)Math.toRadians(yMata),0f,1f,0f);


                    setKanan(1);
                }
            }
        }
        }

        //ChocoCat
        {
            if (window.isKeyPressed(GLFW_KEY_N)) { //Rotasi Kanan
                countDegree++;

                objects_chococat.get(0).rotateSendiri((float)Math.toRadians(1f),0f,1f,0f,x_v,y_v,z_v);
                objects_chococat.get(1).rotateSendiri((float)Math.toRadians(1f),0f,1f,0f,x_v,y_v,z_v);
                setyBadan(1f);
            }
            if (window.isKeyPressed(GLFW_KEY_V)) { //Rotasi Kiri
                countDegree++;

                objects_chococat.get(0).rotateSendiri((float)Math.toRadians(-1f),0f,1f,0f,x_v,y_v,z_v);
                objects_chococat.get(1).rotateSendiri((float)Math.toRadians(-1f),0f,1f,0f,x_v,y_v,z_v);
                setyBadan(-1f);
            }
            if (window.isKeyPressed(GLFW_KEY_H)) { //Translasi Kanan
                setKorV(0.01f,0f,0f);
                objects_chococat.get(0).translateObject(0.01f,0.0f,0.0f);
                objects_chococat.get(1).translateObject(0.01f,0.0f,0.00f);
                MoveCat();
            }
            if (window.isKeyPressed(GLFW_KEY_F)) { //Translasi Kiri
                setKorV(-0.01f,0f,0f);
                objects_chococat.get(0).translateObject(-0.01f,0.0f,0.0f);
                objects_chococat.get(1).translateObject(-0.01f,0.0f,0.00f);
                MoveCat();
            }
            if (window.isKeyPressed(GLFW_KEY_T  )) { //Translasi Depan
                setKorV(0f,0f,-0.01f);
                objects_chococat.get(0).translateObject(0.0f,0.0f,-0.01f);
                objects_chococat.get(1).translateObject(0.0f,0.0f,-0.01f);
                MoveCat();
            }
            if (window.isKeyPressed(GLFW_KEY_G)) { //Translasi Belakang
                setKorV(0f,0f,0.01f);
                objects_chococat.get(0).translateObject(0.0f,0.0f,0.01f);
                objects_chococat.get(1).translateObject(0.0f,0.0f,0.01f);
                MoveCat();
            }


            if (window.isKeyPressed(GLFW_KEY_4)) { //Tangan Atas
                countDegree++;
                objects_chococat.get(1).getChildObject().get(1).rotateSendiri((float)Math.toRadians(-yBadan),0f,1f,0f,x_v,y_v,z_v);
                objects_chococat.get(1).getChildObject().get(2).rotateSendiri((float)Math.toRadians(-yBadan),0f,1f,0f,x_v,y_v,z_v);

                if (HandDegY == 0f)
                    setHandTurnY(false);
                else
                    setHandTurnY(true);
                if(HandTurnY){
                    List<Float> tangan = new ArrayList<>(objects_chococat.get(1).getCenterPoint());
                    objects_chococat.get(1).getChildObject().get(1).translateObject(tangan.get(0) * -1, tangan.get(1) * -1, tangan.get(2) * -1);
                    objects_chococat.get(1).getChildObject().get(1).rotateObject((float) Math.toRadians(0.5f), 0.0f, 0.0f, 1.0f);
                    objects_chococat.get(1).getChildObject().get(1).translateObject(tangan.get(0) * 1, tangan.get(1) * 1, tangan.get(2) * 1);

                    objects_chococat.get(1).getChildObject().get(2).translateObject(tangan.get(0) * -1, tangan.get(1) * -1, tangan.get(2) * -1);
                    objects_chococat.get(1).getChildObject().get(2).rotateObject((float) Math.toRadians(-0.5f), 0.0f, 0.0f, 1.0f);
                    objects_chococat.get(1).getChildObject().get(2).translateObject(tangan.get(0) * 1, tangan.get(1) * 1, tangan.get(2) * 1);
                    setHandDegY(-0.5f);
                }

                objects_chococat.get(1).getChildObject().get(1).rotateSendiri((float)Math.toRadians(yBadan),0f,1f,0f,x_v,y_v,z_v);
                objects_chococat.get(1).getChildObject().get(2).rotateSendiri((float)Math.toRadians(yBadan),0f,1f,0f,x_v,y_v,z_v);
            }

            if (window.isKeyPressed(GLFW_KEY_R)) { //Tangan Bawah
                countDegree++;
                objects_chococat.get(1).getChildObject().get(1).rotateSendiri((float)Math.toRadians(-yBadan),0f,1f,0f,x_v,y_v,z_v);
                objects_chococat.get(1).getChildObject().get(2).rotateSendiri((float)Math.toRadians(-yBadan),0f,1f,0f,x_v,y_v,z_v);

                if (HandDegY >= 20f)
                    setHandTurnY(false);
                else
                    setHandTurnY(true);
                if(HandTurnY){
                    List<Float> tangan = new ArrayList<>(objects_chococat.get(1).getCenterPoint());
                    objects_chococat.get(1).getChildObject().get(1).translateObject(tangan.get(0) * -1, tangan.get(1) * -1, tangan.get(2) * -1);
                    objects_chococat.get(1).getChildObject().get(1).rotateObject((float) Math.toRadians(-0.5f), 0.0f, 0.0f, 1.0f);
                    objects_chococat.get(1).getChildObject().get(1).translateObject(tangan.get(0) * 1, tangan.get(1) * 1, tangan.get(2) * 1);

                    objects_chococat.get(1).getChildObject().get(2).translateObject(tangan.get(0) * -1, tangan.get(1) * -1, tangan.get(2) * -1);
                    objects_chococat.get(1).getChildObject().get(2).rotateObject((float) Math.toRadians(0.5f), 0.0f, 0.0f, 1.0f);
                    objects_chococat.get(1).getChildObject().get(2).translateObject(tangan.get(0) * 1, tangan.get(1) * 1, tangan.get(2) * 1);
                    setHandDegY(+0.5f);
                }


                objects_chococat.get(1).getChildObject().get(1).rotateSendiri((float)Math.toRadians(yBadan),0f,1f,0f,x_v,y_v,z_v);
                objects_chococat.get(1).getChildObject().get(2).rotateSendiri((float)Math.toRadians(yBadan),0f,1f,0f,x_v,y_v,z_v);
            }

        }

        //HK
        {
            if (window.isKeyPressed(GLFW_KEY_PERIOD)){//rotate right
                countDegree++;
                setYbadan(1f);
                HK.get(0).translateObject(-x_jb,-y_jb,-z_jb);
                HK.get(0).rotateObject((float) Math.toRadians(1f),0.0f,1.0f,0.0f);
                HK.get(0).translateObject(x_jb,y_jb,z_jb);
            }
            if (window.isKeyPressed(GLFW_KEY_M)){//rotate left
                countDegree++;
                setYbadan(-1f);
                HK.get(0).translateObject(-x_jb,-y_jb,-z_jb);
                HK.get(0).rotateObject((float) Math.toRadians(-1f),0.0f,1.0f,0.0f);
                HK.get(0).translateObject(x_jb,y_jb,z_jb);
            }

            if (window.isKeyPressed(GLFW_KEY_K)){//translasi sumbu z ke depan
                countDegree++;
                setZ_jb(0.01f);
                HK.get(0).translateObject(0f,0f,0.01f);
                MoveHK();
            }
            if (window.isKeyPressed(GLFW_KEY_I)){//kebalikan Z
                countDegree++;
                setZ_jb(-0.01f);
                HK.get(0).translateObject(0f,0f,-0.01f);
                MoveHK();
            }
            if (window.isKeyPressed(GLFW_KEY_L)){//translasi kanan
                countDegree++;
                setX_jb(0.01f);
                HK.get(0).translateObject(0.01f,0.0f,0f);
                MoveHK();
            }
            if (window.isKeyPressed(GLFW_KEY_J)){//translasi kiri
                countDegree++;
                setX_jb(-0.01f);
                HK.get(0).translateObject(-0.01f,0.0f,0f);
                MoveHK();
            }

            if (window.isKeyPressed(GLFW_KEY_U)){//tangan kanan dada dada
                float degree = 0.5f;
                if (counterDegreeTangan >= 13f){
                    gantiArahTangan *= -1;
                    counterDegreeTangan = 0;
                }
                HK.get(0).translateObject(-x_jb,-y_jb,-z_jb);
                HK.get(0).rotateObject((float)Math.toRadians(-ybadan),0f,1f,0f);
                HK.get(0).getChildObject().get(6).rotateObject((float)Math.toRadians(gantiArahTangan*-degree),0f,0f,1f);
                HK.get(0).rotateObject((float)Math.toRadians(ybadan),0f,1f,0f);
                HK.get(0).translateObject(x_jb,y_jb,z_jb);
                counterDegreeTangan+=degree;
            }
        }
        //keroppi
        {
            if (window.isKeyPressed(GLFW_KEY_PAGE_UP)){//rotate right
                countDegree++;
                setY_badan_mekel(1.5f);
                Keroppi.get(0).translateObject(-x_mekel,-y_mekel,-z_mekel);
                Keroppi.get(0).rotateObject((float) Math.toRadians(1.5f),0.0f,1.0f,0.0f);
                Keroppi.get(0).translateObject(x_mekel,y_mekel,z_mekel);
            }
            if (window.isKeyPressed(GLFW_KEY_PAGE_DOWN)){//rotate right
                countDegree++;
                setY_badan_mekel(-1.5f);
                Keroppi.get(0).translateObject(-x_mekel,-y_mekel,-z_mekel);
                Keroppi.get(0).rotateObject((float) Math.toRadians(-1.5f),0.0f,1.0f,0.0f);
                Keroppi.get(0).translateObject(x_mekel,y_mekel,z_mekel);
            }
            if (window.isKeyPressed(GLFW_KEY_DOWN)){//translasi sumbu z ke depan
                setZ_mekel(0.01f);
                Keroppi.get(0).translateObject(0f,0f,0.01f);
                MoveKeroppi();
            }
            if (window.isKeyPressed(GLFW_KEY_UP)){//translasi sumbu z ke belakang
                setZ_mekel(-0.01f);
                Keroppi.get(0).translateObject(0f,0f,-0.01f);
                MoveKeroppi();
            }
            if (window.isKeyPressed(GLFW_KEY_RIGHT)){//translasi sumbu x ke kanan
                setX_mekel(0.01f);
                Keroppi.get(0).translateObject(0.01f,0f,0f);
                MoveKeroppi();
            }
            if (window.isKeyPressed(GLFW_KEY_LEFT)){//translasi sumbu x ke kiri
                setX_mekel(-0.01f);
                Keroppi.get(0).translateObject(-0.01f,0f,0f);
                MoveKeroppi();
            }
            if (window.isKeyPressed(GLFW_KEY_HOME)){//translasi sumbu x ke kiri
                float degree = 0.5f;
                if (counterDegreeKakiMekel >= 9f){
                    gantiarahtanganmekel *= -1;
                    counterDegreeKakiMekel = 0;
                }
                Keroppi.get(0).translateObject(-x_mekel,-y_mekel,-z_mekel);
                Keroppi.get(0).rotateObject((float)Math.toRadians(-y_badan_mekel),0f,1f,0f);
                Keroppi.get(0).getChildObject().get(4).rotateObject((float)Math.toRadians(gantiarahtanganmekel*-degree),1f,0f,0f);
                Keroppi.get(0).getChildObject().get(5).rotateObject((float)Math.toRadians(gantiarahtanganmekel*degree),1f,0f,0f);
                Keroppi.get(0).rotateObject((float)Math.toRadians(y_badan_mekel),0f,1f,0f);
                Keroppi.get(0).translateObject(x_mekel,y_mekel,z_mekel);
                counterDegreeKakiMekel+=degree;
            }
            if (window.isKeyPressed(GLFW_KEY_F12)) {//barengan kiri kanan
                float degree = 0.0002f;
                if (counterDegreeMata >= 0.03) {
                    gantiArah *= -1;
                    counterDegreeMata = -0.03f;
                }
                Keroppi.get(0).getChildObject().get(6).getChildObject().get(0).translateObject(gantiArah * degree, 0f, 0f);
                Keroppi.get(0).getChildObject().get(7).getChildObject().get(0).translateObject(gantiArah * degree, 0f, 0f);
                counterDegreeMata += degree;

            }

        }
    }
    public void MoveCat(){
        if (kakiDV==30f)
            setKakiV(false);
        else if(kakiDV==-30f)
            setKakiV(true);

        if (kakiV){
            objects_chococat.get(1).rotateObject((float)Math.toRadians(-yBadan),0f,1f,0f);

            objects_chococat.get(1).getChildObject().get(4).rotateObjectSelf((float)Math.toRadians(-1f),1f,0f,0f);
            objects_chococat.get(1).getChildObject().get(4).translateObject(0f,0.0005f,0.0005f);

            objects_chococat.get(1).getChildObject().get(3).rotateObjectSelf((float)Math.toRadians(1f),1f,0f,0f);
            objects_chococat.get(1).getChildObject().get(3).translateObject(0f,-0.0005f,-0.0005f);

            objects_chococat.get(1).rotateObject((float)Math.toRadians(yBadan),0f,1f,0f);

            setKakiDV(1f);
        }
        else{

            objects_chococat.get(1).rotateObject((float)Math.toRadians(-yBadan),0f,1f,0f);

            objects_chococat.get(1).getChildObject().get(3).rotateObjectSelf((float)Math.toRadians(-1f),1f,0f,0f);
            objects_chococat.get(1).getChildObject().get(3).translateObject(0.0f,0.0005f,0.0005f);

            objects_chococat.get(1).getChildObject().get(4).rotateObjectSelf((float)Math.toRadians(1f),1f,0f,0f);
            objects_chococat.get(1).getChildObject().get(4).translateObject(0f,-0.0005f,-0.0005f);

            objects_chococat.get(1).rotateObject((float)Math.toRadians(yBadan),0f,1f,0f);

            setKakiDV(-1f);
        }
    }
    public void MoveHK(){
        float degree = 0.2f;
        if (counterDegreeKaki >= 10f){
            gantiArah *= -1;
            counterDegreeKaki = 0;
        }
        HK.get(0).translateObject(-x_jb,-y_jb,-z_jb);
        HK.get(0).rotateObject((float)Math.toRadians(-ybadan),0f,1f,0f);

        HK.get(0).getChildObject().get(4).rotateObject((float)Math.toRadians(gantiArah*degree),1f,0f,0f);
        HK.get(0).getChildObject().get(5).rotateObject((float)Math.toRadians(gantiArah*-degree),1f,0f,0f);
        HK.get(0).rotateObject((float)Math.toRadians(ybadan),0f,1f,0f);
        HK.get(0).translateObject(x_jb,y_jb,z_jb);
        counterDegreeKaki+=degree;
    }
    public void MoveKeroppi(){
        float degree = 0.2f;
        if (counterDegreeKakiMekel >= 10f){
            gantiArahmekel *= -1;
            counterDegreeKakiMekel = 0;
        }
        if (counterDegreeKakiMekel >= 10f){
            gantiArahmekel *= -1;
            counterDegreeKakiMekel = 0;
        }
        Keroppi.get(0).translateObject(-x_mekel,-y_mekel,-z_mekel);
        Keroppi.get(0).rotateObject((float)Math.toRadians(-ybadan),0f,1f,0f);

        Keroppi.get(0).getChildObject().get(2).rotateObject((float)Math.toRadians(gantiArahmekel*degree),1f,0f,0f);
        Keroppi.get(0).getChildObject().get(3).rotateObject((float)Math.toRadians(gantiArahmekel*-degree),1f,0f,0f);
        Keroppi.get(0).rotateObject((float)Math.toRadians(ybadan),0f,1f,0f);
        Keroppi.get(0).translateObject(x_mekel,y_mekel,z_mekel);
        counterDegreeKakiMekel+=degree;
    }
    public void Move() {
        if (kaki==30f)
            setKakiB(false);
        else if(kaki==-30f)
            setKakiB(true);

        if (kakiB){

            Badtemaru.get(1).rotateObject((float)Math.toRadians(-yMata),0f,1f,0f);

            Badtemaru.get(1).getChildObject().get(4).rotateObjectSelf((float)Math.toRadians(-1f),1f,0f,0f);
            Badtemaru.get(1).getChildObject().get(4).translateObject(0f,0.0005f,0.0005f);

            Badtemaru.get(1).getChildObject().get(3).rotateObjectSelf((float)Math.toRadians(1f),1f,0f,0f);
            Badtemaru.get(1).getChildObject().get(3).translateObject(0f,-0.0005f,-0.0005f);

            Badtemaru.get(1).rotateObject((float)Math.toRadians(yMata),0f,1f,0f);

            setKaki(1f);
        }
        else{

            Badtemaru.get(1).rotateObject((float)Math.toRadians(-yMata),0f,1f,0f);

            Badtemaru.get(1).getChildObject().get(3).rotateObjectSelf((float)Math.toRadians(-1f),1f,0f,0f);
            Badtemaru.get(1).getChildObject().get(3).translateObject(0.0f,0.0005f,0.0005f);

            Badtemaru.get(1).getChildObject().get(4).rotateObjectSelf((float)Math.toRadians(1f),1f,0f,0f);
            Badtemaru.get(1).getChildObject().get(4).translateObject(0f,-0.0005f,-0.0005f);

            Badtemaru.get(1).rotateObject((float)Math.toRadians(yMata),0f,1f,0f);

            setKaki(-1f);
        }
    }
    public static void setKakiB(boolean kakiB) {
        Proyek.kakiB = kakiB;
    }
    public static void setKaki(float kaki) {
        Proyek.kaki += kaki;
    }
    public static void setKakiV(boolean kakiV) {
        Proyek.kakiV = kakiV;
    }
    public static void setKakiDV(float kakiDV) {
        Proyek.kakiDV += kakiDV;
    }
    public static void setKor(float x, float y, float z) {
        Proyek.x += x;
        Proyek.y += y;
        Proyek.z += z;
    }
    public static void setKanan(float kanan) {
        Proyek.kanan += kanan;
    }
    public static void setKiri(float kiri) {
        Proyek.kiri += kiri;
    }
    public static void setxMata(float xMata) {
        Proyek.xMata += xMata;
    }
    public static void setyMata(float yMata) {
        Proyek.yMata += yMata;
    }
    public static void setzMata(float zMata) {
        Proyek.zMata += zMata;
    }
    public static void setBlink(float blink) {
        Proyek.blink += blink;
    }
    public static void setDown(boolean down) {
        Proyek.down = down;
    }
    public static void setHeadTurn(boolean headTurn) {
        Proyek.HeadTurn = headTurn;
    }
    public static void setHeadDeg(float headDeg) {
        Proyek.HeadDeg += headDeg;
    }
    public static void setYbadan(float ybadan) {
        Proyek.ybadan += ybadan;
    }
    public static void setXbadan(float xbadan) {
        Proyek.xbadan += xbadan;
    }
    public static void setY_jb(float y_jb) {
        Proyek.y_jb += y_jb;
    }
    public static void setX_jb(float x_jb) {
        Proyek.x_jb += x_jb;
    }
    public static void setZ_jb(float z_jb) {
        Proyek.z_jb += z_jb;
    }
    public static void setKorV(float x, float y, float z) {
        Proyek.x_v += x;
        Proyek.y_v += y;
        Proyek.z_v += z;
    }
    public static void setyBadan(float yBadan) {
        Proyek.yBadan += yBadan;
    }
    public static void setHeadTurnX(boolean headTurnX) {
        Proyek.HeadTurnX = headTurnX;
    }
    public static void setHeadDegX(float headDegX) {
        Proyek.HeadDegX += headDegX;
    }
    public static void setHeadTurnY(boolean headTurnY) {
        Proyek.HeadTurnY = headTurnY;
    }
    public static void setHeadDegY(float headDegY) {
        Proyek.HeadDegY += headDegY;
    }
    public static void setEyeTurnX(boolean eyeTurnX) {
        Proyek.EyeTurnX = eyeTurnX;
    }
    public static void setEyeDegX(float eyeDegX) {
        Proyek.EyeDegX += eyeDegX;
    }
    public static void setEyeTurnY(boolean eyeTurnY) {
        Proyek.EyeTurnY = eyeTurnY;
    }
    public static void setEyeDegY(float eyeDegY) {
        Proyek.EyeDegY += eyeDegY;
    }
    public static void setBodyTurn(boolean bodyTurn) {
        Proyek.BodyTurn = bodyTurn;
    }
    public static void setBodyDeg(float bodyDeg) {
        Proyek.BodyDeg += bodyDeg;
    }
    public static void setLegTurn(boolean legTurn) {
        Proyek.LegTurn = legTurn;
    }
    public static void setLegDeg(float legDeg) {
        Proyek.LegDeg += legDeg;
    }
    public static void setHandTurnX(boolean handTurnX) {
        Proyek.HandTurnX = handTurnX;
    }
    public static void setHandDegX(float handDegX) {
        Proyek.HandDegX += handDegX;
    }
    public static void setHandTurnY(boolean handTurnY) {
        Proyek.HandTurnY = handTurnY;
    }
    public static void setHandDegY(float handDegY) {
        Proyek.HandDegY += handDegY;
    }
    public static void setX_v(float x_v) {
        Proyek.x_v += x_v;
    }


    public void loop(){
        while (window.isOpen()) {
            window.update();
            glClearColor(0.5f,
                    0.5f, 0.5f,
                    0.0f);
            GL.createCapabilities();
            input();

            //code
            for(Object object: HK){

                object.draw_jb(camera,projection);
            }
            for (Object object: environment){
                object.draw_jb(camera,projection);
            }
            for(Object object: Badtemaru){
                object.draw(camera,projection);
            }
            for(Object object: objects_chococat){
                object.draw(camera,projection);
            }
            for (Object object: Keroppi){
                object.draw_jb(camera,projection);
            }


//            for(Object object: objectsRectangle){
//                object.draw();
//            }
//            for(Object object: objectsPointsControl){
//                object.drawLine();
//            }

            // Restore state
            glDisableVertexAttribArray(0);

            // Poll for window events.
            // The key callback above will only be
            // invoked during this call.
            glfwPollEvents();
        }
    }
    public void run() {

        init();
        loop();

        // Terminate GLFW and
        // free the error callback
        glfwTerminate();
        glfwSetErrorCallback(null).free();
    }
    public static void main(String[] args) {
        new Proyek().run();
    }
}
