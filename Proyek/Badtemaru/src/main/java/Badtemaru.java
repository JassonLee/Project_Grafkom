import Engine.*;
import Engine.Object;
import Engine.Sphere;
import org.joml.Vector4f;
import org.lwjgl.opengl.GL;

import java.util.ArrayList;
import java.util.Arrays;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.glfw.GLFW.glfwSetErrorCallback;
import static org.lwjgl.opengl.GL11.glClearColor;
import static org.lwjgl.opengl.GL20.*;

public class Badtemaru{
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

    private Window window =
            new Window
                    (800,800,"Hello World");
    private ArrayList<Object> objects
            = new ArrayList<>();
    private ArrayList<Object> objectsRectangle
            = new ArrayList<>();

    private ArrayList<Object> objectsPointsControl
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

        //Kepala
        {

            objects.add(new Sphere(
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
                    10000
            ));
            objects.get(0).scaleObject(1f,0.85f,0.85f);

        //Rambut
            {
                objects.get(0).getChildObject().add(new Cone(
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
                objects.get(0).getChildObject().get(0).scaleObject(0.01f, 0.01f, 0.005f);
                objects.get(0).getChildObject().get(0).rotateObject((float) Math.toRadians(90f), 1f, 0f, 0f);
                objects.get(0).getChildObject().get(0).rotateObject((float) Math.toRadians(-33f), 0f, 0f, 1f);
                objects.get(0).getChildObject().get(0).translateObject(0.14f, 0.17f, 0.0f);

                objects.get(0).getChildObject().add(new Cone(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.0f, 0.0f, 0.0f, 0.0f),
                    Arrays.asList(0.0f,0.0f,0.0f),
                    0.125f,
                    0.125f
                ));
                objects.get(0).getChildObject().get(1).scaleObject(0.01f, 0.01f, 0.005f);
                objects.get(0).getChildObject().get(1).rotateObject((float)Math.toRadians(90f),1f,0f,0f);
                objects.get(0).getChildObject().get(1).rotateObject((float)Math.toRadians(33f),0f,0f,1f);
                objects.get(0).getChildObject().get(1).translateObject(-0.14f, 0.17f, 0.0f);

                objects.get(0).getChildObject().add(new Cone(
                        Arrays.asList(
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                        ),
                        new ArrayList<>(),
                        new Vector4f(0.0f, 0.0f, 0.0f, 0.0f),
                        Arrays.asList(0.0f,0.0f,0.0f),
                        0.125f,
                        0.125f
                ));
                objects.get(0).getChildObject().get(2).scaleObject(0.01f, 0.01f, 0.005f);
                objects.get(0).getChildObject().get(2).rotateObject((float)Math.toRadians(90f),1f,0f,0f);
                objects.get(0).getChildObject().get(2).rotateObject((float)Math.toRadians(10f),0f,0f,1f);
                objects.get(0).getChildObject().get(2).translateObject(-0.05f, 0.21f, 0.0f);

                objects.get(0).getChildObject().add(new Cone(
                        Arrays.asList(
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                        ),
                        new ArrayList<>(),
                        new Vector4f(0.0f, 0.0f, 0.0f, 0.0f),
                        Arrays.asList(0.0f,0.0f,0.0f),
                        0.125f,
                        0.125f
                ));
                objects.get(0).getChildObject().get(3).scaleObject(0.01f, 0.01f, 0.005f);
                objects.get(0).getChildObject().get(3).rotateObject((float)Math.toRadians(90f),1f,0f,0f);
                objects.get(0).getChildObject().get(3).rotateObject((float)Math.toRadians(-10f),0f,0f,1f);
                objects.get(0).getChildObject().get(3).translateObject(0.05f, 0.21f, 0.0f);

            }

        //Mata
            {
                objects.get(0).getChildObject().add(new Sphere(
                        Arrays.asList(
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                        ),
                        new ArrayList<>(),
                        new Vector4f(1f,1f,1f,1.0f),
                        Arrays.asList(0.0f,0.0f,0.0f),
                        0.125f,
                        0.125f,
                        0.125f,
                        36,
                        10000
                ));
                objects.get(0).getChildObject().get(4).scaleObject(0.35f, 0.38f, 0.35f);
                objects.get(0).getChildObject().get(4).translateObject(-0.055f, 0.0f, 0.08f);


                objects.get(0).getChildObject().add(new Sphere(
                        Arrays.asList(
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                        ),
                        new ArrayList<>(),
                        new Vector4f(1f,1f,1f,1.0f),
                        Arrays.asList(0.0f,0.0f,0.0f),
                        0.125f,
                        0.125f,
                        0.125f,
                        36,
                        10000
                ));
                    objects.get(0).getChildObject().get(5).scaleObject(0.35f, 0.38f, 0.35f);
                    objects.get(0).getChildObject().get(5).translateObject(0.055f, 0.0f, 0.08f);

            }

        //Selaput Mata
            {
                objects.get(0).getChildObject().add(new HalfSpheare(
                        Arrays.asList(
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                        ),
                        new ArrayList<>(),
                        new Vector4f(0.0f,0.0f,0f,0.0f),
                        Arrays.asList(0.0f,0.0f,0.0f),
                        0.125f,
                        0.125f,
                        0.125f,
                        36,
                        10000
                ));
                objects.get(0).getChildObject().get(6).scaleObject(0.455f, 0.455f, 0.455f);
                objects.get(0).getChildObject().get(6).translateObject(-0.055f, 0.0f, 0.068f);
                objects.get(0).getChildObject().get(6).rotateObjectSelf((float) Math.toRadians(-115f), 1f, 0f, 0f);



                objects.get(0).getChildObject().add(new HalfSpheare(
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
                        10000
                ));
                objects.get(0).getChildObject().get(7).scaleObject(0.455f, 0.455f, 0.455f);
                objects.get(0).getChildObject().get(7).translateObject(0.055f, 0.0f, 0.068f);
                objects.get(0).getChildObject().get(7).rotateObjectSelf((float) Math.toRadians(-115f), 1f, 0f, 0f);


            }

        //Titik mata
            {
                objects.get(0).getChildObject().add(new Cylinder(
                        Arrays.asList(
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                        ),
                        new ArrayList<>(),
                        new Vector4f(0f,0f,0f,1.0f),
                        Arrays.asList(0.0f,0.0f,0.0f),
                        0.125f,
                        0.125f,
                        0.125f,
                        36,
                        10000
                ));
                objects.get(0).getChildObject().get(8).scaleObject(0.1f, 0.1f, 0.1f);
                objects.get(0).getChildObject().get(8).rotateObject((float)Math.toRadians(90f),1f,0f,0f);
                objects.get(0).getChildObject().get(8).rotateObject((float)Math.toRadians(-15f),1f,0f,0f);
                objects.get(0).getChildObject().get(8).translateObject(-0.055f, 0.016f, 0.122f);


                objects.get(0).getChildObject().add(new Cylinder(
                        Arrays.asList(
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                        ),
                        new ArrayList<>(),
                        new Vector4f(0f,0f,0f,1.0f),
                        Arrays.asList(0.0f,0.0f,0.0f),
                        0.125f,
                        0.125f,
                        0.125f,
                        36,
                        10000
                ));
                objects.get(0).getChildObject().get(9).scaleObject(0.1f, 0.1f, 0.1f);
                objects.get(0).getChildObject().get(9).rotateObject((float)Math.toRadians(90f),1f,0f,0f);
                objects.get(0).getChildObject().get(9).rotateObject((float)Math.toRadians(-15f),1f,0f,0f);
                objects.get(0).getChildObject().get(9).translateObject(0.055f, 0.016f, 0.122f);

            }

        //Paruh
            {

                objects.get(0).getChildObject().add(new HalfCone(
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
                objects.get(0).getChildObject().get(10).scaleObject(0.01f, 0.01f, 0.005f);
                objects.get(0).getChildObject().get(10).rotateObject((float)Math.toRadians(180),1f,0f,0f);
                objects.get(0).getChildObject().get(10).translateObject(0f, -0.06f, 0.12f);

                objects.get(0).getChildObject().add(new HalfCone(
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
                objects.get(0).getChildObject().get(11).scaleObject(0.01f, 0.01f, 0.005f);
                objects.get(0).getChildObject().get(11).rotateObject((float)Math.toRadians(180),1f,0f,0f);
                objects.get(0).getChildObject().get(11).rotateObject((float)Math.toRadians(180),0f,0f,1f);
                objects.get(0).getChildObject().get(11).translateObject(0f, -0.05f, 0.12f);

            }
        }

        //Badan
        {
            objects.add(new Sphere(
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
                    10000
            ));
            objects.get(1).scaleObject(0.5f,1.25f,0.5f);
            objects.get(1).rotateObject((float)Math.toRadians(-10f),0f,0f,1f);
            objects.get(1).translateObject(-0.02f, -0.17f, 0.0f);



            objects.get(1).getChildObject().add(new Sphere(
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
                    10000
            ));
            objects.get(1).getChildObject().get(0).scaleObject(0.5f,1.25f,0.5f);
            objects.get(1).getChildObject().get(0).rotateObject((float)Math.toRadians(10f),0f,0f,1f);
            objects.get(1).getChildObject().get(0).translateObject(0.02f, -0.17f, 0.0f);

        //Tangan
            {
                objects.get(1).getChildObject().add(new Sphere(
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
                objects.get(1).getChildObject().get(1).scaleObject(0.25f, 0.6f, 0.25f);
                objects.get(1).getChildObject().get(1).rotateObject((float) Math.toRadians(20f), 0f, 0f, 1f);
                objects.get(1).getChildObject().get(1).translateObject(0.1f, -0.15f, 0.0f);

                objects.get(1).getChildObject().add(new Sphere(
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
                        10000
                ));
                objects.get(1).getChildObject().get(2).scaleObject(0.25f,0.6f,0.25f);
                objects.get(1).getChildObject().get(2).rotateObject((float)Math.toRadians(-20f),0f,0f,1f);
                objects.get(1).getChildObject().get(2).translateObject(-0.1f, -0.15f, 0.0f);
            }

        //Kaki
            {
                objects.get(1).getChildObject().add(new Cylinder(
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
                objects.get(1).getChildObject().get(3).scaleObject(0.25f, 0.1f, 0.35f);
                objects.get(1).getChildObject().get(3).translateObject(0.04f, -0.32f, 0.015f);

                objects.get(1).getChildObject().add(new Cylinder(
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
                objects.get(1).getChildObject().get(4).scaleObject(0.25f, 0.1f, 0.35f);
                objects.get(1).getChildObject().get(4).translateObject(-0.04f, -0.32f, 0.015f);

            }

        //Putih Badan
            {
                objects.get(1).getChildObject().add(new Sphere(
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
                        10000
                ));
                objects.get(1).getChildObject().get(5).scaleObject(0.4f,0.7f,0.2f);
                objects.get(1).getChildObject().get(5).rotateObject((float)Math.toRadians(5f),1f,0f,0f);
                objects.get(1).getChildObject().get(5).rotateObject((float)Math.toRadians(10f),0f,0f,1f);
                objects.get(1).getChildObject().get(5).translateObject(0.02f, -0.20f, 0.04f);

                objects.get(1).getChildObject().add(new Sphere(
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
                        10000
                ));
                objects.get(1).getChildObject().get(6).scaleObject(0.4f,0.7f,0.2f);
                objects.get(1).getChildObject().get(6).rotateObject((float)Math.toRadians(5f),1f,0f,0f);
                objects.get(1).getChildObject().get(6).rotateObject((float)Math.toRadians(-10f),0f,0f,1f);
                objects.get(1).getChildObject().get(6).translateObject(-0.02f, -0.20f, 0.04f);

            }
        //Kurva Kalung
            {
                objects.get(1).getChildObject().add(new Kalung( Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                        ),
                        new ArrayList<>(),
                        new Vector4f(0.8f,0.8f,0f,1.0f),
                        Arrays.asList(
                                new float[]{0.00f, -0.07f, 0},
                                new float[]{0.1f, -0.02f,0},
                                new float[]{0.1f, 0.02f,0},
                                new float[]{0.00f, 0.07f, 0}

                        )
                        ));
                objects.get(1).getChildObject().get(7).scaleObject(0.7f, 0.7f, 0.7f);
                objects.get(1).getChildObject().get(7).rotateObject((float) Math.toRadians(90f), 1f, 0f, 0f);
                objects.get(1).getChildObject().get(7).rotateObject((float) Math.toRadians(-90f), 0f, 1f, 0f);
                objects.get(1).getChildObject().get(7).rotateObject((float) Math.toRadians(60f), 1f, 0f, 0f);
                objects.get(1).getChildObject().get(7).translateObject(0.0f, -0.08f, 0.04f);


                objects.get(1).getChildObject().add(new Kalung( Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                        ),
                        new ArrayList<>(),
                        new Vector4f(0.8f,0.8f,0f,1.0f),
                        Arrays.asList(
                                new float[]{0.00f, -0.07f, 0},
                                new float[]{0.05f, -0.02f,0},
                                new float[]{0.05f, 0.02f,0},
                                new float[]{0.00f, 0.07f, 0}

                        )
                        ));
                objects.get(1).getChildObject().get(8).scaleObject(0.7f, 0.7f, 0.7f);
                objects.get(1).getChildObject().get(8).rotateObject((float) Math.toRadians(90f), 1f, 0f, 0f);
                objects.get(1).getChildObject().get(8).rotateObject((float) Math.toRadians(-90f), 0f, 1f, 0f);
                objects.get(1).getChildObject().get(8).rotateObject((float) Math.toRadians(150f), 1f, 0f, 0f);
                objects.get(1).getChildObject().get(8).translateObject(0.0f, -0.08f, -0.04f);
            }

        }
    }

    public void input(){

        //Translasi Rotasi Scale
        {
            //Translasi
            {

                if (window.isKeyPressed(GLFW_KEY_RIGHT)) {
                    objects.get(0).translateObject(0.01f,0f,0f);
                    objects.get(1).translateObject(0.01f,0f,0f);
                    setKor(0.01f,0f,0f);
                }
                if (window.isKeyPressed(GLFW_KEY_LEFT)) {
                    objects.get(0).translateObject(-0.01f,0f,0f);
                    objects.get(1).translateObject(-0.01f,0f,0f);
                    setKor(-0.01f,0f,0f);
                }


                if (window.isKeyPressed(GLFW_KEY_UP)) {
                    objects.get(0).translateObject(0.0f,0.01f,0f);
                    objects.get(1).translateObject(0.0f,0.01f,0f);
                    setKor(0f,0.01f,0f);
                }
                if (window.isKeyPressed(GLFW_KEY_DOWN)) {
                    objects.get(0).translateObject(0.0f,-0.01f,0f);
                    objects.get(1).translateObject(0.0f,-0.01f,0f);
                    setKor(0f,-0.01f,0f);
                }


                if (window.isKeyPressed(GLFW_KEY_COMMA)) {
                    objects.get(0).translateObject(0.0f,0.0f,0.01f);
                    objects.get(1).translateObject(0.0f,0.0f,0.01f);
                    setKor(0f,0.00f,0.01f);
                }
                if (window.isKeyPressed(GLFW_KEY_PERIOD)) {
                    objects.get(0).translateObject(0.0f,0.0f,-0.01f);
                    objects.get(1).translateObject(0.0f,0.0f,-0.01f);
                    setKor(0f,0.0f,-0.01f);
                }
            }
            //Rotate
            if (window.isKeyPressed(GLFW_KEY_S)) {
                objects.get(0).rotateSendiri((float)Math.toRadians(-1f),0f,1f,0f,x,y,z);
                objects.get(1).rotateSendiri((float)Math.toRadians(-1f),0f,1f,0f,x,y,z);
                setyMata(-1f);
            }
            if (window.isKeyPressed(GLFW_KEY_A)) {
                objects.get(0).rotateSendiri((float)Math.toRadians(1f),0f,1f,0f,x,y,z);
                objects.get(1).rotateSendiri((float)Math.toRadians(1f),0f,1f,0f,x,y,z);
                setyMata(1f);
            }
            //Scale
            if (window.isKeyPressed(GLFW_KEY_G)) {
                objects.get(0).scaleObject(0.99f,0.99f,0.99f);
                objects.get(1).scaleObject(0.99f,0.99f,0.99f);

            }
            if (window.isKeyPressed(GLFW_KEY_B)) {
                objects.get(0).scaleObject(1.01f,1.01f,1.01f);
                objects.get(1).scaleObject(1.01f,1.01f,1.01f);

            }
        }
        //Head Turn
        {
            if (window.isKeyPressed(GLFW_KEY_W)) {
                if (HeadDeg<=-30f)
                    setHeadTurn(false);
                else
                    setHeadTurn(true);
                if(HeadTurn){
                    objects.get(0).rotateSendiri((float)Math.toRadians(-1f),0f,1f,0f,x,y,z);
                    setHeadDeg(-1f);
                    setyMata(-1f);
                }
            }
            if (window.isKeyPressed(GLFW_KEY_Q)) {
                if (HeadDeg>=30f)
                    setHeadTurn(false);
                else
                    setHeadTurn(true);
                if(HeadTurn){
                    objects.get(0).rotateSendiri((float)Math.toRadians(1f),0f,1f,0f,x,y,z);
                    setHeadDeg(1f);
                    setyMata(1f);
                }
            }
        }

        //Blink
        if (window.isKeyPressed(GLFW_KEY_R)) {
            if (blink==0f)
                setDown(false);
            else if(blink==-115f)
                setDown(true);
            if (down){

                objects.get(0).rotateObject((float)Math.toRadians(-yMata),0f,1f,0f);

                objects.get(0).getChildObject().get(6).rotateObjectSelf((float)Math.toRadians(1f),1f,0f,0f);
                objects.get(0).getChildObject().get(7).rotateObjectSelf((float)Math.toRadians(1f),1f,0f,0f);

                objects.get(0).rotateObject((float)Math.toRadians(yMata),0f,1f,0f);


                setBlink(1);
            }
            else{

                objects.get(0).rotateObject((float)Math.toRadians(-yMata),0f,1f,0f);

                objects.get(0).getChildObject().get(6).rotateObjectSelf((float)Math.toRadians(-1f),1f,0f,0f);
                objects.get(0).getChildObject().get(7).rotateObjectSelf((float)Math.toRadians(-1f),1f,0f,0f);

                objects.get(0).rotateObject((float)Math.toRadians(yMata),0f,1f,0f);



                setBlink(-1);
            }
        }

        //Movement Tangan
        {
            if (window.isKeyPressed(GLFW_KEY_D)) {
                if (kiri<70f){

                    objects.get(1).rotateObject((float)Math.toRadians(-yMata),0f,1f,0f);

                    objects.get(1).getChildObject().get(1).rotateObjectSelf((float)Math.toRadians(1f),0f,0f,1f);
                    objects.get(1).getChildObject().get(1).translateObject(0.0005f,0.0007f,0f);

                    objects.get(1).rotateObject((float)Math.toRadians(yMata),0f,1f,0f);


                    setKiri(1);
                }

            }

            if (window.isKeyPressed(GLFW_KEY_C)) {
                if (kiri>0f){

                    objects.get(1).rotateObject((float)Math.toRadians(-yMata),0f,1f,0f);

                    objects.get(1).getChildObject().get(1).rotateObjectSelf((float)Math.toRadians(-1f),0f,0f,1f);
                    objects.get(1).getChildObject().get(1).translateObject(-0.0005f,-0.0007f,0f);
                    objects.get(1).rotateObject((float)Math.toRadians(yMata),0f,1f,0f);


                    setKiri(-1);
                }

            }

            if (window.isKeyPressed(GLFW_KEY_F)) {
                if (kanan>-70f){

                    objects.get(1).rotateObject((float)Math.toRadians(-yMata),0f,1f,0f);

                    objects.get(1).getChildObject().get(2).rotateObjectSelf((float)Math.toRadians(-1f),0f,0f,1f);
                    objects.get(1).getChildObject().get(2).translateObject(-0.0005f,0.0007f,0f);
                    objects.get(1).rotateObject((float)Math.toRadians(yMata),0f,1f,0f);


                    setKanan(-1);
                }

            }


            if (window.isKeyPressed(GLFW_KEY_V)) {
                if (kanan<0f){

                    objects.get(1).rotateObject((float)Math.toRadians(-yMata),0f,1f,0f);

                    objects.get(1).getChildObject().get(2).rotateObjectSelf((float)Math.toRadians(1f),0f,0f,1f);
                    objects.get(1).getChildObject().get(2).translateObject(0.0005f,-0.0007f,0f);

                    objects.get(1).rotateObject((float)Math.toRadians(yMata),0f,1f,0f);


                    setKanan(1);
                }
            }
        }

        //Movement Kaki
        if (window.isKeyPressed(GLFW_KEY_SPACE)) {
            if (kaki==30f)
                setKakiB(false);
            else if(kaki==-30f)
                setKakiB(true);

            if (kakiB){

                objects.get(1).rotateObject((float)Math.toRadians(-yMata),0f,1f,0f);

                objects.get(1).getChildObject().get(4).rotateObjectSelf((float)Math.toRadians(-1f),1f,0f,0f);
                objects.get(1).getChildObject().get(4).translateObject(0f,0.0005f,0.0005f);

                objects.get(1).getChildObject().get(3).rotateObjectSelf((float)Math.toRadians(1f),1f,0f,0f);
                objects.get(1).getChildObject().get(3).translateObject(0f,-0.0005f,-0.0005f);

                objects.get(1).rotateObject((float)Math.toRadians(yMata),0f,1f,0f);

                setKaki(1f);
            }
            else{

                objects.get(1).rotateObject((float)Math.toRadians(-yMata),0f,1f,0f);

                objects.get(1).getChildObject().get(3).rotateObjectSelf((float)Math.toRadians(-1f),1f,0f,0f);
                objects.get(1).getChildObject().get(3).translateObject(0.0f,0.0005f,0.0005f);

                objects.get(1).getChildObject().get(4).rotateObjectSelf((float)Math.toRadians(1f),1f,0f,0f);
                objects.get(1).getChildObject().get(4).translateObject(0f,-0.0005f,-0.0005f);

                objects.get(1).rotateObject((float)Math.toRadians(yMata),0f,1f,0f);

                setKaki(-1f);
            }
        }

    }

    public static void setKakiB(boolean kakiB) {
        Badtemaru.kakiB = kakiB;
    }

    public static void setKaki(float kaki) {
        Badtemaru.kaki += kaki;
    }

    public static void setKor(float x, float y, float z) {
        Badtemaru.x += x;
        Badtemaru.y += y;
        Badtemaru.z += z;
    }

    public static void setKanan(float kanan) {
        Badtemaru.kanan += kanan;
    }

    public static void setKiri(float kiri) {
        Badtemaru.kiri += kiri;
    }

    public static void setxMata(float xMata) {
        Badtemaru.xMata += xMata;
    }

    public static void setyMata(float yMata) {
        Badtemaru.yMata += yMata;
    }

    public static void setzMata(float zMata) {
        Badtemaru.zMata += zMata;
    }

    public static void setBlink(float blink) {
        Badtemaru.blink += blink;
    }

    public static void setDown(boolean down) {
        Badtemaru.down = down;
    }

    public static void setHeadTurn(boolean headTurn) {
        Badtemaru.HeadTurn = headTurn;
    }

    public static void setHeadDeg(float headDeg) {
        Badtemaru.HeadDeg += headDeg;
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
            for(Object object: objects){
                object.draw(camera,projection);
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
        new Badtemaru().run();
    }
}
