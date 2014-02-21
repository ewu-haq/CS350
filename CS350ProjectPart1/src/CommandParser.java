
public class CommandParser {
	private String text;
	private String[] str_array;
	
	private int FIELD_TYPE = 0;
	
 private int INDEX = 0;
	
	private String _ORIGIN = "ORIGIN";
	
	
	/*
	 * Constructor
	 */
	public CommandParser(String command){
		this.text = command;
	}
	
	/*
	 * parser
	 */
	public void parser(){
		String[] str_array  = text.split(" ");
		switch(str_array[++INDEX]){
		
			case  "DEFINE": {
				create_define();
				break;
			}
			case "CREATE": {
				break;
			}
		}// switch
	}

	private void create_define() {
		switch(str_array[++INDEX])
		{
			case "BOOM" : {
				create_boom();
			}
		}//SWITCh
	}

	private void create_boom() {
		switch( str_array[++INDEX])
		{
			case "FEMALE" : {
				DefineCreatinalBoomFemale();
			case "MALE" : {
				DefineCreationalBoomMale();
			}
		}
		}//switch
	}

	private void DefineCreatinalBoomFemale() {
		for(int i = INDEX; i<str_array.length;i++){
			switch( str_array[INDEX])
			{
				case "SPEED" : {
					Speed a = create_Speed();
				}
			}//switch
		}
		
	}

	private Speed create_speed() {
		return new Speed(Integer.parseInt( str_array[INDEX++] ));
	}
}
