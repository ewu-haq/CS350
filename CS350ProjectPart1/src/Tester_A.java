import java.awt.Color;
import java.io.IOException;

import acg.architecture.view.loader.InvalidLayoutException;
import acg.project.cli.CommandLineInterface;
import acg.project.cli.parser.CommandParser;
import acg.project.cli.parser.ParseException;
import acg.project.map.MapSet;


public class Tester_A {
	public static void main(String [] args) throws ParseException,IOException,InvalidLayoutException
	{
		GlyphLoader g = new GlyphLoader("test_loader.txt");
		g.load();
		System.out.println(g);
		System.out.println(Color.decode("#abcdef"));
		/*CommandLineInterface a = new CommandLineInterface();
		MapSet b = new MapSet(a);
		CommandParser cp = new CommandParser(b,"DEFINE TRAP 1 ORIGIN 100");
		
		System.out.println("Text: " + cp.getText());
		//cp.parse();
		cp.enable_tracing();
		System.out.println(cp.getNextToken());
		System.out.println(cp.getNextToken());
		System.out.println(cp.getNextToken());
		System.out.println(cp.getNextToken());
		System.out.println(cp.getNextToken());*/
		
		
	}
}
