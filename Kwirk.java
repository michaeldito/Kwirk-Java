import java.util.*;

public class Kwirk
{
    public static void main(String[] args)
    {
        String debug = "[Application::main] ";
        System.out.println(debug + "Application is starting up.");

        Queue<GameLevelModel> models = new LinkedList<GameLevelModel>();
        models = LevelBuilder.buildAllLevels();

        View view = new View();

        GameplayController controller = new GameplayController();

        System.out.println(debug + "Connecting models to controller.");
        controller.addModels(models);

        System.out.println(debug + "Connecting view to controller.");
        controller.addView(view);

        System.out.println(debug + "Connecting model to view.");
        view.addModel(controller.getCurrentLevelModel());

        System.out.println(debug + "Connecting controller to view.");
        view.addController(controller);

        System.out.println(debug + "Building the view.");
        view.build();

        System.out.println(debug + "Displaying the view.");
        view.display();
    }
}