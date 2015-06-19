package tudelft.ti2806.pl3;

/**
 * Created by Mathieu Post on 17-6-15.
 */
public class Constants {
	// Special chars
	public static final char POWER = '\u00B2';
	public static final char PLUS = '+';
	public static final char MINUS = '-';
	public static final char ARROW_RIGHT = '\u2192';
	public static final char ARROW_LEFT = '\u2190';

	// Name of the application.
	public static final String APP_NAME = "Helix" + POWER;

	// Text for information views.
	public static final String INFO_ABOUT = APP_NAME + " is an interactive DNA sequence viewer. "
			+ "It uses semantic zooming to only display relative information. \n"
			+ "This application was created as part of an assignment"
			+ "for the Context Project at TU Delft.\n"
			+ "\n"
			+ APP_NAME + " was created by: \n"
			+ "- Tom Brouws\n"
			+ "- Boris Mattijssen\n"
			+ "- Mathieu Post\n"
			+ "- Sam Smullers\n"
			+ "- Kasper Wendel\n"
			+ "\n"
			+ "The code of this application is open source and can be found on GitHub: \n";
	public static final String INFO_CONTROLS = APP_NAME + " uses key shortcuts to make life easier. "
			+ "All the controls that can be used are listed below. \n"
			+ "\n"
			+ "Zooming in     \t " + PLUS + " \n"
			+ "Zooming out    \t " + MINUS + " \n"
			+ "Reset the view \t R \n"
			+ "Move the view to the left \t " + ARROW_LEFT + " \n"
			+ "Move the view to the right \t " + ARROW_RIGHT + " \n"
			+ "Gene navigation window \t G \n"
			+ "Hide/show phylogenetic tree window \t spacebar \n"
			+ "\n"
			+ "All of the menus can be controlled with the underlined letter, "
			+ "hold the ALT key to activate this.";
	public static final String INFO_GITHUB_URL = "https://github.com/ProgrammingLife3/ProgrammingLife3";

	// Menu constants.
	public static final String MENU_FILE = "File";
	public static final String MENU_FILE_OPEN_FOLDER = "Open folder";
	public static final String MENU_FILE_OPEN_GRAPH_FILES = "Open graph files";
	public static final String MENU_FILE_OPEN_NWK_FILE = "Open .nwk file";
	public static final String MENU_FILE_OPEN_META_FILE = "Open metadata file";
	public static final String MENU_FILE_OPEN_RECENTS = "Open recent files";
	public static final String MENU_FILE_EXIT = "Exit";

	public static final String MENU_VIEW = "View";
	public static final String MENU_VIEW_ZOOM_IN = "Zoom in";
	public static final String MENU_VIEW_ZOOM_OUT = "Zoom out";
	public static final String MENU_VIEW_MOVE_LEFT = "Move left";
	public static final String MENU_VIEW_MOVE_RIGHT = "Move right";
	public static final String MENU_VIEW_RESET = "Reset view";
	public static final String MENU_VIEW_NAVIGATE_TO_GENE = "Navigate to gene";
	public static final String MENU_VIEW_METADATA = "Filter on metadata";

	public static final String MENU_HELP = "Help";
	public static final String MENU_HELP_CONTROLS = "Controls";
	public static final String MENU_HELP_ABOUT = "About " + APP_NAME;

	public static final String DIALOG_ERROR = "Error!";
	public static final String DETAILVIEW_GENOMES = "Genomes:";
	public static final String DETAILVIEW_LABELS = "Labels:";
}
