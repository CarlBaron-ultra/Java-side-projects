import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.stage.Stage;
import java.util.Random;
import javafx.event.ActionEvent;


public class MagicBall
extends Application
{
	@Override
	public void start(Stage primaryStage)
	{
		Pane pane = new StackPane();
		
		Circle circle=new Circle();
		circle.setRadius(100);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.rgb(30,148,219));
		pane.setStyle("-fx-background-color:black");
		//pane.getChildren().add(circle);
		
		BorderPane bPane=new BorderPane();
		Button btShake = new Button("Shake");
		bPane.setBottom(btShake);
		pane.getChildren().add(bPane);
		Text t=new Text();
		
		btShake.setOnAction((ActionEvent e)->
		{
			String s=fortune();
			
			t.setText(s);
			t.setFont(Font.font("Times New Roman",FontWeight.BOLD,20));
			//pane.getChildren().add(t);
		});	
		
		
		//create scene and place it in the stage
		pane.getChildren().addAll(circle,t);
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Magic 8 Ball");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public String fortune()
	{
		String s=null;
		Random random =new Random();
		int a=random.nextInt(20);
		
		switch(a)
		{
		case 0:
			s="It is certain";
			break;
		case 1:
			s="It is decidedly so";
			break;
		case 2:
			s="Without a doubt";
			break;
		case 3:
			s="Yes definitely";
			break;
		case 4:
			s="You may rely on it";
			break;
		case 5:
			s="As I see\n it, yes";
			break;
		case 6:
			s="Most likely";
			break;
		case 7:
			s="Outlook good";
			break;
		case 8:
			s="Yes";
			break;
		case 9:
			s="Signs point to yes";
			break;
		case 10:
			s="Reply hazy\ntry again";
			break;
		case 11:
			s="Ask again later";
			break;
		case 12:
			s="Better not tell you now";
			break;
		case 13:
			s="Cannot predict now";
			break;
		case 14:
			s="Concentrate\nand ask again";
			break;
		case 15:
			s="Don't count on it";
			break;
		case 16:
			s="No";
			break;
		case 17:
			s="Outlook not so good";
			break;
		case 18:
			s="Very doubtful";
			break;
		case 19:
			s="My sources say no";
			break;
		}
		
		return s;
	}

	public static void main(String[] args)
	{
		Application.launch(args);
	}
}